package Assessment1;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        double list[] = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextDouble();
        }
        System.out.println(Array.isUnique(a));
        System.out.println(Array.isSorted(list));

    }
}

class Array {
    public static boolean isUnique(int a[]) {
        if (a.length <= 0) {
            System.out.println("NOElementsInArrayException");
        }

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j])
                    return false;
            }
        }

        return true;

    }

    public static boolean isSorted(double list[]) {
        if (list.length <= 0) {
            System.out.println("NOElementsInArrayException");
        }

        if (list.length <= 1)
            return true;

        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
        }

        return true;

    }
}
