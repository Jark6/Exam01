/*
Напишите программу, в которой создается двумерный числовой массив и этот массив заполняется «змейкой»:
сначала первая строка (слева направо),
затем последний столбец (снизу вверх),
вторая строка (слева направо)
и так далее.
 */
package Exam16;
import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);// Создание объекта класса Scanner
        System.out.print("введите количество строк массива: ");
        int a =id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int Zmeyka[][] = new int[a][b]; // создание массива
        int hvost = 0; //переменная для подсчета использованных значений
        int telo = 0; //переменная для заполнения элементов массива
        int h = 0;//вспомогательная переменная для подсчета строк
        for (int i = 0 ; h <Zmeyka.length ; h++) {
            for (int j = 0 ; j <(Zmeyka[i].length - hvost); j++) {//заполнение верхней строки массива слева-направо
                Zmeyka[i][j] = telo;
                telo++;
            }
            if(i<Zmeyka.length-1) {
                i++;}
            for (int k = Zmeyka[i].length-1; k > hvost; k--) {//заполнение правого столбца массива сверху-вниз
                Zmeyka[k][Zmeyka[i].length-1-hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int z = 0;//вспомогательная переменная для подсчета символов в строке
        for (int i =0; i < Zmeyka.length; i++){//печать массива
            int count = i+1;//переменная для повышения номера индекса для вывода на консоль
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j <Zmeyka[i].length; j++){
                System.out.print(Zmeyka[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0; //обнуление счетчика символов
        }
    }
}
