import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập 3 cạnh của 1 tam giác :");
            System.out.println("cạnh a:");
            double a = sc.nextInt();
            System.out.println("cạnh b:");
            double b = sc.nextInt();
            System.out.println("cạnh c:");
            double c = sc.nextInt();
            if (a > 0 && b > 0 && c > 0) {
                if (a + b < c || b + c < a || a + c < b) {
                    System.out.println("3 cạnh vừa nhập không tạo thành 1 hình tròn");
                } else {
                    double cv = a + b + c;
                    double s = (a + b + c) / 2.0;
                    double dt = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                    System.out.println("chu vi hình CN = " + cv);
                    System.out.println("diện tích hình CN = " + dt);
                }
            }else {
                System.out.println("cạnh phải lớn hơn không");
            }
        }
    }
}
