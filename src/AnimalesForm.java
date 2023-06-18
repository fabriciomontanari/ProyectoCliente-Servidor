
import javax.swing.JOptionPane;
import java.io.*;

public class AnimalesForm extends javax.swing.JFrame {

    public AnimalesForm() {
        initComponents();
         initComponents();
        setLocationRelativeTo(null);
        setTitle("Animales");
        setResizable(false);
    }
     public void agregar() {
       Mantenimiento a = new Mantenimiento();
        a.setNombreAnimal(jTextField1.getText());
        a.setEdadAnimal(jTextField2.getText());
        a.setRaza(jTextField3.getText());
        a.setGenero(jTextField4.getText());
        a.setMedicamentos(jTextField5.getText());
        a.setDiagnostico(jTextField6.getText());
        a.setAlimentacion(jTextField7.getText());
        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("animales.dat", true));
            salida.writeUTF(a.getNombreAnimal());
            salida.writeUTF(a.getEdadAnimal());
            salida.writeUTF(a.getRaza());
            salida.writeUTF(a.getGenero());
            salida.writeUTF(a.getMedicamentos());
            salida.writeUTF(a.getDiagnostico());
            salida.writeUTF(a.getAlimentacion());
            
            JOptionPane.showMessageDialog(null, "¡Datos agregados correctamente!");
            limpiarControles();
            salida.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "¡Error al guardar!");
        }
    }
    
    

    public void modificar() {
        Mantenimiento a = new Mantenimiento();
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("animales.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("auxiliar.dat"));
            try {
                while (true) {
                    a.setNombreAnimal(entrada.readUTF());
                    a.setMedicamentos(entrada.readUTF());
                    a.setRaza(entrada.readUTF());
                    a.setGenero(entrada.readUTF());
                    a.setDiagnostico(entrada.readUTF());
                    a.setEdadAnimal(entrada.readUTF());
                    if (a.getNombreAnimal().equals(jTextField1.getText())) {
                        a.setDiagnostico(jTextField6.getText());
                         a.setAlimentacion(jTextField7.getText());
                        a.setRaza(jTextField3.getText());
                       a.setGenero(jTextField4.getText());
                        a.setMedicamentos(jTextField5.getText());
                        a.setEdadAnimal(jTextField2.getText());
                    }
                     salida.writeUTF(a.getNombreAnimal());
                     salida.writeUTF(a.getMedicamentos());
                     salida.writeUTF(a.getRaza());
                     salida.writeUTF(a.getGenero());
                     salida.writeUTF(a.getDiagnostico());
                     salida.writeUTF(a.getAlimentacion());
                     salida.writeUTF(a.getEdadAnimal());
                }
            } catch (EOFException ex) {
                entrada.close();
                salida.close();
                JOptionPane.showMessageDialog(null,"¡Datos fueron modificados correctamente!");
                intercambiar();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo!");
        }
    }

    public void eliminar() {
        Mantenimiento a = new Mantenimiento();
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("empleado.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("auxiliar.dat"));
            try {
                while (true) {
                    a.setDiagnostico(entrada.readUTF());
                    a.setAlimentacion(entrada.readUTF());
                    a.setGenero(entrada.readUTF());
                    a.setRaza(entrada.readUTF());
                    a.setMedicamentos(entrada.readUTF());
                    a.setNombreAnimal(entrada.readUTF());
                    a.setEdadAnimal(entrada.readUTF());
                    if (!a.getNombreAnimal().equals(jTextField1.getText())) {
                         salida.writeUTF(a.getNombreAnimal());
                         salida.writeUTF(a.getMedicamentos());
                         salida.writeUTF(a.getRaza());
                         salida.writeUTF(a.getGenero());
                         salida.writeUTF(a.getDiagnostico());
                         salida.writeUTF(a.getAlimentacion());
                         salida.writeUTF(a.getEdadAnimal());
                    }
                }
            } catch (EOFException eofe) {
                salida.close();
                entrada.close();
                JOptionPane.showMessageDialog(null, "¡Datos fueron borrados correctamente!");
                intercambiar();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo!");
        }
    }

    public void intercambiar() {
        Mantenimiento a = new Mantenimiento();
        try {
            DataInputStream entrada = new DataInputStream(new FileInputStream("auxiliar.dat"));
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("empleado.dat"));
            try {
                a.setDiagnostico(entrada.readUTF());
                a.setAlimentacion(entrada.readUTF());
                a.setGenero(entrada.readUTF());
                a.setRaza(entrada.readUTF());
                a.setMedicamentos(entrada.readUTF());
                a.setNombreAnimal(entrada.readUTF());
                a.setEdadAnimal(entrada.readUTF());
                salida.writeUTF(a.getNombreAnimal());
                salida.writeUTF(a.getMedicamentos());
                salida.writeUTF(a.getRaza());
                salida.writeUTF(a.getGenero());
                salida.writeUTF(a.getDiagnostico());
                salida.writeUTF(a.getAlimentacion());
                salida.writeUTF(a.getEdadAnimal());
            } catch (EOFException eofe) {
                salida.close();
                entrada.close();
            }
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "¡No se encontró el archivo!");
        } catch (IOException eioe) {
            JOptionPane.showMessageDialog(null, "¡Error en el dispositivo!");
        }
    }
    
    public void limpiarControles() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
    }

////////////////////////////////////////////////
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Género");

        jLabel6.setText("Medicamentos");

        jLabel7.setText("Diagnostico");

        jLabel1.setText("Nombre");

        jLabel4.setText("Raza");

        jLabel2.setText("Edad");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconos/iconos/delete.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconos/iconos/add.png"))); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconos/iconos/edit.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Alimentación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel6)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)
                        .addGap(64, 64, 64)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        eliminar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modificar();
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
            java.util.logging.Logger.getLogger(AnimalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimalesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimalesForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
