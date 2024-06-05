package QuanLyDiem.DAO;

import QuanLyDiem.DTO.DiemMonHocDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiemMonHocDAO {
    private Connection connection;

    public DiemMonHocDAO() {
        connection = MyConnect.conn;
    }

    public List<DiemMonHocDTO> getAllDiemMonHoc() {
        List<DiemMonHocDTO> diemMonHocList = new ArrayList<>();
        String query = "SELECT * FROM DiemMonHoc";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                DiemMonHocDTO diemMonHoc = new DiemMonHocDTO(
                    rs.getString("maHS"),
                    rs.getString("maMH"),
                    rs.getString("namHoc"),
                    rs.getString("hocKy"),
                    rs.getFloat("diemHS1"),
                    rs.getFloat("diemHS2"),
                    rs.getFloat("diemHS3"),
                    rs.getFloat("diemTB")
                );
                diemMonHocList.add(diemMonHoc);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return diemMonHocList;
    }
}