package Bai7;

import Bai4.Bai4;

public class Bai7 {
    /* Bài 7.
a. Xây dựng lớp NhanVien có thuộc tính họ và tên.
- Tạo cấu tử và các phương thức đặt và lấy giá trị các thuộc tính.
- Viết phương thức tính lương để trả về số tiền lương của nhân viên (giả sử ở lớp này phương
thức sẽ trả về giá trị là 0).
b. Xây dựng lớp NhanVienFullTime kế thừa từ lớp NhanVien ở trên và có thêm một thuộc tính là số
lượng ngày làm việc trong tháng có kiểu int.
- Tạo cấu tử và các phương thức đặt và lấy giá trị các thuộc tính.
- Nạp chồng phương thức tính lương để trả về số tiền lương của nhân viên theo công thức:
tiền lương = số ngày làm việc * 500.000đ
c. Xây dựng lớp NhanVienPartTime kế thừa từ lớp NhanVien ở trên và có thêm một thuộc tính là số
lượng giờ làm việc trong tháng có kiểu int.
- Tạo cấu tử và các phương thức đặt và lấy giá trị các thuộc tính.
- Nạp chồng phương thức tính lương để trả về số tiền lương của nhân viên theo công thức:
tiền lương = số giờ làm việc * 40.000đ
d. Trong hàm main() minh họa:
- Xây dựng 5 đối tượng thuộc lớp NhanVien.
- Với mỗi đối tượng thuộc lớp NhanVien ở trên, ta thực hiện:
+ Sinh một số ngẫu nhiên trong khoảng từ 1 đến 100.
+ Nếu số ngẫu nhiên là số lẻ thì khởi tạo đối tượng NhanVienFullTime cho đối tượng
NhanVien tương ứng. Số ngày làm việc sẽ là một số ngẫu nhiên nằm từ 15 cho đến 25 ngày.
+ Nếu số ngẫu nhiên là số chẵn thì khởi tạo đối tượng NhanVienPartTime cho đối
tượng NhanVien tương ứng. Số giờ làm việc sẽ là một số ngẫu nhiên nằm từ 80 cho đến 200 giờ.
- In ra màn hình số tiền lương mà mỗi nhân viên nhận được.
*/
    class NhanVien{
        private String hoTen;
        public NhanVien(String hoTen){
            this.hoTen = hoTen;
        }
        public void setHoTen(String hoTen){
            this.hoTen = hoTen;
        }
        public String getHoTen(){
            return hoTen;
        }
        public int tinhLuong(){
            return 0;
        }
    }
    class NhanVienFullTime extends NhanVien {
        private int soNgayLamViec;
        public NhanVienFullTime(String hoTen, int soNgayLamViec){
            super(hoTen);
            this.soNgayLamViec = soNgayLamViec;
        }
        public void setSoNgayLamViec(int soNgayLamViec){
            this.soNgayLamViec = soNgayLamViec;
        }
        public int getSoNgayLamViec(){
            return soNgayLamViec;
        }
        @Override
        public int tinhLuong(){
            return soNgayLamViec * 500000;
        }
    }
    class NhanVienPartTime extends NhanVien {
        private int soGioLamViec;
        public NhanVienPartTime(String hoTen, int soGioLamViec){
            super(hoTen);
            this.soGioLamViec = soGioLamViec;
        }
        public void setSoGioLamViec(int soGioLamViec){
            this.soGioLamViec = soGioLamViec;
        }
        public int getSoGioLamViec(){
            return soGioLamViec;
        }
        @Override
        public int tinhLuong(){
            return soGioLamViec * 40000;
        }
    }
    public static void main(String[] args) {
/*Trong hàm main() minh họa:
- Xây dựng 5 đối tượng thuộc lớp NhanVien.
- Với mỗi đối tượng thuộc lớp NhanVien ở trên, ta thực hiện:
+ Sinh một số ngẫu nhiên trong khoảng từ 1 đến 100.
+ Nếu số ngẫu nhiên là số lẻ thì khởi tạo đối tượng NhanVienFullTime cho đối tượng
NhanVien tương ứng. Số ngày làm việc sẽ là một số ngẫu nhiên nằm từ 15 cho đến 25 ngày.
+ Nếu số ngẫu nhiên là số chẵn thì khởi tạo đối tượng NhanVienPartTime cho đối
tượng NhanVien tương ứng. Số giờ làm việc sẽ là một số ngẫu nhiên nằm từ 80 cho đến 200 giờ.
- In ra màn hình số tiền lương mà mỗi nhân viên nhận được.*/
        Bai7 bai7 = new Bai7();
        NhanVien[] nhanViens = new NhanVien[5];
        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens[i] = bai7.new NhanVien("Nhan vien " + (i + 1));
            int random = (int) (Math.random() * 100 + 1);
            if (random % 2 == 0) {
                nhanViens[i] = bai7.new NhanVienFullTime("Nhan vien " + (i + 1), (int) (Math.random() * 11 + 15));
            } else {
                nhanViens[i] = bai7.new NhanVienPartTime("Nhan vien " + (i + 1), (int) (Math.random() * 121 + 80));
            }
            System.out.println(nhanViens[i].getHoTen() + " co luong la: " + nhanViens[i].tinhLuong());
        }
    }
}
