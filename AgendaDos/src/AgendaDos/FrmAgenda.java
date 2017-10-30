
package AgendaDos;

import javax.swing.JOptionPane;

public class FrmAgenda extends javax.swing.JFrame {
    ClsDatos temDatos = new ClsDatos();
    /*primero declaramos un objeto del tipo que contenga las rutinas 
    en este caso de tipo ClsDatos.*/
    
    public FrmAgenda() {
        initComponents();
    }
    /*Creamos un metodo para llenar los campos el cual llamaremos imprimir
    este recibe un parametro de tipo(ontacto c)*/
    public void imprimir(ClsContacto ob){
        txt_Nombre.setText(ob.getNombre());
        txt_Apellido.setText(ob.getApellido());
        txt_Telefono.setText(ob.getTelefono());
    }
    /*Creamos un metodo para limpieza llamado limpiar que no reciba parametro*/
    public void limpiar(){
        txt_Nombre.setText("");
        txt_Apellido.setText("");
        txt_Telefono.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Anterior = new javax.swing.JButton();
        Btn_Siguiente = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Btn_Primero = new javax.swing.JButton();
        Btn_Ultimo = new javax.swing.JButton();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Telefono:");

        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Anterior.setText("<");
        Btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AnteriorActionPerformed(evt);
            }
        });

        Btn_Siguiente.setText(">");
        Btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SiguienteActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");

        Btn_Primero.setText("|<");
        Btn_Primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PrimeroActionPerformed(evt);
            }
        });

        Btn_Ultimo.setText(">|");
        Btn_Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Telefono)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_Primero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Anterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btn_Guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_Siguiente)
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Ultimo))))
                    .addComponent(txt_Apellido)
                    .addComponent(txt_Nombre))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Anterior)
                    .addComponent(Btn_Siguiente)
                    .addComponent(Btn_Primero)
                    .addComponent(Btn_Ultimo)
                    .addComponent(Btn_Guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_UltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UltimoActionPerformed
        if(temDatos.primero()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
            imprimir(temDatos.utimo());
        }
    }//GEN-LAST:event_Btn_UltimoActionPerformed

    private void Btn_PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PrimeroActionPerformed
        if(temDatos.primero()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
          imprimir(temDatos.primero());  
        }
    }//GEN-LAST:event_Btn_PrimeroActionPerformed

    private void Btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AnteriorActionPerformed
         if(temDatos.primero()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
             imprimir(temDatos.anterior());
         }
    }//GEN-LAST:event_Btn_AnteriorActionPerformed

    private void Btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SiguienteActionPerformed
         if(temDatos.primero()==null){
            JOptionPane.showMessageDialog(rootPane, "No hay datos a Mostrar");
        }else{
             imprimir(temDatos.siguinte());
         }
    }//GEN-LAST:event_Btn_SiguienteActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
         if(txt_Nombre.getText().isEmpty() && txt_Apellido.getText().isEmpty() &&
                 txt_Telefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Ingrese Datos");
        }else{
             temDatos.guardar(txt_Nombre.getText(), txt_Apellido.getText(), txt_Telefono.getText());
             limpiar();
         }
    }//GEN-LAST:event_Btn_GuardarActionPerformed
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
            java.util.logging.Logger.getLogger(FrmAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Anterior;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Primero;
    private javax.swing.JButton Btn_Siguiente;
    private javax.swing.JButton Btn_Ultimo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
