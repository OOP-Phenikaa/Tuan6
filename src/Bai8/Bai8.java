package Bai8;

public class Bai8 {
    /*Bài 8. Xây dựng lớp SoNgauNhien có một thuộc tính là số ngẫu nhiên kiểu int.
- Tạo cấu tử và các phương thức đặt và lấy giá trị thuộc tính. Trong đó phương thức set hoặc
cấu tử mặc định sẽ sinh ra một số ngẫu nhiên nằm trong khoảng từ 1 đến 100.
- Trong hàm main(): Tạo ra một số lượng tùy ý các đối tượng của lớp SoNgauNhien. Bạn hãy
sửa đổi lớp SoNgauNhien sao cho chương trình có thể in ra màn hình số lượng đối tượng của lớp
SoNgauNhien (có thể thêm thuộc tính, phương thức cho lớp SoNgauNhien này) mà bạn đã tạo ra.*/
    class SoNgauNhien{
        private int soNgauNhien;

        public SoNgauNhien() {
            this.soNgauNhien = (int) (Math.random() * 100 + 1);
        }

        public int getSoNgauNhien() {
            return soNgauNhien;
        }

        public void setSoNgauNhien(int soNgauNhien) {
            this.soNgauNhien = soNgauNhien;
        }
    }

    public static void main(String[] args) {
        Bai8 bai8 = new Bai8();
        SoNgauNhien[] soNgauNhien = new SoNgauNhien[10];
        for (int i = 0; i < soNgauNhien.length; i++) {
            soNgauNhien[i] = bai8.new SoNgauNhien();
            System.out.println(soNgauNhien[i].getSoNgauNhien());
        }
    }
}
