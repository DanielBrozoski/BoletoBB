package br.edu.ifsc.boletoBB.boleto.model;

public class Endereco {
    String ende_logradouro;
    String ende_bairro;
    String ende_cep;
    String ende_Cidade;
    String ende_uf;

    public Endereco(String ende_logradouro, String ende_bairro, String ende_cep, String ende_Cidade, String ende_uf) {
        this.ende_logradouro = ende_logradouro;
        this.ende_bairro = ende_bairro;
        this.ende_cep = ende_cep;
        this.ende_Cidade = ende_Cidade;
        this.ende_uf = ende_uf;
    }

    public String getEnde_logradouro() {
        return ende_logradouro;
    }

    public void setEnde_logradouro(String ende_logradouro) {
        this.ende_logradouro = ende_logradouro;
    }

    public String getEnde_bairro() {
        return ende_bairro;
    }

    public void setEnde_bairro(String ende_bairro) {
        this.ende_bairro = ende_bairro;
    }

    public String getEnde_cep() {
        return ende_cep;
    }

    public void setEnde_cep(String ende_cep) {
        this.ende_cep = ende_cep;
    }

    public String getEnde_Cidade() {
        return ende_Cidade;
    }

    public void setEnde_Cidade(String ende_Cidade) {
        this.ende_Cidade = ende_Cidade;
    }

    public String getEnde_uf() {
        return ende_uf;
    }

    public void setEnde_uf(String ende_uf) {
        this.ende_uf = ende_uf;
    }
            
    
}
