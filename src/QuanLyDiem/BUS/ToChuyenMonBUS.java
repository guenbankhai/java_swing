package QuanLyDiem.BUS;

import QuanLyDiem.DAO.ToChuyenMonDAO;
import QuanLyDiem.DTO.ToChuyenMonDTO;
import java.util.List;

public class ToChuyenMonBUS {
    private ToChuyenMonDAO toChuyenMonDAO;

    public ToChuyenMonBUS() {
        toChuyenMonDAO = new ToChuyenMonDAO();
    }

    public List<ToChuyenMonDTO> getAllToChuyenMon() {
        return toChuyenMonDAO.getAllToChuyenMon();
    }
}