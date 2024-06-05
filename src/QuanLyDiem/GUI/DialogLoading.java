package QuanLyDiem.GUI;

import java.awt.Font;
import java.awt.event.*;

public class DialogLoading extends javax.swing.JFrame {

    private boolean error = false;
    private int mouseX, mouseY;
    
    public DialogLoading() {
        initComponents();
        initDrag();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new javax.swing.JPanel();
        lbl_close = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_appname = new javax.swing.JLabel();
        lbl_makeby = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        lbl_loading = new javax.swing.JLabel();
        lbl_percent = new javax.swing.JLabel();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BackGroundPanel.setBackground(new java.awt.Color(255, 204, 153));

        lbl_close.setIcon(new javax.swing.ImageIcon("C:\\Users\\guenb\\Documents\\NetBeansProjects\\PhanMem_QuanLyDiem\\img\\LoginUI\\btn-close.png")); // NOI18N
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_closeMouseExited(evt);
            }
        });

        lbl_appname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_appname.setForeground(new java.awt.Color(255, 153, 102));
        lbl_appname.setText("PHẦN MỀM QUẢN LÝ ĐIỂM");

        lbl_makeby.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_makeby.setText("Make by");

        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name.setText("GUENBANKHAI");

        ProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        ProgressBar.setForeground(new java.awt.Color(255, 153, 102));

        lbl_loading.setText("Loading...");

        lbl_percent.setText("100%");

        lbl_error.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_error.setText("UTT");
        lbl_error.setPreferredSize(new java.awt.Dimension(0, 12));

        javax.swing.GroupLayout BackGroundPanelLayout = new javax.swing.GroupLayout(BackGroundPanel);
        BackGroundPanel.setLayout(BackGroundPanelLayout);
        BackGroundPanelLayout.setHorizontalGroup(
            BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackGroundPanelLayout.createSequentialGroup()
                .addGroup(BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbl_logo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BackGroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_loading)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_percent)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_close, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackGroundPanelLayout.createSequentialGroup()
                        .addGroup(BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackGroundPanelLayout.createSequentialGroup()
                                .addComponent(lbl_appname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_makeby)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_name)))
                        .addGap(19, 19, 19))))
        );
        BackGroundPanelLayout.setVerticalGroup(
            BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackGroundPanelLayout.createSequentialGroup()
                .addGroup(BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackGroundPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lbl_logo))
                    .addComponent(lbl_close))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_appname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_makeby, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_error, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BackGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_loading)
                    .addComponent(lbl_percent))
                .addGap(3, 3, 3)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbl_closeMouseClicked

    private void lbl_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseEntered
        lbl_close.setIcon(new javax.swing.ImageIcon("C:\\Users\\guenb\\Documents\\NetBeansProjects\\PhanMem_QuanLyDiem\\img\\LoginUI\\btn-close-hover.png"));
    }//GEN-LAST:event_lbl_closeMouseEntered

    private void lbl_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMouseExited
        lbl_close.setIcon(new javax.swing.ImageIcon("C:\\Users\\guenb\\Documents\\NetBeansProjects\\PhanMem_QuanLyDiem\\img\\LoginUI\\btn-close.png"));
    }//GEN-LAST:event_lbl_closeMouseExited

    private void initDrag() {
        BackGroundPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mouseX = evt.getX();
                mouseY = evt.getY();
            }
        });

        BackGroundPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                setLocation(x - mouseX, y - mouseY);
            }
        });
    }
    
    public void updateProgress(String message, int percent) {
        lbl_loading.setText(message);
        lbl_percent.setText(percent + "%");
        ProgressBar.setValue(percent);
    }

    public void updateError(String errorMessage) {
        error = true;
        lbl_error.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 12));
        lbl_error.setText("<html>" + errorMessage + "</html>");
    }

    public boolean hasError() {
        return error;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel lbl_appname;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_loading;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_makeby;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_percent;
    // End of variables declaration//GEN-END:variables
}
