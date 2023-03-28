package Bai4;

public class Bai4 {
    /*Bài 4.
a. Xây dựng lớp TacGia (tác giả) gồm các thuộc tính họ và tên, năm sinh. Xây dựng các phương thức
đặt và lấy giá trị các thuộc tính cho lớp TacGia này.
b. Xây dựng lớp TaiLieu (tài liệu) gồm các thuộc tính tên tài liệu, tác giả của tài liệu (sử dụng lớp
TacGia) ở trên và năm xuất bản. Xây dựng các phương thức đặt và lấy giá trị các thuộc tính cho lớp
TaiLieu này.
c. Trong lớp TaiLieu, xây dựng một phương thức tên là hienThiThongTin() được sử dụng để hiển thị
thông tin của tài liệu theo cú pháp:
Tài liệu <tên tài liệu> của tác giả <họ và tên tác giả> được xuất bản vào năm <năm xuất bản>.
d. Viết minh họa bên trong hàm main()
*/
    class TacGia{
        private String hoTen;
        private int namSinh;

        public TacGia(String hoTen, int namSinh) {
            this.hoTen = hoTen;
            this.namSinh = namSinh;
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
    }
    class TaiLieu{
        private String tenTaiLieu;
        private TacGia tacGia;
        private int namXuatBan;

        public TaiLieu(String tenTaiLieu, TacGia tacGia, int namXuatBan) {
            this.tenTaiLieu = tenTaiLieu;
            this.tacGia = tacGia;
            this.namXuatBan = namXuatBan;
        }

        public String getTenTaiLieu() {
            return tenTaiLieu;
        }

        public void setTenTaiLieu(String tenTaiLieu) {
            this.tenTaiLieu = tenTaiLieu;
        }

        public TacGia getTacGia() {
            return tacGia;
        }

        public void setTacGia(TacGia tacGia) {
            this.tacGia = tacGia;
        }

        public int getNamXuatBan() {
            return namXuatBan;
        }

        public void setNamXuatBan(int namXuatBan) {
            this.namXuatBan = namXuatBan;
        }
        public void hienThiThongTin(){
            System.out.println("Tài liệu " + tenTaiLieu + " của tác giả " + tacGia.getHoTen() + " được xuất bản vào năm " + namXuatBan + ".");
        }
    }
    public static void main(String[] args) {
        Bai4 bai4 = new Bai4();
        TacGia tacGia = bai4.new TacGia("Nguyễn Văn A", 1990);
        TaiLieu taiLieu = bai4.new TaiLieu("Tài liệu 1", tacGia, 2020);
        taiLieu.hienThiThongTin();
    }
}
