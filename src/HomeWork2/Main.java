package HomeWork2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] zeroAndOne = {0, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1};
        for (int i = 0; i < zeroAndOne.length; i++) {
            if (zeroAndOne[i] == 0) {
                zeroAndOne[i] = 1;
            } else zeroAndOne[i] = 0;
        }
        System.out.println(Arrays.toString(zeroAndOne));

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int n = -3;
        int[] emptyArray = new int[8];
        for (int i = 0; i < emptyArray.length; i++) {
            n = n + 3;
            emptyArray[i] = n;
        }
        System.out.println(Arrays.toString(emptyArray));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] randomArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < 6) {
                randomArray[i] = randomArray[i] * 2;
            }
        }
        System.out.println(Arrays.toString(randomArray));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] twoDimensional = new int[5][5];
        for (int i = 0; i < twoDimensional.length; i++) {
            for (int j = 0; j < twoDimensional[i].length; j++) {
                if (i == j) {
                    twoDimensional[i][j] = 1;
                    System.out.printf("%4d", twoDimensional[i][j]);
                } else if (i + j == twoDimensional.length - 1) {
                    twoDimensional[i][j] = 1;
                    System.out.printf("%4d", twoDimensional[i][j]);
                } else System.out.printf("%4d", twoDimensional[i][j]);
            }
            System.out.println();
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int min = 0;
        int max = 0;
        int[] minMaxArr = {0, 50, 41, 23, 69, 77, 10, 65464, -4654, 1255, 8989, 50056, 123, 94, -465, -4654, -845645, 65012};
        for (int i = 0; i < minMaxArr.length; i++) {
            if (minMaxArr[i] <= min) {
                min = minMaxArr[i];
            }
            if (minMaxArr[i] >= max) {
                max = minMaxArr[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);

        int[] checkArr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(checkArr));
        shiftArray(checkArr, 1);
    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBalance(int[] array){
        int leftSum = 0;
        for(int i = 0; i < array.length; i++){
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                rightSum += (j > i)? array[j] : 0;
            }
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }

    //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.
    public static void shiftArray(int[] arr, int n) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("(n = " + n + ") ");
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
