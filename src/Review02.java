
public class Review02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // その整数が3で割り切れ、なおかつ5で割り切れる数なら
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                // 3で割り切れる数なら
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                // 5で割り切れる数なら
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                //上記以外の数なら
            } else {
                System.out.println(i);
            }

        }
    }

}
