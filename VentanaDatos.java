package JuegoXO;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class VentanaDatos extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    
    public VentanaDatos() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public static String texto1 = "";
    public static String texto2 = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        txtJugador1 = new javax.swing.JTextField();
        txtJugador2 = new javax.swing.JTextField();
        ButtonIniciar = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUEGO XO");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugador1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jugador1.setForeground(new java.awt.Color(0, 153, 0));
        jugador1.setText("JUGADOR 1");
        jPanel1.add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        jugador2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jugador2.setForeground(new java.awt.Color(0, 153, 0));
        jugador2.setText("JUGADOR 2");
        jPanel1.add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 140, 20));

        txtJugador1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 180, 20));

        txtJugador2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        txtJugador2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 180, 20));

        ButtonIniciar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 10)); // NOI18N
        ButtonIniciar.setForeground(new java.awt.Color(255, 153, 0));
        ButtonIniciar.setText("INICIAR PARTIDA");
        ButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        ButtonSalir.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        ButtonSalir.setForeground(new java.awt.Color(255, 153, 0));
        ButtonSalir.setText("SALIR");
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/ventana inicio.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIniciarActionPerformed
        texto1 = txtJugador1.getText();
        texto2 = txtJugador2.getText();

        VentanaXO v = new VentanaXO ();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonIniciar;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugador2;
    // End of variables declaration//GEN-END:variables

        class FondoPanel extends JPanel {   
        private Image imagen;
        
        @Override
        public void paint (Graphics g){
        imagen = new ImageIcon(getClass().getResource("/Imágenes/imagen.jpg")).getImage();
       
        g.drawImage(imagen,0, 0, getWidth(), getHeight(), this);
        setOpaque(false);      
        
        super.paint(g);
        } 
    }  
}