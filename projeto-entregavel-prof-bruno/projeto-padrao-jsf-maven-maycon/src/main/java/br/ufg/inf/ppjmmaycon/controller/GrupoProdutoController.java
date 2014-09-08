package br.ufg.inf.ppjmmaycon.controller;

import br.ufg.inf.ppjmmaycon.bean.GrupoProdutoBean;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Maycon Spirlandelli
 */
@ManagedBean
public class GrupoProdutoController {
    
    GrupoProdutoBean grupoProdutoBean;
    
    public GrupoProdutoController() {        
        grupoProdutoBean = new GrupoProdutoBean();
    }
    
   public void cadastrar() {
       
   }
    
}
