public class BT4 {
    public static void main(String[] args) {
        int n = 20;
        int count = 0;
        int num = 2;
        System.out.println("20 số nguyên tố đầu tiên là:");
        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

    }
}
