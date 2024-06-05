package QuanLyDiem.DAO;

import QuanLyDiem.DTO.ThongTinHocSinhDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongTinHocSinhDAO {
    private Connection connection;

    public ThongTinHocSinhDAO() {
        connection = MyConnect.conn;
    }

    public List<ThongTinHocSinhDTO> getAllHocSinh() {
        List<ThongTinHocSinhDTO> students = new ArrayList<>();
        String query = "SELECT * FROM ThongTinHocSinh";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                ThongTinHocSinhDTO student = new ThongTinHocSinhDTO(
                    rs.getString("maHS"),
                    rs.getString("hoTen"),
                    rs.getDate("ngaySinh"),
                    rs.getString("noiSinh"),
                    rs.getString("soDienThoai"),
                    rs.getInt("namNhapHoc"),
                    rs.getString("maLop")
                );
                students.add(student);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return students;
    }
}