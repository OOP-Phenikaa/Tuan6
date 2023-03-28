package Bai3;

public class Bai3 {
    /*Bài 3. Xây dựng lớp quản lý tọa độ của điểm trên không gian 2 chiều có tên là Point, lớp gồm có hai
thuộc tính x và y với kiểu dữ liệu là int.
a. Tạo cấu tử và các phương thức đặt và lấy giá trị các thuộc tính.
b. Xây dựng phương thức khoangcach không tham số, được dùng để tính khoảng cách của tọa độ hiện
tại với gốc tọa độ.
c. Xây dựng phương thức khoangcach 02 tham số x và y có kiểu dữ liệu là int, được dùng để tính
khoảng cách của tọa độ hiện tại với tọa độ (x, y).
d. Xây dựng phương thức khoangcach 01 tham số có kiểu dữ liệu là Point, được dùng để tính khoảng
cách của tọa độ hiện tại với tọa độ được truyền vào thông qua lớp Point.
e. Viết minh họa bên trong hàm main()
 */
    class Point{
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public float khoangCach(){
            return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }

        public float khoangCach(int x, int y){
            return (float) Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        }

        public float khoangCach(Point point){
            return (float) Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
        }
    }
    public static void main(String[] args) {
        Bai3 bai3 = new Bai3();
        Bai3.Point point = bai3.new Point(1, 1);
        System.out.println(point.khoangCach());
        System.out.println(point.khoangCach(5, 6));
        System.out.println(point.khoangCach(bai3.new Point(7, 8)));
    }
}
