/*
Ќапишите программу, в которой пользователю предлагаетс€ ввести название дн€ недели. 
ѕо введенному названию программа определ€ет пор€дковый номер дн€ в неделе. 
≈сли пользователь вводит неправильное название дн€, программа выводит сообщение о том, что такого дн€ нет. 
ѕредложите версию программы на основе вложенных условных операторов и на основе оператора выбора switch. 
 */
package Exam2;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
        System.out.println("¬ведите день недели(кириллица, нижний регистр)");
        String day = id.nextLine(); 
		
        WeekDay.IfMethod(day);
        WeekDay.SwitchMethod(day);
    
	}
}

