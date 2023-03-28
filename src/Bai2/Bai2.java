package Bai2;

public class Bai2 {
    /*Bài 2. Tạo một lớp quản lý tài khoản ngân hàng gồm các thuộc tính số tài khoản, số dư, tên khách
hàng, email và số điện thoại.
a. Tạo cấu tử và các phương thức đặt và lấy giá trị các thuộc tính.
b. Tạo phương thức gửi tiền để cho phép khách hàng tăng số dư tài khoản lên.
c. Tạo phương thức rút tiền để cho phép khách hàng giảm số dư tài khoản xuống, tuy nhiên không cho
phép rút nếu số dư tài khoản nhỏ hơn số tiền cần rút.
d. Viết minh họa bên trong hàm main()
*/
    class Bank{
        private String soTaiKhoan;
        private int soDu;
        private String tenKhachHang;
        private String email;
        private String soDienThoai;

        public Bank(String soTaiKhoan, int soDu, String tenKhachHang, String email, String soDienThoai) {
            this.soTaiKhoan = soTaiKhoan;
            this.soDu = soDu;
            this.tenKhachHang = tenKhachHang;
            this.email = email;
            this.soDienThoai = soDienThoai;
        }

        public String getSoTaiKhoan() {
            return soTaiKhoan;
        }

        public void setSoTaiKhoan(String soTaiKhoan) {
            this.soTaiKhoan = soTaiKhoan;
        }

        public int getSoDu() {
            return soDu;
        }

        public void setSoDu(int soDu) {
            this.soDu = soDu;
        }

        public String getTenKhachHang() {
            return tenKhachHang;
        }

        public void setTenKhachHang(String tenKhachHang) {
            this.tenKhachHang = tenKhachHang;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getSoDienThoai() {
            return soDienThoai;
        }

        public void setSoDienThoai(String soDienThoai) {
            this.soDienThoai = soDienThoai;
        }

        public void guiTien(int soTien){
            this.soDu += soTien;
        }

        public void rutTien(int soTien){
            if (this.soDu < soTien){
                System.out.println("Số dư không đủ để rút");
            }else {
                this.soDu -= soTien;
            }
        }
    }
    public static void main(String[] args) {
        Bai2 bai2 = new Bai2();
        Bank bank = bai2.new Bank("123456789", 1000000, "Nguyễn Văn A", "nguyenvanA@gmail.com", "0123456789");
        System.out.println("Số dư tài khoản: " + bank.getSoDu());
        bank.guiTien(100000);
        System.out.println("Số dư tài khoản: " + bank.getSoDu());
    }
}
