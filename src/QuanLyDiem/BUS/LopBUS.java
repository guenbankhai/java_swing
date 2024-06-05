package QuanLyDiem.BUS;

import QuanLyDiem.DAO.LopDAO;
import QuanLyDiem.DTO.LopDTO;
import java.util.List;

public class LopBUS {
    private LopDAO lopDAO;

    public LopBUS() {
        lopDAO = new LopDAO();
    }

    public List<LopDTO> getAllLop() {
        return lopDAO.getAllLop();
    }
}