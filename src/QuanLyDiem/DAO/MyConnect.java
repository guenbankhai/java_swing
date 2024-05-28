package QuanLyDiem.DAO;

import javax.swing.JOptionPane;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import QuanLyDiem.GUI.LoadingDialog;

public class MyConnect {

    public static Connection conn = null;
    private String severName = "GUENBANKHAI";
    private String dbName = "quanly_diem";
    private String userName = "sa";
    private String password = "123123";

    public MyConnect(LoadingDialog loadingDialog) {
        String strConnect = "jdbc:sqlserver://" + severName + ";databaseName=" + dbName + ";useUnicode=true;characterEncoding=utf-8;trustServerCertificate=true";
        Properties pro = new Properties();
        pro.put("user", userName);
        pro.put("password", password);
        try {
            loadingDialog.updateProgress("Loading Modules...", 20);
            Thread.sleep(500); // Giả lập thời gian chờ
            loadingDialog.updateProgress("Connecting Database...", 50);
            SQLServerDriver driver = new SQLServerDriver();
            conn = driver.connect(strConnect, pro);
            loadingDialog.updateProgress("Connection Successful!", 80);
            Thread.sleep(500); // Giả lập thời gian chờ
            loadingDialog.updateProgress("Launching Application...", 90);
        } catch (SQLException | InterruptedException ex) {
            loadingDialog.updateError("Error" + ex.getMessage());
            ex.printStackTrace();
        }
    }
}