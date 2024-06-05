package QuanLyDiem.DAO;

import QuanLyDiem.DTO.LopDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LopDAO {
    private Connection connection;

    public LopDAO() {
        connection = MyConnect.conn;
    }

    public List<LopDTO> getAllLop() {
        List<LopDTO> lopList = new ArrayList<>();
        String query = "SELECT * FROM Lop";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                LopDTO lop = new LopDTO(
                    rs.getString("maLop"),
                    rs.getString("maKT"),
                    rs.getInt("namMoLop")
                );
                lopList.add(lop);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lopList;
    }
}