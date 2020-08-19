package JuegoXO;

import java.awt.Color;

public class VentanaXO extends javax.swing.JFrame {
  
    public VentanaXO() {       
        initComponents();
        llenar();
        pnlO.setBackground(Color.WHITE);
        pnlX.setBackground(Color.GREEN);
        diagonal1.setVisible(false);
        diagonal2.setVisible(false);
        columna1.setVisible(false);
        columna2.setVisible(false);
        columna3.setVisible(false);
        fila1.setVisible(false);
        fila2.setVisible(false);      
        fila3.setVisible(false);
        this.setLocationRelativeTo(null);
        
        VentanaDatos v = new VentanaDatos ();
        nombreJ1.setText(v.texto1);
        nombreJ2.setText(v.texto2);
    }
    
    public static String tX = "";
    public static String tO = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelXO = new javax.swing.JPanel();
        diagonal2 = new javax.swing.JLabel();
        diagonal1 = new javax.swing.JLabel();
        columna1 = new javax.swing.JPanel();
        columna2 = new javax.swing.JPanel();
        columna3 = new javax.swing.JPanel();
        fila1 = new javax.swing.JPanel();
        fila3 = new javax.swing.JPanel();
        fila2 = new javax.swing.JPanel();
        B00 = new javax.swing.JButton();
        B01 = new javax.swing.JButton();
        B02 = new javax.swing.JButton();
        B12 = new javax.swing.JButton();
        B11 = new javax.swing.JButton();
        B10 = new javax.swing.JButton();
        B20 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        botonJugarDeNuevo = new javax.swing.JButton();
        panelContador = new javax.swing.JPanel();
        pnlX = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jx = new javax.swing.JLabel();
        pnlO = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jo = new javax.swing.JLabel();
        nombreJ2 = new javax.swing.JLabel();
        nombreJ1 = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        botonFinalizar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUEGO XO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelXO.setBackground(new java.awt.Color(102, 102, 255));
        panelXO.setOpaque(false);
        panelXO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        diagonal2.setForeground(new java.awt.Color(0, 153, 0));
        diagonal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/diagonal2.png"))); // NOI18N
        panelXO.add(diagonal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 10, 430, 250));

        diagonal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/diagonal1.png"))); // NOI18N
        panelXO.add(diagonal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 10, 360, 250));

        columna1.setBackground(new java.awt.Color(255, 0, 0));
        columna1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout columna1Layout = new javax.swing.GroupLayout(columna1);
        columna1.setLayout(columna1Layout);
        columna1Layout.setHorizontalGroup(
            columna1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        columna1Layout.setVerticalGroup(
            columna1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        panelXO.add(columna1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, -1, -1));

        columna2.setBackground(new java.awt.Color(255, 0, 0));
        columna2.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout columna2Layout = new javax.swing.GroupLayout(columna2);
        columna2.setLayout(columna2Layout);
        columna2Layout.setHorizontalGroup(
            columna2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        columna2Layout.setVerticalGroup(
            columna2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        panelXO.add(columna2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -10, -1, -1));

        columna3.setBackground(new java.awt.Color(255, 0, 0));
        columna3.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout columna3Layout = new javax.swing.GroupLayout(columna3);
        columna3.setLayout(columna3Layout);
        columna3Layout.setHorizontalGroup(
            columna3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        columna3Layout.setVerticalGroup(
            columna3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        panelXO.add(columna3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        fila1.setBackground(new java.awt.Color(255, 0, 0));
        fila1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout fila1Layout = new javax.swing.GroupLayout(fila1);
        fila1.setLayout(fila1Layout);
        fila1Layout.setHorizontalGroup(
            fila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        fila1Layout.setVerticalGroup(
            fila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelXO.add(fila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 40, 320, 10));

        fila3.setBackground(new java.awt.Color(255, 0, 0));
        fila3.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout fila3Layout = new javax.swing.GroupLayout(fila3);
        fila3.setLayout(fila3Layout);
        fila3Layout.setHorizontalGroup(
            fila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        fila3Layout.setVerticalGroup(
            fila3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelXO.add(fila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 200, 310, 10));

        fila2.setBackground(new java.awt.Color(255, 0, 0));
        fila2.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout fila2Layout = new javax.swing.GroupLayout(fila2);
        fila2.setLayout(fila2Layout);
        fila2Layout.setHorizontalGroup(
            fila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        fila2Layout.setVerticalGroup(
            fila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        panelXO.add(fila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 120, 320, 10));

        B00.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B00ActionPerformed(evt);
            }
        });
        panelXO.add(B00, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 75, 75));

        B01.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B01ActionPerformed(evt);
            }
        });
        panelXO.add(B01, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 75, 75));

        B02.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B02ActionPerformed(evt);
            }
        });
        panelXO.add(B02, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 75, 75));

        B12.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });
        panelXO.add(B12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 75, 75));

        B11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });
        panelXO.add(B11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 75, 75));

        B10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });
        panelXO.add(B10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 75, 75));

        B20.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B20ActionPerformed(evt);
            }
        });
        panelXO.add(B20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 75, 75));

        B21.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B21ActionPerformed(evt);
            }
        });
        panelXO.add(B21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 75, 75));

        B22.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B22ActionPerformed(evt);
            }
        });
        panelXO.add(B22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 75, 75));

        getContentPane().add(panelXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 250, 260));

        botonJugarDeNuevo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonJugarDeNuevo.setForeground(new java.awt.Color(0, 153, 0));
        botonJugarDeNuevo.setText("Jugar de Nuevo");
        botonJugarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarDeNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(botonJugarDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        panelContador.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");

        jx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jx.setText("0");

        javax.swing.GroupLayout pnlXLayout = new javax.swing.GroupLayout(pnlX);
        pnlX.setLayout(pnlXLayout);
        pnlXLayout.setHorizontalGroup(
            pnlXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlXLayout.setVerticalGroup(
            pnlXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlXLayout.createSequentialGroup()
                .addGroup(pnlXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("O");

        jo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jo.setText("0");

        javax.swing.GroupLayout pnlOLayout = new javax.swing.GroupLayout(pnlO);
        pnlO.setLayout(pnlOLayout);
        pnlOLayout.setHorizontalGroup(
            pnlOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlOLayout.setVerticalGroup(
            pnlOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelContadorLayout = new javax.swing.GroupLayout(panelContador);
        panelContador.setLayout(panelContadorLayout);
        panelContadorLayout.setHorizontalGroup(
            panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelContadorLayout.setVerticalGroup(
            panelContadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContadorLayout.createSequentialGroup()
                .addComponent(pnlX, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelContador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 130, 60));

        nombreJ2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nombreJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJ2.setText("Texto2");
        getContentPane().add(nombreJ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 210, 30));

        nombreJ1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        nombreJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreJ1.setText("Texto1");
        getContentPane().add(nombreJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 210, 30));

        jugador1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jugador1.setText("Jugador X");
        getContentPane().add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jugador2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jugador2.setText("Jugador O");
        getContentPane().add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        botonFinalizar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botonFinalizar.setForeground(new java.awt.Color(0, 153, 0));
        botonFinalizar.setText("Finalizar");
        botonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(botonFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/imagen2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B00ActionPerformed
        turnoar();
        l.rayas(matriz, diagonal1, 7, 0, 0);
        l.rayas(matriz, fila1, 1, 0, 0);
        l.rayas(matriz, columna1, 4, 0, 0);
        
        if(l.ejecutar(B00, 0, 0, matriz, jx, jo)==1){
            reiniciar();
        }
    }//GEN-LAST:event_B00ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        turnoar();
        
        l.rayas(matriz, columna3, 6, 1,2);
        l.rayas(matriz, fila2, 2, 1, 2);
        if(l.ejecutar(B12, 1,2, matriz, jx, jo)==1){
            reiniciar();
        }       
    }//GEN-LAST:event_B12ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        turnoar();
        l.rayas(matriz, diagonal2, 8, 1,1);
        l.rayas(matriz, diagonal1, 7, 1, 1);
        l.rayas(matriz, columna2, 5, 1, 1);
        l.rayas(matriz, fila2, 2, 1, 1);
        if(l.ejecutar(B11, 1,1, matriz, jx, jo)==1){
            reiniciar();
        }
    }//GEN-LAST:event_B11ActionPerformed

    private void B22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B22ActionPerformed
        turnoar();
        l.rayas(matriz, columna2, 2, 2,2);
        l.rayas(matriz, diagonal1, 7, 2,2);
        l.rayas(matriz, columna3, 6, 2, 2);
        l.rayas(matriz, fila3, 3, 2, 2);
        if(l.ejecutar(B22, 2,2, matriz, jx, jo)==1){
            reiniciar();
        }
    }//GEN-LAST:event_B22ActionPerformed

    private void B01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B01ActionPerformed
        turnoar();
        l.rayas(matriz, fila1, 1, 0, 1);
        l.rayas(matriz, fila2, 2, 0, 1);
        l.rayas(matriz, columna2, 5, 0, 1);
        if(l.ejecutar(B01, 0,1, matriz, jx, jo)==1){
            reiniciar();
        }
    }//GEN-LAST:event_B01ActionPerformed

    private void B02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B02ActionPerformed
        turnoar();
        l.rayas(matriz, diagonal2, 8, 0,2);
        l.rayas(matriz, fila1, 1, 0, 2);
        l.rayas(matriz, columna3, 6, 0, 2);
        if(l.ejecutar(B02, 0,2, matriz, jx, jo)==1){
            reiniciar();
        }
    }//GEN-LAST:event_B02ActionPerformed

    private void B20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B20ActionPerformed
        turnoar();
        l.rayas(matriz, diagonal2, 8, 2,0);
        l.rayas(matriz, fila3, 2, 2,0);
        l.rayas(matriz, columna1, 4, 2, 0);
        l.rayas(matriz, fila3, 3, 2, 0);
        if(l.ejecutar(B20, 2,0, matriz, jx, jo)==1){
            reiniciar();
        } 
    }//GEN-LAST:event_B20ActionPerformed

    private void B21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B21ActionPerformed
        turnoar();
        l.rayas(matriz, fila3, 2, 2,1);
        l.rayas(matriz, columna2, 5, 2, 1);
        l.rayas(matriz, fila3, 3, 2, 1);
        if(l.ejecutar(B21, 2,1, matriz, jx, jo)==1){
            reiniciar();
        } 
    }//GEN-LAST:event_B21ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        turnoar();
        l.rayas(matriz, fila2, 2, 1, 0);
        l.rayas(matriz, columna1, 4, 1, 0);
        if(l.ejecutar(B10, 1,0, matriz, jx, jo)==1){
            reiniciar();
        } 
    }//GEN-LAST:event_B10ActionPerformed

    private void botonJugarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarDeNuevoActionPerformed
        reiniciar();
    }//GEN-LAST:event_botonJugarDeNuevoActionPerformed

    private void botonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarActionPerformed
        tX = jx.getText();
        tO = jo.getText();
        
        VentanaFinal v = new VentanaFinal ();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonFinalizarActionPerformed
    
    int matriz[][]=new int[3][3];
    public void llenar(){
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            matriz[i][j]=(j+10)*(i+10);
        }
    }
    }
    
    CalculoXO l = new CalculoXO(0,0,0);

    public void turnoar(){
    if(l.getTurno()==1){
        pnlX.setBackground(Color.green);
        pnlO.setBackground(Color.white);
    }
    if(l.getTurno()==0){
        pnlX.setBackground(Color.white);
        pnlO.setBackground(Color.green);
    }
    }
    
    public void reiniciar(){
        llenar();
        B00.setText("");
        B00.setEnabled(true);
        B01.setText("");
        B01.setEnabled(true);
        B02.setText("");
        B02.setEnabled(true);
        B10.setText("");
        B10.setEnabled(true);
        B11.setText("");
        B11.setEnabled(true);
        B12.setText("");
        B12.setEnabled(true);
        B20.setText("");
        B20.setEnabled(true);
        B21.setText("");
        B21.setEnabled(true);
        B22.setText("");
        B22.setEnabled(true);
        diagonal1.setVisible(false);
        diagonal2.setVisible(false);
        columna1.setVisible(false);      
        columna2.setVisible(false);
        columna3.setVisible(false);       
        fila1.setVisible(false);
        fila2.setVisible(false);
        fila3.setVisible(false);
}

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
            java.util.logging.Logger.getLogger(VentanaXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaXO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaXO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B00;
    private javax.swing.JButton B01;
    private javax.swing.JButton B02;
    private javax.swing.JButton B10;
    private javax.swing.JButton B11;
    private javax.swing.JButton B12;
    private javax.swing.JButton B20;
    private javax.swing.JButton B21;
    private javax.swing.JButton B22;
    private javax.swing.JButton botonFinalizar;
    private javax.swing.JButton botonJugarDeNuevo;
    private javax.swing.JPanel columna1;
    private javax.swing.JPanel columna2;
    private javax.swing.JPanel columna3;
    private javax.swing.JLabel diagonal1;
    private javax.swing.JLabel diagonal2;
    private javax.swing.JPanel fila1;
    private javax.swing.JPanel fila2;
    private javax.swing.JPanel fila3;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jo;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JLabel jx;
    private javax.swing.JLabel nombreJ1;
    private javax.swing.JLabel nombreJ2;
    private javax.swing.JPanel panelContador;
    private javax.swing.JPanel panelXO;
    private javax.swing.JPanel pnlO;
    private javax.swing.JPanel pnlX;
    // End of variables declaration//GEN-END:variables
}