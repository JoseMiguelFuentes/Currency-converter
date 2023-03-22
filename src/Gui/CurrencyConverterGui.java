

package Gui;

import Util.Symbols;
import Currencies.CurrencyConverter;
import Util.getSecureData;
import java.awt.Color;

import java.awt.LayoutManager;
import java.awt.Toolkit;

import java.text.NumberFormat;
import java.util.ArrayList;

import java.util.Collections;

import java.util.Map;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import pressure.PressureConverter;
import temperature.TemperatureConverter;







/**
 *
 * @author jomif
 */
public class CurrencyConverterGui extends javax.swing.JFrame {

    String apiKey;
    int xMouse,yMouse;
    
    public CurrencyConverterGui() {
        initComponents();
        LoadSymbols();
        this.setLocationRelativeTo( null );//Este Código permite iniciar la ventana en elcentor de la pantalla.
        this.setBackground (new Color(0, 0, 102, 200) );
        this.jPbg.setBackground( new Color(10,10,35) );
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/exchange.png")));
        this.apiKey = new getSecureData().getApiKey();
    }
    
   
//    @SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        btnMinP = new javax.swing.JPanel();
        btnMin = new javax.swing.JLabel();
        btnCloseP = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        Light = new Gui.RoundJLabel();
        jLabel1 = new javax.swing.JLabel();
        jLive = new javax.swing.JLabel();
        jpLateralR = new javax.swing.JPanel();
        jPbg = new RoundedPanel( 27, new Color(10,10,35));
        Result = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        txtTasaName = new javax.swing.JTextField();
        txtAmount = new javax.swing.JSpinner();
        txtTasa = new javax.swing.JTextField();
        jlMonto = new javax.swing.JLabel();
        cbFrom = new javax.swing.JComboBox<>();
        cbTo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLTitleCurrency = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLbg = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListConverters = new javax.swing.JList<>();
        jPTemp = new javax.swing.JPanel();
        jlGrados = new javax.swing.JLabel();
        txtGrados = new javax.swing.JSpinner();
        btnConvert1 = new javax.swing.JButton();
        ResulTemp = new javax.swing.JTextField();
        cbFromTemp = new javax.swing.JComboBox<>();
        cbToTemp = new javax.swing.JComboBox<>();
        jLTitleTemp = new javax.swing.JLabel();
        jLIconTemp = new javax.swing.JLabel();
        jLTemp = new javax.swing.JLabel();
        jPPresion = new javax.swing.JPanel();
        jlGrados1 = new javax.swing.JLabel();
        spiPressure = new javax.swing.JSpinner();
        btnConvertPressure = new javax.swing.JButton();
        ResultPressure = new javax.swing.JTextField();
        cbFromPressure = new javax.swing.JComboBox<>();
        cbToPressure = new javax.swing.JComboBox<>();
        jLTitleTemp1 = new javax.swing.JLabel();
        jLTemp1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(10, 10, 35));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinP.setBackground(new java.awt.Color(38, 36, 91));
        btnMinP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        btnMinP.setForeground(new java.awt.Color(0, 51, 153));
        btnMinP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinPMouseExited(evt);
            }
        });
        btnMinP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMin.setFont(new java.awt.Font("Orbitron SemiBold", 0, 18)); // NOI18N
        btnMin.setForeground(new java.awt.Color(255, 255, 255));
        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setText("-");
        btnMin.setAlignmentY(0.0F);
        btnMin.setInheritsPopupMenu(false);
        btnMinP.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 37, 30));
        btnMin.getAccessibleContext().setAccessibleParent(btnMinP);

        Header.add(btnMinP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 40, 30));

        btnCloseP.setBackground(new java.awt.Color(38, 36, 91));
        btnCloseP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        btnCloseP.setForeground(new java.awt.Color(0, 51, 153));
        btnCloseP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClosePMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClosePMouseExited(evt);
            }
        });
        btnCloseP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setBackground(new java.awt.Color(153, 255, 153));
        btnClose.setFont(new java.awt.Font("Orbitron Medium", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        btnCloseP.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        Header.add(btnCloseP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 30));
        Header.add(Light, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 10));

        jLabel1.setFont(new java.awt.Font("CaskaydiaCove NFM", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido al mejor conversor!");
        Header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 370, 30));

        jLive.setFont(new java.awt.Font("Lato", 0, 10)); // NOI18N
        jLive.setForeground(new java.awt.Color(255, 255, 255));
        jLive.setText("Online?");
        Header.add(jLive, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 20));

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        jpLateralR.setBackground(new java.awt.Color(10, 10, 35));

        javax.swing.GroupLayout jpLateralRLayout = new javax.swing.GroupLayout(jpLateralR);
        jpLateralR.setLayout(jpLateralRLayout);
        jpLateralRLayout.setHorizontalGroup(
            jpLateralRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jpLateralRLayout.setVerticalGroup(
            jpLateralRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jpLateralR, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 40, 400));

        jPbg.setForeground(new java.awt.Color(0, 0, 0));
        jPbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Result.setEditable(false);
        Result.setBackground(new java.awt.Color(10, 10, 35));
        Result.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        Result.setForeground(new java.awt.Color(255, 255, 255));
        Result.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Result.setFocusable(false);
        jPbg.add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 240, 40));

        btnConvert.setBackground(new java.awt.Color(10, 10, 85));
        btnConvert.setFont(new java.awt.Font("Inconsolata Ultra Expanded SemiBold", 0, 14)); // NOI18N
        btnConvert.setForeground(new java.awt.Color(255, 255, 255));
        btnConvert.setText("Convertir");
        btnConvert.setBorderPainted(false);
        btnConvert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvertMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvertMouseExited(evt);
            }
        });
        jPbg.add(btnConvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 160, 40));

        txtTasaName.setEditable(false);
        txtTasaName.setBackground(new java.awt.Color(10, 10, 35));
        txtTasaName.setFont(new java.awt.Font("Cormorant SC", 0, 12)); // NOI18N
        txtTasaName.setForeground(new java.awt.Color(255, 255, 255));
        txtTasaName.setText("Tasa:");
        txtTasaName.setBorder(null);
        txtTasaName.setFocusable(false);
        jPbg.add(txtTasaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 110, 20));

        txtAmount.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jPbg.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 40));
        txtAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000000000, 5));

        txtTasa.setEditable(false);
        txtTasa.setBackground(new java.awt.Color(10, 10, 35));
        txtTasa.setFont(new java.awt.Font("Orbitron", 0, 10)); // NOI18N
        txtTasa.setForeground(new java.awt.Color(255, 255, 255));
        txtTasa.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTasa.setBorder(null);
        txtTasa.setFocusable(false);
        jPbg.add(txtTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 130, 20));

        jlMonto.setBackground(new java.awt.Color(255, 255, 255));
        jlMonto.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jlMonto.setForeground(new java.awt.Color(255, 255, 255));
        jlMonto.setText("Monto");
        jPbg.add(jlMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cbFrom.setFont(new java.awt.Font("Victor Mono Medium", 0, 14)); // NOI18N
        cbFrom.setForeground(new java.awt.Color(255, 255, 255));
        cbFrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convierte de" }));
        cbFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFromActionPerformed(evt);
            }
        });
        jPbg.add(cbFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 40));

        cbTo.setFont(new java.awt.Font("Victor Mono Medium", 0, 14)); // NOI18N
        cbTo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hasta" }));
        cbTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToActionPerformed(evt);
            }
        });
        jPbg.add(cbTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 270, 40));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("www.vecteezy.com/free-vector/wallpaper");
        jLabel2.setEnabled(false);
        jPbg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLTitleCurrency.setFont(new java.awt.Font("Cormorant SC", 0, 18)); // NOI18N
        jLTitleCurrency.setForeground(new java.awt.Color(255, 255, 255));
        jLTitleCurrency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitleCurrency.setText("Conversor de monedas en tiempo real");
        jLTitleCurrency.setVerifyInputWhenFocusTarget(false);
        jPbg.add(jLTitleCurrency, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 350, 30));

        jLabel3.setBackground(new java.awt.Color(204, 0, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exchangeicon.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPbg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 48, 48));

        jLbg.setBackground(new java.awt.Color(0, 0, 0));
        jLbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OtherLittle.png"))); // NOI18N
        jLbg.setText("jLabel2");
        jPbg.add(jLbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 340));

        getContentPane().add(jPbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 600, 370));

        jListConverters.setBackground(new Color( 51,153,225,150 ));
        jListConverters.setBorder(null);
        jListConverters.setFont(new java.awt.Font("Cormorant SC SemiBold", 0, 12)); // NOI18N
        jListConverters.setForeground(new java.awt.Color(10, 10, 35));
        jListConverters.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Monedas", "Temperatura", "Unidades de presión" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListConverters.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListConverters.setAutoscrolls(false);
        jListConverters.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jListConverters.setMaximumSize(new java.awt.Dimension(117, 84));
        jListConverters.setSelectedIndex(0);
        jListConverters.setSelectionBackground(new java.awt.Color(10, 10, 35));
        jListConverters.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jListConverters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListConvertersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListConverters);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 70));

        jPTemp.setBackground(new Color(10,10,35, 150));
        jPTemp.setForeground(new java.awt.Color(255, 255, 255));
        jPTemp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlGrados.setBackground(new java.awt.Color(255, 255, 255));
        jlGrados.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jlGrados.setForeground(new java.awt.Color(255, 255, 255));
        jlGrados.setText("Grados°");
        jPTemp.add(jlGrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txtGrados.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jPTemp.add(txtGrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 40));
        txtAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000000000, 5));

        btnConvert1.setBackground(new java.awt.Color(10, 10, 35));
        btnConvert1.setFont(new java.awt.Font("Inconsolata Ultra Expanded SemiBold", 0, 14)); // NOI18N
        btnConvert1.setForeground(new java.awt.Color(255, 255, 255));
        btnConvert1.setText("Convertir");
        btnConvert1.setBorderPainted(false);
        btnConvert1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConvert1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvert1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvert1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvert1MouseExited(evt);
            }
        });
        btnConvert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvert1ActionPerformed(evt);
            }
        });
        jPTemp.add(btnConvert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 160, 40));

        ResulTemp.setEditable(false);
        ResulTemp.setBackground(new java.awt.Color(10, 10, 35));
        ResulTemp.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        ResulTemp.setForeground(new java.awt.Color(255, 255, 255));
        ResulTemp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ResulTemp.setFocusable(false);
        jPTemp.add(ResulTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 240, 40));

        cbFromTemp.setBackground(new java.awt.Color(255, 255, 255));
        cbFromTemp.setFont(new java.awt.Font("Victor Mono Medium", 0, 14)); // NOI18N
        cbFromTemp.setForeground(new java.awt.Color(10, 10, 35));
        cbFromTemp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convierte de", "Celsius", "Fahrenheit", "Kelvin", "Rankine" }));
        cbFromTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFromTempActionPerformed(evt);
            }
        });
        jPTemp.add(cbFromTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 40));

        cbToTemp.setBackground(new java.awt.Color(255, 255, 255));
        cbToTemp.setFont(new java.awt.Font("Victor Mono Medium", 0, 14)); // NOI18N
        cbToTemp.setForeground(new java.awt.Color(10, 10, 35));
        cbToTemp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hasta", "Celsius", "Fahrenheit", "Kelvin", "Rankine" }));
        cbToTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToTempActionPerformed(evt);
            }
        });
        jPTemp.add(cbToTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 270, 40));

        jLTitleTemp.setFont(new java.awt.Font("Cormorant SC", 0, 18)); // NOI18N
        jLTitleTemp.setForeground(new java.awt.Color(255, 255, 255));
        jLTitleTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitleTemp.setText("Conversor de temperatura.");
        jPTemp.add(jLTitleTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 260, 30));

        jLIconTemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/therm.png"))); // NOI18N
        jLIconTemp.setText("jLabel3");
        jPTemp.add(jLIconTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 50, 50));

        jLTemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gradient2.png"))); // NOI18N
        jPTemp.add(jLTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        getContentPane().add(jPTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 600, 370));

        jPPresion.setBackground(new Color(10,10,35, 150));
        jPPresion.setForeground(new java.awt.Color(255, 255, 255));
        jPPresion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlGrados1.setBackground(new java.awt.Color(255, 255, 255));
        jlGrados1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jlGrados1.setForeground(new java.awt.Color(255, 255, 255));
        jlGrados1.setText("Unidades de presión");
        jPPresion.add(jlGrados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        spiPressure.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        jPPresion.add(spiPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 240, 40));
        txtAmount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000000000, 5));

        btnConvertPressure.setBackground(new java.awt.Color(10, 10, 35));
        btnConvertPressure.setFont(new java.awt.Font("Inconsolata Ultra Expanded SemiBold", 0, 14)); // NOI18N
        btnConvertPressure.setForeground(new java.awt.Color(255, 255, 255));
        btnConvertPressure.setText("Convertir");
        btnConvertPressure.setBorderPainted(false);
        btnConvertPressure.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConvertPressure.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConvertPressureMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvertPressureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvertPressureMouseExited(evt);
            }
        });
        btnConvertPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertPressureActionPerformed(evt);
            }
        });
        jPPresion.add(btnConvertPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 160, 40));

        ResultPressure.setEditable(false);
        ResultPressure.setBackground(new java.awt.Color(10, 10, 35));
        ResultPressure.setFont(new java.awt.Font("Orbitron", 0, 18)); // NOI18N
        ResultPressure.setForeground(new java.awt.Color(255, 255, 255));
        ResultPressure.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ResultPressure.setFocusable(false);
        jPPresion.add(ResultPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 240, 40));

        cbFromPressure.setBackground(new java.awt.Color(255, 255, 255));
        cbFromPressure.setFont(new java.awt.Font("Victor Mono Medium", 0, 14)); // NOI18N
        cbFromPressure.setForeground(new java.awt.Color(10, 10, 35));
        cbFromPressure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convierte de", "Atmósfera (Atm)", "Bar", "Kilopascal (Kpa)", "Libra por pulgada (Psi)", "Pascal (Pa)", "Torr" }));
        cbFromPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFromPressureActionPerformed(evt);
            }
        });
        jPPresion.add(cbFromPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 270, 40));

        cbToPressure.setBackground(new java.awt.Color(255, 255, 255));
        cbToPressure.setFont(new java.awt.Font("Victor Mono Medium", 0, 14)); // NOI18N
        cbToPressure.setForeground(new java.awt.Color(10, 10, 35));
        cbToPressure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hasta", "Atmósfera (Atm)", "Bar", "Kilopascal (Kpa)", "Libra por pulgada (Psi)", "Pascal (Pa)", "Torr" }));
        cbToPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToPressureActionPerformed(evt);
            }
        });
        jPPresion.add(cbToPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 270, 40));

        jLTitleTemp1.setBackground(new java.awt.Color(255, 255, 255));
        jLTitleTemp1.setFont(new java.awt.Font("Cormorant SC SemiBold", 1, 18)); // NOI18N
        jLTitleTemp1.setForeground(new java.awt.Color(255, 255, 255));
        jLTitleTemp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitleTemp1.setText("Conversor de unidades de presión.");
        jPPresion.add(jLTitleTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 310, 30));

        jLTemp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/www.png"))); // NOI18N
        jPPresion.add(jLTemp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 340));

        getContentPane().add(jPPresion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnConvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertMouseClicked
        
        
	Symbols symbolsArray = new Symbols();
        String[] symbols = symbolsArray.getSymbolsS();
        
        //Creando Map para obtener par k-v.
        Map<String, String> map = new HashMap<>();
         
        for( int i = 0; i < symbols.length; i += 2 ){
                map.put( symbols[i+1], symbols[i] );
                
        }
        String desde = map.get( this.cbFrom.getSelectedItem() );
        String hasta = map.get( this.cbTo.getSelectedItem() );//(String)
        
        int valor = (int) this.txtAmount.getValue();
        String monto = Integer.toString(valor);
        
        //System.out.println( monto );
        //System.out.println( valor );
        

        
        
        boolean conn = Light.isConnect();
        
        if ( !conn ){
            JOptionPane.showMessageDialog(null, "Revisa tu connección a internet por favor.", "Problema de red!", HEIGHT);
        }
        else if( cbFrom.getSelectedItem() == "Convierte de" ){
            JOptionPane.showMessageDialog(null, "Escoge una moneda para convertir.", "Campo faltante!", HEIGHT);

        }else if ( cbTo.getSelectedItem() == "Hasta" ){
            JOptionPane.showMessageDialog(null, "Escoge una opción de moneda destino.", "Campo faltante!", HEIGHT);
        }else if ( valor == 0){
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor a cero.", "Valor Invalido!", HEIGHT);
        }else{
            CurrencyConverter conversion = new CurrencyConverter( desde, hasta, monto, apiKey );
            Number[] response = conversion.convert();
            NumberFormat formatoNumero = NumberFormat.getNumberInstance();
            NumberFormat formatoNuevo = NumberFormat.getNumberInstance();
            formatoNuevo.setMaximumFractionDigits(5);
            formatoNumero.setMaximumFractionDigits(2);
            Result.setText( formatoNumero.format( response[0] ) );
            txtTasa.setText(  formatoNuevo.format( response[1] ) );
        }
        


    }//GEN-LAST:event_btnConvertMouseClicked

    private void cbFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFromActionPerformed

       
        
    }//GEN-LAST:event_cbFromActionPerformed

    private void LoadSymbols(){
        
        Symbols symbolsArray = new Symbols();

        String[] symbols = symbolsArray.getSymbolsS();
        
      
        ArrayList onlyNames = new ArrayList<>();
        
        for (int i = 1; i < symbols.length; i += 2 ) {
            onlyNames.add( symbols[i] );
        }
        //Ordeno arreglo retornado.
        Collections.sort( onlyNames );
        //System.out.println( onlyNames );
        
        for (int i = 0; i < onlyNames.size(); i += 2 ) {
//            String name = onlyNames.get(i);
            cbFrom.addItem( onlyNames.get(i).toString() );
            cbTo.addItem( onlyNames.get(i).toString() );
        }
        

 
}
    
    private void cbToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToActionPerformed
        // cbTo.setSelectedItem(evt);
    }//GEN-LAST:event_cbToActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        this.xMouse = evt.getX();
        this.yMouse = evt.getY(); 

    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation( x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinPMouseEntered
        btnMinP.setBackground(new Color(0, 102, 51));
    }//GEN-LAST:event_btnMinPMouseEntered

    private void btnMinPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinPMouseExited
        btnMinP.setBackground(new Color( 38,36,91 ));

    }//GEN-LAST:event_btnMinPMouseExited

    private void btnClosePMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClosePMouseExited
        btnCloseP.setBackground(new Color( 38,36,91 ));

    }//GEN-LAST:event_btnClosePMouseExited

    private void btnClosePMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClosePMouseEntered
        btnCloseP.setBackground(new Color(255, 40, 59));
    }//GEN-LAST:event_btnClosePMouseEntered

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnCloseP.setBackground(new Color(255, 40, 59));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnCloseP.setBackground(new Color( 38,36,91 ));
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnMinPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinPMouseClicked
        this.setExtendedState(ICONIFIED);//Para minimizar ventana.
    }//GEN-LAST:event_btnMinPMouseClicked

    private void jListConvertersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListConvertersMouseClicked
        String selection = this.jListConverters.getSelectedValue().toString();
        
        switch ( selection )
        {
            case "Monedas":
                this.jPTemp.setVisible( false );
                this.jPPresion.setVisible( false );
                this.jPbg.setVisible( true );
                break;
            case "Temperatura":
                this.jPTemp.setVisible( true );
                this.jPbg.setVisible( false );
                this.jPPresion.setVisible( false );
                break;
            case "Unidades de presión":
                this.jPPresion.setVisible( true );
                this.jPTemp.setVisible( false );
                this.jPbg.setVisible( false );
                break;
            default:
                throw new AssertionError();
        }

    }//GEN-LAST:event_jListConvertersMouseClicked

    private void btnConvert1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvert1MouseClicked
        String from = cbFromTemp.getSelectedItem().toString();
        String to = cbToTemp.getSelectedItem().toString();
        int grados = Integer.parseInt( txtGrados.getValue().toString() );
        
        
        
        if( from == "Convierte de" ){
            JOptionPane.showMessageDialog(null, "Escoge la temperatura para convertir.", "Campo faltante!", HEIGHT);

        }else if ( to == "Hasta" ){
            JOptionPane.showMessageDialog(null, "Escoge la temperatura de destino.", "Campo faltante!", HEIGHT);
        }else if ( to == from ){
            JOptionPane.showMessageDialog(null, "La temperatura de origen y de destino son la misma.", "Valores Repetidos!", HEIGHT);
        }else{
            TemperatureConverter tp = new TemperatureConverter( from, to, grados );
            Number result =  tp.convert();
            NumberFormat formatoNumero = NumberFormat.getNumberInstance();
            formatoNumero.setMaximumFractionDigits(4);

            ResulTemp.setText( formatoNumero.format( result ).toString() );
        }
        
    }//GEN-LAST:event_btnConvert1MouseClicked

    private void btnConvert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvert1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConvert1ActionPerformed

    private void cbFromTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFromTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFromTempActionPerformed

    private void cbToTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbToTempActionPerformed

    private void btnConvert1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvert1MouseEntered
        btnConvert1.setBackground( new Color(51, 255, 51) );
        btnConvert1.setForeground( Color.black );
    }//GEN-LAST:event_btnConvert1MouseEntered

    private void btnConvert1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvert1MouseExited
        btnConvert1.setBackground( new Color(10,10,85  ) );
        btnConvert1.setForeground( Color.white );
    }//GEN-LAST:event_btnConvert1MouseExited

    private void btnConvertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertMouseEntered
        btnConvert.setBackground( new Color(51, 255, 51) );
        btnConvert.setForeground( Color.black );
    }//GEN-LAST:event_btnConvertMouseEntered

    private void btnConvertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertMouseExited
        btnConvert.setBackground( new Color(10,10,85  ) );
        btnConvert.setForeground( Color.white );
    }//GEN-LAST:event_btnConvertMouseExited

    private void btnConvertPressureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertPressureMouseClicked
        String from = cbFromPressure.getSelectedItem().toString();
        String to = cbToPressure.getSelectedItem().toString();
        int value = Integer.parseInt( spiPressure.getValue().toString() );
        
        
        
        if( from == "Convierte de" ){
            JOptionPane.showMessageDialog(null, "Escoge las unidades para convertir.", "Campo faltante!", HEIGHT);

        }else if ( to == "Hasta" ){
            JOptionPane.showMessageDialog(null, "Escoge la presión de destino.", "Campo faltante!", HEIGHT);
        }else if ( to == from ){
            JOptionPane.showMessageDialog(null, "La unidades de origen y de destino son la misma.", "Valores Repetidos!", HEIGHT);
        }else{
            PressureConverter pc = new PressureConverter( from, to, value );
            Number result =  pc.convert();
            NumberFormat formatoNumero = NumberFormat.getNumberInstance();
            formatoNumero.setMaximumFractionDigits(4);

            ResultPressure.setText( formatoNumero.format( result ).toString() );
        }
    }//GEN-LAST:event_btnConvertPressureMouseClicked

    private void btnConvertPressureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertPressureMouseEntered
        btnConvertPressure.setBackground( new Color(51, 255, 51) );
        btnConvertPressure.setForeground( Color.black );
    }//GEN-LAST:event_btnConvertPressureMouseEntered

    private void btnConvertPressureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertPressureMouseExited
        btnConvertPressure.setBackground( new Color(10,10,85  ) );
        btnConvertPressure.setForeground( Color.white );
    }//GEN-LAST:event_btnConvertPressureMouseExited

    private void btnConvertPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConvertPressureActionPerformed

    private void cbFromPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFromPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbFromPressureActionPerformed

    private void cbToPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbToPressureActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
                
        
        
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(CurrencyConverterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(CurrencyConverterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(CurrencyConverterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(CurrencyConverterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverterGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private Gui.RoundJLabel Light;
    private javax.swing.JTextField ResulTemp;
    private javax.swing.JTextField Result;
    private javax.swing.JTextField ResultPressure;
    private javax.swing.JLabel btnClose;
    private javax.swing.JPanel btnCloseP;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnConvert1;
    private javax.swing.JButton btnConvertPressure;
    private javax.swing.JLabel btnMin;
    private javax.swing.JPanel btnMinP;
    private javax.swing.JComboBox<String> cbFrom;
    private javax.swing.JComboBox<String> cbFromPressure;
    private javax.swing.JComboBox<String> cbFromTemp;
    private javax.swing.JComboBox<String> cbTo;
    private javax.swing.JComboBox<String> cbToPressure;
    private javax.swing.JComboBox<String> cbToTemp;
    private javax.swing.JLabel jLIconTemp;
    private javax.swing.JLabel jLTemp;
    private javax.swing.JLabel jLTemp1;
    private javax.swing.JLabel jLTitleCurrency;
    private javax.swing.JLabel jLTitleTemp;
    private javax.swing.JLabel jLTitleTemp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbg;
    private javax.swing.JList<String> jListConverters;
    private javax.swing.JLabel jLive;
    private javax.swing.JPanel jPPresion;
    private javax.swing.JPanel jPTemp;
    private javax.swing.JPanel jPbg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlGrados;
    private javax.swing.JLabel jlGrados1;
    private javax.swing.JLabel jlMonto;
    private javax.swing.JPanel jpLateralR;
    private javax.swing.JSpinner spiPressure;
    private javax.swing.JSpinner txtAmount;
    private javax.swing.JSpinner txtGrados;
    private javax.swing.JTextField txtTasa;
    private javax.swing.JTextField txtTasaName;
    // End of variables declaration//GEN-END:variables
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
            
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        
        

        
    }
    
    
}
