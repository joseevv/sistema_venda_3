/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Samuelson
 */
public class funcionario {
    
    private int id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    //private String senha;

    

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  public String getEmail() {
      return email;
  }
   public void setEmail (String email){
       this.email = email;
   }
    
   public String getLogin(){
       return login;
   }
   public void setLogin (String login){
       this.login = login;
   }
   public String getSenha(){
       return senha;
   }
   public void setSenha (String senha){
       this.senha = senha;
   }
   
}
