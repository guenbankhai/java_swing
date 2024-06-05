package QuanLyDiem.BUS;

import QuanLyDiem.DAO.MonHocDAO;
import QuanLyDiem.DTO.MonHocDTO;
import java.util.List;

public class MonHocBUS {
    private MonHocDAO monHocDAO;

    public MonHocBUS() {
        monHocDAO = new MonHocDAO();
    }

    public List<MonHocDTO> getAllMonHoc() {
        return monHocDAO.getAllMonHoc();
    }
}