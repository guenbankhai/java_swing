package QuanLyDiem.DAO;

import QuanLyDiem.DTO.PhanCongGiangDayDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhanCongGiangDayDAO {
    private Connection connection;

    public PhanCongGiangDayDAO() {
        connection = MyConnect.conn;
    }

    public List<PhanCongGiangDayDTO> getAllPhanCong() {
        List<PhanCongGiangDayDTO> phanCongList = new ArrayList<>();
        String query = "SELECT * FROM PhanCongGiangDay";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                PhanCongGiangDayDTO phanCong = new PhanCongGiangDayDTO(
                    rs.getString("maLop"),
                    rs.getString("maMH"),
                    rs.getString("namHoc"),
                    rs.getString("maGV")
                );
                phanCongList.add(phanCong);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return phanCongList;
    }
}