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

        System.out.println("Grupo de Produtos: " + produto.getDescricao());

        listaProduto.add(produto);

        produto = new Produto();
    }

    public void listar() {
        System.out.println("Lista de Produtos: tamanho de " + listaProduto.size());
        for (Produto produto : listaProduto) {
            //System.out.println("Id: " + grupoProduto.getId() + " Descricao: " + grupoProduto.getDescricao());            
            System.out.println("Id: " + " Descricao: " + produto.getDescricao());
        }
    }
    
    public void limpar() {
        listaProduto.clear();
    }
    
    public void remover(Produto produto) {
        listaProduto.remove(produto);
    }
    
    public void editar(Produto produto) {
        //Produto produtoTemp = listaProduto.
    }
}
