package br.edu.ifsc.boletoBB.model;

public class PagadorM {
   int paga_codi;
   String paga_nome;
   String paga_documento;
   EnderecoM paga_endereco;

   public PagadorM(){}
    public PagadorM(String paga_nome, String paga_documento, EnderecoM paga_endereco) {
        
        this.paga_nome = paga_nome;
        this.paga_documento = paga_documento;
        this.paga_endereco = paga_endereco;
    }

    public int getPaga_codi() {
        return paga_codi;
    }

    public void setPaga_codi(int paga_codi) {
        this.paga_codi = paga_codi;
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

    public EnderecoM getPaga_endereco() {
        return paga_endereco;
    }

    public void setPaga_endereco(EnderecoM paga_endereco) {
        this.paga_endereco = paga_endereco;
    }
   
   
}
