public class MutualRecursion {

    public static void funA(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            funB(n - 1);
        }
    }

    public static void funB(int n) {
        if (n > 1) {
            System.out.print(n + " ");
            funA(n / 2);
        }
    }

    public static void main(String[] args) {
        funA(20);
    }
}
