package Bai6;

public class Bai6 {
    /*Bài 6.
a. Xây dựng lớp HinhChuNhat có hai thuộc tính tên là chiều dài và chiều rộng và có kiểu double.
- Tạo cấu tử và các phương thức đặt và lấy giá trị các thuộc tính (Chú ý trường hợp nếu chiều
dài hay chiều rộng được đưa vào nhỏ hơn 0 thì gán cho chúng giá trị bằng 0).
- Viết phương thức trả về diện tích của hình chữ nhật.
b. Xây dựng lớp HinhLapPhuong kế thừa từ lớp HinhChuNhat ở trên và có thêm một thuộc tính có
kiểu double để thể hiện chiều cao của hình lập phương.
- Tạo cấu tử và các phương thức đặt và lấy giá trị các thuộc tính (Chú ý trường hợp nếu chiều
cao được đưa vào nhỏ hơn 0 thì gán cho chiều cao bằng 0).
- Viết phương thức tính thể tích của hình lập phương.
c. Viết minh họa bên trong hàm main()
*/
    class HinhChuNhat{
        private double chieuDai;
        private double chieuRong;
        public HinhChuNhat(){
            chieuDai = 0;
            chieuRong = 0;
        }
        public HinhChuNhat(double chieuDai, double chieuRong){
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
        public void setChieuDai(double chieuDai){
            if (chieuDai < 0) {
                chieuDai = 0;
            }
            this.chieuDai = chieuDai;
        }
        public void setChieuRong(double chieuRong){
            if (chieuRong < 0) {
                chieuRong = 0;
            }
            this.chieuRong = chieuRong;
        }
        public double getChieuDai(){
            return chieuDai;
        }
        public double getChieuRong(){
            return chieuRong;
        }
        public double dienTich(){
            return chieuDai * chieuRong;
        }
    }
    class HinhLapPhuong extends HinhChuNhat{
        private double chieuCao;
        public HinhLapPhuong(){
            chieuCao = 0;
        }
        public HinhLapPhuong(double chieuDai, double chieuRong, double chieuCao){
            super(chieuDai, chieuRong);
            this.chieuCao = chieuCao;
        }
        public void setChieuCao(double chieuCao){
            if (chieuCao < 0) {
                chieuCao = 0;
            }
            this.chieuCao = chieuCao;
        }
        public double getChieuCao(){
            return chieuCao;
        }
        public double theTich(){
            return dienTich() * chieuCao;
        }
    }

    public static void main(String[] args) {
        Bai6 bai6 = new Bai6();
        HinhChuNhat hcn = bai6.new HinhChuNhat(5, 6);
        System.out.println("Dien tich hinh chu nhat: " + hcn.dienTich());
        HinhLapPhuong hlp = bai6.new HinhLapPhuong(5, 6, 7);
        System.out.println("The tich hinh lap phuong: " + hlp.theTich());
    }
}
