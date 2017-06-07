package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private Connection conexao;

    public Conexao() throws Exception {
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        String url = "jdbc:jtds:sqlserver://VILASBOAS:1433/APS";
        conexao = DriverManager.getConnection(url, "aps", "123");
    }

    public Connection getConexao() {
        return conexao;
    }
}
