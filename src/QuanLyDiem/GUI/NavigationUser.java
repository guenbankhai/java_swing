package QuanLyDiem.GUI;

public class NavigationUser extends javax.swing.JPanel {

    public NavigationUser() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_copyright = new javax.swing.JLabel();
        lbl_qldiem = new javax.swing.JLabel();
        lbl_qlthongtin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 102));

        lbl_copyright.setForeground(new java.awt.Color(204, 204, 204));
        lbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_copyright.setText("© Copyright 2024 - Made by GuenBanKhai");

        lbl_qldiem.setBackground(new java.awt.Color(255, 153, 102));
        lbl_qldiem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_qldiem.setForeground(new java.awt.Color(255, 255, 255));
        lbl_qldiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_qldiem.setText("Quản lý điểm");
        lbl_qldiem.setOpaque(true);
        lbl_qldiem.setPreferredSize(new java.awt.Dimension(250, 40));

        lbl_qlthongtin.setBackground(new java.awt.Color(255, 153, 102));
        lbl_qlthongtin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_qlthongtin.setForeground(new java.awt.Color(255, 255, 255));
        lbl_qlthongtin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_qlthongtin.setText("Quản lý thông tin cá nhân");
        lbl_qlthongtin.setOpaque(true);
        lbl_qlthongtin.setPreferredSize(new java.awt.Dimension(250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_copyright, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_qldiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_qlthongtin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbl_qldiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl_qlthongtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(lbl_copyright)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_copyright;
    private javax.swing.JLabel lbl_qldiem;
    private javax.swing.JLabel lbl_qlthongtin;
    // End of variables declaration//GEN-END:variables
}
