package br.ufg.inf.ppjmmaycon.bean;

/**
 *
 * @author Maycon Spirlandelli
 */
public class PessoaBean {
    
    private Integer id;
    private String nome;
    private String endereco;
    private String telefone;    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
