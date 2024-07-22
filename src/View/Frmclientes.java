/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import dao.ClientesDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Clientes;

/*
 *
 * @author Cezarino Hora
 */
public class Frmclientes extends javax.swing.JFrame {

    /**
     * Creates new form Frmclientes
     */
    // Metodo listar na tabela
    public void listar(){
        
        ClientesDao dao = new ClientesDao();
        List<Clientes> lista = dao.listarClientes();
        DefaultTableModel dados = (DefaultTableModel) tabelaClientes.getModel();
        dados.setNumRows(0);
        
        for (Clientes c:lista){
        dados.addRow(new Object[]{
            c.getId_cliente(),
            c.getNome(),
            c.getCpf(),
            c.getEmail(),
            c.getTelefone(),
            c.getCep(),
            c.getEndereco(),
            c.getCidade(),
            c.getUf()
         });
        }
    }
    public Frmclientes() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfone = new javax.swing.JFormattedTextField();
        txtcpf = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcep = new javax.swing.JFormattedTextField();
        txtendereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbuf = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Código:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 43, -1, -1));

        txtcodigo.setEditable(false);
        txtcodigo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        jPanel2.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 43, 91, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 86, -1, -1));

        txtnome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        jPanel2.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 526, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CPF:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Email:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 526, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, -1, -1));

        try {
            txtfone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtfone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel2.add(txtfone, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 210, 30));

        try {
            txtcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcpf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcpfActionPerformed(evt);
            }
        });
        jPanel2.add(txtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("CEP:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtcep.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcepActionPerformed(evt);
            }
        });
        jPanel2.add(txtcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 200, 30));

        txtendereco.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenderecoActionPerformed(evt);
            }
        });
        jPanel2.add(txtendereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 526, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Endereço:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Cidade:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtcidade.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtcidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcidadeActionPerformed(evt);
            }
        });
        jPanel2.add(txtcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 330, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("UF:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, -1, -1));

        cbuf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbuf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MT", "SP", "MS", " " }));
        jPanel2.add(cbuf, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 100, -1));

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNovo.setText("+ NOVO");
        jPanel2.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 110, 60));

        btnsalvar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 110, 60));

        btneditar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btneditar.setText("EDITAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        jPanel2.add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 120, 60));

        btnexcluir.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnexcluir.setText("EXCLUIR");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 120, 60));

        jTabbedPane1.addTab("Dados Pessoais", jPanel2);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Nome:");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Email", "Telefone", "CEP", "Endereco", "Cidade", "UF"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addGap(0, 584, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addGap(73, 73, 73))
        );

        jTabbedPane1.addTab("Consulta de Clientes", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcpfActionPerformed

    private void txtcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcepActionPerformed

    private void txtenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtenderecoActionPerformed

    private void txtcidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcidadeActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // botão Editar
        Clientes obj = new Clientes();

        obj.setNome(txtnome.getText());
        obj.setCpf(txtcpf.getText());
        obj.setEmail(txtemail.getText());
        obj.setTelefone(txtfone.getText());
        obj.setCep(txtcep.getText());
        obj.setEndereco(txtendereco.getText());
        obj.setCidade(txtcidade.getText());
        obj.setUf(cbuf.getSelectedItem().toString());

        obj.setId_cliente(Integer.parseInt(txtcodigo.getText()));

        ClientesDao dao = new ClientesDao();

        dao.alterarCliente(obj);
       
        
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // botão salvar
 
        Clientes obj = new Clientes();

        obj.setNome(txtnome.getText());
        obj.setCpf(txtcpf.getText());
        obj.setEmail(txtemail.getText());
        obj.setTelefone(txtfone.getText());
        obj.setCep(txtcep.getText());
        obj.setEndereco(txtendereco.getText());
        obj.setCidade(txtcidade.getText());
        obj.setUf(cbuf.getSelectedItem().toString());

        ClientesDao dao = new ClientesDao();

        dao.cadastrarCliente(obj);

    }//GEN-LAST:event_btnsalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Carrega a lista
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        // Pega os dados
        jTabbedPane1.setSelectedIndex(0);
        txtcodigo.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),0).toString());
        txtnome.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),1).toString());
        txtcpf.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),2).toString());
        txtemail.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),3).toString());
        txtfone.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),4).toString());
        txtcep.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),5).toString());
        txtendereco.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),6).toString());
        txtcidade.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),7).toString());
        cbuf.setSelectedItem(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),8).toString());
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        // botão excluir
         Clientes obj = new Clientes();

        obj.setId_cliente(Integer.parseInt(txtcodigo.getText()));

        ClientesDao dao = new ClientesDao();

        dao.excluirCliente(obj);
    }//GEN-LAST:event_btnexcluirActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmclientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmclientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<String> cbuf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JFormattedTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JFormattedTextField txtfone;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
