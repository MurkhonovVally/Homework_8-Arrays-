public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println((char) 27 + "[34m----------Задача 1----------" + (char) 27 + "[0m");
        int[] arrays = new int[3];
        arrays[0] = 1;
        arrays[1] = 2;
        arrays[2] = 3;

        double[] arrays1 = {1.57, 7.654, 9.986};

        char[] arrays2 = {'q', 'w', 'e'};
    }

    public static void task2() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 2----------" + (char)27 + "[0m");
        int[]arrays = {1, 2, 3};
        double[] arrays1 = {1.57, 7.654, 9.986};
        char[] arrays2 = {'v', 'a', 'l', 'l', 'y'};
        for (int a = 0; a < arrays.length; a++) {
            System.out.print(arrays[a]);
            if (a != arrays.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int a = 0; a < arrays1.length; a++) {
            System.out.print(arrays1[a]);
            if (a != arrays1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int a = 0; a < arrays2.length; a++) {
            System.out.print(arrays2[a]);
            if (a != arrays2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 3----------" + (char)27 + "[0m");
    }

    public static void task4() {
        System.out.println((char) 27 + "[32m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[34m----------Задача 4----------" + (char)27 + "[0m");
    }
}