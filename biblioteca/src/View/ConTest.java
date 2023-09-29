package View;
import Model.Livro;
import Uteis.BdLivro;
import Uteis.BdCliente;
import Uteis.CriarConexao;
import java.sql.Connection;
import java.sql.SQLException;

public class ConTest {
    public static void main(String[] args) throws SQLException {
        Livro livro1 = new Livro("senhor","pong",1,2050,"s");
        BdLivro conexao = new BdLivro();
        conexao.adicionaLivro(livro1);
    }

}
