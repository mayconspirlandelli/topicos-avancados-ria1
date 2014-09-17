package br.ufg.inf.ppjmmaycon.controller;

import br.ufg.inf.ppjmmaycon.bean.GrupoProdutoBean;
import br.ufg.inf.ppjmmaycon.model.GrupoProduto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Maycon Spirlandelli
 */
@ManagedBean
@SessionScoped
public class GrupoProdutoController {
    
    private Integer idGrupoPrduto = 1;
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
       listaGrupoProduto.add(grupoProduto);
       System.out.println("Grupo de Produtos: " + grupoProduto.getDescricao());             
       grupoProduto = new GrupoProduto();
   }
    public void listar() {        
        System.out.println("Lista de Produtos: tamanho de " + listaGrupoProduto.size());
        for(GrupoProduto grupoProduto : listaGrupoProduto) {            
            System.out.println("Id: " + " Descricao: " + grupoProduto.getDescricao());
        }        
    }
    
    public void limpar() {        
        listaGrupoProduto.clear();        
    }
    
    public void remover(GrupoProduto grupoProduto) {
        listaGrupoProduto.remove(grupoProduto);
    }
   
    public List<GrupoProduto> getListaGrupoProduto() {
        return listaGrupoProduto;
    }

    public void setListaGrupoProduto(List<GrupoProduto> listaGrupoProduto) {
        this.listaGrupoProduto = listaGrupoProduto;
    }
    
     /**
     * Método responsável por editar um item da lista na datatable.
     *
     * @param event
     */
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Produto editado!", ((GrupoProduto) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * Método responsável por cancelar a operação de cancelar edição de um item
     * da datatable.
     *
     * @param event
     */
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição cancelada!", ((GrupoProduto) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
