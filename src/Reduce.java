public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(reduce(n));
    }

    private static int reduce(int n) {
        int stepsSoFar = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n--;
            }
            stepsSoFar++;
        }
        return stepsSoFar;
    }
}
