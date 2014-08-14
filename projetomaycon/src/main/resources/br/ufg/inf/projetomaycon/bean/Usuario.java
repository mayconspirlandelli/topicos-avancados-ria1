package br.ufg.inf.projetomaycon.bean;

import java.util.Date;

/**
 *
 * @author alunoinf
 */
public class Usuario {

    private Integer id;
    private String login;
    private String senha;
    private boolean ativo;
    private Date ultimoLogin;
    private GrupoUsuario grupo;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the ultimoLogin
     */
    public Date getUltimoLogin() {
        return ultimoLogin;
    }

    /**
     * @param ultimoLogin the ultimoLogin to set
     */
    public void setUltimoLogin(Date ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    /**
     * @return the grupo
     */
    public GrupoUsuario getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(GrupoUsuario grupo) {
        this.grupo = grupo;
    }
    
}
