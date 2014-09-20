package br.ufg.inf.ppjmmaycon.controller;

import br.ufg.inf.ppjmmaycon.bean.GrupoProdutoBean;
import br.ufg.inf.ppjmmaycon.bean.PedidoBean;
import br.ufg.inf.ppjmmaycon.bean.PessoaBean;
import br.ufg.inf.ppjmmaycon.bean.ProdutoBean;
import br.ufg.inf.ppjmmaycon.model.GrupoProduto;
import br.ufg.inf.ppjmmaycon.model.Pedido;
import br.ufg.inf.ppjmmaycon.model.Pessoa;
import br.ufg.inf.ppjmmaycon.model.Produto;
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
public class PedidoController {

    private Integer idPedido = 1;
    private Integer idCliente = 1;
    private Integer idProduto = 1;

    /* Tela */    
    private PedidoBean pedidoBean;
    
    /* Entidade */
    private Pessoa cliente;
    private Pedido pedido;
    private Produto produto;

    /* Lista de pedidos a serem exibidos na view */    
    private List<Pedido> listaDePedidos;
    
    
    public PedidoController() {
        pedidoBean = new PedidoBean();      
    }

    public void cadastrar() {
        cliente = new Pessoa();
        produto = new Produto();
        pedido = new Pedido();

        pedidoBean.setId(idPedido++);
        pedidoBean.setIdCliente(idCliente++);
        pedidoBean.setIdProduto(idProduto++);

        pedido.setId(pedidoBean.getId());

        cliente.setId(pedidoBean.getIdCliente());
        cliente.setNome(pedidoBean.getNomeCliente());
        cliente.setEndereco(pedidoBean.getEndereco());
        cliente.setNome(pedidoBean.getNomeCliente());
        cliente.setTelefone(pedidoBean.getTelefone());

        produto.setId(pedidoBean.getIdProduto());
        produto.setDescricao(pedidoBean.getDescricaoProduto());

        pedido.setCliente(cliente);
        pedido.setProduto(produto);

        cliente = new Pessoa();
        produto = new Produto();
        pedido = new Pedido();
    }

    public void listar() {
     
    }

    public void limpar() {
     
    }

    public void remover(GrupoProduto grupoProduto) {
        //listaGrupoProduto.remove(grupoProduto);
    }

    /**
     * Método responsável por editar um item da lista na datatable.
     *
     * @param event
     */
    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Pedido editado!", ((Pedido) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * Método responsável por cancelar a operação de cancelar edição de um item
     * da datatable.
     *
     * @param event
     */
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição cancelada!", ((Pedido) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * @return the listaDePedidos
     */
    public List<Pedido> getListaDePedidos() {
        return listaDePedidos;
    }

    /**
     * @param listaDePedidos the listaDePedidos to set
     */
    public void setListaDePedidos(List<Pedido> listaDePedidos) {
        this.listaDePedidos = listaDePedidos;
    }
}
