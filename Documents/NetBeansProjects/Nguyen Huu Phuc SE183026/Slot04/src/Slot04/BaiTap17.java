
import java.util.Scanner;

/*
 Write a Java program that will accept 
two float numbers and an operator (+-*:) 
then the program will print out the result of the specified expression 
that bases on the inputted operator.
 */
/**
 *
 * @author hunagroup Nhập 2 số thực từ bàn phím và lưu giá trị vào 2 biến x, y
 * nhập phép toán trong các loại sau: +, -, *, / Sau đó, xuất ra màn hình kết
 * quả Ví dụ x = 10 y = 20 phép toán là / Output: x / y = 10 / 20 = 0.50
 */
public class BaiTap17 {

    public static void main(String[] args) {
        System.out.println("Nhập 2 số thực x, y: ");
        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập phép toán (+,-,*,/): ");
        String ops = sc.nextLine();

        double result = 0.0;
        // Trong so sánh 2 chuỗi bằng nhau, ta không dùng == mà phải dùng hàm equals
        if (ops.equals("+")) {
            result = x + y;
        } else if (ops.equals("-")) {
            result = x - y;
        } else if (ops.equals("*")) {
            result = x * y;
        } else if (ops.equals("/")) {
            result = x / y;
        } else {
            System.out.println("Nhập sai");
        }
        System.out.format("%.2f %s %.2f = %.2f \n", x, ops, y, result);
    }
}
