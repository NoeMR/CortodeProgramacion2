/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cortoprogramacion2;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Noé
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    
    Control controlE;

    // crear modelo de lista
    DefaultListModel modeloLista;

    int numeroEstudiante;
    
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        txtNombre.requestFocus();
        transparentes();
        
        //radiobutton agregar seleccionado por defecto
        rbtnAgregar.setSelected(true);
        txtCarnet.setEditable(false);

        controlE = new Control();

        //instanciar modelo y asignarlo al control de lista
        modeloLista = new DefaultListModel();
        lstEstudiantes.setModel(modeloLista);

        numeroEstudiante = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGroup = new javax.swing.ButtonGroup();
        lblNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        rbtnAgregar = new javax.swing.JRadioButton();
        rbtnBuscar = new javax.swing.JRadioButton();
        rbtnEditar = new javax.swing.JRadioButton();
        rbtnEliminar = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList<>();
        lblResultado = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnAccion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        txtGrado = new javax.swing.JTextField();
        lblGrado = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Apellido:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 290, 30));

        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 290, 30));

        bGroup.add(rbtnAgregar);
        rbtnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnAgregar.setText("Agregar");
        rbtnAgregar.setBorder(null);
        rbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, 30));

        bGroup.add(rbtnBuscar);
        rbtnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnBuscar.setText("Buscar");
        rbtnBuscar.setBorder(null);
        rbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, 30));

        bGroup.add(rbtnEditar);
        rbtnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnEditar.setText("Editar");
        rbtnEditar.setBorder(null);
        rbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, 30));

        bGroup.add(rbtnEliminar);
        rbtnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbtnEliminar.setText("Eliminar");
        rbtnEliminar.setBorder(null);
        rbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, 30));

        jScrollPane1.setViewportView(lstEstudiantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 480, 190));
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 180, 20));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        btnAccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAccion.setText("Acción");
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cernet:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        txtCarnet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCarnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCarnetKeyTyped(evt);
            }
        });
        getContentPane().add(txtCarnet, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 290, 30));

        txtGrado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtGrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGradoKeyTyped(evt);
            }
        });
        getContentPane().add(txtGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 290, 30));

        lblGrado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGrado.setText("Grado:");
        getContentPane().add(lblGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAgregarActionPerformed
        txtCarnet.setText("");
        txtCarnet.setEditable(false);
        txtNombre.requestFocus();
    }//GEN-LAST:event_rbtnAgregarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        if (rbtnAgregar.isSelected() == true) {
            if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtGrado.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Error: asegurese de ingresar el nombre, apellido y grado del estudiante a agregar");
            } else {
                controlE.agregar(txtNombre.getText(), txtApellido.getText(), txtGrado.getText());
                // se le pasa numeroEstudiante como parametro al metodo informacion que indica el indice o posicion del arrayList y se agrega ese elemento a la lista
                modeloLista.addElement(controlE.informacion(numeroEstudiante));
                ordenarLista();
                numeroEstudiante++;
                txtApellido.setText("");
                txtNombre.setText("");
                txtGrado.setText("");
            }
            txtNombre.requestFocus();
        } else if (rbtnEliminar.isSelected() == true) {
            ordenarLista();
            //en la siguiente linea se envia el parametro para eliminar el registro del arrayList y a la ves recive la posicion del elemento que se va a eliminar de la lista de gui
            int eliminado = controlE.elminar(txtCarnet.getText());
            // se asigna la informacion del estudiante elimado al label y luego se elimina de la lista (se elimina solo si existe el elemento en la posicion obtenida)
            if (eliminado < modeloLista.size()) {
                lblResultado.setText(String.valueOf(modeloLista.get(eliminado)));
                modeloLista.remove(eliminado);
            }
            txtCarnet.setText("");
            txtCarnet.requestFocus();
        } else if (rbtnBuscar.isSelected() == true) {
            ordenarLista();
            lblResultado.setText(controlE.buscar(txtCarnet.getText()));
            txtCarnet.setText("");
            txtCarnet.requestFocus();
        } else if (rbtnEditar.isSelected() == true) {
            if (txtNombre.getText().equals("") && txtApellido.getText().equals("") && txtGrado.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Error: asegurese de ingresar la informacion a modificar del estudiante");
            } else {
                //en la siguiente linea se envia el parametro para editar el registro del arrayList y a la ves recive la posicion del elemento que se va a editar de la lista de gui
                int editado = controlE.editar(txtNombre.getText(), txtApellido.getText(), txtGrado.getText(), txtCarnet.getText());
                // se modifica solo si existe el elemento en la posicion obtenida
                if (editado < modeloLista.size()) {
                    ordenarLista();
                    modeloLista.set(editado, controlE.informacion(editado));
                    txtGrado.setText("");
                    txtApellido.setText("");
                    txtNombre.setText("");
                }
                txtNombre.requestFocus();
            }
        }
    }//GEN-LAST:event_btnAccionActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (!(Character.isLetter(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        if (!(Character.isLetter(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void rbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEliminarActionPerformed
        txtApellido.setText("");
        txtNombre.setText("");
        txtGrado.setText("");
        txtApellido.setEditable(false);
        txtNombre.setEditable(false);
        txtGrado.setEditable(false);
        txtCarnet.setEditable(true);
        txtCarnet.requestFocus();
    }//GEN-LAST:event_rbtnEliminarActionPerformed

    private void rbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBuscarActionPerformed
        txtApellido.setText("");
        txtNombre.setText("");
        txtGrado.setText("");
        txtApellido.setEditable(false);
        txtNombre.setEditable(false);
        txtGrado.setEditable(false);
        txtCarnet.setEditable(true);
        txtCarnet.requestFocus();
    }//GEN-LAST:event_rbtnBuscarActionPerformed

    private void rbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEditarActionPerformed
        txtApellido.setText("");
        txtNombre.setText("");
        txtGrado.setText("");
        txtCarnet.setText("");
        txtApellido.setEditable(true);
        txtNombre.setEditable(true);
        txtGrado.setEditable(true);
        txtCarnet.setEditable(true);
        txtNombre.requestFocus();
    }//GEN-LAST:event_rbtnEditarActionPerformed

    private void txtCarnetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarnetKeyTyped
       if (!(Character.isLetterOrDigit(evt.getKeyChar()))) {
            evt.consume();
        } else if(Character.isLowerCase(evt.getKeyChar())){
            evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        }
    }//GEN-LAST:event_txtCarnetKeyTyped

    private void txtGradoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGradoKeyTyped
        if (!(Character.isLetter(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtGradoKeyTyped

    //metodo que manda a ordenar el Arraylist, luego le asigna a la lista de GUI los elementos ya ordenados
    public void ordenarLista(){
        controlE.ordenarArray();
        for (int i = 0; i < modeloLista.size(); i++) {
            modeloLista.set(i, controlE.informacion(i));
        }
    }
    
    public void transparentes(){
        this.rbtnAgregar.setOpaque(false);
        this.rbtnBuscar.setOpaque(false);
        this.rbtnEditar.setOpaque(false);
        this.rbtnEliminar.setOpaque(false);
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGroup;
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JList<String> lstEstudiantes;
    private javax.swing.JRadioButton rbtnAgregar;
    private javax.swing.JRadioButton rbtnBuscar;
    private javax.swing.JRadioButton rbtnEditar;
    private javax.swing.JRadioButton rbtnEliminar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
