package br.ufg.inf.ppjmmaycon.controller;

import br.ufg.inf.ppjmmaycon.bean.GrupoProdutoBean;
import br.ufg.inf.ppjmmaycon.bean.ProdutoBean;
import br.ufg.inf.ppjmmaycon.model.GrupoProduto;
import br.ufg.inf.ppjmmaycon.model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Maycon Spirlandelli
 */
@ManagedBean
@SessionScoped
public class ProdutoController {

    private Integer idPrduto = 1; //Simula o auto-increment do banco de dados.

    /* Tela */
    private ProdutoBean produtoBean;

    /* Entidade */
    private Produto produto;

    /* Lista de protutos  a serem exibidos na view */
    private List<Produto> listaProduto;

    private GrupoProduto grupoProdutoSelecionado;
    

    private ArrayList<SelectItem> listaSelectItemGrupoProduto;

    public ProdutoController() {
        produtoBean = new ProdutoBean();
        produto = new Produto();
        listaProduto = new ArrayList<Produto>();        
    }

    public ProdutoBean getProdutoBean() {
        return produtoBean;
    }

    public void setProdutoBean(ProdutoBean produtoBean) {
        this.produtoBean = produtoBean;
    }

    public List<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(List<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public void cadastrar() {
        produto = new Produto();
        produtoBean.setId(idPrduto++);
        produto.setId(produtoBean.getId());
        produto.setDescricao(produtoBean.getDescricao());
        produto.setLucro(produtoBean.getLucro());
        produto.setNcm(produtoBean.getNcm());
        produto.setPrecoCompra(produtoBean.getPrecoCompra());
        produto.setValor(produtoBean.getValor());
        
        
        System.out.println("teste: " + getGrupoProdutoSelecionado() ); 

        System.out.println("Produtos: " + produto.getDescricao());

        listaProduto.add(produto);

        produto = new Produto();
    }

    public void listar() {
        System.out.println("Lista de Produtos: tamanho de " + listaProduto.size());
        for (Produto produto : listaProduto) {
            System.out.println("Id: " + produto.getId() + " Descricao: " + produto.getDescricao());
            //System.out.println("Id: " + " Descricao: " + produto.getDescricao());
        }
    }

    public void limpar() {
        listaProduto.clear();
    }

    public void remover(Produto produto) {
        listaProduto.remove(produto);
    }

    /**
     * Método responsável por editar um item da lista na datatable.
     *
     * @param event
     */
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Produto editado!", ((Produto) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * Método responsável por cancelar a operação de cancelar edição de um item
     * da datatable.
     *
     * @param event
     */
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição cancelada!", ((Produto) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    private List<GrupoProduto> obterListaGrupoProduto() {

        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        HttpSession session = (HttpSession) externalContext.getSession(true);        
        GrupoProdutoController grupoProdutoBean = (GrupoProdutoController) session.getAttribute("grupoProdutoController");
//        List<GrupoProduto> lista = new ArrayList<GrupoProduto>();
//        lista.add(new GrupoProduto(1, "Legumes"));
//        lista.add(new GrupoProduto(2, "Verduras"));
//        lista.add(new GrupoProduto(3, "Frios"));
//        lista.add(new GrupoProduto(4, "Integrais"));
//        return lista;
        return grupoProdutoBean.getListaGrupoProduto();
    }

    public ArrayList<SelectItem> getListaSelectItemGrupoProduto() {
        List<GrupoProduto> listaGrupoProduto = obterListaGrupoProduto();
        if (this.listaSelectItemGrupoProduto == null) {
            if (listaGrupoProduto != null && !listaGrupoProduto.isEmpty()) {
                listaSelectItemGrupoProduto = new ArrayList<SelectItem>();
                for (GrupoProduto item : listaGrupoProduto) {
                    listaSelectItemGrupoProduto.add(new SelectItem(item, item.getDescricao()));
                }
            }
        }
        return listaSelectItemGrupoProduto;
    }

//    public GrupoProduto getGrupoProdutoSelecionado() {
//        return grupoProdutoSelecionado;
//    }

    /**
     * @return the grupoProdutoSelecionado
     */
    public GrupoProduto getGrupoProdutoSelecionado() {
        return grupoProdutoSelecionado;
    }

    /**
     * @param grupoProdutoSelecionado the grupoProdutoSelecionado to set
     */
    public void setGrupoProdutoSelecionado(GrupoProduto grupoProdutoSelecionado) {
        this.grupoProdutoSelecionado = grupoProdutoSelecionado;
    }

    

}
