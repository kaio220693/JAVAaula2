package Uteis;

import Model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BdCliente {
    private Connection conexao;
    public BdCliente() throws SQLException {
        this.conexao=CriarConexao.getConexao();
    }
    //adicionar um registro
    public void adicionaCliente() throws SQLException{
        String sql = "INSERT INTO cliente(nome,data_nasci,sexo,cpf,endereco,fone)"
                + "VALUES (?,?,?,?,?,?)";
        PreparedStatement stmt;
        stmt = this.conexao.prepareStatement(sql);

        stmt.setString(1,"pong");
        stmt.setString(2,"1965/05/02");
        stmt.setString(3,"M");
        stmt.setString(4,"24235689");
        stmt.setString(5,"pongolandia, 69");
        stmt.setString(6,"123456");

        stmt.execute();
        stmt.close();

    }
}
