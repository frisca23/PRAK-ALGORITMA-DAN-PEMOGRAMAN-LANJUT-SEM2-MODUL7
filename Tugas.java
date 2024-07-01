public class Tugas {
    public static void main(String[] args) {
        int n = 7;
        int a = 1, b = 2, c;

        System.out.print("Deret: ");
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(a + " ");
            } else if (i == 2) {
                System.out.print(b + " ");
            } else if (i % 2 == 0) {
                c = a + b;
                System.out.print(c + " ");
                a = c;
            } else {
                c = a + b;
                System.out.print(c + " ");
                b = c;
            }
        }
    }
}