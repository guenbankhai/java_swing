package QuanLyDiem.BUS;

import QuanLyDiem.DAO.PhanCongGiangDayDAO;
import QuanLyDiem.DTO.PhanCongGiangDayDTO;
import java.util.List;

public class PhanCongGiangDayBUS {
    private PhanCongGiangDayDAO phanCongGiangDayDAO;

    public PhanCongGiangDayBUS() {
        phanCongGiangDayDAO = new PhanCongGiangDayDAO();
    }

    public List<PhanCongGiangDayDTO> getAllPhanCong() {
        return phanCongGiangDayDAO.getAllPhanCong();
    }
}