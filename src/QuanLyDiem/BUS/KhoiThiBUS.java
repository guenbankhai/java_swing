package QuanLyDiem.BUS;

import QuanLyDiem.DAO.KhoiThiDAO;
import QuanLyDiem.DTO.KhoiThiDTO;
import java.util.List;

public class KhoiThiBUS {
    private KhoiThiDAO khoiThiDAO;

    public KhoiThiBUS() {
        khoiThiDAO = new KhoiThiDAO();
    }

    public List<KhoiThiDTO> getAllKhoiThi() {
        return khoiThiDAO.getAllKhoiThi();
    }
}
