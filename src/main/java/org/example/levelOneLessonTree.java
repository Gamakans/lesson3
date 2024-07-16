package org.example;
//Домашнаяя работа
//Уровень 1 урок 3
import java.util.Arrays;

public class levelOneLessonTree {

    public static void main(String[] args) {
        lessonOne();
        lessonTwo();
        lessonThree();
        lessonFour();
        System.out.println(Arrays.toString(lessonFive(10, 4)));
        lessonSix();

        int[] massSeven =    {1, 2, 2, 2, 2, 8, 1};
        System.out.println("Выполняется ли условие равенства правой и левой стороны " + lessonSeven(massSeven));


        int[] massEightTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        lessonEightIterationTwo(massEightTwo, -1);
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,0, 0 ].
//   С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void lessonOne() {
        System.out.println();
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание 1");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
//    значениями 1 2 3 4 5 6 7 8 … 100;
    public static void lessonTwo() {
        System.out.println();
        int[] arr = new int[100];
        System.out.println("Задание 2");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
//    умножить на 2;
    public static void lessonThree() {
        System.out.println();
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание 3");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//            одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//            (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
//    диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
//            [1][1], [2][2], …, [n][n];
    public static void lessonFour() {
        int[][] arr = new int[10][10];
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr[i].length; j++)
                if (i == j || j == arr[i].length - i - 1) {
                    arr[i][j] = 1;
                }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    //5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
//    одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] lessonFive(int len, int initialValue) {
        System.out.println();
        System.out.println("Задание 5");
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void lessonSix() {
        System.out.println();
        System.out.println("Задание 6");
        int[] mass6 = {1, 9, 0, 4, 7, 3, 0, 100, -1};
        int min = mass6[0];
        int max = mass6[0];
        for (int i = 0; i < mass6.length; i++) {
            if (min > mass6[i]) {
                min = mass6[i];
            }
            if (max < mass6[i]) {
                max = mass6[i];
            }
        }
        System.out.println("Минимальный элемент в массиве " + min);
        System.out.println("Максимальный элемент в массиве " + max);
    }

    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части
//    массива равны.
//    Примеры:
//    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//    граница показана символами |||, эти символы в массив не входят и не имеют никакого
//    отношения к ИЛИ.
    public static boolean lessonSeven(int[] in) {
        System.out.println();
        System.out.println("Задание 7");
        System.out.println(Arrays.toString(in));
        int left = in[0];
        int right = 0;
        int counterRight = 1;
        int counterLeft = 1;
        for (int i = 1; i < in.length; i++) {
            if (left < right) {
                left += in[counterLeft];
                counterLeft += 1;
            } else {
                right += in[in.length - counterRight];
                counterRight += 1;
            }
        }
        counterRight -= 1;
        System.out.println("Сумма левой стороны " + left);
        System.out.println("Сумма правой стороны " + right);
        if (left == right) {
            System.out.println("Массив равен между шагами слева " + counterLeft + " и шагом справа " + counterRight);
            return true;
        }
        return false;
    }

    //8. *** Написать метод, которому на вход подается одномерный массив и число n (может быть
//положительным, или отрицательным), при этом метод должен сместить все элементы массива
//    на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
//    вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5,
//            6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете
//    выбирать сами.

    public static void lessonEightIterationTwo(int[] in, int offcet) {
        System.out.println();
        System.out.println("Задание 8");
        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(in));
        int offcetValue = offcet;
        int arrValueVector;

        offcet = offcet % in.length;
        if (offcet < 0) {
            offcet += in.length;
        }
        for (int j = 0; j < offcet; j++) {
            arrValueVector = in[0];
            for (int i = 0; i < in.length - 1; i++) {
                in[i] = in[i + 1];
            }
            in[in.length - 1] = arrValueVector;
        }
        System.out.println("После смещения на " + offcetValue);
        System.out.println(Arrays.toString(in));
    }
}
