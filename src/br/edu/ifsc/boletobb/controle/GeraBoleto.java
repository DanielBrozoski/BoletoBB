package br.edu.ifsc.boletoBB.controle;

import br.com.caelum.stella.boleto.bancos.BancoDoBrasil;
import br.com.caelum.stella.boleto.Beneficiario;

import br.edu.ifsc.boletoBB.model.BeneficiarioM;
import br.edu.ifsc.boletoBB.model.BoletoM;
import br.edu.ifsc.boletoBB.model.Configuracao;
import br.edu.ifsc.boletoBB.model.EnderecoM;
import br.edu.ifsc.boletoBB.model.PagadorM;
import br.edu.ifsc.boletobb.controle.ImprimeBoleto;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GeraBoleto {
    private XMLreader reader;
    private BoletoM bol;
    private PagadorM pagadorM;
    private EnderecoM endereco;
    
    
    private ImprimeBoleto imp;
    
    private Beneficiario beneficiario;
    
    
    public GeraBoleto(String url, Beneficiario beneficiario) throws IOException {
        this.beneficiario = beneficiario;
        this.reader = new XMLreader(url) ;
        bol = inicializaBoleto();
        imp = new ImprimeBoleto(bol, beneficiario);
        
        

    }  
    
    public BoletoM inicializaBoleto(){
        Date data = new Date(System.currentTimeMillis());  
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd"); 
        
        BoletoM bol = new BoletoM(new BancoDoBrasil(), 
                                 new BeneficiarioM(beneficiario.getNomeBeneficiario(), 
                                                       beneficiario.getAgenciaFormatada(), 
                                                       beneficiario.getDigitoAgencia(), 
                                                       beneficiario.getCodigoBeneficiario(), 
                                                       beneficiario.getDigitoCodigoBeneficiario(), 
                                                       beneficiario.getNumeroConvenio(), 
                                                       beneficiario.getCarteira(), 
                                                       beneficiario.getNossoNumero(), 
                                                       new EnderecoM(
                                                               beneficiario.getEndereco().getLogradouro(), 
                                                               beneficiario.getEndereco().getBairro(), 
                                                               beneficiario.getEndereco().getCep(), 
                                                               beneficiario.getEndereco().getCidade(), 
                                                               beneficiario.getEndereco().getUf())), 
                                    new PagadorM(
                                        reader.getRazaosocial(), 
                                        reader.getCnpj(), 
                                            new EnderecoM(
                                                reader.getLogradouro(), 
                                                reader.getBairro(), 
                                                reader.getCep(), 
                                                reader.getMunicipio(), 
                                                reader.getUf())),
                                    reader.getNumero(), 
                                    "fsdhfajksdfsda", 
                                    "fhdsajhjfkasldfasd", 
                                    formatarDate.format(data), 
                                    formatarDate.format(data), 
                                    reader.getVencimento().get(0), 
                                    reader.getValor().get(0));
       return bol;
    }
    


    
}
