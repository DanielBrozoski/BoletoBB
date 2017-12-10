package br.edu.ifsc.boletoBB.boleto.model;

public class Pagador {
   String paga_nome;
   String paga_documento;
   Endereco paga_endereco;

    public Pagador(String paga_nome, String paga_documento, Endereco paga_endereco) {
        this.paga_nome = paga_nome;
        this.paga_documento = paga_documento;
        this.paga_endereco = paga_endereco;
    }

    public String getPaga_nome() {
        return paga_nome;
    }

    public void setPaga_nome(String paga_nome) {
        this.paga_nome = paga_nome;
    }

    public String getPaga_documento() {
        return paga_documento;
    }

    public void setPaga_documento(String paga_documento) {
        this.paga_documento = paga_documento;
    }

    public Endereco getPaga_endereco() {
        return paga_endereco;
    }

    public void setPaga_endereco(Endereco paga_endereco) {
        this.paga_endereco = paga_endereco;
    }
   
   
}
