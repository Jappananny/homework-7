import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] free = new int[3];
        free[0] = 1;
        free[1] = 2;
        free[2] = 3;
        System.out.println("Ни " + free[0] + " человек не может жить без " + free[1] + " вещей. Воды, еды и сна. Ой " + free[2] + " вещей :)");
        for (int i = 0; i < free.length; i++) {
            System.out.print(free[i]);
            if (i != free.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = free.length - 1; i > -1; i--) {
            System.out.print(free[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < free.length; i++) {
            if (free[i] % 2 != 0) {
                free[i] += 1;
            }
        }
        System.out.print(Arrays.toString(free)); //Я не знаю что это такое, было в обзоре домашки !!!
        System.out.println();
        //Задача 1.1
        System.out.println("Задача 1.1");
        double[] percent = {1.57, 7.654, 9.986};
        System.out.println(percent[1] + " рандомное число + " + percent[0] + " еще одно, явно не будет " + percent[2]);
        for (int i = 0; i < percent.length; i++) {
            System.out.print(percent[i]);
            if (i != percent.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = percent.length - 1; i > -1; i--) {
            System.out.print(percent[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 1.2
        System.out.println("Задача 1.2");
        int[] galadrielNo = {58008, 58008918};
        System.out.println("Чего нет у эльфийки " + galadrielNo[0]);
        for (int i = 0; i < galadrielNo.length; i++) {
            System.out.print(galadrielNo[i]);
            if (i != galadrielNo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = galadrielNo.length - 1; i > -1; i--) {
            System.out.print(galadrielNo[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }
}