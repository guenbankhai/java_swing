package QuanLyDiem.DAO;

import QuanLyDiem.DTO.ThongTinGiaoVienDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongTinGiaoVienDAO {
    private Connection connection = MyConnect.conn;

    public List<ThongTinGiaoVienDTO> getAllGiaoVien() {
        List<ThongTinGiaoVienDTO> teachers = new ArrayList<>();

        try {
            String query = "SELECT * FROM ThongTinGiaoVien";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongTinGiaoVienDTO teacher = new ThongTinGiaoVienDTO(
                    rs.getString("maGV"),
                    rs.getString("hoTen"),
                    rs.getString("gioiTinh"),
                    rs.getDate("ngaySinh"),
                    rs.getString("noiSinh"),
                    rs.getString("soDienThoai"),
                    rs.getString("maTCM")
                );
                teachers.add(teacher);
                }
        } catch (SQLException ex) {
            return null;
        }
        return teachers;
    }
    
    public boolean deleteGiaoVien(String maGV) {
        boolean result = false;
        try {
            String query = "DELETE FROM ThongTinGiaoVien WHERE maGV = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, maGV);
            result = ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            return false;
        }
        return result;
    }
}