package Main;

import QuanLyDiem.DAO.MyConnect;
import QuanLyDiem.GUI.LoadingDialog;
import QuanLyDiem.GUI.LoginFrame;

public class Main {

    public static void main(String[] args) {
        LoadingDialog loadingDialog = new LoadingDialog();
        loadingDialog.setVisible(true);

        changLNF("Nimbus");

        new MyConnect(loadingDialog);

        if (!loadingDialog.hasError()) {
            loadingDialog.setVisible(false);
            LoginFrame login = new LoginFrame();
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
