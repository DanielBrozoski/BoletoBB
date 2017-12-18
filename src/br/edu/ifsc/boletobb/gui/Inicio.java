package br.edu.ifsc.boletoBB.gui;


//import boletobb.LeituraXml;
import br.edu.ifsc.boletobb.bd.BancoDeDados;
import br.edu.ifsc.boletoBB.controle.GeraBoleto;
import br.edu.ifsc.boletoBB.controle.Usuario;
import br.com.caelum.stella.boleto.Beneficiario;
import br.com.caelum.stella.boleto.Endereco;
import br.edu.ifsc.boletoBB.model.EnderecoM;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author aldir
 */
public class Inicio extends javax.swing.JFrame {

    private Usuario user;
    private BancoDeDados banco;
    private GeraBoleto gerador;
    private Beneficiario beneficiario;
    
    public Inicio() {
        initComponents();
        inicializaBeneficiario();
        this.setLocationRelativeTo(null); //iniciar o frame no meio da tela
        btn_configuracao.setEnabled(false); //iniciar bloqueado até logar
        btn_listar.setEnabled(false); //iniciar bloqueado até logar
        btn_novo.setEnabled(false);  //iniciar bloqueado até logar
        //btn_remessa.setEnabled(false);
        this.user = new Usuario(false); //inicia usuario como false para logado
        this.banco = new BancoDeDados();
        btn_loginActionPerformed(null); //para iniciar ja abrindo a tela de login
        jLabel1.setText("Usuario: Não Logado");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        btn_novo = new javax.swing.JButton();
        btn_configuracao = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_listar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boletos BB");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsc/boletoBB/res/icons/Soma-48.png"))); // NOI18N
        btn_novo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });
        btn_novo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_novoKeyPressed(evt);
            }
        });

        btn_configuracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsc/boletoBB/res/icons/configuracao.png"))); // NOI18N
        btn_configuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_configuracaoActionPerformed(evt);
            }
        });
        btn_configuracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_configuracaoKeyPressed(evt);
            }
        });

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/ifsc/boletoBB/res/icons/login.png"))); // NOI18N
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        btn_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_loginKeyPressed(evt);
            }
        });

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });
        btn_sair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_sairKeyPressed(evt);
            }
        });

        btn_listar.setText("Listar");
        btn_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listarActionPerformed(evt);
            }
        });
        btn_listar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_listarKeyPressed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_configuracao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_configuracao)
                    .addComponent(btn_login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_listar)
                    .addComponent(btn_sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_configuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_configuracaoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracao().setVisible(true);
            }
        });
    }//GEN-LAST:event_btn_configuracaoActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", 2) == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_novoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_novoKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_btn_novoKeyPressed

    private void inicializaBeneficiario(){
         Endereco enderecoBeneficiario = Endereco.novoEndereco()
        		.comLogradouro("Rua Waldomiro Olsen, 567")  
        		.comBairro("Campo da Agua Verde")  
        		.comCep("89.460-000")  
        		.comCidade("Canoinhas")  
        		.comUf("SC");  

        //Quem emite o boleto
        this.beneficiario = Beneficiario.novoBeneficiario()  
                .comNomeBeneficiario("Papelnorte Distribuidora de Papeis Ltda")  
                .comAgencia("0343").comDigitoAgencia("3")  
                .comCodigoBeneficiario("8248").comDigitoCodigoBeneficiario("1")   
                .comNumeroConvenio("1207113")  
                .comCarteira("17")  
                .comEndereco(enderecoBeneficiario)
                .comNossoNumero("9000206");  
    }
    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        jFileChooser1.setMultiSelectionEnabled(true); //permitir multiplos arquivos
        jFileChooser1.showOpenDialog(this); //mostrar a caixa de seleção
        File[] arq = jFileChooser1.getSelectedFiles(); // armazenando os arquivos selecionados em um vetor de File
        int i = 0;
        String[] lote = new String[arq.length]; //criando vetor de String do numero de arquivos selecionados
        while (i < arq.length){ //armazenando os arquivos em um vetor de String com todos os caminhos
            lote[i] = arq[i].toString();
            i++;
        }
        i = 0;
        while(i < lote.length){
            System.out.println("\n" + lote[i]);  //testando se estava armazenado certo os endereços
            i++;
        }
        
        try {
            gerador = new GeraBoleto(arq[0].getAbsolutePath(), beneficiario);
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if(user.isLogado()){
            if(JOptionPane.showConfirmDialog(null, "Voce realmente deseja se desconectar?", "Desconectar-se", 2) == 0){
                this.user.setLogado(false);
                btn_configuracao.setEnabled(false); //iniciar bloqueado até logar
                btn_listar.setEnabled(false); //iniciar bloqueado até logar
                btn_novo.setEnabled(false);  //iniciar bloqueado até logar
               // btn_remessa.setEnabled(false);
                jLabel1.setText("Usuario: Não Logado");
            }
        } else {
            Login login = new Login(this, true);
            login.setVisible(true);
            
            if(login.isVerificacao()){
                this.user.setNome(login.getNome());
                this.user.setSenha(login.getSenha());
                this.user.setLogado(true);
                //JOptionPane.showMessageDialog(null, this.user.getNome()+" e "+ this.user.getSenha()); //testando para ver se retornava certo o nome e senha do usuario
                btn_configuracao.setEnabled(true); //iniciar bloqueado até logar
                btn_listar.setEnabled(true); //iniciar bloqueado até logar
                btn_novo.setEnabled(true);  //iniciar bloqueado até logar
               // btn_remessa.setEnabled(true);
                jLabel1.setText("Usuario: " + this.user.getNome());
            }
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_sairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_sairKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_btn_sairKeyPressed

    private void btn_configuracaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_configuracaoKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_btn_configuracaoKeyPressed

    private void btn_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_loginKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_btn_loginKeyPressed

    private void btn_listarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_listarKeyPressed
        keyPressed(evt);
    }//GEN-LAST:event_btn_listarKeyPressed

    private void btn_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listarActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }//GEN-LAST:event_btn_listarActionPerformed

    public void keyPressed (java.awt.event.KeyEvent evt){
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            btn_sairActionPerformed(null);
        }
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_configuracao;
    private javax.swing.JButton btn_listar;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_sair;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
