package View;
import Model.Livro;
import Uteis.BdLivro;
import Uteis.BdCliente;
import Uteis.CriarConexao;
import java.sql.Connection;
import java.sql.SQLException;

public class ConTest {
    public static void main(String[] args) throws SQLException {
        JfCliente JfCliente = new JfCliente();
        JfCliente.setVisible(true);
    }

}
