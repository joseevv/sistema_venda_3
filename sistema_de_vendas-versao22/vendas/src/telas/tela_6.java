/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;
import static java.lang.Integer.parseInt;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo_query.dao.totalvendas;
import model.bean.venda_bean;

//import modelo_query.dao.ProdutoDAO;
/**
 *
 * @author 963478
 */
public class tela_6 extends javax.swing.JFrame {

    /**
     * Creates new form tela_6
     */
    public tela_6() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DINHEIRO = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pagamentos = new javax.swing.JLabel();
        dinheiro = new javax.swing.JLabel();
        cartao = new javax.swing.JLabel();
        cheque = new javax.swing.JLabel();
        troco = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        obs = new javax.swing.JLabel();
        observacao = new javax.swing.JTextField();
        totalField = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        finalizar = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        hoje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        DINHEIRO.setBackground(new java.awt.Color(255, 255, 255));
        DINHEIRO.setForeground(new java.awt.Color(255, 255, 255));
        DINHEIRO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 105, 255));

        pagamentos.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        pagamentos.setForeground(new java.awt.Color(255, 255, 255));
        pagamentos.setText("Pagamentos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(pagamentos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(pagamentos)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        DINHEIRO.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        dinheiro.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dinheiro.setText("DINHEIRO:");
        DINHEIRO.add(dinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        cartao.setBackground(new java.awt.Color(0, 0, 0));
        cartao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cartao.setText("CARTÃO:");
        DINHEIRO.add(cartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        cheque.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cheque.setText("CHEQUE:");
        DINHEIRO.add(cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        troco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        troco.setText("TROCO:");
        DINHEIRO.add(troco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        total.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        total.setText("TOTAL:");
        DINHEIRO.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        obs.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        obs.setText("Obs.:");
        DINHEIRO.add(obs, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 166, -1, -1));

        observacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                observacaoActionPerformed(evt);
            }
        });
        DINHEIRO.add(observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 164, 330, 130));

        totalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalFieldActionPerformed(evt);
            }
        });
        DINHEIRO.add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 150, 30));
        DINHEIRO.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 150, 30));
        DINHEIRO.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 150, 30));
        DINHEIRO.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 150, 30));
        DINHEIRO.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 150, 30));

        finalizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        finalizar.setText("salvar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        DINHEIRO.add(finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 190, 40));

        soma.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        soma.setText("somar");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });
        DINHEIRO.add(soma, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 190, 40));
        DINHEIRO.add(hoje, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 170, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DINHEIRO, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DINHEIRO, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void observacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_observacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_observacaoActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizarActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        // TODO add your handling code here:
        
        int a,b,c,d,e;
        
        a = parseInt(c1.getText());
        b = parseInt(c2.getText());
        c = parseInt(c3.getText());
        d = parseInt(c4.getText());
        e = a+b+c+d;
        totalField.setText(""+e);
        
        Date dataAnual = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = sdf.format(dataAnual);
        hoje.setText(""+dataFormatada);
        
        String obs = observacao.getText();
        
        
        venda_bean v = new venda_bean();
        totalvendas dao = new totalvendas();
        
        v.setobservacao(""+obs);
        
        v.setData(""+dataFormatada);
        dao.create(v);
        
            
        
    }//GEN-LAST:event_somaActionPerformed

    private void totalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(tela_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DINHEIRO;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JLabel cartao;
    private javax.swing.JLabel cheque;
    private javax.swing.JLabel dinheiro;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel hoje;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel obs;
    private javax.swing.JTextField observacao;
    private javax.swing.JLabel pagamentos;
    private javax.swing.JButton soma;
    private javax.swing.JLabel total;
    private javax.swing.JTextField totalField;
    private javax.swing.JLabel troco;
    // End of variables declaration//GEN-END:variables
}
