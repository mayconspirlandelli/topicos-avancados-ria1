package br.ufg.inf.projetomaycon.bean;

/**
 * Classe Cidade
 * @date 09/08/14
 * @author Maycon Spirlandelli
 */
public class Cidade {
    
    private String cidade;
    private Estado estado;

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
                
}
