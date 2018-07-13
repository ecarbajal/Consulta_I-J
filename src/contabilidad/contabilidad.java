package contabilidad;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class contabilidad extends javax.swing.JFrame {

    ResultSet cdr = null;
    Conexion con = new Conexion();
    Statement sentencia = null;

    public contabilidad() {
        initComponents();
        con.Conectar();
        con.getConexion();
        sentencia = con.getSentenciaSQL();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        reporte = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFacturas = new javax.swing.JTable();
        btnBusqueda = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fechaini = new javax.swing.JFormattedTextField();
        fechafin = new javax.swing.JFormattedTextField();
        reporte1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        reporte.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reporte.setText("LIMPIAR TABLA");
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });

        tblFacturas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tblFacturas.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tblFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FACTURA", "N° CLIENTE ", "NOMBRE", "FECHA", "SUBTOTAL", "IVA", "TOTAL", "IUUID", "ORIGEN", "EFECTIVO", "CREDITO", "DEBITO", "TRANSFER", "CHEQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFacturas);
        if (tblFacturas.getColumnModel().getColumnCount() > 0) {
            tblFacturas.getColumnModel().getColumn(0).setMinWidth(80);
            tblFacturas.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblFacturas.getColumnModel().getColumn(0).setMaxWidth(80);
            tblFacturas.getColumnModel().getColumn(1).setMinWidth(80);
            tblFacturas.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblFacturas.getColumnModel().getColumn(1).setMaxWidth(80);
            tblFacturas.getColumnModel().getColumn(2).setMinWidth(200);
            tblFacturas.getColumnModel().getColumn(2).setPreferredWidth(280);
            tblFacturas.getColumnModel().getColumn(2).setMaxWidth(500);
            tblFacturas.getColumnModel().getColumn(3).setMinWidth(80);
            tblFacturas.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblFacturas.getColumnModel().getColumn(3).setMaxWidth(80);
            tblFacturas.getColumnModel().getColumn(4).setMinWidth(80);
            tblFacturas.getColumnModel().getColumn(4).setPreferredWidth(80);
            tblFacturas.getColumnModel().getColumn(4).setMaxWidth(80);
            tblFacturas.getColumnModel().getColumn(5).setMinWidth(80);
            tblFacturas.getColumnModel().getColumn(5).setPreferredWidth(80);
            tblFacturas.getColumnModel().getColumn(5).setMaxWidth(80);
            tblFacturas.getColumnModel().getColumn(6).setMinWidth(80);
            tblFacturas.getColumnModel().getColumn(6).setPreferredWidth(80);
            tblFacturas.getColumnModel().getColumn(6).setMaxWidth(80);
            tblFacturas.getColumnModel().getColumn(7).setMinWidth(270);
            tblFacturas.getColumnModel().getColumn(7).setPreferredWidth(270);
            tblFacturas.getColumnModel().getColumn(7).setMaxWidth(270);
        }

        btnBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBusqueda.setText("Consultar");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("(01) Almacen Nave A");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("A");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("FECHAS");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Consulta entrada de inventario - Factura");

        fechaini.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        fechaini.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fechaini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechainiActionPerformed(evt);
            }
        });

        fechafin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy/MM/dd"))));
        fechafin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        reporte1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reporte1.setLabel("REPORTE EXCEL");
        reporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaini, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(fechafin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBusqueda)
                .addContainerGap(486, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reporte1)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(fechaini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reporte)
                    .addComponent(reporte1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reporte.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        // TODO add your handling code here:
        String inicio = fechaini.getText().trim();
        String fin = fechafin.getText().trim();
        String tie = "01";

        if (inicio.equals("") || fin.equals("") || tie.equals("")) {
            JOptionPane.showMessageDialog(this, "Campo en Blanco, No puedes dejar campos vacios");
        } else {
            try {
                String consulta = null;
                Object fila = null;

                DefaultTableModel modelo = (DefaultTableModel) tblFacturas.getModel();

                consulta = "SELECT f.`DNUM`, fc.`CLICOD`, fc.`CLINOM` , f.`DFECHA`, f.`DBRUTO` , f.`DIVA`, f.`DCANTF`, f.`DUTILID`, f.`DCFDIUUID`, f.`DREFER`, DPAGO1, DPAGO2, DPAGO3, DPAGO4, DPAGO5  "
                        + "FROM ferhog.fdoc f INNER JOIN ferhog.fcli fc on f.cliseq = fc.cliseq "
                        + "WHERE DFECHA BETWEEN '" + inicio + "' AND '" + fin + "' AND DNUM like 'F" + tie + "%';";

                cdr = sentencia.executeQuery(consulta);

                while (cdr.next()) {
                    fila = new Object[]{cdr.getString("DNUM"), cdr.getString("CLICOD"), cdr.getString("CLINOM"), cdr.getString("DFECHA"),
                        cdr.getString("DBRUTO"), cdr.getString("DIVA"), cdr.getString("DCANTF"),
                        cdr.getString("DCFDIUUID"), cdr.getString("DREFER"), cdr.getString("DPAGO1"), cdr.getString("DPAGO2"),
                        cdr.getString("DPAGO3"), cdr.getString("DPAGO4"), cdr.getString("DPAGO5")};
                    modelo.addRow((Object[]) fila);

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblFacturas.getModel();
        
       for (int i = 0; i < modelo.getRowCount(); i++) {
           modelo.removeRow(i);
           i-=1;
       }
        
    }//GEN-LAST:event_reporteActionPerformed

    private void fechainiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechainiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechainiActionPerformed

    private void reporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tblFacturas.getModel();
        crearExcel.crearExcelFactura(modelo);
    }//GEN-LAST:event_reporte1ActionPerformed

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
            java.util.logging.Logger.getLogger(contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contabilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contabilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JFormattedTextField fechafin;
    private javax.swing.JFormattedTextField fechaini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reporte;
    private javax.swing.JButton reporte1;
    private javax.swing.JTable tblFacturas;
    // End of variables declaration//GEN-END:variables
}
