package QuanLyDiem.GUI;

import QuanLyDiem.BUS.ThongTinGiaoVienBUS;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormTable extends javax.swing.JPanel {

    public static final String DIEMMONHOC_TABLE = "DIEMMONHOC";
    public static final String KHOITHI_TABLE = "KHOITHI";
    public static final String LOP_TABLE = "LOP";
    public static final String MONHOC_TABLE = "MONHOC";
    public static final String NAMHOC_TABLE = "NAMHOC";
    public static final String PHANCONG_TABLE = "PHANCONGGIANGDAY";
    public static final String GIAOVIEN_TABLE = "GIAOVIEN";
    public static final String HOCSINH_TABLE = "HOCSINH";
    public static final String TOCHUYENMON_TABLE = "TOCHUYENMON";
    
    private String currentTableType;

    private Object[][] tempData; // Biến để lưu trữ dữ liệu tạm thời
    private String[] columnNames; // Biến để lưu trữ tên cột

    private int rowsPerPage = 100; // Số dòng hiển thị trên mỗi trang
    private int currentPage = 1; // Trang hiện tại
    
    public FormTable() {
        initComponents();
        
        // Disable cell editing
        jTable1.setDefaultEditor(Object.class, null);

        // Disable column reordering
        jTable1.getTableHeader().setReorderingAllowed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_search = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        cbx_search = new javax.swing.JComboBox<>();
        pageButton = new javax.swing.JButton();
        cbx_page = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        importButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(693, 500));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        txt_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_search.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        searchButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchButton.setText("Tìm kiếm");
        searchButton.setBorderPainted(false);
        searchButton.setFocusPainted(false);
        searchButton.setFocusable(false);

        cbx_search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbx_search.setFocusable(false);

        pageButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pageButton.setText("Xác nhận");
        pageButton.setBorderPainted(false);
        pageButton.setFocusPainted(false);
        pageButton.setFocusable(false);
        pageButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pageButtonMouseClicked(evt);
            }
        });

        cbx_page.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_page.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addButton.setText("Thêm");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateButton.setText("Sửa");

        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteButton.setText("Xoá");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        importButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        importButton.setText("Nhập");

        exportButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exportButton.setText("Xuất");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbx_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pageButton)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(importButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exportButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbx_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(cbx_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importButton)
                    .addComponent(exportButton))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageButton)
                    .addComponent(cbx_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        switch (currentTableType) {
            case DIEMMONHOC_TABLE:
                // Add code to handle adding a new score
                break;
            case KHOITHI_TABLE:
                // Add code to handle adding a new exam block
                break;
            case LOP_TABLE:
                // Add code to handle adding a new class
                break;
            case MONHOC_TABLE:
                // Add code to handle adding a new subject
                break;
            case NAMHOC_TABLE:
                // Add code to handle adding a new school year
                break;
            case PHANCONG_TABLE:
                // Add code to handle adding a new teaching assignment
                break;
            case GIAOVIEN_TABLE:
                FrameAddTeacher frameTeacher = new FrameAddTeacher();
                frameTeacher.setVisible(true);
                break;
            case HOCSINH_TABLE:
                FrameAddStudent frameStudent = new FrameAddStudent();
                frameStudent.setVisible(true);
                break;
            case TOCHUYENMON_TABLE:
                // Add code to handle adding a new specialty group
                break;
            default:
                throw new IllegalStateException("Unknown table type: " + currentTableType);
        }
    }//GEN-LAST:event_addButtonMouseClicked

    private void pageButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pageButtonMouseClicked
        currentPage = Integer.parseInt(cbx_page.getSelectedItem().toString());
        refreshTable();
    }//GEN-LAST:event_pageButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        int[] selectedRows = jTable1.getSelectedRows();
        
        if (selectedRows.length == 0) {
            new MyDialog("Chưa chọn dòng nào!", MyDialog.ERROR_DIALOG);
            return;
        }
        
        String[] selectedIds = new String[selectedRows.length];
        
        for (int i = 0; i < selectedRows.length; i++) {
            selectedIds[i] = (String) jTable1.getValueAt(selectedRows[i], 0);
        }
        
        switch (currentTableType) {
            case DIEMMONHOC_TABLE:
                // Add code to handle adding a new score
                break;
            case KHOITHI_TABLE:
                // Add code to handle adding a new exam block
                break;
            case LOP_TABLE:
                // Add code to handle adding a new class
                break;
            case MONHOC_TABLE:
                // Add code to handle adding a new subject
                break;
            case NAMHOC_TABLE:
                // Add code to handle adding a new school year
                break;
            case PHANCONG_TABLE:
                // Add code to handle adding a new teaching assignment
                break;
            case GIAOVIEN_TABLE:
                ThongTinGiaoVienBUS bus = new ThongTinGiaoVienBUS();
                bus.deleteGiaoVien(selectedIds);
                break;
            case HOCSINH_TABLE:
                // Add code to handle adding a new teaching assignment
                break;
            case TOCHUYENMON_TABLE:
                // Add code to handle adding a new specialty group
                break;
            default:
                throw new IllegalStateException("Unknown table type: " + currentTableType);
        }
    }//GEN-LAST:event_deleteButtonMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> cbx_page;
    private javax.swing.JComboBox<String> cbx_search;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JButton importButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton pageButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField txt_search;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    public void setTableData(String[] columnNames, Object[][] data) {
        this.columnNames = columnNames;
        this.tempData = data;
        currentPage = 1; // Reset về trang đầu tiên khi cập nhật dữ liệu mới

        // Tính toán và cập nhật số trang tương ứng với dữ liệu mới
        int totalPages = (int) Math.ceil((double) tempData.length / rowsPerPage);
        populatePageComboBox(totalPages);

        refreshTable();
    }

    private void populatePageComboBox(int totalPages) {
        cbx_page.removeAllItems();
        for (int i = 1; i <= totalPages; i++) {
            cbx_page.addItem(String.valueOf(i));
        }
    }
    
    private void refreshTable() {
        int startIndex = (currentPage - 1) * rowsPerPage;
        int endIndex = Math.min(startIndex + rowsPerPage, tempData.length);

        Object[][] currentPageData = new Object[endIndex - startIndex][columnNames.length];
        for (int i = startIndex; i < endIndex; i++) {
            currentPageData[i - startIndex] = tempData[i];
        }

        DefaultTableModel model = new DefaultTableModel(currentPageData, columnNames);
        jTable1.setModel(model);
    }
    
    public void setCurrentTableType(String tableType) {
        this.currentTableType = tableType;
    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }
}