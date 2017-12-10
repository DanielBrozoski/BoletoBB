package br.edu.ifsc.boletoBB.controle;

import br.edu.ifsc.boletoBB.boleto.model.Beneficiario;
import br.edu.ifsc.boletoBB.boleto.model.Boleto;
import br.edu.ifsc.boletoBB.boleto.model.Endereco;
import br.edu.ifsc.boletoBB.boleto.model.Pagador;
import br.com.caelum.stella.boleto.bancos.BancoDoBrasil;
import java.io.IOException;

public class GeraBoleto {
    private XMLreader reader;
    private Boleto boleto;
    private Beneficiario beneficiario;
    private Pagador pagador;
    private Endereco endereco;

    public GeraBoleto(String url, Beneficiario beneficiario) throws IOException {
        this.beneficiario = beneficiario;
        this.reader = new XMLreader(url) ;
        inicializaBoleto();
    }

    private void inicializaBoleto() {
        this.endereco = new Endereco(reader.getLogradouro(), reader.getBairro(), reader.getCep(), reader.getMunicipio(), reader.getUf());
        this.pagador = new Pagador(reader.getRazaosocial(), reader.getCnpj(), endereco);
        this.boleto = new Boleto(new BancoDoBrasil(), //banco
                                 beneficiario, // beneficiario 
                                 pagador,  //pagador
                                 reader.getNumero(), // numero do doumento 
                                 "instrucao 1", "instrucao 2", "instrucao 3", // instruções 
                                 "Qualquer banco até o vencimento", //locais de pagamento
                                 "asdfsd",  // data processamento
                                 "sdfsadfsd", //data documento
                                 reader.getVencimento(), // data vencimento
                                 reader.getValor()); // valor do documento
        
    }
   

    
}
