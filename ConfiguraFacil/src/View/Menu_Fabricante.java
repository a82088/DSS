package View;

import java.awt.CardLayout;
import dss.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 10
 */
public class Menu_Fabricante extends javax.swing.JFrame {
    private Facade  fac;
    /**
     * Creates new form Fabricante_menu
     */
    public Menu_Fabricante(Facade facade) {
        initComponents();
        this.fac = facade;
        List<Integer> lespera = new ArrayList<>();
        try{
            lespera = fac.getListaEspera();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
        DefaultListModel listModel1 = new DefaultListModel();
            lespera.forEach((c) -> {listModel1.addElement(Integer.toString(c));});
            ListEspera.setModel(listModel1);
        Map<String,Integer> compstock = new HashMap<>();
        try{
            compstock = fac.getListaStock();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
        DefaultTableModel tm = new DefaultTableModel(new Object[] { "Componente", "Stock" },0); 
        CompStock.setModel(tm);
        for(String c : compstock.keySet()){
            tm.addRow(new Object[] {c , compstock.get(c) });
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        Gerir_config = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListEspera = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListCP = new javax.swing.JList<>();
        Fabricar = new javax.swing.JButton();
        SairLEsp = new javax.swing.JButton();
        Detalhes = new javax.swing.JButton();
        Gerir_stock = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CompStock = new javax.swing.JTable();
        SairStock = new javax.swing.JButton();
        AdicionarStock = new javax.swing.JButton();
        nrStock = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Lista de Espera");

        ListEspera.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListEspera);

        jLabel2.setText("Detalhes da configuração");

        jScrollPane1.setViewportView(ListCP);

        Fabricar.setText("Fabricar Próximo");
        Fabricar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FabricarActionPerformed(evt);
            }
        });

