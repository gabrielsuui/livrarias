/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gabriel
 */
public class bancoMysql {

    public static Connection conectaBanco() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/db_livraria?"
                    + "user=root&password=2643");
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro ao conectar no Banco de dados!", ex);
        }
    }
}
