package br.ufg.inf.ppjmmaycon.controller;

import br.ufg.inf.ppjmmaycon.bean.ProdutoBean;
import br.ufg.inf.ppjmmaycon.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Maycon Spirlandelli
 */
@ManagedBean
@SessionScoped
public class ProdutoController {
    
    private Integer idPrduto = 0; //Simula o auto-increment do banco de dados.
    
    /* Tela */
    private ProdutoBean produtoBean;
    /* Entidade */
    private Produto produto;        
    /* Lista de protutos  a serem exibidos na view */
    private List<Produto> listaProduto;
        
    
    public ProdutoController() {        
        produtoBean = new ProdutoBean();
        produto = new Produto();
        listaProduto = new ArrayList<Produto>();
    }
    
    public ProdutoBean getGrupoProdutoBean() {
        return produtoBean;
    }

    public void setProdutoBean(ProdutoBean produtoBean) {
        this.produtoBean = produtoBean;
    }
    
    public void cadastrar() {       
       produto = new Produto();
       produtoBean.setId(idPrduto++);
       produto.setId(produtoBean.getId());
       produto.setDescricao(produtoBean.getDescricao());
              
       listaProduto.add(produto);
       
       System.out.println("Grupo de Produtos: " + produto.getDescricao());      
       
   }
    public void listar() {        
        System.out.println("Lista de Produtos: tamanho de " + listaProduto.size());
        for(Produto produto : listaProduto) {
            //System.out.println("Id: " + grupoProduto.getId() + " Descricao: " + grupoProduto.getDescricao());            
            System.out.println("Id: " + " Descricao: " + produto.getDescricao());
        }        
    }
    public void limpar() {        
        listaProduto.clear();        
    }

    /**
     * @return the listaGrupoProduto
     */
    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    /**
     * @param listaProduto the listaGrupoProduto to set
     */
    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    
}
