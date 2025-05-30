/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.ICrud;
import modelos.Marca;
import modelos.Modelo;
import persistencia.MarcaDAO;
import persistencia.ModeloDAO;
/**
 *
 * @author Cliente
 */
public class TelaModelo extends javax.swing.JInternalFrame {
    private ICrud<Modelo> ModeloBD = null;
    private ICrud<Marca> MarcaBD = null;
    /**
     * Creates new form TelaModelo
     */
    public TelaModelo() {
        initComponents();
        try {
          ModeloBD = new ModeloDAO();
          MarcaBD = new MarcaDAO();
          
            List<Marca> listaDeMarca = new ArrayList<>();
            listaDeMarca = null;
            listaDeMarca = MarcaBD.listar();
            jComboBox_Marca.removeAllItems();
            for(int pos = 0; pos < listaDeMarca.size(); pos++){
              jComboBox_Marca.addItem(listaDeMarca.get(pos).toString());
            }
          mostrarModeloNaGrid();
        } catch (Exception erro) {
          JOptionPane.showMessageDialog(null, "Construtor Tela: "+erro.getMessage());
        }
    }
    private void limparTela(){
      jTextField_idModelo.setText("");
      jTextField_descricao.setText("");
    }
    
    private void mostrarModeloNaGrid(){
    try {
      List<Modelo> listaDeModelo = new ArrayList<>();
      listaDeModelo = null;
      listaDeModelo = ModeloBD.listar();
      DefaultTableModel model =  (DefaultTableModel) jTable_Saida.getModel();
      model.setNumRows(0); 
      if(listaDeModelo.isEmpty()) 
        throw new Exception("Lista de Modelo BD Vazia");
      for(int j = 0; j<3;j++){
          jTable_Saida.getColumnModel().getColumn(j);
           }
      for(int pos = 0; pos < listaDeModelo.size(); pos++){
        Modelo objModelo = listaDeModelo.get(pos);
        String[] saida = new String[3];
          saida[0] = objModelo.getIdModelo()+ "";
          saida[1] = objModelo.getDescricao()+ "";
          saida[2] = MarcaBD.consultar(objModelo.getMarca()).toString();
        model.addRow(saida);
      }  
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(rootPane, erro.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_idModelo = new javax.swing.JTextField();
        jTextField_descricao = new javax.swing.JTextField();
        jComboBox_Marca = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Saida = new javax.swing.JTable();
        jButtonincluir = new javax.swing.JButton();
        jButton_alterar = new javax.swing.JButton();
        jButton_buscar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1119, 466));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("IDModelo");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Marca");

        jTextField_idModelo.setBackground(new java.awt.Color(204, 255, 204));
        jTextField_idModelo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jTextField_descricao.setBackground(new java.awt.Color(204, 255, 204));
        jTextField_descricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jComboBox_Marca.setBackground(new java.awt.Color(204, 255, 204));
        jComboBox_Marca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jTable_Saida.setBackground(new java.awt.Color(153, 255, 204));
        jTable_Saida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "idModelo", "Descricao", "Marca"
            }
        ));
        jTable_Saida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_SaidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Saida);

        jButtonincluir.setBackground(new java.awt.Color(0, 153, 0));
        jButtonincluir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButtonincluir.setForeground(new java.awt.Color(0, 255, 204));
        jButtonincluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/seta.png"))); // NOI18N
        jButtonincluir.setText("INCLUIR");
        jButtonincluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonincluirActionPerformed(evt);
            }
        });

        jButton_alterar.setBackground(new java.awt.Color(0, 153, 0));
        jButton_alterar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton_alterar.setForeground(new java.awt.Color(0, 255, 204));
        jButton_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/troca.png"))); // NOI18N
        jButton_alterar.setText("ALTERAR");
        jButton_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alterarActionPerformed(evt);
            }
        });

        jButton_buscar.setBackground(new java.awt.Color(0, 153, 0));
        jButton_buscar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton_buscar.setForeground(new java.awt.Color(0, 255, 204));
        jButton_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figuras/procurar.png"))); // NOI18N
        jButton_buscar.setText("BUSCAR");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_idModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox_Marca, 0, 464, Short.MAX_VALUE)
                                    .addComponent(jTextField_descricao))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonincluir)
                .addGap(83, 83, 83)
                .addComponent(jButton_alterar)
                .addGap(80, 80, 80)
                .addComponent(jButton_buscar)
                .addGap(353, 353, 353))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_idModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_buscar)
                    .addComponent(jButton_alterar)
                    .addComponent(jButtonincluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonincluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonincluirActionPerformed
        // TODO add your handling code here:
            try {
            String aux = (String)jComboBox_Marca.getSelectedItem();
            //System.out.println(aux);
            String[] vetMarca = aux.split("-");
            //System.out.println(vetMarca[0]);
            int idMarca = Integer.parseInt(vetMarca[0]);
            Marca marca = new Marca(idMarca);
            String descricao = jTextField_descricao.getText().toUpperCase();
            if (descricao.isEmpty()) {
                throw new Exception("O campo de descrição não pode estar vazio.");
            }
            Modelo objModelo = new Modelo(0,descricao,marca);
            ModeloBD.incluir(objModelo);
            limparTela();
            mostrarModeloNaGrid();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, "Incluir Visao: "+erro.getMessage());
        }
    }//GEN-LAST:event_jButtonincluirActionPerformed

    private void jButton_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterarActionPerformed
        // TODO add your handling code here:
            try {
            String aux = (String)jComboBox_Marca.getSelectedItem();
            //System.out.println(aux);
            String[] vetMarca = aux.split("-");
            //System.out.println(vetMarca[0]);
            int idMarca = Integer.parseInt(vetMarca[0]);
            Marca marca = new Marca(idMarca);
            String descricao = jTextField_descricao.getText().toUpperCase();
            if (descricao.isEmpty()) {
                throw new Exception("O campo de descrição não pode estar vazio.");
            }
            Modelo objModelo = new Modelo(Integer.parseInt(jTextField_idModelo.getText()),descricao,marca);
            ModeloBD.alterar(objModelo);
            limparTela();
            mostrarModeloNaGrid();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, "Incluir Visao: "+erro.getMessage());
        }
    }//GEN-LAST:event_jButton_alterarActionPerformed

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        // TODO add your handling code here:
        try {
        if(jTextField_idModelo.getText().isEmpty()) throw new Exception("Id vazio");
            Modelo objModelo = new Modelo(Integer.parseInt(jTextField_idModelo.getText()));
            objModelo = (ModeloBD.consultar(objModelo));
      
            jTextField_idModelo.setText(objModelo.getIdModelo()+"");
            jTextField_descricao.setText(objModelo.getDescricao());
            jComboBox_Marca.setSelectedItem(MarcaBD.consultar(objModelo.getMarca()).toString());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, "Buscar Visao: "+erro.getMessage());
        }
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jTable_SaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_SaidaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable_Saida.getModel();
        int selectedRowIndex = jTable_Saida.getSelectedRow();
        
        jTextField_idModelo.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jTextField_descricao.setText(model.getValueAt(selectedRowIndex, 1).toString());
        
        try {
            String auxMarca = (String) model.getValueAt(selectedRowIndex, 2);
            String vetMarca[] = auxMarca.split("-");
            Marca marca = new Marca(Integer.parseInt(vetMarca[0]));
            jComboBox_Marca.setSelectedItem(MarcaBD.consultar(marca).toString());
        } catch (Exception ex) {
            Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable_SaidaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_alterar;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JButton jButtonincluir;
    private javax.swing.JComboBox<String> jComboBox_Marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Saida;
    private javax.swing.JTextField jTextField_descricao;
    private javax.swing.JTextField jTextField_idModelo;
    // End of variables declaration//GEN-END:variables
}
