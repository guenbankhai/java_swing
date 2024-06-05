package QuanLyDiem.BUS;

import QuanLyDiem.DAO.ThongTinGiaoVienDAO;
import QuanLyDiem.DTO.ThongTinGiaoVienDTO;
import QuanLyDiem.GUI.MyDialog;
import java.util.List;

public class ThongTinGiaoVienBUS {  
    private ThongTinGiaoVienDAO thongTinGiaoVienDAO = new ThongTinGiaoVienDAO();

    public List<ThongTinGiaoVienDTO> getAllGiaoVien() {
        return thongTinGiaoVienDAO.getAllGiaoVien();
    }
    
    public void deleteGiaoVien(String[] listmaGV) {
        int count = 0;
        boolean result;
        MyDialog dlg = new MyDialog("Bạn có chắc chắn muốn xoá " + listmaGV.length + " giáo viên?", MyDialog.WARNING_DIALOG);
        if(dlg.getAction() == MyDialog.OK_OPTION) {
            for(String maGV : listmaGV) {
                result = thongTinGiaoVienDAO.deleteGiaoVien(maGV);
                if(result){count++;}
            }
                
            if (count == listmaGV.length) {
                new MyDialog("Xoá thành công " + listmaGV.length + " giáo viên!", MyDialog.SUCCESS_DIALOG);
            } else {
                new MyDialog("Xoá thành công " + count + " giáo viên, còn " + (listmaGV.length - count) + " giáo viên chưa xoá!", MyDialog.ERROR_DIALOG);
            }
        }
    }
}