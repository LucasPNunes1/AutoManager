/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package visao;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Endereco;
import modelos.ICrud;
import modelos.Oficina;
import modelos.Telefone;
import persistencia.OficinaDAO;

/**
 *
 * @author Cliente
 */
public class TelaOficinas extends javax.swing.JInternalFrame {
  private ICrud<Oficina> OficinaBD = null;
    /**
     * Creates new form TelaOficinas
     */
    public TelaOficinas() {
        initComponents();
    try {
      OficinaBD = new OficinaDAO();
      mostrarOficinaNaGrid();
    } catch (Exception erro) {
      JOptionPane.showMessageDialog(null, "Construtor Tela: "+erro.getMessage());
    }
    }
  private void limparTela(){
    jTextField1_nome.setText("");
    jTextField3_email.setText("");
    jTextField1_logradouro.setText("");
    jTextField2_numero.setText("");
    jTextField3_BAIRO.setText("");
    jTextField4_cep.setText("");
    jTextField3_complemento.setText("");
    jTextField5_cidade.setText("");
    jTextField6_estado.setText("");
    jFormattedTextField1_telefone.setValue(null);
    jFormattedTextField1_telefone2.setValue(null);
  }
  private void mostrarOficinaNaGrid(){
  try {
    List<Oficina> listaDeOficina = new ArrayList<>();
    listaDeOficina = null;
    listaDeOficina = OficinaBD.listar();
    if(listaDeOficina != null){
    DefaultTableModel model =  (DefaultTableModel) jTableOficina.getModel();
    model.setNumRows(0); 
    if(listaDeOficina.isEmpty()) 
      throw new Exception("Lista de Oficina BD Vazia");
    
        jTableOficina.setRowHeight(150);
    for(int j = 0; j<5;j++){
        jTableOficina.getColumnModel().getColumn(j).setCellRenderer(new MultiLineTableCellRenderer());
         }
    for(int pos = 0; pos < listaDeOficina.size(); pos++){
      Oficina objOficina = listaDeOficina.get(pos);
      String[] saida = new String[5];
        saida[0] = objOficina.getIdentificador_Email()+ "";
        saida[1] = objOficina.getNome() + "";
        saida[2] = objOficina.getTelefone1().toString()+ "";
        saida[3] = objOficina.getTelefone2().toString()+ "";
        saida[4] = objOficina.getEndereco().toString()+ "";
      model.addRow(saida);
    }  
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

        jTextField1_logradouro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1_telefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1_nome = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField3_BAIRO = new javax.swing.JTextField();
        jButton_buscar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField6_estado = new javax.swing.JTextField();
        jFormattedTextField1_telefone2 = new javax.swing.JFormattedTextField();
        jTextField5_cidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4_cep = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3_complemento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOficina = new javax.swing.JTable();
        jTextField2_numero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(957, 466));
        setPreferredSize(new java.awt.Dimension(957, 466));

        jTextField1_logradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_logradouroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("LOGADOURO");

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setText("Endereco");

        jTextField3_email.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Email");

        try {
            jFormattedTextField1_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+##(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1_telefone.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("Telefone1");

        jTextField1_nome.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jTextField1_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_nomeActionPerformed(evt);
            }
        });
        jTextField1_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1_nomeKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("BAIRRO");

        jButton_buscar.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButton_buscar.setText("BUSCAR");
        jButton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("ESTADO");

        jLabel16.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel16.setText("Telefone2");

