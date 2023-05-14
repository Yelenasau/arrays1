import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1-3");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] b = {1.57d, 7.654, 9.986};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            if (i != b.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        long[] c = {1, 2, 3, 4, 5};
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i != c.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
        public static void task2 () {
            System.out.println("Задача 4");

            int[] a = new int[3];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 != 0) {
                    a[i]++;
                }
            }
                System.out.println(Arrays.toString(a));
            }

            }

