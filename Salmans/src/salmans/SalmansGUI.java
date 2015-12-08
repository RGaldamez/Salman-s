/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author rick
 */
public class SalmansGUI extends javax.swing.JFrame {

    /**
     * Creates new form SalmansGUI
     */
    public SalmansGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_almacen = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jt_ingrediente = new javax.swing.JTextField();
        btn_addIngredient = new javax.swing.JButton();
        jd_productos = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_ingredientes = new javax.swing.JList();
        jt_tiempo = new javax.swing.JTextField();
        jt_precio = new javax.swing.JTextField();
        jt_nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jt_tiempo1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_ingredientes1 = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        btn_eliminarIngrediente = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jt_nombre1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jt_precio1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jc_productos = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_almacen = new javax.swing.JMenuItem();
        jm_productos = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jLabel1.setText("Almacén");

        btn_addIngredient.setText("Agregar Ingrediente al almacén");
        btn_addIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addIngredientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_almacenLayout = new javax.swing.GroupLayout(jd_almacen.getContentPane());
        jd_almacen.getContentPane().setLayout(jd_almacenLayout);
        jd_almacenLayout.setHorizontalGroup(
            jd_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_almacenLayout.createSequentialGroup()
                .addGroup(jd_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_almacenLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jt_ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_almacenLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jd_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_addIngredient)
                            .addGroup(jd_almacenLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(77, 77, 77)))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jd_almacenLayout.setVerticalGroup(
            jd_almacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_almacenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jt_ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_addIngredient)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel2.setText("Tiempo de Preparacion (segundos)");

        jLabel3.setText("Nombre");

        jLabel4.setText("Precio");

        jLabel5.setText("Lista de Ingredientes");

        jScrollPane1.setViewportView(jl_ingredientes);

        jButton1.setText("Agregar Ingrediente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", jPanel1);

        jLabel7.setText("Tiempo de Preparacion (segundos)");

        jScrollPane2.setViewportView(jl_ingredientes1);

        jLabel9.setText("Lista de Ingredientes");