        SairLEsp.setText("Sair");
        SairLEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairLEspActionPerformed(evt);
            }
        });

        Detalhes.setText("Ver Detalhes");
        Detalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetalhesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Gerir_configLayout = new javax.swing.GroupLayout(Gerir_config);
        Gerir_config.setLayout(Gerir_configLayout);
        Gerir_configLayout.setHorizontalGroup(
            Gerir_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Gerir_configLayout.createSequentialGroup()
                .addGroup(Gerir_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Gerir_configLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SairLEsp))
                    .addGroup(Gerir_configLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(Gerir_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(Gerir_configLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Detalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fabricar)
                .addContainerGap())
        );
        Gerir_configLayout.setVerticalGroup(
            Gerir_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Gerir_configLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Gerir_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Gerir_configLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Gerir_configLayout.createSequentialGroup()
                        .addComponent(Detalhes)
                        .addGap(89, 89, 89)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Gerir_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fabricar)
                    .addComponent(SairLEsp))
                .addContainerGap())
        );

        jPanel1.add(Gerir_config, "Gerir_config");

        jLabel3.setText("Lista de Stock");

        CompStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Componente", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        CompStock.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(CompStock);
        CompStock.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        SairStock.setText("Sair");
        SairStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairStockActionPerformed(evt);
            }
        });

        AdicionarStock.setText("Adicionar Stock");
        AdicionarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Gerir_stockLayout = new javax.swing.GroupLayout(Gerir_stock);
        Gerir_stock.setLayout(Gerir_stockLayout);
        Gerir_stockLayout.setHorizontalGroup(
            Gerir_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Gerir_stockLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Gerir_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Gerir_stockLayout.createSequentialGroup()
                .addGroup(Gerir_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Gerir_stockLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(nrStock, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Gerir_stockLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(AdicionarStock))
                    .addGroup(Gerir_stockLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(SairStock)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Gerir_stockLayout.setVerticalGroup(
            Gerir_stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Gerir_stockLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nrStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdicionarStock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(SairStock)
                .addContainerGap())
        );

        jPanel1.add(Gerir_stock, "Gerir_stock");

        jMenuBar1.setToolTipText("");

        jMenu1.setText("Opções");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Gerir Configurações");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Gerir Stock");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

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

    private void SairLEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairLEspActionPerformed
        new LogIn(new Facade()).setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_SairLEspActionPerformed

    private void SairStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairStockActionPerformed
        new LogIn(new Facade()).setVisible(true); 
        this.setVisible(false);
    }//GEN-LAST:event_SairStockActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
      //
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CardLayout c1 = (CardLayout) jPanel1.getLayout(); 
        c1.show(jPanel1,"Gerir_config"); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CardLayout c1 = (CardLayout) jPanel1.getLayout(); 
        c1.show(jPanel1,"Gerir_stock"); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void FabricarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FabricarActionPerformed
          try{
              int fabricar = fac.FabricaProx();
              JOptionPane.showMessageDialog(null,"A configuração "+fabricar+" começou a ser fabricada!");
          }
          catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
          
           List<Integer> lespera = new ArrayList<>();
            try{
                lespera = fac.getListaEspera();
            }
            catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
            DefaultListModel listModel1 = new DefaultListModel();
                lespera.forEach((c) -> {listModel1.addElement(Integer.toString(c));});
                ListEspera.setModel(listModel1);
                
            Map<String,Integer> compstock = new HashMap<>();
        try{
            compstock = fac.getListaStock();
        }
        catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
        DefaultTableModel tm = new DefaultTableModel(new Object[] { "Componente", "Stock" },0); 
        CompStock.setModel(tm);
        for(String c : compstock.keySet()){
            tm.addRow(new Object[] {c , compstock.get(c) });
        }
          
    }//GEN-LAST:event_FabricarActionPerformed

    private void AdicionarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarStockActionPerformed
        int sel = CompStock.getSelectedRow();
        if(sel == -1) JOptionPane.showMessageDialog(null,"Ainda não selecionou nenhum componente ao qual quer adicionar stock!");
        else{
            String stock = nrStock.getText();
            if(stock == null) JOptionPane.showMessageDialog(null,"Ainda não escolheu qual o número de stock que quer adcionar!");
            else{
                 String componente = (String)CompStock.getValueAt(sel, 0);
                 int nst = -1;
                 try { 
                    nst = Integer.parseInt(stock); 
                 } 
                 catch(NumberFormatException e) {JOptionPane.showMessageDialog(null,"Tem que digitar um número!");}
                 if (nst > 0){
                     try{
                        fac.atualizaStock(componente, nst);
                        JOptionPane.showMessageDialog(null,"Stock adicionada com sucesso!");
                        Map<String,Integer> compstock = new HashMap<>();
                        try{
                            compstock = fac.getListaStock();
                        }
                        catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
                        DefaultTableModel tm = new DefaultTableModel(new Object[] { "Componente", "Stock" },0); 
                        CompStock.setModel(tm);
                        for(String c : compstock.keySet()){
                            tm.addRow(new Object[] {c , compstock.get(c) });
                        }
                     }
                     catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
                 }
                 else{JOptionPane.showMessageDialog(null,"Só pode adicionar stock, não retirar!");}
            }
        }
    }//GEN-LAST:event_AdicionarStockActionPerformed

    private void DetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetalhesActionPerformed
        String val = (String)ListEspera.getSelectedValue();
        if(val == null) JOptionPane.showMessageDialog(null,"Não selecionou nenhuma configuração para ver os detalhes!");
        else{
            int id = Integer.parseInt(val);
            try{
                List<String> info = fac.getConfig(id);
                DefaultListModel listModel1 = new DefaultListModel();
                info.forEach((c) -> {listModel1.addElement(c);});
                ListCP.setModel(listModel1);
            }
            catch(Exception e){JOptionPane.showMessageDialog(null,e.getMessage());}
        }
    }//GEN-LAST:event_DetalhesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Fabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Fabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Fabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Fabricante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Fabricante(new Facade()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarStock;
    private javax.swing.JTable CompStock;
    private javax.swing.JButton Detalhes;
    private javax.swing.JButton Fabricar;
    private javax.swing.JPanel Gerir_config;
    private javax.swing.JPanel Gerir_stock;
    private javax.swing.JList<String> ListCP;
    private javax.swing.JList<String> ListEspera;
    private javax.swing.JButton SairLEsp;
    private javax.swing.JButton SairStock;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField nrStock;
    // End of variables declaration//GEN-END:variables
}