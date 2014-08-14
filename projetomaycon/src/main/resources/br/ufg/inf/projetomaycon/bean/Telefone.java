package br.ufg.inf.projetomaycon.bean;

/**
 * Classe Telefone
 * @date 09/08/14
 * @author Maycon Spirlandelli
 */
public class Telefone {
    
    private String comercial;
    private String fixo;
    private String celular;

    /**
     * @return the comercial
     */
    public String getComercial() {
        return comercial;
    }

    /**
     * @param comercial the comercial to set
     */
    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    /**
     * @return the fixo
     */
    public String getFixo() {
        return fixo;
    }

    /**
     * @param fixo the fixo to set
     */
    public void setFixo(String fixo) {
        this.fixo = fixo;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }
       
}
