/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_query.dao;

import conexao.Banco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.funcionario;

/**
 *
 * @author 963478
 */
public class funcionarioDAO {
    public int checkData(String data) {

        Connection con = Banco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        int check = 0;

        try {

            stmt = con.prepareStatement("SELECT nome FROM funcionario WHERE email = ?");
            stmt.setString(1, data);
           // stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {                
              //  check = 1;
              check = rs.getInt("nome");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Banco.closeConnection(con, stmt, rs);
        }

        return check;

    }

    public void create(funcionario v) {
        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
         stmt = con.prepareStatement ("INSERT INTO funcionario(nome,email,login,senha) VALUES (?,?,?,?)");
         stmt.setString (1, v.getNome());
         stmt.setString (2, v.getEmail());
         stmt.setString (3, v.getLogin());
         stmt.setString (4, v.getSenha());
      //   stmt.setString(2,v.getobservacao());
         
         stmt.executeUpdate();
         
         JOptionPane.showMessageDialog(null, "salvo com sucesso");
        }catch (SQLException ex) {
            System.out.println(ex);
        }finally{
            Banco.closeConnection(con, stmt);
        }
    }
}
