package br.edu.ifsc.boletoBB.controle;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package boletobb;
//
//import java.io.File;  
//import java.util.Iterator;  
//import java.util.List;  
//import javax.swing.JOptionPane;  
//import org.jdom.Document;  
//import org.jdom.Element;  
//import org.jdom.input.SAXBuilder;  
//
//
//
//public class LeituraXml {
//    private String tagPai, tipoDeElemento, elementoAlvo, conteudo;  
//    boolean jaAchouTagPai = false;  
//    int ocorreu = 0, ocorrencia = 0;  
//  
//    public String trataXML(  
//            String arquivoXML, //  caminho e nome do arquivo XML a ser lido  
//            String tagPai, //  TAG onde procurar a informacao  
//            String tipoDeElemento,   //  tipo de elemento para procurar (T = TAG, A = Atributo)  
//            String elementoAlvo,   //  nome da TAG?Atributo a ser procurada  
//            int ocorrencia  //  numero de ocorrencias do elemento (mais utilizado qdo o elemento ocorre mais de uma vez. Ex.: elementos de um produto)  
//            ){  
//        String retorno = null;  
//        this.tipoDeElemento = tipoDeElemento;  
//        this.tagPai = tagPai;  
//        this.elementoAlvo = elementoAlvo;  
//        this.ocorrencia = ocorrencia;  
//        File file = new File(arquivoXML);  
//        SAXBuilder builder = new SAXBuilder();  
//        Document document;  
//  
//        try{  
//            document = builder.build(file);  
//            Element el = document.getRootElement();  
//  
//           System.out.println("Elemento Raiz: "+document.getRootElement().getName());  
//            trataElemento(el);  
//            retorno = getConteudo();  
//        } catch(Exception e){  
//            JOptionPane.showMessageDialog(null, "XMLReaderUmaTag - Erro ao tentar tratar o arquivo. \nErro: "+e);  
//        }  
//        return retorno;  
//    }  
//    private void trataElemento(Element el){  
//        List list = el.getChildren();  
//        int tamanho = list.size();  
//        System.out.println("Elemento lido: "+el.getName()+" - tipo: "+el.getContent());  
//        System.out.println("Tamanho da lista: "+tamanho);  
//        if (tamanho > 0){  //Elemento  
//            Iterator it = list.iterator();  
//            for (int i=0;i<tamanho;i++){  
//                Element el1 = (Element)it.next();  
//                String campo = el1.getQualifiedName().toString().trim();  
//                //if (campo.equalsIgnoreCase((tagPai)) || el1.getText().toString().equalsIgnoreCase("")){  
//                if(el1.getQualifiedName().toString().trim().equals(tagPai)) {  
//                   ocorreu++;  
//  
////JOptionPane.showMessageDialog(null,"Encontrou tagPai:"+el1.getQualifiedName().toString().trim());  
//                    jaAchouTagPai = true;  
//                    if (tipoDeElemento.equals("A")) { //  A - attribute  
//                        if (ocorreu == ocorrencia) {  
////JOptionPane.showMessageDialog(null,"Encontrou o Atributo informado para a ocorrencia ("+ocorreu+"/"+ocorrencia+"):"+el1.getAttributeValue(elementoAlvo));  
//                            setConteudo(el1.getAttributeValue(elementoAlvo));  
//                            break;  
//                        }  
//                    } else {  
//                        trataElemento(el1);  
//                    }  
//                } else if (jaAchouTagPai) {  //  
////JOptionPane.showMessageDialog(null,"Lendo elemento da TAG aberta:"+el1.getQualifiedName().toString().trim()+" - Valor: "+el1.getText().toString());  
//                    if (campo.equalsIgnoreCase(elementoAlvo)) {  //  tipo = T - TAG  
////JOptionPane.showMessageDialog(null,"Encontrou elementoAlvo informado para a ocorrencia ("+ocorreu+"/"+ocorrencia+"):"+el1.getQualifiedName().toString().trim()+" - Valor: "+el1.getText().toString());  
//                       if (ocorreu == ocorrencia) {  
//                            setConteudo(el1.getText().toString());  //(el1.getChildText(elementoAlvo));  
//                            ocorreu++;  
//                            break;  
//                        } else {  
//                            jaAchouTagPai = false;  
//                        }  
//                    } else if (ocorreu > ocorrencia) {  
//                        break;  
//                    } else {  
//                        trataElemento(el1);  
//                    }  
//                } else {  
//                    if (el1.getText().toString().equalsIgnoreCase("")) {  
////JOptionPane.showMessageDialog(null,"Elemento Vazio:"+el1.getQualifiedName().toString().trim());  //+" - Valor: "+el1.getText().toString());  
//                    trataElemento(el1);  
//                    }  
//                }  
//            }  
//        } else {  
//        }  
//    }
//    
//    public String getConteudo() {  
//        return conteudo;  
//    }  
//  
//    public void setConteudo(String conteudo) {  
//        this.conteudo = conteudo;  
//    }  
//}
