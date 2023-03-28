package Bai5;

import Bai4.Bai4;

public class Bai5 {
    /*Bài 5.
a. Xây dựng lớp HinhTron có một thuộc tính tên là bán kính và có kiểu double.
- Tạo cấu tử và các phương thức đặt và lấy giá trị các thuộc tính (Chú ý trường hợp nếu bán
kính được đưa vào nhỏ hơn 0 thì gán cho bán kính bằng 0).
- Viết phương thức trả về diện tích của hình tròn.
b. Xây dựng lớp HinhTruTron kế thừa từ lớp HinhTron ở trên và có thêm một thuộc tính có kiểu
double để thể hiện chiều cao của hình trụ tròn.
- Tạo cấu tử và các phương thức đặt và lấy giá trị các thuộc tính (Chú ý trường hợp nếu chiều
cao được đưa vào nhỏ hơn 0 thì gán cho chiều cao bằng 0).
- Viết phương thức tính thể tích của hình trụ tròn.
c. Viết minh họa bên trong hàm main()
*/
    class HinhTron{
        private double banKinh;
        public HinhTron(double banKinh) {
            this.banKinh = banKinh;
        }
        public double getBanKinh() {

            return banKinh;
        }
        public void setBanKinh(double banKinh) {
            if (banKinh < 0) {
                banKinh = 0;
            }
            this.banKinh = banKinh;
        }
        public double getDienTich(){
            return Math.PI * banKinh * banKinh;
        }
    }
    class HinhTruTron extends HinhTron {
        private double chieuCao;
        public HinhTruTron(double banKinh, double chieuCao) {
            super(banKinh);
            this.chieuCao = chieuCao;
        }
        public double getChieuCao() {
            return chieuCao;
        }
        public void setChieuCao(double chieuCao) {
            if (chieuCao < 0) {
                chieuCao = 0;
            }
            this.chieuCao = chieuCao;
        }
        public double getTheTich(){
            return getDienTich() * chieuCao;
        }
    }

    public static void main(String[] args) {
        Bai5 bai5 = new Bai5();
        HinhTron hinhtron = bai5.new HinhTron(5);
        HinhTruTron hinhtrutron = bai5.new HinhTruTron(5, 10);
        System.out.println("Dien tich hinh tron: " + hinhtron.getDienTich());
        System.out.println("The tich hinh tru tron: " + hinhtrutron.getTheTich());
    }
}
