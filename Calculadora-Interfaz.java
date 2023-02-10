

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Calc extends javax.swing.JFrame {

    //variables
    String  signo, contenido;
    Double resultado=0.0,valor1=0.0, valor2=0.0,valor3=0.0;
    
    public Calc() {
        initComponents();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_exp = new javax.swing.JButton();
        btn_porcentaje = new javax.swing.JButton();
        btn_division = new javax.swing.JButton();
        btn_multi = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_suma1 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txt_resultado = new javax.swing.JLabel();
        txt_operacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_c = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_iva = new javax.swing.JButton();
        btn_elevado = new javax.swing.JButton();
        btn_division1 = new javax.swing.JButton();
        btn_multi1 = new javax.swing.JButton();
        btn_resta1 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_igual1 = new javax.swing.JButton();
        btn_exp2 = new javax.swing.JButton();
        btn_sen = new javax.swing.JButton();
        btn_cos = new javax.swing.JButton();
        btn_tan = new javax.swing.JButton();
        btn_raiz = new javax.swing.JButton();
        btn_10 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        btn_exp.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 20)); // NOI18N
        btn_exp.setForeground(new java.awt.Color(55, 62, 71));
        btn_exp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_exp.setText("<-");
        btn_exp.setFocusPainted(false);
        btn_exp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_exp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_exp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_exp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expActionPerformed(evt);
            }
        });

        btn_porcentaje.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 21)); // NOI18N
        btn_porcentaje.setForeground(new java.awt.Color(55, 62, 71));
        btn_porcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_porcentaje.setText("%");
        btn_porcentaje.setFocusPainted(false);
        btn_porcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porcentaje.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_porcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_porcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcentajeActionPerformed(evt);
            }
        });

        btn_division.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_division.setForeground(new java.awt.Color(55, 62, 71));
        btn_division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_division.setText("/");
        btn_division.setFocusPainted(false);
        btn_division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divisionActionPerformed(evt);
            }
        });

        btn_multi.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_multi.setForeground(new java.awt.Color(55, 62, 71));
        btn_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_multi.setText("X");
        btn_multi.setFocusPainted(false);
        btn_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multi.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_multi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_multi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });

        btn_resta.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(55, 62, 71));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });

        btn_suma1.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_suma1.setForeground(new java.awt.Color(55, 62, 71));
        btn_suma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_suma1.setText("+");
        btn_suma1.setFocusPainted(false);
        btn_suma1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_suma1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_suma1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_suma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suma1ActionPerformed(evt);
            }
        });

        btn_igual.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_resultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txt_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txt_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 322, 60));

        txt_operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txt_operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 322, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 150));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_c.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_c.setForeground(new java.awt.Color(55, 62, 71));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btn_1.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        btn_7.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        btn_8.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        btn_9.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 62, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        btn_5.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        btn_6.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        btn_4.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        btn_2.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        btn_3.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        btn_dot.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        btn_dot.setForeground(new java.awt.Color(55, 62, 71));
        btn_dot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_dot.setText(".");
        btn_dot.setFocusPainted(false);
        btn_dot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dot.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_dot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_dot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel2.add(btn_dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        btn_iva.setFont(new java.awt.Font("Montserrat Medium", 1, 12)); // NOI18N
        btn_iva.setForeground(new java.awt.Color(55, 62, 71));
        btn_iva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_iva.setText("iva");
        btn_iva.setFocusPainted(false);
        btn_iva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_iva.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_iva.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_iva.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ivaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_iva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btn_elevado.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 20)); // NOI18N
        btn_elevado.setForeground(new java.awt.Color(55, 62, 71));
        btn_elevado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_elevado.setText("^");
        btn_elevado.setFocusPainted(false);
        btn_elevado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_elevado.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_elevado.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_elevado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_elevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elevadoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_elevado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        btn_division1.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_division1.setForeground(new java.awt.Color(55, 62, 71));
        btn_division1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_division1.setText("/");
        btn_division1.setFocusPainted(false);
        btn_division1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_division1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_division1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_division1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_division1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_division1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_division1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        btn_multi1.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 24)); // NOI18N
        btn_multi1.setForeground(new java.awt.Color(55, 62, 71));
        btn_multi1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_multi1.setText("X");
        btn_multi1.setFocusPainted(false);
        btn_multi1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multi1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_multi1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_multi1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_multi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multi1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        btn_resta1.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_resta1.setForeground(new java.awt.Color(55, 62, 71));
        btn_resta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_resta1.setText("-");
        btn_resta1.setFocusPainted(false);
        btn_resta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_resta1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_resta1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_resta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resta1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        btn_suma.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(55, 62, 71));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        btn_igual1.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 30)); // NOI18N
        btn_igual1.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btn_igual1.setText("=");
        btn_igual1.setFocusPainted(false);
        btn_igual1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_igual1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_igual1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_igual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igual1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        btn_exp2.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 20)); // NOI18N
        btn_exp2.setForeground(new java.awt.Color(55, 62, 71));
        btn_exp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_exp2.setText("<-");
        btn_exp2.setFocusPainted(false);
        btn_exp2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exp2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_exp2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_exp2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_exp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exp2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        btn_sen.setFont(new java.awt.Font("Montserrat Alternates Medium", 1, 12)); // NOI18N
        btn_sen.setForeground(new java.awt.Color(55, 62, 71));
        btn_sen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_sen.setText("sen");
        btn_sen.setFocusPainted(false);
        btn_sen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sen.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_sen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_sen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_senActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        btn_cos.setFont(new java.awt.Font("Montserrat Alternates Medium", 1, 12)); // NOI18N
        btn_cos.setForeground(new java.awt.Color(55, 62, 71));
        btn_cos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_cos.setText("cos");
        btn_cos.setFocusPainted(false);
        btn_cos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cos.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_cos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_cos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        btn_tan.setFont(new java.awt.Font("Montserrat Alternates Medium", 1, 12)); // NOI18N
        btn_tan.setForeground(new java.awt.Color(55, 62, 71));
        btn_tan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_tan.setText("tan");
        btn_tan.setFocusPainted(false);
        btn_tan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tan.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_tan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_tan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        btn_raiz.setFont(new java.awt.Font("Montserrat Alternates Medium", 0, 18)); // NOI18N
        btn_raiz.setForeground(new java.awt.Color(55, 62, 71));
        btn_raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_raiz.setText(" √");
        btn_raiz.setFocusPainted(false);
        btn_raiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_raiz.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_raiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_raiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raizActionPerformed(evt);
            }
        });
        jPanel2.add(btn_raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        btn_10.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        btn_10.setForeground(new java.awt.Color(55, 62, 71));
        btn_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn_10.setText("0");
        btn_10.setFocusPainted(false);
        btn_10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_10.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn_10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btn_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_10ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 350, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txt_operacion.setText("");
        txt_resultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        addNumber(".");
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ivaActionPerformed
            
        if("".equals(txt_operacion.getText())){
            valor1=Double.parseDouble(txt_resultado.getText());
            txt_operacion.setText(txt_resultado.getText());
            txt_resultado.setText(txt_resultado.getText() + " iva ");
            txt_operacion.setText("");
            
        }else{
            valor1=Double.parseDouble(txt_operacion.getText());
            //addNumber("+");
            txt_operacion.setText("");
            txt_resultado.setText(txt_resultado.getText() + " iva ");
        }
        
        signo="iva";
    }//GEN-LAST:event_btn_ivaActionPerformed

    private void btn_expActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expActionPerformed
        String texto = txt_operacion.getText().substring(0, txt_operacion.getText().length() - 1);
        txt_operacion.setText(texto);

    }//GEN-LAST:event_btn_expActionPerformed

    private void btn_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcentajeActionPerformed
        addNumber("%");
    }//GEN-LAST:event_btn_porcentajeActionPerformed

    private void btn_divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divisionActionPerformed

    }//GEN-LAST:event_btn_divisionActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed

    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed

    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_suma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suma1ActionPerformed
       

    }//GEN-LAST:event_btn_suma1ActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed

       

    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_elevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elevadoActionPerformed
      

        if("".equals(txt_operacion.getText())){
            valor1=Double.parseDouble(txt_resultado.getText());
            txt_operacion.setText(txt_resultado.getText());
            txt_resultado.setText(txt_resultado.getText() + "^");
            txt_operacion.setText("");
            
        }else{
            valor1=Double.parseDouble(txt_operacion.getText());
            //addNumber("+");
            txt_operacion.setText("");
            txt_resultado.setText(txt_resultado.getText() + "^");
        }
        
        signo="^";
        
    }//GEN-LAST:event_btn_elevadoActionPerformed

    private void btn_division1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_division1ActionPerformed

                if("".equals(txt_operacion.getText())){
            valor1=Double.parseDouble(txt_resultado.getText());
            txt_operacion.setText(txt_resultado.getText());
            txt_resultado.setText(txt_resultado.getText() + "/");
            txt_operacion.setText("");
            
        }else{
            valor1=Double.parseDouble(txt_operacion.getText());
            //addNumber("+");
            txt_operacion.setText("");
            txt_resultado.setText(txt_resultado.getText() + "/");
        }
        
        signo="/";
    }//GEN-LAST:event_btn_division1ActionPerformed

    private void btn_multi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multi1ActionPerformed
       
        if("".equals(txt_operacion.getText())){
            valor1=Double.parseDouble(txt_resultado.getText());
            txt_operacion.setText(txt_resultado.getText());
            txt_resultado.setText(txt_resultado.getText() + "x");
            txt_operacion.setText("");
            
        }else{
            valor1=Double.parseDouble(txt_operacion.getText());
            //addNumber("+");
            txt_operacion.setText("");
            txt_resultado.setText(txt_resultado.getText() + "x");
        }
        
        signo="*";
        
    }//GEN-LAST:event_btn_multi1ActionPerformed

    private void btn_resta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resta1ActionPerformed
        
        if("".equals(txt_operacion.getText())){
            valor1=Double.parseDouble(txt_resultado.getText());
            txt_operacion.setText(txt_resultado.getText());
            txt_resultado.setText(txt_resultado.getText() + "-");
            txt_operacion.setText("");
            
        }else{
            valor1=Double.parseDouble(txt_operacion.getText());
            //addNumber("+");
            txt_operacion.setText("");
            txt_resultado.setText(txt_resultado.getText() + "-");
        }
        signo="-";        
   
    }//GEN-LAST:event_btn_resta1ActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        if("".equals(txt_operacion.getText())){
            valor1=Double.parseDouble(txt_resultado.getText());
            txt_operacion.setText(txt_resultado.getText());
            txt_resultado.setText(txt_resultado.getText() + "+");
            txt_operacion.setText("");
            
        }else{
            valor1=Double.parseDouble(txt_operacion.getText());
            //addNumber("+");
            txt_operacion.setText("");
            txt_resultado.setText(txt_resultado.getText() + "+");
        }
        
        signo="+";

    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_igual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igual1ActionPerformed

        valor2=Double.parseDouble(txt_operacion.getText());
        txt_resultado.setText(operaciones(valor1,valor2,valor3,signo));
        txt_operacion.setText("");
    }//GEN-LAST:event_btn_igual1ActionPerformed

    private void btn_exp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exp2ActionPerformed
        String texto = txt_operacion.getText().substring(0, txt_operacion.getText().length() - 1);
        txt_operacion.setText(texto);
        txt_resultado.setText(texto);
        
    }//GEN-LAST:event_btn_exp2ActionPerformed

    private void btn_senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_senActionPerformed
        
        if("".equals(txt_resultado.getText())){
            txt_operacion.setText("Introduzca el número primero");
            txt_resultado.setText("Oprima C");
        }else{
        valor1=Double.parseDouble(txt_resultado.getText());
        txt_resultado.setText("Sen("+valor1+")");
        valor3=Math.toRadians(valor1);
        
        
        signo="sen";
        }
        
    }//GEN-LAST:event_btn_senActionPerformed

    private void btn_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosActionPerformed
         
        
        if("".equals(txt_resultado.getText())){
            txt_operacion.setText("Introduzca el número primero");
            txt_resultado.setText("Oprima C");
        }else{
        valor1=Double.parseDouble(txt_resultado.getText());
        txt_resultado.setText("Cos("+valor1+")");
        valor3=Math.toRadians(valor1);
        
        
        signo="c";
        }
        
    }//GEN-LAST:event_btn_cosActionPerformed

    private void btn_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tanActionPerformed
        
            
        if("".equals(txt_resultado.getText())){
            txt_operacion.setText("Introduzca el número primero");
            txt_resultado.setText("Oprima C");
        }else{
        valor1=Double.parseDouble(txt_resultado.getText());
        txt_resultado.setText("Tan("+valor1+")");
        valor3=Math.toRadians(valor1);
        
        
        signo="tan";
        }
    }//GEN-LAST:event_btn_tanActionPerformed

    private void btn_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raizActionPerformed
        
        
        if("".equals(txt_resultado.getText())){
            txt_operacion.setText("Introduzca el número primero");
            txt_resultado.setText("Oprima C");
        }else{
        valor1=Double.parseDouble(txt_resultado.getText());
            txt_resultado.setText("√("+valor1+")");
            signo="raiz";
        
        }
    }//GEN-LAST:event_btn_raizActionPerformed

    private void btn_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_10ActionPerformed
        addNumber("0");// TODO add your handling code here:
    }//GEN-LAST:event_btn_10ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }
    
    public void addNumber(String digito) {
        txt_operacion.setText(txt_operacion.getText() + digito);
        txt_resultado.setText(txt_resultado.getText() + digito);
    }
    public static String operaciones(Double valor1, Double valor2, Double valor3, String signo){
        
        String resultado_final;
        Double calculo=0.0;
        
        switch(signo) {
            case "+":
              calculo = valor1 + valor2;
              break;
            case "-":
              calculo = valor1 - valor2;
              break;
            case "/":
              calculo = valor1 / valor2;
              break;
            case "*":
              calculo = (valor1 * valor2);
              break;
            case "sen":
              calculo = Math.sin(valor3);
              break;
            case "cos":
              calculo = Math.cos(valor3);
              break;
            case "tan":
              calculo = Math.tan(valor3);
              break;
            case "^":
              calculo = Math.pow(valor1,valor2);
              break;
            case "raiz":
              calculo = Math.sqrt(valor1);
              break; 
            case "iva":
              calculo = (valor1/100)*valor2;
              break;
            default:
              // code block
          }
        
        resultado_final=calculo.toString();
        return resultado_final;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_10;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_cos;
    private javax.swing.JButton btn_division;
    private javax.swing.JButton btn_division1;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_elevado;
    private javax.swing.JButton btn_exp;
    private javax.swing.JButton btn_exp2;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_igual1;
    private javax.swing.JButton btn_iva;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_multi1;
    private javax.swing.JButton btn_porcentaje;
    private javax.swing.JButton btn_raiz;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_resta1;
    private javax.swing.JButton btn_sen;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_suma1;
    private javax.swing.JButton btn_tan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_operacion;
    private javax.swing.JLabel txt_resultado;
    // End of variables declaration//GEN-END:variables

    private Object txt_resultado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
