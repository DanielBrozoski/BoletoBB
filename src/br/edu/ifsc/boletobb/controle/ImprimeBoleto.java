/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.boletobb.controle;

import br.com.caelum.stella.boleto.bancos.BancoDoBrasil;
import br.com.caelum.stella.boleto.Datas;
import br.com.caelum.stella.boleto.Endereco;
import br.com.caelum.stella.boleto.Pagador;
import br.com.caelum.stella.boleto.Boleto;
import br.com.caelum.stella.boleto.Beneficiario;
import br.com.caelum.stella.boleto.transformer.GeradorDeBoleto;

import br.edu.ifsc.boletoBB.model.BoletoM;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Iva
 */
public class ImprimeBoleto {
    private BoletoM bol;
    
    private Pagador pagador;
    private Beneficiario beneficiario;
    private Datas datas;
    private Boleto boleto;

    
    public ImprimeBoleto(BoletoM bol, Beneficiario beneficiario){
        this.bol = bol;
        this.beneficiario = beneficiario;
        
        inicializaDatas();
        inicializaPagador();
        inicializaBoleto();
        imprimeBoleto();
    }
    public void inicializaDatas(){
        String vencimento = bol.getBole_data_vencimento();
        String[] data_vencimento = vencimento.split("-");
        
        String documento = bol.getBole_data_documento();
        String[] data_documento = vencimento.split("-");
       
        String processamento = bol.getBole_data_processsamento();
        String[] data_processamento = vencimento.split("-");
        
        this.datas = Datas.novasDatas()
                .comDocumento(Integer.parseInt(data_documento[2]), Integer.parseInt(data_documento[1]), Integer.parseInt(data_documento[0]))
                .comProcessamento(Integer.parseInt(data_processamento[2]), Integer.parseInt(data_processamento[1]), Integer.parseInt(data_processamento[0]))
                .comVencimento(Integer.parseInt(data_vencimento[2]), Integer.parseInt(data_vencimento[1]), Integer.parseInt(data_vencimento[0])); 
//         
        
    }
    public void inicializaPagador(){
        

        Endereco enderecoPagador = Endereco.novoEndereco()
        		.comLogradouro(bol.getBole_pagador().getPaga_endereco().getEnde_logradouro())
        		.comBairro(bol.getBole_pagador().getPaga_endereco().getEnde_bairro())  
        		.comCep(bol.getBole_pagador().getPaga_endereco().getEnde_cep())  
        		.comCidade(bol.getBole_pagador().getPaga_endereco().getEnde_Cidade())  
        		.comUf(bol.getBole_pagador().getPaga_endereco().getEnde_uf());  
        
        this.pagador = Pagador.novoPagador()
                .comNome(bol.getBole_pagador().getPaga_nome())  
                .comDocumento(bol.getBole_pagador().getPaga_documento())
                .comEndereco(enderecoPagador);
              
        
    }
    
    private void inicializaBoleto() {
             
        this.boleto = Boleto.novoBoleto()  
                .comBanco(bol.getBole_banco())  
                .comDatas(datas)  
                .comBeneficiario(beneficiario)  
                .comPagador(this.pagador)  
                .comValorBoleto(bol.getBole_valor())  
                .comNumeroDoDocumento(bol.getBole_numero_do_documento())
                .comInstrucoes(bol.getBole_intrucoes())  
                .comLocaisDePagamento(bol.getBole_locais_de_pagamento());  
    }
    
    
    
    private void imprimeBoleto(){
         GeradorDeBoleto gerador = new GeradorDeBoleto(this.boleto);  

        // Para gerar um boleto em PDF 
        gerador.geraPDF(boleto.getNumeroDoDocumento() + ".pdf");

        // Para gerar um boleto em PNG  
        gerador.geraPNG(boleto.getNumeroDoDocumento() + ".png");  

        // Para gerar um array de bytes a partir de um PDF  
        byte[] bPDF = gerador.geraPDF();  

        // Para gerar um array de bytes a partir de um PNG  
      //byte[] bPNG = gerador.geraPNG();
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(new File(boleto.getNumeroDoDocumento() + ".pdf"));
        } catch (IOException ex) {
            Logger.getLogger(br.edu.ifsc.boletoBB.controle.GeraBoleto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
