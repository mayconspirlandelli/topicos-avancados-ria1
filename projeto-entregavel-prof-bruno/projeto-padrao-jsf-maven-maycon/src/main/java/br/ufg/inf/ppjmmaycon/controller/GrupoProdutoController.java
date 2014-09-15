package br.ufg.inf.ppjmmaycon.controller;

import br.ufg.inf.ppjmmaycon.bean.GrupoProdutoBean;
import br.ufg.inf.ppjmmaycon.model.GrupoProduto;
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
public class GrupoProdutoController {
    
    private Integer idGrupoPrduto = 0;
    /* Tela */
    private GrupoProdutoBean grupoProdutoBean;
    /* Entidade */
    private GrupoProduto grupoProduto;        
    /* Lista de grupos a serem exibidos na view */
    private List<GrupoProduto> listaGrupoProduto;
        
    
    public GrupoProdutoController() {        
        grupoProdutoBean = new GrupoProdutoBean();
        grupoProduto = new GrupoProduto();
        listaGrupoProduto = new ArrayList<GrupoProduto>();
    }
    
    public GrupoProdutoBean getGrupoProdutoBean() {
        return grupoProdutoBean;
    }

    public void setGrupoProdutoBean(GrupoProdutoBean grupoProdutoBean) {
        this.grupoProdutoBean = grupoProdutoBean;
    }
    
    public void cadastrar() {       
       grupoProduto = new GrupoProduto();
       grupoProdutoBean.setId(idGrupoPrduto++);
       grupoProduto.setId(grupoProdutoBean.getId());
       grupoProduto.setDescricao(grupoProdutoBean.getDescricao());
       
       //grupoProduto.setId(getGrupoProdutoBean().getId());
       //grupoProduto.setDescricao(getGrupoProdutoBean().getDescricao());
       
       listaGrupoProduto.add(grupoProduto);
       
       System.out.println("Grupo de Produtos: " + grupoProduto.getDescricao());      
       
       //servidro.cadastrar(grupoProduto)
       
   }
    public void listar() {        
        System.out.println("Lista de Produtos: tamanho de " + listaGrupoProduto.size());
        for(GrupoProduto grupoProduto : listaGrupoProduto) {
            //System.out.println("Id: " + grupoProduto.getId() + " Descricao: " + grupoProduto.getDescricao());            
            System.out.println("Id: " + " Descricao: " + grupoProduto.getDescricao());
        }        
    }
    public void limpar() {        
        listaGrupoProduto.clear();        
    }

    /**
     * @return the listaGrupoProduto
     */
    public List<GrupoProduto> getListaGrupoProduto() {
        return listaGrupoProduto;
    }

    /**
     * @param listaGrupoProduto the listaGrupoProduto to set
     */
    public void setListaGrupoProduto(List<GrupoProduto> listaGrupoProduto) {
        this.listaGrupoProduto = listaGrupoProduto;
    }
    
}
