package QuanLyDiem.DAO;

import QuanLyDiem.DTO.ToChuyenMonDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToChuyenMonDAO {
    private Connection connection;

    public ToChuyenMonDAO() {
        connection = MyConnect.conn;
    }

    public List<ToChuyenMonDTO> getAllToChuyenMon() {
        List<ToChuyenMonDTO> toChuyenMonList = new ArrayList<>();
        String query = "SELECT * FROM ToChuyenMon";

        try (PreparedStatement ps = connection.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                ToChuyenMonDTO toChuyenMon = new ToChuyenMonDTO(
                    rs.getString("maTCM"),
                    rs.getString("tenTo"),
                    rs.getString("maMH1"),
                    rs.getString("maMH2"),
                    rs.getString("maMH3")
                );
                toChuyenMonList.add(toChuyenMon);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return toChuyenMonList;
    }
}