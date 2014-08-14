package br.ufg.inf.projetomaycon.bean;

import java.util.List;

/**
 *
 * @author alunoinf
 */
public class Estado {
    
    private Integer id;
    private String nome;
    private String sigla;
    private List<Cidade> cidades;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the cidades
     */
    public List<Cidade> getCidades() {
        return cidades;
    }

    /**
     * @param cidades the cidades to set
     */
    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }
    
}
