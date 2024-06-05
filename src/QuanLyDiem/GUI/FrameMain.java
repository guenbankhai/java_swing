package QuanLyDiem.GUI;

import QuanLyDiem.BUS.*;
import QuanLyDiem.DAO.*;
import QuanLyDiem.DTO.*;
import java.awt.event.*;
import java.util.List;

public class FrameMain extends javax.swing.JFrame {

    private NavigationAdmin navigationAdmin;
    private NavigationUser navigationUser;
    private String role;
    
    private FormTable  formTable;
    private DiemMonHocBUS diemMonHocBUS;
    private KhoiThiBUS khoiThiBUS;
    private LopBUS lopBUS;
    private MonHocBUS monHocBUS;
    private NamHocBUS namHocBUS;
    private PhanCongGiangDayBUS phanCongGiangDayBUS;
    private ThongTinGiaoVienBUS thongTinGiaoVienBUS;
    private ThongTinHocSinhBUS thongTinHocSinhBUS;
    private ToChuyenMonBUS toChuyenMonBUS;
    
    
    public FrameMain() {
        initComponents();
        
        role = "Admin";
        
        ShowPanelNavigation();
        ShowPanelForm();
        
        diemMonHocBUS = new DiemMonHocBUS();
        khoiThiBUS = new KhoiThiBUS();
        lopBUS = new LopBUS();
        monHocBUS = new MonHocBUS();
        namHocBUS = new NamHocBUS();
        phanCongGiangDayBUS = new PhanCongGiangDayBUS();
        thongTinGiaoVienBUS = new ThongTinGiaoVienBUS();
        thongTinHocSinhBUS = new ThongTinHocSinhBUS();
        toChuyenMonBUS = new ToChuyenMonBUS();

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                FrameMainComponentResized(e);
            }
        });
        
    }

    private void FrameMainComponentResized(ComponentEvent e) {
        if (navigationAdmin != null) {
            navigationAdmin.setBounds(0, 0, PanelNavigation.getWidth(), PanelNavigation.getHeight());
        }
        if (navigationUser != null) {
            navigationUser.setBounds(0, 0, PanelNavigation.getWidth(), PanelNavigation.getHeight());
        }
        formTable.setBounds(0, 0, PanelForm.getWidth(), PanelForm.getHeight());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelForm = new javax.swing.JPanel();
        PanelNavigation = new javax.swing.JPanel();
        PanelLogo = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(1050, 650));

        PanelForm.setPreferredSize(new java.awt.Dimension(800, 650));
        PanelForm.setLayout(new java.awt.GridLayout());

        PanelNavigation.setBackground(new java.awt.Color(0, 0, 0));
        PanelNavigation.setMaximumSize(new java.awt.Dimension(300, 250));
        PanelNavigation.setPreferredSize(new java.awt.Dimension(250, 400));
        PanelNavigation.setLayout(new java.awt.GridLayout(1, 0));

        PanelLogo.setBackground(new java.awt.Color(255, 255, 255));
        PanelLogo.setMaximumSize(new java.awt.Dimension(300, 250));
        PanelLogo.setPreferredSize(new java.awt.Dimension(250, 250));

        lbl_logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\guenb\\Documents\\NetBeansProjects\\PhanMem_QuanLyDiem\\img\\LoginUI\\logo.png")); // NOI18N

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(lbl_logo)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(lbl_logo)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(PanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(PanelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        DialogLoading loadingDialog = new DialogLoading();
        loadingDialog.setVisible(true);
        
        new MyConnect(loadingDialog);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelForm;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JPanel PanelNavigation;
    private javax.swing.JLabel lbl_logo;
    // End of variables declaration//GEN-END:variables

    private void ShowPanelForm() {
        PanelForm.removeAll();
        
        formTable = new FormTable();
        PanelForm.add(formTable);
        
        PanelForm.revalidate();
        PanelForm.repaint();
    }
    
        private void ShowPanelNavigation() {
        PanelNavigation.removeAll();
        if (role.equals("Admin")) {
            navigationAdmin = new NavigationAdmin();
            PanelNavigation.add(navigationAdmin);
        } else {
            navigationUser = new NavigationUser();
            PanelNavigation.add(navigationUser);
        }
        PanelNavigation.revalidate();
        PanelNavigation.repaint();
    }
     
    public void showTableDiemMonHoc() {
        formTable.setCurrentTableType(FormTable.DIEMMONHOC_TABLE);
        List<DiemMonHocDTO> scores = diemMonHocBUS.getAllDiemMonHoc();
        String[] columnNames = {"Mã học sinh", "Mã môn học", "Năm học", "Học kỳ", "Điểm HS1", "Điểm HS2", "Điểm HS3", "Điểm TB"};
        Object[][] data = new Object[scores.size()][8];

        for (int i = 0; i < scores.size(); i++) {
            DiemMonHocDTO score = scores.get(i);
            data[i][0] = score.getMaHS();
            data[i][1] = score.getMaMH();
            data[i][2] = score.getNamHoc();
            data[i][3] = score.getHocKy();
            data[i][4] = score.getDiemHS1();
            data[i][5] = score.getDiemHS2();
            data[i][6] = score.getDiemHS3();
            data[i][7] = score.getDiemTB();
        }

        formTable.setTableData(columnNames, data);
    }

    
    public void showTableKhoiThi() {
        formTable.setCurrentTableType(FormTable.KHOITHI_TABLE);
        List<KhoiThiDTO> examBlocks = khoiThiBUS.getAllKhoiThi();
        String[] columnNames = {"Mã khối thi", "Mã môn học 1", "Mã môn học 2", "Mã môn học 3"};
        Object[][] data = new Object[examBlocks.size()][4];

        for (int i = 0; i < examBlocks.size(); i++) {
            KhoiThiDTO examBlock = examBlocks.get(i);
            data[i][0] = examBlock.getMaKT();
            data[i][1] = examBlock.getMaMH1();
            data[i][2] = examBlock.getMaMH2();
            data[i][3] = examBlock.getMaMH3();
        }

        formTable.setTableData(columnNames, data);
    }

        
    public void showTableLop() {
        formTable.setCurrentTableType(FormTable.LOP_TABLE);
        List<LopDTO> classes = lopBUS.getAllLop();
        String[] columnNames = {"Mã lớp", "Mã khối thi", "Năm mở lớp"};
        Object[][] data = new Object[classes.size()][3];

        for (int i = 0; i < classes.size(); i++) {
            LopDTO lop = classes.get(i);
            data[i][0] = lop.getMaLop();
            data[i][1] = lop.getMaKT();
            data[i][2] = lop.getNamMoLop();
        }

        formTable.setTableData(columnNames, data);
    }

    
    public void showTableMonHoc() {
        formTable.setCurrentTableType(FormTable.MONHOC_TABLE);
        List<MonHocDTO> subjects = monHocBUS.getAllMonHoc();
        String[] columnNames = {"Mã môn học", "Tên môn học"};
        Object[][] data = new Object[subjects.size()][2];

        for (int i = 0; i < subjects.size(); i++) {
            MonHocDTO subject = subjects.get(i);
            data[i][0] = subject.getMaMH();
            data[i][1] = subject.getTenMH();
        }

        formTable.setTableData(columnNames, data);
    }
    
    public void showTableNamHoc() {
        formTable.setCurrentTableType(FormTable.NAMHOC_TABLE);
        List<NamHocDTO> schoolYears = namHocBUS.getAllNamHoc();
        String[] columnNames = {"Năm bắt đầu", "Năm kết thúc", "Năm học"};
        Object[][] data = new Object[schoolYears.size()][3];

        for (int i = 0; i < schoolYears.size(); i++) {
            NamHocDTO schoolYear = schoolYears.get(i);
            data[i][0] = schoolYear.getNamBatDau();
            data[i][1] = schoolYear.getNamKetThuc();
            data[i][2] = schoolYear.getNamHoc();
        }

        formTable.setTableData(columnNames, data);
    }
    
    public void showTablePhanCong() {
        formTable.setCurrentTableType(FormTable.PHANCONG_TABLE);
        List<PhanCongGiangDayDTO> assignments = phanCongGiangDayBUS.getAllPhanCong();
        String[] columnNames = {"Mã lớp", "Mã môn học", "Năm học", "Mã giáo viên"};
        Object[][] data = new Object[assignments.size()][4];

        for (int i = 0; i < assignments.size(); i++) {
            PhanCongGiangDayDTO assignment = assignments.get(i);
            data[i][0] = assignment.getMaLop();
            data[i][1] = assignment.getMaMH();
            data[i][2] = assignment.getNamHoc();
            data[i][3] = assignment.getMaGV();
        }

        formTable.setTableData(columnNames, data);
    }

    
    public void showTableGiaoVien() {
        formTable.setCurrentTableType(FormTable.GIAOVIEN_TABLE);
        List<ThongTinGiaoVienDTO> teachers = thongTinGiaoVienBUS.getAllGiaoVien();
        String[] columnNames = {"Mã giáo viên", "Họ tên", "Giới tính", "Ngày sinh", "Nơi sinh", "Số điện thoại", "Mã tổ chuyên môn"};
        Object[][] data = new Object[teachers.size()][7];

        for (int i = 0; i < teachers.size(); i++) {
            ThongTinGiaoVienDTO teacher = teachers.get(i);
            data[i][0] = teacher.getMaGV();
            data[i][1] = teacher.getHoTen();
            data[i][2] = teacher.getGioiTinh();
            data[i][3] = teacher.getNgaySinh();
            data[i][4] = teacher.getNoiSinh();
            data[i][5] = teacher.getSoDienThoai();
            data[i][6] = teacher.getMaTCM();
        }

        formTable.setTableData(columnNames, data);
    }
    
    public void showTableHocSinh() {
        formTable.setCurrentTableType(FormTable.HOCSINH_TABLE);
        List<ThongTinHocSinhDTO> students = thongTinHocSinhBUS.getAllHocSinh();
        String[] columnNames = {"Mã học sinh", "Họ tên", "Ngày sinh", "Nơi sinh", "Số điện thoại", "Năm nhập học", "Mã lớp"};
        Object[][] data = new Object[students.size()][7];

        for (int i = 0; i < students.size(); i++) {
            ThongTinHocSinhDTO student = students.get(i);
            data[i][0] = student.getMaHS();
            data[i][1] = student.getHoTen();
            data[i][2] = student.getNgaySinh();
            data[i][3] = student.getNoiSinh();
            data[i][4] = student.getSoDienThoai();
            data[i][5] = student.getNamNhapHoc();
            data[i][6] = student.getMaLop();
        }

        formTable.setTableData(columnNames, data);
    }

    
    public void showTableToChuyenMon() {
        formTable.setCurrentTableType(FormTable.TOCHUYENMON_TABLE);
        List<ToChuyenMonDTO> specialtyGroups = toChuyenMonBUS.getAllToChuyenMon();
        String[] columnNames = {"Mã tổ chuyên môn", "Tên tổ", "Mã môn học 1", "Mã môn học 2", "Mã môn học 3"};
        Object[][] data = new Object[specialtyGroups.size()][5];

        for (int i = 0; i < specialtyGroups.size(); i++) {
            ToChuyenMonDTO specialtyGroup = specialtyGroups.get(i);
            data[i][0] = specialtyGroup.getMaTCM();
            data[i][1] = specialtyGroup.getTenTo();
            data[i][2] = specialtyGroup.getMaMH1();
            data[i][3] = specialtyGroup.getMaMH2();
            data[i][4] = specialtyGroup.getMaMH3();
        }

        formTable.setTableData(columnNames, data);
    }
}
