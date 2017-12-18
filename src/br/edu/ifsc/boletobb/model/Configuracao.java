package br.edu.ifsc.boletoBB.model;

import br.edu.ifsc.boletoBB.model.EnderecoM;

public class Configuracao {
    private String conf_razao_social;
    private String conf_cnpj;
    private String conf_telefone;
    private String conf_carteira;
    private String conf__modalidade;
    private String conf_mensagem;
    private int conf_juros;
    private int conf_multa;
    private String conf_agencia;
    private String conf_codigo_agencia;
    private String conf_conta;
    private boolean check_protestar;
    private EnderecoM conf_ende;

    public Configuracao(String conf_razao_social, String conf_cnpj, String conf_telefone, String conf_carteira, String conf__modalidade, String conf_mensagem, int conf_juros, int conf_multa, String conf_agencia, String conf_conta, String conf_codigo_agencia, boolean check_protestar, EnderecoM conf_ende) {
        this.conf_razao_social = conf_razao_social;
        this.conf_cnpj = conf_cnpj;
        this.conf_telefone = conf_telefone;
        this.conf_carteira = conf_carteira;
        this.conf__modalidade = conf__modalidade;
        this.conf_mensagem = conf_mensagem;
        this.conf_juros = conf_juros;
        this.conf_multa = conf_multa;
        this.conf_agencia = conf_agencia;
        this.conf_codigo_agencia = conf_codigo_agencia;
        this.conf_conta = conf_conta;
        this.check_protestar = check_protestar;
        this.conf_ende = conf_ende;
    }

    public String getConf_codigo_agencia() {
        return conf_codigo_agencia;
    }

    public void setConf_codigo_agencia(String conf_codigo_agencia) {
        this.conf_codigo_agencia = conf_codigo_agencia;
    }
    
    
    
    public String getConf_razao_social() {
        return conf_razao_social;
    }

    public void setConf_razao_social(String conf_razao_social) {
        this.conf_razao_social = conf_razao_social;
    }

    public String getConf_cnpj() {
        return conf_cnpj;
    }

    public void setConf_cnpj(String conf_cnpj) {
        this.conf_cnpj = conf_cnpj;
    }

    public String getConf_telefone() {
        return conf_telefone;
    }

    public void setConf_telefone(String conf_telefone) {
        this.conf_telefone = conf_telefone;
    }

    public String getConf_carteira() {
        return conf_carteira;
    }

    public void setConf_carteira(String conf_carteira) {
        this.conf_carteira = conf_carteira;
    }

    public String getConf__modalidade() {
        return conf__modalidade;
    }

    public void setConf__modalidade(String conf__modalidade) {
        this.conf__modalidade = conf__modalidade;
    }

    public String getConf_mensagem() {
        return conf_mensagem;
    }

    public void setConf_mensagem(String conf_mensagem) {
        this.conf_mensagem = conf_mensagem;
    }

    public int getConf_juros() {
        return conf_juros;
    }

    public void setConf_juros(int conf_juros) {
        this.conf_juros = conf_juros;
    }

    public int getConf_multa() {
        return conf_multa;
    }

    public void setConf_multa(int conf_multa) {
        this.conf_multa = conf_multa;
    }

    public String getConf_agencia() {
        return conf_agencia;
    }

    public void setConf_agencia(String conf_agencia) {
        this.conf_agencia = conf_agencia;
    }

    public String getConf_conta() {
        return conf_conta;
    }

    public void setConf_conta(String conf_conta) {
        this.conf_conta = conf_conta;
    }

    public boolean isCheck_protestar() {
        return check_protestar;
    }

    public void setCheck_protestar(boolean check_protestar) {
        this.check_protestar = check_protestar;
    }

    public EnderecoM getConf_ende() {
        return conf_ende;
    }

    public void setConf_ende(EnderecoM conf_ende) {
        this.conf_ende = conf_ende;
    }
    
    
    
    
}
