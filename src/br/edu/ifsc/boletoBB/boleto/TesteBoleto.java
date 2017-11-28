/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.boletoBB.boleto;

import br.com.caelum.stella.boleto.Banco;
import br.com.caelum.stella.boleto.Beneficiario;
import br.com.caelum.stella.boleto.Boleto;
import br.com.caelum.stella.boleto.Datas;
import br.com.caelum.stella.boleto.Endereco;
import br.com.caelum.stella.boleto.Pagador;
import br.com.caelum.stella.boleto.bancos.BancoDoBrasil;
import br.com.caelum.stella.boleto.exception.BoletoException;
import br.com.caelum.stella.boleto.transformer.GeradorDeBoleto;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author aldir
 */
public class TesteBoleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Datas datas = Datas.novasDatas()
                .comDocumento(1, 5, 2008)
                .comProcessamento(1, 5, 2008)
                .comVencimento(2, 5, 2008);  

        Endereco enderecoBeneficiario = Endereco.novoEndereco()
        		.comLogradouro("Rua Waldomiro Olsen, 567")  
        		.comBairro("Campo da Agua Verde")  
        		.comCep("89.460-000")  
        		.comCidade("Canoinhas")  
        		.comUf("SC");  

        //Quem emite o boleto
        Beneficiario beneficiario = Beneficiario.novoBeneficiario()  
                .comNomeBeneficiario("Papelnorte Distribuidora de Papeis Ltda")  
                .comAgencia("0343").comDigitoAgencia("3")  
                .comCodigoBeneficiario("8248").comDigitoCodigoBeneficiario("1")   
                .comNumeroConvenio("1207113")  
                .comCarteira("17")  
                .comEndereco(enderecoBeneficiario)
                .comNossoNumero("9000206");  

        Endereco enderecoPagador = Endereco.novoEndereco()
        		.comLogradouro("Av dos Gays, 111 apto 333")  
        		.comBairro("Bairro Teste")  
        		.comCep("01234-111")  
        		.comCidade("São Paulo")  
        		.comUf("SP");  
        
        //Quem paga o boleto
        Pagador pagador = Pagador.novoPagador()  
                .comNome("Bruno dos Anjos")  
                .comDocumento("111.222.333-12")
                .comEndereco(enderecoPagador);

        Banco banco = new BancoDoBrasil();  

        Boleto boleto = Boleto.novoBoleto()  
                .comBanco(banco)  
                .comDatas(datas)  
                .comBeneficiario(beneficiario)  
                .comPagador(pagador)  
                .comValorBoleto("200.00")  
                .comNumeroDoDocumento("1234")
                .comInstrucoes("instrucao 1", "instrucao 2", "instrucao 3")  
                .comLocaisDePagamento("Qualquer banco até o vencimento");  

        
        GeradorDeBoleto gerador = new GeradorDeBoleto(boleto);  

        // Para gerar um boleto em PDF  
        gerador.geraPDF("BancoDoBrasil.pdf");  

        // Para gerar um boleto em PNG  
      //gerador.geraPNG("BancoDoBrasil.png");  

        // Para gerar um array de bytes a partir de um PDF  
        byte[] bPDF = gerador.geraPDF();  

        // Para gerar um array de bytes a partir de um PNG  
      //byte[] bPNG = gerador.geraPNG();
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File("BancoDoBrasil.pdf"));
    }
    
}
