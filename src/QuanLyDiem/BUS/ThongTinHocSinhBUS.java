package QuanLyDiem.BUS;

import QuanLyDiem.DAO.ThongTinHocSinhDAO;
import QuanLyDiem.DTO.ThongTinHocSinhDTO;
import java.util.List;

public class ThongTinHocSinhBUS {
    private ThongTinHocSinhDAO thongTinHocSinhDAO;

    public ThongTinHocSinhBUS() {
        thongTinHocSinhDAO = new ThongTinHocSinhDAO();
    }

    public List<ThongTinHocSinhDTO> getAllHocSinh() {
        return thongTinHocSinhDAO.getAllHocSinh();
    }
}