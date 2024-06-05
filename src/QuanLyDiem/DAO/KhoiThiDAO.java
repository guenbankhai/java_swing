package QuanLyDiem.DAO;

import QuanLyDiem.DTO.KhoiThiDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class KhoiThiDAO {
    private Connection connection;

    public KhoiThiDAO() {
        connection = MyConnect.conn;
    }

    public List<KhoiThiDTO> getAllKhoiThi() {
        List<KhoiThiDTO> khoiThiList = new ArrayList<>();
        String query = "SELECT * FROM KhoiThi";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                KhoiThiDTO khoiThi = new KhoiThiDTO(
                    rs.getString("maKT"),
                    rs.getString("maMH1"),
                    rs.getString("maMH2"),
                    rs.getString("maMH3")
                );
                khoiThiList.add(khoiThi);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return khoiThiList;
    }
}