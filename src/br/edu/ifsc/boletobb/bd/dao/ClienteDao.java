//package br.edu.ifsc.boletobb.bd.dao;
//
//import br.edu.ifsc.boletoBB.bd.BancoDeDados;
//import br.edu.ifsc.boletoBB.model.BoletoM;
//import br.edu.ifsc.boletoBB.model.Configuracao;
//import br.com.caelum.stella.boleto.Beneficiario;
//import br.edu.ifsc.boletoBB.model.PagadorM;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//public class ClienteDao {
//    
//    private BancoDeDados db;
//    private ArrayList<PagadorM> listaClientes;
//    private Beneficiario bene;
//   
//    public ClienteDao(BancoDeDados db){
//        
//        this.db = db;
//        this.listaClientes = new ArrayList<PagadorM>();
//        this.consultar();
//    }
//    
//  public void inserir(BoletoM bol) {
//        String sql;
//        sql = "insert into cliente(clie_razaosocial, clie_logradouro, clie_bairro, clie_cidade, clie_uf, clie_cnpj, clie_telefone, clie_cep"
//           +  " values " + "("+bol.getBole_pagador().getPaga_nome()+",'"
//           +    bol.getBole_pagador().getPaga_endereco().getEnde_logradouro() + "','"
//           +    bol.getBole_pagador().getPaga_endereco().getEnde_bairro()+ "','"
//           +    bol.getBole_pagador().getPaga_endereco().getEnde_Cidade()+ "','"
//           +    bol.getBole_pagador().getPaga_endereco().getEnde_uf()+ "','"
//           +    bol.getBole_pagador().getPaga_documento() + "','"
//           +    "00000"+ "','"
//           +    bol.getBole_pagador().getPaga_endereco().getEnde_cep()+ "');";
//        System.out.println(sql);
//        this.db.bdAtualizar(sql);
//    }
//   public void consultar() {
//        String sql;
//        sql = "select * from clientes";
//        this.populaControle(this.db.bdConsultar(sql));
//    }
//      
//   public void populaControle(ResultSet resultSet){
//       try {
//            this.listaClientes.clear();
//            resultSet.first();
//            if (resultSet.isFirst()){
//                while(true) {
//                    PagadorM cliente = new PagadorM();
//                    //clie_razaosocial, clie_logradouro, clie_bairro, clie_cidade, clie_uf, clie_cnpj, clie_telefone, clie_ce
//                    cliente.setPaga_codi(resultSet.getInt("clie_codi"));
//                    cliente.set
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
