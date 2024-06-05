package QuanLyDiem.DAO;

import QuanLyDiem.DTO.NamHocDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NamHocDAO {
    private Connection connection;

    public NamHocDAO() {
        connection = MyConnect.conn;
    }

    public List<NamHocDTO> getAllNamHoc() {
        List<NamHocDTO> namHocList = new ArrayList<>();
        String query = "SELECT * FROM NamHoc";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                NamHocDTO namHoc = new NamHocDTO(
                    rs.getInt("namBatDau"),
                    rs.getInt("namKetThuc"),
                    rs.getString("namHoc")
                );
                namHocList.add(namHoc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return namHocList;
    }
}