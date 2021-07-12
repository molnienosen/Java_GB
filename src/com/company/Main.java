package com.company;

public class Main {

    public static void main(String[] args) {
        allVal();
        float first = desk(12.5F, 33.4F, 41.2F, 22.1F);
        System.out.println(first);
        boolean result4 = sumBetween10and20(5, 4);
        System.out.println(result4);
        positiveOrNot(-5);
        System.out.println(positiveOrNotBoolean(10));
        helloName("Александр");
        leapYearOrNo(400);
    }

    //2. Создание и иницилизация переменных всех типов
    public static void allVal() {
        byte byteVal = 125;
        short shortVal = 32000;
        int intVal = 125000;
        long longVal = 95640322;
        float floatVal = 12.23f;
        double doubleVal = 17.50;
        char charVal = 'Ú';
        boolean booleanVal = false;
        String stringVal = "Hello home work!";
        System.out.println("byteVal= " + byteVal);
        System.out.println("shortVal= " + shortVal);
        System.out.println("intVal= " + intVal);
        System.out.println("longVal= " + longVal);
        System.out.println("byteVal= " + byteVal);
        System.out.println("longVal= " + floatVal);
        System.out.println("doubleVal= " + doubleVal);
        System.out.println("chatVal = " + charVal);
        System.out.println("booleanVal= " + booleanVal);
        System.out.println("stringVal= " + stringVal);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static float desk(float a, float b, float c, float d) {
        float x;
        x = a * (b + (c / d));
        return x;
    }

    //4. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean sumBetween10and20(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void positiveOrNot(int a) {
        if (a >= 0) {
            System.out.println(a + " Является положительным числом!");
        } else System.out.println(a + " Является отрицалтельным числом!");
    }

    //6. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean positiveOrNotBoolean(int a) {
        return a < 0;
    }

    //7. Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void helloName(String name) {
        System.out.println("Привет, " + name);
    }

    //8. *Написать метод, который определяет, является ли год високосным,
    // и выводит сообщение в консоль. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void leapYearOrNo(int year) {
        if (year % 4 == 0 && year % 100 != 0 || (year & 400) == 0) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " Год является високосным!");
            } else System.out.println(year + " Год не является вискосным!");
        }
    }
}