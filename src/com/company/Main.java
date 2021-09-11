package com.company;
import java.util.Scanner;
//Важно читать в чем ошибка именно на английском.
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] daysInMonth = new int [12]; // Тип[] Название_массива = new Тип [Размер массива]
        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;

        //int march = daysInMonth[2]; // Вывод значения 2 элемента массива
        //System.out.println("Дней в марте: " + march);

        // for(int i = 0; i < 12; i++) - это простой вывод всех элементов массива
        //Однако лучше использовать второй способ, тк при увеличении размеров
        //массива не придется ничего менять в коде.

        //for(int i = 0; i < daysInMonth.length; i++){
        //    System.out.println(daysInMonth[i]);
        //}

        int[] nums = new int[100]; // Массив с 100 элементов
        for(int i = 0; i < nums.length; i++){ // Цикл Автозаполнения массива с шагом в 10
            nums[i] = i * 10;
        }
        //for(int i = 0; i < nums.length; i++){ // Цикл вывода значений массива
        //    System.out.println(nums[i]);
        //}


        //for (int i : nums){ // Цикл "for each" - для каждого не обращается к индексам массива, однако не пускает какие-либо изменения
        //    System.out.println(i); // Плюс этого цикла в том, что невозможно выйти за пределы массива
        //}



        // Задачка на вывод элементов массивов от 100 до 1000,
        // Первый массив инициализирует элементы самостоятельно,
        // а второй массив должен брать элементы из первого массива
        // и выводить их в обратном порядке.
        int[] num = new int [1000];
        int[] num2 = new int[1000];
        for(int i = 100; i < num.length; i++){
            num[i] = i;
            System.out.println(num[i]);
        }
        for(int i = 100, j = 999; i < num.length; i++, j--){
            num2[i] = num[j];
            System.out.println(num2[i]);



        }
    }
}