        btn_eliminarIngrediente.setText("Eliminar Ingrediente");
        btn_eliminarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarIngredienteActionPerformed(evt);
            }
        });

        jButton4.setText("Agregar Ingrediente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre");

        jLabel8.setText("Precio");

        jButton3.setText("Modificar Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Cargar Producto");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jt_precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(btn_eliminarIngrediente)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jt_tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jc_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_eliminarIngrediente)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jc_productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jt_tiempo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jt_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jt_precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jButton3)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar", jPanel3);

        javax.swing.GroupLayout jd_productosLayout = new javax.swing.GroupLayout(jd_productos.getContentPane());
        jd_productos.getContentPane().setLayout(jd_productosLayout);
        jd_productosLayout.setHorizontalGroup(
            jd_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_productosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jd_productosLayout.setVerticalGroup(
            jd_productosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_productosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menu");

        jm_almacen.setText("Almacen");
        jm_almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_almacenActionPerformed(evt);
            }
        });
        jMenu1.add(jm_almacen);

        jm_productos.setText("Productos");
        jm_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_productosActionPerformed(evt);
            }
        });
        jMenu1.add(jm_productos);

        jMenuItem3.setText("jMenuItem3");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_almacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_almacenActionPerformed
        openDialog(this.jd_almacen);
    }//GEN-LAST:event_jm_almacenActionPerformed

    private void jm_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_productosActionPerformed
        openDialog(this.jd_productos);
        this.ingredientesTemp = new ArrayList();
    }//GEN-LAST:event_jm_productosActionPerformed

    private void btn_addIngredientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addIngredientActionPerformed
        String newIngredient = jt_ingrediente.getText();
        boolean newItem = true;

        for (int i = 0; i < almacen.size(); i++) {
            for (int j = 0; j < almacen.get(i).size(); j++) {
                if (newIngredient.equalsIgnoreCase((String)almacen.get(i).peek())){
                    almacen.get(i).add(newIngredient.toLowerCase());
                    newItem=false;
                    break;
                }else{
                    newItem = true;
                }
            }
        }
        if (newItem){
            almacen.add(new Stack());
            almacen.get(almacen.size()-1).add(newIngredient.toLowerCase());
        }
        
        this.jt_ingrediente.setText("");
        JOptionPane.showMessageDialog(this, "Ingrediente Agregado al Almacén", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_addIngredientActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String temp = JOptionPane.showInputDialog(this, "Porfavor ingrese el nuevo Ingrediente");
        ingredientesTemp.add(temp);
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < ingredientesTemp.size(); i++) {
            model.addElement(ingredientesTemp.get(i));
        }
        this.jl_ingredientes.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (this.ingredientesTemp.isEmpty()){
            JOptionPane.showMessageDialog(this, "La lista de ingredientes esta vacia", "Error", WIDTH);
        }else{
            String nombre = this.jt_nombre.getText();
            int tiempo = Integer.parseInt(this.jt_tiempo.getText());
            int precio = Integer.parseInt(this.jt_precio.getText());
            productos.add(new Producto(this.ingredientesTemp,tiempo,nombre,precio));
            JOptionPane.showMessageDialog(this, "Producto Agregado");
            this.jt_nombre.setText("");
            this.jt_precio.setText("");
            this.jt_tiempo.setText("");
            this.jl_ingredientes.setModel(new DefaultListModel());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nombre = this.jt_nombre1.getText();
        int precio = Integer.parseInt(this.jt_precio1.getText());
        int tiempo = Integer.parseInt(this.jt_tiempo1.getText());
        productos.get(indexGlobal).setNombre(nombre);
        productos.get(indexGlobal).setPrecio(precio);
        productos.get(indexGlobal).setTiempo(tiempo);
        this.jt_nombre1.setText("");
        this.jt_precio1.setText("");
        this.jt_tiempo1.setText("");
        this.jl_ingredientes1.setModel(new DefaultListModel());
        JOptionPane.showMessageDialog(null, "Producto modificado con exito");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String temp = JOptionPane.showInputDialog(this, "Porfavor ingrese el nuevo Ingrediente");
        productos.get(indexGlobal).getIngredientes().add(temp);
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < productos.get(indexGlobal).getIngredientes().size(); i++) {
            model.addElement(productos.get(indexGlobal).getIngredientes().get(i));
        }
        this.jl_ingredientes1.setModel(model);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < this.productos.size(); i++) {
            model.addElement(productos.get(i).getNombre());
        }
        this.jc_productos.setModel(model);
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        indexGlobal = this.jc_productos.getSelectedIndex();
        if (indexGlobal != -1){
            this.jt_nombre1.setText(productos.get(indexGlobal).getNombre());
            this.jt_precio1.setText(Integer.toString(productos.get(indexGlobal).getPrecio()));
            this.jt_tiempo1.setText(Integer.toString(productos.get(indexGlobal).getTiempo()));
            DefaultListModel model = new DefaultListModel();
            for (int i = 0; i < productos.get(indexGlobal).getIngredientes().size(); i++) {
                model.addElement(productos.get(indexGlobal).getIngredientes().get(i));
            }
            this.jl_ingredientes1.setModel(model);
            this.ingredientesTemp = productos.get(indexGlobal).getIngredientes();
        }else{
            JOptionPane.showMessageDialog(this, "No se ha seleccionado nada del comboBox", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_eliminarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarIngredienteActionPerformed
        int index = this.jl_ingredientes1.getSelectedIndex();
        if (index != -1){
            productos.get(indexGlobal).getIngredientes().remove(index);
            DefaultListModel model = new DefaultListModel();
            for (int i = 0; i < productos.get(indexGlobal).getIngredientes().size(); i++) {
                model.addElement(productos.get(indexGlobal).getIngredientes().get(i));
            }
            this.jl_ingredientes1.setModel(model);
        }else{
            JOptionPane.showMessageDialog(this, "No se ha seleccionado nada de la lista", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminarIngredienteActionPerformed

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
            java.util.logging.Logger.getLogger(SalmansGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalmansGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalmansGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalmansGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalmansGUI().setVisible(true);
            }
        });
    }
    
    public void openDialog(JDialog dialog){
        dialog.setLocationRelativeTo(null);
        dialog.setModal(true);
        dialog.pack();
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addIngredient;
    private javax.swing.JButton btn_eliminarIngrediente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox jc_productos;
    private javax.swing.JDialog jd_almacen;
    private javax.swing.JDialog jd_productos;
    private javax.swing.JList jl_ingredientes;
    private javax.swing.JList jl_ingredientes1;
    private javax.swing.JMenuItem jm_almacen;
    private javax.swing.JMenuItem jm_productos;
    private javax.swing.JTextField jt_ingrediente;
    private javax.swing.JTextField jt_nombre;
    private javax.swing.JTextField jt_nombre1;
    private javax.swing.JTextField jt_precio;
    private javax.swing.JTextField jt_precio1;
    private javax.swing.JTextField jt_tiempo;
    private javax.swing.JTextField jt_tiempo1;
    // End of variables declaration//GEN-END:variables
    int indexGlobal;
    private Stack stack;
    private ArrayList<Stack> almacen  = new ArrayList();
    private ArrayList<Producto> productos = new ArrayList();
    private ArrayList<String> ingredientesTemp = new ArrayList();


}
