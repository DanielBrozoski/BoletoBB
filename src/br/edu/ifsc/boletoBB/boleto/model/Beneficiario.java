package br.edu.ifsc.boletoBB.boleto.model;

public class Beneficiario {
    private String bene_nome;
    private String bene_agencia;
    private String bene_digito_agencia;
    private String bene_codigo_beneficiario;
    private String bene_digito_codigo_beneficiario;
    private String bene_numero_convenio;
    private String bene_carteira;
    private String bene_nosso_numero;
    private Endereco bene_endereco;

    public Beneficiario(String bene_nome, String bene_agencia, String bene_digito_agencia, String bene_codigo_beneficiario, String bene_digito_codigo_beneficiario, String bene_numero_convenio, String bene_carteira, String bene_nosso_numero, Endereco bene_endereco) {
        this.bene_nome = bene_nome;
        this.bene_agencia = bene_agencia;
        this.bene_digito_agencia = bene_digito_agencia;
        this.bene_codigo_beneficiario = bene_codigo_beneficiario;
        this.bene_digito_codigo_beneficiario = bene_digito_codigo_beneficiario;
        this.bene_numero_convenio = bene_numero_convenio;
        this.bene_carteira = bene_carteira;
        this.bene_nosso_numero = bene_nosso_numero;
        this.bene_endereco = bene_endereco;
    }

    public String getBene_nome() {
        return bene_nome;
    }

    public void setBene_nome(String bene_nome) {
        this.bene_nome = bene_nome;
    }

    public String getBene_agencia() {
        return bene_agencia;
    }

    public void setBene_agencia(String bene_agencia) {
        this.bene_agencia = bene_agencia;
    }

    public String getBene_digito_agencia() {
        return bene_digito_agencia;
    }

    public void setBene_digito_agencia(String bene_digito_agencia) {
        this.bene_digito_agencia = bene_digito_agencia;
    }

    public String getBene_codigo_beneficiario() {
        return bene_codigo_beneficiario;
    }

    public void setBene_codigo_beneficiario(String bene_codigo_beneficiario) {
        this.bene_codigo_beneficiario = bene_codigo_beneficiario;
    }

    public String getBene_digito_codigo_beneficiario() {
        return bene_digito_codigo_beneficiario;
    }

    public void setBene_digito_codigo_beneficiario(String bene_digito_codigo_beneficiario) {
        this.bene_digito_codigo_beneficiario = bene_digito_codigo_beneficiario;
    }

    public String getBene_numero_convenio() {
        return bene_numero_convenio;
    }

    public void setBene_numero_convenio(String bene_numero_convenio) {
        this.bene_numero_convenio = bene_numero_convenio;
    }

    public String getBene_carteira() {
        return bene_carteira;
    }

    public void setBene_carteira(String bene_carteira) {
        this.bene_carteira = bene_carteira;
    }

    public String getBene_nosso_numero() {
        return bene_nosso_numero;
    }

    public void setBene_nosso_numero(String bene_nosso_numero) {
        this.bene_nosso_numero = bene_nosso_numero;
    }

    public Endereco getBene_endereco() {
        return bene_endereco;
    }

    public void setBene_endereco(Endereco bene_endereco) {
        this.bene_endereco = bene_endereco;
    }
    
    
   
}
