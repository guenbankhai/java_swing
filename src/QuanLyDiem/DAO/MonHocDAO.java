package QuanLyDiem.DAO;

import QuanLyDiem.DTO.MonHocDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MonHocDAO {
    private Connection connection;

    public MonHocDAO() {
        connection = MyConnect.conn;
    }

    public List<MonHocDTO> getAllMonHoc() {
        List<MonHocDTO> monHocList = new ArrayList<>();
        String query = "SELECT * FROM MonHoc";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                MonHocDTO monHoc = new MonHocDTO(
                    rs.getString("maMH"),
                    rs.getString("tenMH")
                );
                monHocList.add(monHoc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return monHocList;
    }
}