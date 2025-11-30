package CF.AgendaContatos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL  = "jdbc:mysql://localhost:3306/bdagendadecontatos";
    private static final String USER = "root";
    private static final String PASS = "162403";

    public static Connection conectar() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectado!");
            return con;
        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getMessage());

            return null;
        }
    }
}
