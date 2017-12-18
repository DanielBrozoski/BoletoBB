package br.edu.ifsc.boletoBB.controle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class XMLreader {
    private String nota = ""; //ok
    private String cnpj = ""; //ok
    private String razaosocial = ""; //ok
    private String logradouro = ""; //ok
    private String numero = ""; //ok
    private String bairro = ""; //ok
    private String municipio = ""; //ok
    private String uf = ""; //ok
    private String cep = ""; //ok
    private String pais = ""; //ok
    private String fone = ""; //ok
    private String valorST = ""; //ok
    private String valorDesconto = ""; //ok
    private ArrayList<String> vencimento;
    private ArrayList<String> valor;
    private FileReader arq;
    private BufferedReader lerArq;

    public XMLreader(String url) throws FileNotFoundException, IOException {
        this.arq = new FileReader(url);
        this.lerArq = new BufferedReader(arq);
        String linha = lerArq.readLine();
        this.vencimento = new ArrayList<>();
        this.valor = new ArrayList<>();
        buscaST(linha);
        buscaNOTA(linha);
        buscaDESCONTO(linha);
        buscaCNPJ(buscaDESTINATARIO(linha));
        buscaRAZAOSOCIAL(buscaDESTINATARIO(linha));
        buscaLOGRADOURO(buscaDESTINATARIO(linha));
        buscaNUMERO(buscaDESTINATARIO(linha));
        buscaBAIRRO(buscaDESTINATARIO(linha));
        buscaMUNICIPIO(buscaDESTINATARIO(linha));
        buscaUF(buscaDESTINATARIO(linha));
        buscaCEP(buscaDESTINATARIO(linha));
        buscaPAIS(buscaDESTINATARIO(linha));
        buscaFONE(buscaDESTINATARIO(linha));
       buscaDuplicata(linha);
    }

    public String getNota() {
        return nota;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getPais() {
        return pais;
    }

    public String getFone() {
        return fone;
    }

    public String getValorST() {
        return valorST;
    }

    public String getValorDesconto() {
        return valorDesconto;
    }

    public ArrayList<String> getVencimento() {
        return vencimento;
    }

    public ArrayList<String> getValor() {
        return valor;
    }

    
    
    public void buscaST(String linha){
        int inicio, fim;
        String chaveA = "<vST>";
        String chaveB = "</vST>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.valorST = this.valorST.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaNOTA(String linha){
        
        int inicio, fim;
        String chaveA = "<cNF>";
        String chaveB = "</cNF>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.nota = this.nota.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaDESCONTO(String linha){
        int inicio, fim;
        String chaveA = "<vDesc>";
        String chaveB = "</vDesc>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.valorDesconto = this.valorDesconto.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public String buscaDESTINATARIO(String linha){
        int inicio, fim;
        String chaveA = "<dest>";
        String chaveB = "</dest>";
        String destinatario = "";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            destinatario = destinatario.concat(""+linha.charAt(inicio));
            inicio++;
        }
        return destinatario;
    }
    
    public void buscaCNPJ(String linha){
        int inicio, fim;
        String chaveA = "<CNPJ>";
        String chaveB = "</CNPJ>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.cnpj = this.cnpj.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaRAZAOSOCIAL(String linha){
        int inicio, fim;
        String chaveA = "<xNome>";
        String chaveB = "</xNome>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.razaosocial = this.razaosocial.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaLOGRADOURO(String linha){
        int inicio, fim;
        String chaveA = "<xLgr>";
        String chaveB = "</xLgr>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.logradouro = this.logradouro.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaNUMERO(String linha){
        int inicio, fim;
        String chaveA = "<nro>";
        String chaveB = "</nro>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.numero = this.numero.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaBAIRRO(String linha){
        int inicio, fim;
        String chaveA = "<xBairro>";
        String chaveB = "</xBairro>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.bairro = this.bairro.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaMUNICIPIO(String linha){
        int inicio, fim;
        String chaveA = "<xMun>";
        String chaveB = "</xMun>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.municipio = this.municipio.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaUF(String linha){
        int inicio, fim;
        String chaveA = "<UF>";
        String chaveB = "</UF>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.uf = this.uf.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaCEP(String linha){
        int inicio, fim;
        String chaveA = "<CEP>";
        String chaveB = "</CEP>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.cep = this.cep.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaPAIS(String linha){
        int inicio, fim;
        String chaveA = "<xPais>";
        String chaveB = "</xPais>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.pais = this.pais.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaFONE(String linha){
        int inicio, fim;
        String chaveA = "<fone>";
        String chaveB = "</fone>";
        
        inicio = chaveA.length() + linha.indexOf(chaveA);
        fim = linha.indexOf(chaveB);
        
        while (inicio < fim){
            this.fone = this.fone.concat(""+linha.charAt(inicio));
            inicio++;
        }
    }
    
    public void buscaDuplicata(String linha){
        int inicioVenc, fimVenc;
        String chaveA = "<dVenc>";
        String chaveB = "</dVenc>";
        String vencimento = "";
        int indiceA = 0;
        int indiceB = 0;
            
        
            
            inicioVenc = chaveA.length() + linha.indexOf(chaveA, indiceA);
            fimVenc = linha.indexOf(chaveB, indiceB);

            while (inicioVenc < fimVenc){
                vencimento = vencimento.concat(""+linha.charAt(inicioVenc));
                inicioVenc++;
            }
            this.vencimento.add(vencimento);
            indiceA = linha.indexOf(chaveA, indiceA);
            indiceB = linha.indexOf(chaveB, indiceB);
        
           
            
        
        
        indiceA = 0;
        indiceB = 0;
        String valor = "";
        chaveA = "<vDup>";
        chaveB = "</vDup>";
        
            
            inicioVenc = chaveA.length() + linha.indexOf(chaveA, indiceA);
            fimVenc = linha.indexOf(chaveB, indiceB);

            while (inicioVenc < fimVenc){
                valor = valor.concat(""+linha.charAt(inicioVenc));
                inicioVenc++;
            }
            this.valor.add(valor);
            indiceA = linha.indexOf(chaveA, indiceA);
            indiceB = linha.indexOf(chaveB, indiceB);
        
            
        
    }
    

    
}
