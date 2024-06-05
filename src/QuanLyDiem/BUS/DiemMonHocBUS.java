package QuanLyDiem.BUS;

import QuanLyDiem.DAO.DiemMonHocDAO;
import QuanLyDiem.DTO.DiemMonHocDTO;
import java.util.List;

public class DiemMonHocBUS {
    private DiemMonHocDAO diemMonHocDAO = new DiemMonHocDAO();;

    public List<DiemMonHocDTO> getAllDiemMonHoc() {
        return diemMonHocDAO.getAllDiemMonHoc();
    }
}