        try {
            jFormattedTextField1_telefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+##(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1_telefone2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("CIDADE");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("CEP");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("COMPLEMENTO");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel1.setText("CADASTRO DE OFICINA");

        jButtonIncluir.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButtonIncluir.setText("INCLUIR");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jButtonAlterar.setText("ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jTableOficina.setFont(new java.awt.Font("Helvetica Neue", 3, 12)); // NOI18N
        jTableOficina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IDENTIFICADOR_EMAIL", "NOME", "TELEFONE1", "TELEFONE2", "ENDERECO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableOficina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOficinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOficina);
        if (jTableOficina.getColumnModel().getColumnCount() > 0) {
            jTableOficina.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTableOficina.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableOficina.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        jTextField2_numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_numeroActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("NUMERO");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel6.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextField2_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(72, 72, 72))
                            .addComponent(jTextField4_cep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3_BAIRO, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jTextField5_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jTextField6_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jButtonIncluir)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_buscar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField1_telefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField1_telefone))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3_email, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField1_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField1_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField1_telefone2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField3_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextField4_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextField3_BAIRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(26, 26, 26)
                                            .addComponent(jTextField3_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel12))
                                    .addGap(1, 1, 1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jTextField5_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel10))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIncluir)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButton_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1_logradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_logradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_logradouroActionPerformed

    private void jTextField1_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_nomeActionPerformed

    }//GEN-LAST:event_jTextField1_nomeActionPerformed

    private void jTextField1_nomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1_nomeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_nomeKeyReleased

    private void jButton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarActionPerformed
        // TODO add your handling code here:
        try {
            
            if(jTextField3_email.getText().isEmpty()) throw new Exception("email vazio");
            String email = jTextField3_email.getText();
            Oficina objeto = new Oficina(email);
            objeto = OficinaBD.consultar(objeto);
            

            jTextField1_nome.setText(objeto.getNome());
            jTextField3_email.setText(objeto.getIdentificador_Email());
            jTextField4_cep.setText(objeto.getEndereco().getCep());
            jTextField1_logradouro.setText(objeto.getEndereco().getLogradouro());
            jTextField2_numero.setText(objeto.getEndereco().getNumeroEndereco()+"");
            jTextField3_BAIRO.setText(objeto.getEndereco().getBairro());
            jTextField3_complemento.setText(objeto.getEndereco().getComplemento());
            jTextField5_cidade.setText(objeto.getEndereco().getCidade());
            jTextField6_estado.setText(objeto.getEndereco().getEstado()+"");
            String valueTelefone1 = ""+objeto.getTelefone1().getDdi()+objeto.getTelefone1().getDdd()+objeto.getTelefone1().getNumero();
            jFormattedTextField1_telefone.setText(valueTelefone1);
            String valueTelefone2 = ""+objeto.getTelefone2().getDdi()+objeto.getTelefone2().getDdd()+objeto.getTelefone2().getNumero();
            jFormattedTextField1_telefone2.setText(valueTelefone2);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, "Incluir Visao: "+erro.getMessage());
        }
    }//GEN-LAST:event_jButton_buscarActionPerformed

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        try {
            // Validação do nome da oficina
            String nome = jTextField1_nome.getText().trim().toUpperCase();
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de nome não pode estar vazio.");
            }

            // Validação do email
            String email = jTextField3_email.getText().trim();
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de email não pode estar vazio.");
            }
            if (!email.matches("^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
                JOptionPane.showMessageDialog(rootPane, "Insira um email válido no formato: exemplo@dominio.com.");
            }

            // Validação do telefone principal
            String numeroTele = jFormattedTextField1_telefone.getText().trim();
            if (numeroTele.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O telefone principal não pode estar vazio.");
            }
            if (!numeroTele.matches("\\+\\d{2}\\(\\d{2}\\)\\d{8,9}")) {
                JOptionPane.showMessageDialog(rootPane, "Insira um telefone principal válido no formato: +XX(XX)XXXXXXXXX.");
            }

            // Extrai partes do telefone principal
            String[] telefonePartes = numeroTele.split("[() -]+");
            int ddi = Integer.parseInt(telefonePartes[0]);
            int ddd = Integer.parseInt(telefonePartes[1]);
            int numero = Integer.parseInt(telefonePartes[2]);

            // Validação do telefone secundário (opcional)
            String numeroTele2 = jFormattedTextField1_telefone2.getText().trim();
            int ddi2 = 55, ddd2 = 0, numero2 = 0;
            if (!numeroTele2.isEmpty()) {
                if (!numeroTele2.matches("\\+\\d{2}\\(\\d{2}\\)\\d{8,9}")) {
                    JOptionPane.showMessageDialog(rootPane, "Insira um telefone secundário válido no formato: +XX(XX)XXXXXXXXX.");
                }
                String[] telefonePartes2 = numeroTele2.split("[() -]+");
                ddi2 = Integer.parseInt(telefonePartes2[0]);
                ddd2 = Integer.parseInt(telefonePartes2[1]);
                numero2 = Integer.parseInt(telefonePartes2[2]);
            }

            // Validação do endereço
            String logradouro = jTextField1_logradouro.getText().trim().toUpperCase();
            if (logradouro.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de logradouro não pode estar vazio.");
            }

            String numeroEndereco = jTextField2_numero.getText().trim();
            if (numeroEndereco.isEmpty() || !numeroEndereco.matches("\\d+")) {
                JOptionPane.showMessageDialog(rootPane, "O número do endereço deve ser um número válido.");
            }

            String cep = jTextField4_cep.getText().trim();
            if (cep.isEmpty() || !cep.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(rootPane, "Insira um CEP válido no formato: XXXXXXXX.");
            }

            String bairro = jTextField3_BAIRO.getText().trim().toUpperCase();
            if (bairro.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de bairro não pode estar vazio.");
            }

            String complemento = jTextField3_complemento.getText().trim().toUpperCase();

            String cidade = jTextField5_cidade.getText().trim().toUpperCase();
            if (cidade.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de cidade não pode estar vazio.");
            }

            String estado = jTextField6_estado.getText().trim().toUpperCase();
            if (estado.isEmpty() || estado.length() != 2 || !estado.matches("[A-Z]{2}")) {
                JOptionPane.showMessageDialog(rootPane, "O campo de estado deve conter 2 letras (ex: SP, RJ).");
            }

            // Criação dos objetos
            Telefone telefone1 = new Telefone(ddi, ddd, numero);
            Telefone telefone2 = new Telefone(ddi2, ddd2, numero2);
            Endereco endereco = new Endereco(logradouro, Integer.parseInt(numeroEndereco), cep, bairro, complemento, cidade, estado);
            Oficina objOficina = new Oficina(email, nome, telefone1, telefone2, endereco);

            // Inserção no banco de dados
            OficinaBD.incluir(objOficina);

            // Limpa a tela e atualiza a tabela
            limparTela();
            mostrarOficinaNaGrid();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, "Incluir Visão: " + erro.getMessage());
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            // Validação do nome da oficina
            String nome = jTextField1_nome.getText().trim().toUpperCase();
            if (nome.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de nome não pode estar vazio.");
                return;
            }

            // Validação do email
            String email = jTextField3_email.getText().trim();
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de email não pode estar vazio.");
                return;
            }
            if (!email.matches("^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) {
                JOptionPane.showMessageDialog(rootPane, "Insira um email válido no formato: exemplo@dominio.com.");
                return;
            }

            // Validação do telefone principal
            String numeroTele = jFormattedTextField1_telefone.getText().trim();
            if (numeroTele.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O telefone principal não pode estar vazio.");
                return;
            }
            if (!numeroTele.matches("\\+\\d{2}\\(\\d{2}\\)\\d{8,9}")) {
                JOptionPane.showMessageDialog(rootPane, "Insira um telefone principal válido no formato: +XX(XX)XXXXXXXXX.");
                return;
            }

            // Extrai partes do telefone principal
            String[] telefonePartes = numeroTele.split("[() -]+");
            int ddi = Integer.parseInt(telefonePartes[0]);
            int ddd = Integer.parseInt(telefonePartes[1]);
            int numero = Integer.parseInt(telefonePartes[2]);

            // Validação do telefone secundário (opcional)
            String numeroTele2 = jFormattedTextField1_telefone2.getText().trim();
            int ddi2 = 0, ddd2 = 0, numero2 = 0;
            if (!numeroTele2.isEmpty()) {
                if (!numeroTele2.matches("\\+\\d{2}\\(\\d{2}\\)\\d{8,9}")) {
                    JOptionPane.showMessageDialog(rootPane, "Insira um telefone secundário válido no formato: +XX(XX)XXXXXXXXX.");
                    return;
                }
                String[] telefonePartes2 = numeroTele2.split("[() -]+");
                ddi2 = Integer.parseInt(telefonePartes2[0]);
                ddd2 = Integer.parseInt(telefonePartes2[1]);
                numero2 = Integer.parseInt(telefonePartes2[2]);
            }

            // Validação do endereço
            String logradouro = jTextField1_logradouro.getText().trim().toUpperCase();
            if (logradouro.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de logradouro não pode estar vazio.");
                return;
            }

            String numeroEndereco = jTextField2_numero.getText().trim();
            if (numeroEndereco.isEmpty() || !numeroEndereco.matches("\\d+")) {
                JOptionPane.showMessageDialog(rootPane, "O número do endereço deve ser um número válido.");
                return;
            }

            String cep = jTextField4_cep.getText().trim();
            if (cep.isEmpty() || !cep.matches("\\d{8}")) {
                JOptionPane.showMessageDialog(rootPane, "Insira um CEP válido no formato: XXXXXXXX.");
                return;
            }

            String bairro = jTextField3_BAIRO.getText().trim().toUpperCase();
            if (bairro.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de bairro não pode estar vazio.");
                return;
            }

            String complemento = jTextField3_complemento.getText().trim().toUpperCase();

            String cidade = jTextField5_cidade.getText().trim().toUpperCase();
            if (cidade.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "O campo de cidade não pode estar vazio.");
                return;
            }

            String estado = jTextField6_estado.getText().trim().toUpperCase();
            if (estado.isEmpty() || estado.length() != 2 || !estado.matches("[A-Z]{2}")) {
                JOptionPane.showMessageDialog(rootPane, "O campo de estado deve conter 2 letras (ex: SP, RJ).");
                return;
            }

            // Criação dos objetos
            Telefone telefone1 = new Telefone(ddi, ddd, numero);
            Telefone telefone2 = new Telefone(ddi2, ddd2, numero2);
            Endereco endereco = new Endereco(logradouro, Integer.parseInt(numeroEndereco), cep, bairro, complemento, cidade, estado);
            Oficina objOficina = new Oficina(email, nome, telefone1, telefone2, endereco);
            OficinaBD.alterar(objOficina);
            limparTela();
            mostrarOficinaNaGrid();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, "Incluir Visao: "+erro.getMessage());
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTextField2_numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_numeroActionPerformed

    private void jTableOficinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOficinaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTableOficina.getModel();
        int selectedRowIndex = jTableOficina.getSelectedRow();
        
        jTextField3_email.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jTextField1_nome.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jFormattedTextField1_telefone.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jFormattedTextField1_telefone2.setText(model.getValueAt(selectedRowIndex, 3).toString());
        
        String auxEnd = model.getValueAt(selectedRowIndex, 4).toString();
        String vetEnd[] = auxEnd.split("[\u200B,-]");
        jTextField1_logradouro.setText(vetEnd[0].trim());
        jTextField2_numero.setText(vetEnd[1].trim());
        jTextField3_complemento.setText(vetEnd[2].trim());
        jTextField3_BAIRO.setText(vetEnd[3].trim());
        jTextField5_cidade.setText(vetEnd[4].trim());
        jTextField6_estado.setText(vetEnd[5].trim());
        jTextField4_cep.setText(vetEnd[6].trim());
        
        //aux
        //String vetTelefone1[] = model.getValueAt
    }//GEN-LAST:event_jTableOficinaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButton_buscar;
    private javax.swing.JFormattedTextField jFormattedTextField1_telefone;
    private javax.swing.JFormattedTextField jFormattedTextField1_telefone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOficina;
    private javax.swing.JTextField jTextField1_logradouro;
    private javax.swing.JTextField jTextField1_nome;
    private javax.swing.JTextField jTextField2_numero;
    private javax.swing.JTextField jTextField3_BAIRO;
    private javax.swing.JTextField jTextField3_complemento;
    private javax.swing.JTextField jTextField3_email;
    private javax.swing.JTextField jTextField4_cep;
    private javax.swing.JTextField jTextField5_cidade;
    private javax.swing.JTextField jTextField6_estado;
    // End of variables declaration//GEN-END:variables
}
