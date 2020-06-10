

package br.edu.fja.entidades;


public class UsuarioAdmin {
    private String usuario;
    private String senha;

    public UsuarioAdmin() {
    }

    public UsuarioAdmin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        
    }

    public String getUsuario() {
        
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    

}
