package br.ufg.inf.ppjmmaycon.bean;

/**
 *
 * @author Maycon Spirlandelli
 */
public class GrupoProdutoBean {
    
    private Integer id;
    private String descricao;
    //TODO: criar - produtos : Set<Produto>
    
    public GrupoProdutoBean() {}
    

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
}
