/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
//import Controlador.registro;
/**
 *
 * @author Duoc UC
 */
public class vista_agregar extends javax.swing.JFrame {

    /**
     * Creates new form vista_agregar
     */
    public vista_agregar() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_cod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_nom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_desc = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        tf_precio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_cant = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_tip_choc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cb_tip_sab = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cb_tip_marca = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("AGREGAR CHOCOLATE");

        jLabel2.setText("Código:");

        tf_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        tf_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripción:");

        ta_desc.setColumns(20);
        ta_desc.setRows(5);
        jScrollPane1.setViewportView(ta_desc);

        jLabel5.setText("Precio Venta:");

        tf_precio.setText("0");

        jLabel6.setText("Cantidad:");

        tf_cant.setText("0");
        tf_cant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cantActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo Chocolate:");

        cb_tip_choc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione tipo", "Blanco", "Negro", "Con Fruta" }));
        cb_tip_choc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tip_chocActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo Sabor:");

        cb_tip_sab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione sabor", "Bitter", "Leche", "Blanco" }));

        jLabel9.setText("Marca:");

        cb_tip_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione marca", "Nestle", "Costa", "LaFete", "Entrelagos" }));

        jLabel10.setText("Azucar:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Si");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar ventana");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_nom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(tf_cod, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tf_cant, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cb_tip_marca, javax.swing.GroupLayout.Alignment.LEADING, 0, 147, Short.MAX_VALUE)
                                        .addComponent(cb_tip_sab, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_tip_choc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(tf_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cb_tip_choc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_tip_sab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_tip_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_cantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cantActionPerformed

    private void tf_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codActionPerformed

    private void tf_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomActionPerformed

    private void cb_tip_chocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tip_chocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tip_chocActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*String cod, nom, desc, tip_choc, tip_sab, marc, sugar;
        int precio, cant;
        cod = "";
        nom = "";
        desc = "";
        tip_choc = "";
        tip_sab = "";
        marc = " ";
        sugar = "";
        precio = 0;
        cant = 0;
        jRadioButton1.setActionCommand("Si");
        jRadioButton2.setActionCommand("No");
        
        cod = tf_cod.getText();
        nom = tf_nom.getText();
        desc = ta_desc.getText();
        tip_choc = cb_tip_choc.getSelectedItem().toString();
        tip_sab = cb_tip_sab.getSelectedItem().toString();
        marc = cb_tip_marca.getSelectedItem().toString();
        precio = Integer.parseInt(tf_precio.getText());
        cant = Integer.parseInt(tf_cant.getText());
        sugar = buttonGroup1.getSelection().getActionCommand();
        
        registro reg = new registro();
        
        if(cod.length()== 3){
            if(nom.length() > 0){
                if(desc.length() > 0){
                    if(precio > 0){
                       if(cant >= 0){
                          if(reg.validar(cod,nom,desc,tip_choc,tip_sab,marc,precio,cant,sugar) == 1){
                             reg.validar(cod,nom,desc,tip_choc,tip_sab,marc,precio,cant,sugar);
                             javax.swing.JOptionPane.showMessageDialog(this, "El registro ha sido ingresado exitosamente!!");
                          }else{
                              javax.swing.JOptionPane.showMessageDialog(this, "El código ingresado ya existe en los registros!");
                          }                         
                       } else{
                          javax.swing.JOptionPane.showMessageDialog(this, "El campo Cantidad debe ser al menos '0'!");  
                       }
                    }else{
                       javax.swing.JOptionPane.showMessageDialog(this, "El campo Precio debe ser mayor a '0'!"); 
                    }
                }else{
                    javax.swing.JOptionPane.showMessageDialog(this, "El campo Descripción no puede estar vacío!");
                }
            }else{
               javax.swing.JOptionPane.showMessageDialog(this, "El campo Nombre no puede estar vacío!"); 
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "El código debe ser de 3 caracteres!");
        }*/
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(vista_agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cb_tip_choc;
    public javax.swing.JComboBox<String> cb_tip_marca;
    public javax.swing.JComboBox<String> cb_tip_sab;
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextArea ta_desc;
    public javax.swing.JTextField tf_cant;
    public javax.swing.JTextField tf_cod;
    public javax.swing.JTextField tf_nom;
    public javax.swing.JTextField tf_precio;
    // End of variables declaration//GEN-END:variables
}