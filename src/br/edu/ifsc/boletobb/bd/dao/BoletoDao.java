//package br.edu.ifsc.boletobb.bd.dao;
//
//import br.edu.ifsc.boletoBB.bd.BancoDeDados;
//import br.edu.ifsc.boletoBB.model.BoletoM;
//import br.edu.ifsc.boletoBB.model.Configuracao;
//import br.com.caelum.stella.boleto.Beneficiario;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//public class BoletoDao {
//    
//    private BancoDeDados db;
//    private ArrayList<BoletoM> listaBoletos;
//    private Beneficiario bene;
//   
//    public BoletoDao(BancoDeDados db, Beneficiario bene){
//        this.bene = bene;
//        this.db = db;
//        this.listaBoletos = new ArrayList<BoletoM>();
//        this.consultar();
//    }
//    
//  public void inserir(BoletoM bol) {
//        String sql;
//        sql = "insert into boleto(bole_emissao, bole_vencimento, bole_documento, bole_convenio, bole_carteira, bole_nosso_numero, bole_valor, bole_instrucao, bole_locais_pagamento, bole_situacao, clie_id) "
//           +  " values " + "("+bol.getBole_data_processsamento()+",'"
//           +    bol.getBole_data_vencimento() + "','"
//           +    bol.getBole_data_documento()+ "','"
//           +    bene.getNumeroConvenio()+ "','"
//           +    bene.getCarteira()+ "','"
//           +    bene.getNossoNumero() + "','"
//           +    bol.getBole_valor()+ "','"
//           +    bol.getBole_intrucoes()+ "','"
//           +    "bom"+ "','"
//           +    bol.getBole_data_vencimento() + "','"
//           +    ala.getAla_dcad()+ "');";
//        System.out.println(sql);
//        this.db.bdAtualizar(sql);
//    }
//   public void consultar() {
//        String sql;
//        sql = "select * from boletos";
//        this.populaControle(this.db.bdConsultar(sql));
//    }
//    public void consultar(int clie_codi, int o) {
//        String sql;
//        if(o == 1)
//        sql = "select * from Boleto where clie_id = "+clie_codi;
//        if(o==2)
//        sql = "select * from Boleto where esta_codi = "+clie_codi;        
//                
//        this.populaControle(this.db.bdConsultar(sql));
//    }
//    public void consultar(float valor) {
//        String sql;
//        sql = "select * from Cidades where bole_valor = "+valor;
//        System.out.println(sql);
//        this.populaControle(this.db.bdConsultar(sql));
//    }
//    
//   public void populaControle(ResultSet resultSet){
//       try {
//            this.listaBoletos.clear();
//            resultSet.first();
//            if (resultSet.isFirst()){
//                while(true) {
//                    BoletoM boleto = new BoletoM();
//
//                    boleto.getBole_banco(resultSet.getInt(""));
//                    cidade.setCida_nome(resultSet.getString("cida_nome"));
//                    cidade.setEsta_codi(resultSet.getInt("esta_codi"));
//                    this.listaCidades.add(cidade);
//                    resultSet.next();
//                    if (resultSet.isAfterLast()) {
//                        break;
//                    }
//                }
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//   }
//
//    public ArrayList<Cidades> getListaCidades() {
//        return listaCidades;
//    }
//
//    public void setListaCidades(ArrayList<Cidades> listaCidades) {
//        this.listaCidades = listaCidades;
//    }
//
//}
//
//}
