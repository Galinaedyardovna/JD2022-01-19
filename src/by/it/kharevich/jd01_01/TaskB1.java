package by.it.kharevich.jd01_01;

/*
Выводим квадрат числа
Напишите программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.

Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Прочитать число можно так:
int i=sc.nextInt();

Требования:
1. Программа должна выводить текст.
2. В программе необходимо создать объект типа Scanner.
3. Программа должна считывать число типа Int с клавиатуры.
4. Программа должна выводить квадрат считанного числа.

 */

import java.util.Scanner;

class TaskB1 {

    public static void main(String[] args){
        System.out.println("Введите число, которое хотите возвести в квадрат");{
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=2;
            System.out.println(Math.pow(a, b));
        }






    }
}
