package QuanLyDiem.BUS;

import QuanLyDiem.DAO.NamHocDAO;
import QuanLyDiem.DTO.NamHocDTO;
import java.util.List;

public class NamHocBUS {
    private NamHocDAO namHocDAO;

    public NamHocBUS() {
        namHocDAO = new NamHocDAO();
    }

    public List<NamHocDTO> getAllNamHoc() {
        return namHocDAO.getAllNamHoc();
    }
}