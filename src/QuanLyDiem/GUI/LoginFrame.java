package QuanLyDiem.GUI;

public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
        txt_username.setBackground(new java.awt.Color(0,0,0,1));
        txt_password.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RightPanel = new javax.swing.JPanel();
        RightFormPanel = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        lbl_type = new javax.swing.JLabel();
        lbl_level = new javax.swing.JLabel();
        lbl_coryright = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        LeftFormPanel = new javax.swing.JPanel();
        lbl_username = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        lbl_logouser = new javax.swing.JLabel();
        lbl_userline = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        lbl_logohide = new javax.swing.JLabel();
        lbl_logoeye = new javax.swing.JLabel();
        lbl_passline = new javax.swing.JLabel();
        cbx_remember = new javax.swing.JCheckBox();
        btn_confirm = new javax.swing.JButton();
        TitlePannel = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý điểm");
        setName("LoginFrame"); // NOI18N

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setPreferredSize(new java.awt.Dimension(300, 500));

        RightFormPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightFormPanel.setPreferredSize(new java.awt.Dimension(250, 200));

        lbl_logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\guenb\\Documents\\NetBeansProjects\\PhanMem_QuanLyDiem\\img\\LoginUI\\logo.png")); // NOI18N

        lbl_type.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_type.setText("QUẢN LÝ ĐIỂM");

        lbl_level.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_level.setText("TRUNG HỌC PHỔ THÔNG");

        javax.swing.GroupLayout RightFormPanelLayout = new javax.swing.GroupLayout(RightFormPanel);
        RightFormPanel.setLayout(RightFormPanelLayout);
        RightFormPanelLayout.setHorizontalGroup(
            RightFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightFormPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_type)
                .addGap(37, 37, 37))
            .addGroup(RightFormPanelLayout.createSequentialGroup()
                .addGroup(RightFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightFormPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbl_logo))
                    .addGroup(RightFormPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbl_level)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RightFormPanelLayout.setVerticalGroup(
            RightFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightFormPanelLayout.createSequentialGroup()
                .addComponent(lbl_logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_type)
                .addGap(0, 0, 0)
                .addComponent(lbl_level))
        );

        lbl_coryright.setForeground(new java.awt.Color(204, 204, 204));
        lbl_coryright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_coryright.setText("© Copyright 2024 - Made by GuenBanKhai");
        lbl_coryright.setPreferredSize(new java.awt.Dimension(250, 16));

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RightFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_coryright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RightFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_coryright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LeftPanel.setBackground(new java.awt.Color(255, 153, 102));
        LeftPanel.setPreferredSize(new java.awt.Dimension(400, 500));

        LeftFormPanel.setBackground(new java.awt.Color(255, 153, 102));
        LeftFormPanel.setPreferredSize(new java.awt.Dimension(300, 200));
        LeftFormPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("Tên đăng nhập:");
        LeftFormPanel.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setBorder(null);
        txt_username.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_username.setPreferredSize(new java.awt.Dimension(270, 26));
        LeftFormPanel.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 23, -1, -1));

        lbl_logouser.setIcon(new javax.swing.ImageIcon("C:\\Users\\guenb\\Documents\\NetBeansProjects\\PhanMem_QuanLyDiem\\img\\LoginUI\\user.png")); // NOI18N
        LeftFormPanel.add(lbl_logouser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        lbl_userline.setForeground(new java.awt.Color(255, 255, 255));
        lbl_userline.setText("______________________________________________________________");
        lbl_userline.setPreferredSize(new java.awt.Dimension(300, 16));
        LeftFormPanel.add(lbl_userline, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 30));

        lbl_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_password.setText("Mật khẩu:");
        LeftFormPanel.add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(null);
        txt_password.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_password.setPreferredSize(new java.awt.Dimension(270, 26));
        LeftFormPanel.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 83, -1, -1));

        lbl_logohide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logohide.setIcon(new javax.swing.ImageIcon("C:\\Users\\guenb\\Documents\\NetBeansProjects\\PhanMem_QuanLyDiem\\img\\LoginUI\\hide.png")); // NOI18N
        lbl_logohide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_logohide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logohideMouseClicked(evt);
            }
        });
        LeftFormPanel.add(lbl_logohide, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        lbl_logoeye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logoeye.setIcon(new javax.swing.ImageIcon("C:\\Users\\guenb\\Documents\\NetBeansProjects\\PhanMem_QuanLyDiem\\img\\LoginUI\\eye.png")); // NOI18N
        lbl_logoeye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_logoeye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_logoeyeMouseClicked(evt);
            }
        });
        LeftFormPanel.add(lbl_logoeye, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        lbl_passline.setForeground(new java.awt.Color(255, 255, 255));
        lbl_passline.setText("______________________________________________________________");
        lbl_passline.setPreferredSize(new java.awt.Dimension(300, 16));
        LeftFormPanel.add(lbl_passline, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, -1, -1));

        cbx_remember.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbx_remember.setForeground(new java.awt.Color(255, 255, 255));
        cbx_remember.setText("Ghi nhớ mật khẩu");
        cbx_remember.setBorder(null);
        cbx_remember.setFocusPainted(false);
        cbx_remember.setFocusable(false);
        LeftFormPanel.add(cbx_remember, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        btn_confirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_confirm.setForeground(new java.awt.Color(255, 153, 102));
        btn_confirm.setText("Xác nhận");
        btn_confirm.setBorderPainted(false);
        btn_confirm.setFocusable(false);
        btn_confirm.setPreferredSize(new java.awt.Dimension(150, 40));
        LeftFormPanel.add(btn_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 150, -1, -1));

        TitlePannel.setBackground(new java.awt.Color(255, 153, 102));
        TitlePannel.setPreferredSize(new java.awt.Dimension(300, 70));

        lbl_title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("ĐĂNG NHẬP");

        javax.swing.GroupLayout TitlePannelLayout = new javax.swing.GroupLayout(TitlePannel);
        TitlePannel.setLayout(TitlePannelLayout);
        TitlePannelLayout.setHorizontalGroup(
            TitlePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePannelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbl_title)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        TitlePannelLayout.setVerticalGroup(
            TitlePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePannelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lbl_title)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LeftFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(TitlePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LeftFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_logoeyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logoeyeMouseClicked
        txt_password.setEchoChar((char)8226);
        lbl_logohide.setVisible(true);
        lbl_logohide.setEnabled(true);
        lbl_logoeye.setEnabled(false);
        lbl_logoeye.setEnabled(false);
    }//GEN-LAST:event_lbl_logoeyeMouseClicked

    private void lbl_logohideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_logohideMouseClicked
        txt_password.setEchoChar((char)0);
        lbl_logohide.setVisible(false);
        lbl_logohide.setEnabled(false);
        lbl_logoeye.setEnabled(true);
        lbl_logoeye.setEnabled(true);
    }//GEN-LAST:event_lbl_logohideMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftFormPanel;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel RightFormPanel;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JPanel TitlePannel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JCheckBox cbx_remember;
    private javax.swing.JLabel lbl_coryright;
    private javax.swing.JLabel lbl_level;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_logoeye;
    private javax.swing.JLabel lbl_logohide;
    private javax.swing.JLabel lbl_logouser;
    private javax.swing.JLabel lbl_passline;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_type;
    private javax.swing.JLabel lbl_userline;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    public void showWindow() {
        this.setVisible(true);
    }
}
