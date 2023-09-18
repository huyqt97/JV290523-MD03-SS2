import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        System.out.println("Nhập số muốn kiểm tra : ");
        int nb = new Scanner(System.in).nextInt();
        System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số.\n" +
                "2.Kiểm tra số nguyên tố.\n" +
                "3.Kiểm tra một số có chia hết cho 3 không.\n" +
                "0.Thoát\n");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                if (nb % 2 == 0) {
                    System.out.println(nb + " : là số chẵn");
                    break;
                } else {
                    System.out.println(nb + " : là số lẻ");
                    break;
                }
            case 2:
                boolean r = true;
                for (int i = 2; i < nb; i++) {
                    if (nb % i == 0) {
                        r = false;
                    }
                }
                if (r) {
                    System.out.println("là số nguyên tố");
                } else {
                    System.out.println("không phải là số nguyên tố");
                }
                break;
            case 3:
                if (nb % 3 == 0) {
                    System.out.println(nb + " : chia hết cho 3");
                } else {
                    System.out.println(nb + " : không chia hết cho 3");
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("không hợp lệ");
                break;
        }
    }
}
