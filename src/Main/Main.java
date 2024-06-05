package Main;

import QuanLyDiem.DAO.MyConnect;
import QuanLyDiem.GUI.DialogLoading;
import QuanLyDiem.GUI.FrameLogin;

public class Main {

    public static void main(String[] args) {
        DialogLoading loadingDialog = new DialogLoading();
        loadingDialog.setVisible(true);

        changLNF("Nimbus");

        new MyConnect(loadingDialog);

        if (!loadingDialog.hasError()) {
            loadingDialog.setVisible(false);
            FrameLogin login = new FrameLogin();
            login.showWindow();
        } else {
            loadingDialog.setVisible(true);
        }
    }

    public static void changLNF(String nameLNF) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (nameLNF.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            // Handle exception if needed
        }
    }
}
