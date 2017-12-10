package br.edu.ifsc.boletoBB.boleto.model;

import java.util.ArrayList;
import br.com.caelum.stella.boleto.Banco; 

public class Boleto {
    private Banco bole_banco;
    private Beneficiario bole_benebeneficiario;
    private Pagador bole_pagador;
    private String bole_numero_do_documento;
    private String bole_intrucoes;
    private String bole_locais_de_pagamento;
    private String bole_data_processsamento;
    private String bole_data_documento;
    private ArrayList<String> bole_data_vencimento;
    private ArrayList<String> bole_valor;

    public Boleto(Banco bole_banco, Beneficiario bole_benebeneficiario, Pagador bole_pagador, String bole_numero_do_documento, String bole_intrucoes, String bole_locais_de_pagamento, String bole_data_processsamento, String bole_data_documento, ArrayList<String> bole_data_vencimento, ArrayList<String> bole_valor) {
        this.bole_banco = bole_banco;
        this.bole_benebeneficiario = bole_benebeneficiario;
        this.bole_pagador = bole_pagador;
        this.bole_numero_do_documento = bole_numero_do_documento;
        this.bole_intrucoes = bole_intrucoes;
        this.bole_locais_de_pagamento = bole_locais_de_pagamento;
        this.bole_data_processsamento = bole_data_processsamento;
        this.bole_data_documento = bole_data_documento;
        this.bole_data_vencimento = bole_data_vencimento;
        this.bole_valor = bole_valor;
    }
    
    
    

    public Banco getBole_banco() {
        return bole_banco;
    }

    public void setBole_banco(Banco bole_banco) {
        this.bole_banco = bole_banco;
    }

    public Beneficiario getBole_benebeneficiario() {
        return bole_benebeneficiario;
    }

    public void setBole_benebeneficiario(Beneficiario bole_benebeneficiario) {
        this.bole_benebeneficiario = bole_benebeneficiario;
    }

    public Pagador getBole_pagador() {
        return bole_pagador;
    }

    public void setBole_pagador(Pagador bole_pagador) {
        this.bole_pagador = bole_pagador;
    }

    public String getBole_numero_do_documento() {
        return bole_numero_do_documento;
    }

    public void setBole_numero_do_documento(String bole_numero_do_documento) {
        this.bole_numero_do_documento = bole_numero_do_documento;
    }

    public String getBole_intrucoes() {
        return bole_intrucoes;
    }

    public void setBole_intrucoes(String bole_intrucoes) {
        this.bole_intrucoes = bole_intrucoes;
    }

    public String getBole_locais_de_pagamento() {
        return bole_locais_de_pagamento;
    }

    public void setBole_locais_de_pagamento(String bole_locais_de_pagamento) {
        this.bole_locais_de_pagamento = bole_locais_de_pagamento;
    }
            
    
   
}
