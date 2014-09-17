package br.ufg.inf.ppjmmaycon.model;

import java.util.List;

/**
 *
 * @author Maycon Spirlandelli
 */
public class GrupoProduto {
    
    private Integer id;
    private String descricao;
    //TODO: criar - produtos : Set<Produto>
    private List<Produto> produtos;

    public GrupoProduto() {}
    
    public GrupoProduto(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }       
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
