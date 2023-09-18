import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        System.out.println("Nhập số a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Nhập số b:");
        int b = sc.nextInt();
        int chan = 0;
        int le = 0;
        if (b > a) {
            for (int i = a; i <= b; i++) {
                if(i%2 ==  0){
                    chan = chan + i;
                }else {
                    le = le + i;
                }
            }
        }else {
            System.out.println("số b phải lớn hơn số a");
        }
        System.out.println("tổng chẵn = " + chan);
        System.out.println("tổng lẻ = " + le);

    }
}
