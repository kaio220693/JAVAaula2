package View;

import javax.swing.*;
import java.awt.*;

public class JfCliente extends JFrame {
    JPanel pnlPrincipal, pnlPesquisar, pnlCliente,pnlDadosClientes, pnlBotoesClientes;
    JLabel lblPesquisar;
    JTextField txtPesquisar;
    JButton btnPesquisar, btnExcluir;
    JTable tblPesquisar;
    public JfCliente() {
        setTitle("Cadastro de Cliente");
        setBounds(300,90,900,600);

        pnlPrincipal = new JPanel(new GridLayout(2,1,5,5));
        pnlPrincipal.setBackground(Color.MAGENTA);

        pnlPesquisar = new JPanel();
        pnlPesquisar.setBounds(300,90,900,300);
        pnlPesquisar.setBackground(Color.GREEN);
        lblPesquisar = new JLabel("Nome");
        txtPesquisar = new JTextField();
        txtPesquisar.setColumns(60);
        btnPesquisar = new JButton("Pesquisar");

        Object [][] dados = {
                {"id","Nome","Data de nascimento", "Sexo", "endereço","Fone"},
                {1,"Pietro","09/03/1994","M","Rua das oliveiras", "43434343"},
                {2,"Pong","09/03/2005","m","Rua das maconheiras", "25252525"},
                {3,"Thiago","09/03/2023","F","Rua das bananeiras", "15151515"},
        };
        String [] colunas =  {"id","Nome","Data de nascimento", "Sexo", "endereço","Fone"};

        tblPesquisar = new JTable(dados,colunas);

        tblPesquisar.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblPesquisar.getColumnModel().getColumn(0).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblPesquisar.getColumnModel().getColumn(1).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(2).setPreferredWidth(105);
        tblPesquisar.getColumnModel().getColumn(2).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(3).setPreferredWidth(50);
        tblPesquisar.getColumnModel().getColumn(3).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(4).setPreferredWidth(250);
        tblPesquisar.getColumnModel().getColumn(4).setResizable(false);
        tblPesquisar.getColumnModel().getColumn(5).setPreferredWidth(175);
        tblPesquisar.getColumnModel().getColumn(5).setResizable(false);

        pnlCliente = new JPanel(new BorderLayout());
        pnlCliente.setBackground(Color.BLUE);

        pnlDadosClientes = new JPanel();
        pnlDadosClientes.setSize(600,180);
        pnlDadosClientes.setBackground(Color.CYAN);

        pnlBotoesClientes = new JPanel();
        pnlBotoesClientes.setSize(280,180);
        pnlBotoesClientes.setBackground(Color.BLACK);

        btnExcluir = new JButton("Excluir");

        pnlPrincipal.add(pnlPesquisar);
        pnlPrincipal.add(pnlCliente);

        pnlPesquisar.add(lblPesquisar);
        pnlPesquisar.add(txtPesquisar);
        pnlPesquisar.add(btnPesquisar);
        pnlPesquisar.add(tblPesquisar);

        pnlCliente.add(pnlDadosClientes, BorderLayout.CENTER);
        pnlCliente.add(pnlBotoesClientes, BorderLayout.EAST);
        pnlBotoesClientes.add(btnExcluir);

        getContentPane().add(pnlPrincipal);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
