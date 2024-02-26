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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;
//import model.bean.Produto;
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
    
    public List<funcionario> read() {

        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {

                funcionario f = new funcionario();

                f.setId(rs.getInt("idfuncionario"));
                f.setNome(rs.getString("nome"));
                f.setEmail(rs.getString("email"));
                f.setLogin(rs.getString("login"));
                f.setSenha(rs.getString("senha"));
                /*produto.setDescricao(rs.getString("descricao"));
                produto.setQtd(rs.getInt("qtd"));
                produto.setPreco(rs.getDouble("preco"));
                produto.add(produto);*/
                funcionarios.add(f);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Banco.closeConnection(con, stmt, rs);
        }

        return funcionarios;
        } 
        public void update(funcionario f) {

        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE funcionario SET nome = ? ,email = ?,login = ? WHERE idfuncionario = ?");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getEmail());
            stmt.setString(3, f.getLogin());
            stmt.setInt(4, f.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            Banco.closeConnection(con, stmt);
        }
        
        
    }
    public void delete(funcionario f) {

        Connection con = Banco.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM funcionario WHERE idfuncionario = ?");
            stmt.setInt(1, f.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            Banco.closeConnection(con, stmt);
        }
    }
}
