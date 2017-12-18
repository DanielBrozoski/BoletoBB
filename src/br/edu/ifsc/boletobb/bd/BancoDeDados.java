package br.edu.ifsc.boletobb.bd;

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
    
    public boolean validaSenha(String user, String pass){
        try {
            String sql = "select * from usuario where usua_login = ? and usua_senha = ?";
            boolean autenticado = false; 
            
            this.preparedStatement = this.connection.prepareStatement(sql);
            
            this.preparedStatement.setString(1, user);
            this.preparedStatement.setString(2, pass);
            
            this.resultSet = this.preparedStatement.executeQuery();

            if(this.resultSet.next()){
                String loginBanco = this.resultSet.getString("usua_login");  
                String senhaBanco = this.resultSet.getString("usua_senha"); 
                int sit = resultSet.getInt("usua_situacao");
                if(sit == 1)
                    autenticado = true;  
                else 
                    autenticado = false;
            } 
            this.preparedStatement.close();
            
            return autenticado;
        } catch (SQLException ex) {
            Logger.getLogger(BancoDeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
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

