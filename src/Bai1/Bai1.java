package Bai1;

public class Bai1 {
/*Bài 1. Xây dựng lớp SinhVien gồm các thuộc tính mã sinh viên, họ và tên, năm sinh và điểm Java. Xây
dựng các phương thức đặt và lấy giá trị các thuộc tính cho lớp SinhVien này. Ngoài ra, xây dựng một
phương thức trả về tuổi của sinh viên và một phương thức tên là hienThiThongTin() được sử dụng để
hiển thị thông tin của SinhVien theo cú pháp:
Sinh viên <họ và tên>, <tuổi> tuổi, có mã sinh viên là <mã sinh viên> đạt <điểm Java> điểm Java.
Viết minh họa bên trong hàm main()
*/
    class SinhVien{
        private String maSV;
        private String hoTen;
        private int namSinh;
        private float diemJava;
        public SinhVien(String maSV, String hoTen, int namSinh, float diemJava) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.namSinh = namSinh;
            this.diemJava = diemJava;
        }
        public String getMaSV() {
            return maSV;
        }
        public void setMaSV(String maSV) {
            this.maSV = maSV;
        }
        public String getHoTen() {
            return hoTen;
        }
        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }
        public int getNamSinh() {
            return namSinh;
        }
        public void setNamSinh(int namSinh) {
            this.namSinh = namSinh;
        }
        public float getDiemJava() {
            return diemJava;
        }
        public void setDiemJava(float diemJava) {
            this.diemJava = diemJava;
        }
        public int getTuoi(){
            return 2023 - namSinh;
        }
        public void hienThiThongTin(){
            System.out.println("Sinh viên " + hoTen + ", " + getTuoi() + " tuổi, có mã sinh viên là " + maSV + " đạt " + diemJava + " điểm Java.");
        }
    }
    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        Bai1.SinhVien sv = bai1.new SinhVien("B20DCCN001", "Nguyễn Văn A", 2000, 8.5f);
        sv.hienThiThongTin();
    }
}

