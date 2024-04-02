/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author Cezarino Hora
 */
public class ConnectionFactory {

    public Connection getConnection() {
 
        // Estabelecendo a conexão com o Banco de dados
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/BDVENDAS","master","123");
               
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }

    }

}
