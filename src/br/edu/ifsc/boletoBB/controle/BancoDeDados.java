/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.boletoBB.controle;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aldir
 */
public class BancoDeDados {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/boletobb";
    private static final String login = "brozoski";
    private static final String senha = "@Federal5547155";
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public BancoDeDados() {
        try {
            this.connection = DriverManager.getConnection(url, login, senha);
        } catch (SQLException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public int bdAtualizar(String sql) {
        int id = 0;
        try {  
            this.preparedStatement = this.connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            this.preparedStatement.executeUpdate();
            ResultSet rs = this.preparedStatement.getGeneratedKeys();
            if (rs.first()) {
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            if(ex instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
                JOptionPane.showMessageDialog(null, "Usuario já cadastrado");
                return 99;
            }
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public ResultSet bdConsultar(String sql) {
        try {
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.resultSet = this.preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return this.resultSet;
    }

    public void fecharConexao() {
        try {
            this.preparedStatement.close();
            this.connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
