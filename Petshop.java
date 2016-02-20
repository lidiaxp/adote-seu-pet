package Program;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Petshop extends javax.swing.JFrame {
    private int x = 0;
    private int y = 0;
    private String nomear;
    private String racear;
    
    public Petshop() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    public void adocao() throws AnimalExcepetion, NameExcepetion{
        nomear = nome.getText();
        racear = raca.getText();
        if(especie.getText().equals("Cachorro")){
            Cachorro jack = new Cachorro (nomear, racear, 5, 5, 7, 7, false, false, false, false);
            maternidade.setText("Parabéns, seu cachorro logo irá nascer, tente chocá-lo");
            x = 2;
        } else if (especie.getText().equals("Gato")) {
            Gato larry = new Gato (nomear, racear, 8, 4, 6, 4, false, false, false, 5);
            maternidade.setText("Parabéns, seu gato logo irá nascer, tente chocá-lo");
            x = 3;
        } else if (especie.getText().equals("Passarinho")) {
            Passarinho jonhy = new Passarinho (nomear, racear, 6, 5, 3, 5, false, false, false, false);
            maternidade.setText("Parabéns, seu passarinho logo irá nascer, tente chocá-lo");
            x = 4;
        }else {
            throw new AnimalExcepetion("Escolha um animal para adotar");
        }
        if (nome.getText().equals("")||raca.getText().equals("")){
            throw new NameExcepetion("De um nome e uma raça ao seu pet");
        } 
        if(nome.getText().equals(raca.getText())){
            throw new AnimalExcepetion("Raça não pode ser igual ao nome");
        }
    }
    
    public void chocar() throws MissingPet {
        if(x>1){
            y++;
            if(y > 30){
                URL url = getClass().getResource("explosao.wav");
                AudioClip audio = Applet.newAudioClip(url);
                audio.play();
                if(x==2){      
                    new LifeDog(nomear,racear).setVisible(true);
                    this.dispose();
                } else if (x==3){             
                    new LifeCat(nomear,racear).setVisible(true);
                    this.dispose();
                } else if (x==4) {
                    new LifeBird(nomear,racear).setVisible(true);
                    this.dispose();
                }
            }
        } else {
            throw new MissingPet("Primeiro adote um animal");
        }
    }
    
    public String getRaca(){
        return raca.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        raca = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        especie = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        maternidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adote seu pet");

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bem-vindo, você acabou de entrar no pet shop, temos disponível cachorros, gatos e passarinhos.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setText("Pode escolher qual animal você quer e suas características:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 26, -1, -1));

        jButton1.setText("Cachorro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jButton2.setText("Gato");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jButton3.setText("Passarinho");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, -1, -1));

        jLabel4.setText("Raça:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 153, -1, -1));
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, 116, -1));

        raca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                racaActionPerformed(evt);
            }
        });
        jPanel1.add(raca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, 116, -1));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 102));
        jButton4.setText("Criar pet");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        especie.setText("Espécie");
        jPanel1.add(especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 51));
        jButton5.setText("Chocar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Program/FER_0007_RENDER_04.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        maternidade.setText("Maternidade");
        jPanel1.add(maternidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        especie.setText("Cachorro");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        especie.setText("Passarinho");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void racaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_racaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_racaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            adocao();
        } catch (NameExcepetion ex) {
            Logger.getLogger(Petshop.class.getName()).log(Level.SEVERE, null, ex);
            new Principal().setVisible(true);
            this.dispose();
        } catch (AnimalExcepetion ex) {
            Logger.getLogger(Petshop.class.getName()).log(Level.SEVERE, null, ex);
            new Principal().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            chocar();
        } catch (MissingPet ex) {
            Logger.getLogger(Petshop.class.getName()).log(Level.SEVERE, null, ex);
            new Principal().setVisible(true);
            this.dispose();
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        especie.setText("Gato");
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Petshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Petshop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel especie;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maternidade;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField raca;
    // End of variables declaration//GEN-END:variables
}
