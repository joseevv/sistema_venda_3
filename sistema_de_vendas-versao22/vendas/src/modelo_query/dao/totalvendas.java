package modelo_query.dao;

import conexao.Banco;
// busca dados do mysql aqui 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.venda_bean;
/**
 *
 * @author Samuelson
 */
public class totalvendas {

    public int checkData(String data) {

        Connection con = Banco.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        int check = 0;

        try {

            stmt = con.prepareStatement("SELECT valor FROM vendas WHERE data = ?");
            stmt.setString(1, data);
           // stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {                
              //  check = 1;
              check = rs.getInt("valor");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Banco.closeConnection(con, stmt, rs);
        }

        return check;

    }

    public void create(venda_bean v) {
        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;
        
        try {
         stmt = con.prepareStatement ("INSERT INTO vendas(data,obs) VALUES (?,?)");
         stmt.setString (1, v.getData());
         stmt.setString(2,v.getobservacao());
         
         stmt.executeUpdate();
         
         JOptionPane.showMessageDialog(null, "salvo com sucesso");
        }catch (SQLException ex) {
            System.out.println(ex);
        }finally{
            Banco.closeConnection(con, stmt);
        }
         
        }
            
        
    }
    
   
