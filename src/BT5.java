public class BT5 {
    public static void main(String[] args) {
        int t = 1;
        while (true) {

            if (t % 5 == 0 && t % 7 == 0 && t % 10 == 0) {
                System.out.println(t);
                return;
            }
            t++;
        }
    }
}
