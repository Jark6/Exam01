/*
�������� ���������, � ������� ������������ ������������ ������ �������� ��� ������. 
�� ���������� �������� ��������� ���������� ���������� ����� ��� � ������. 
���� ������������ ������ ������������ �������� ���, ��������� ������� ��������� � ���, ��� ������ ��� ���. 
���������� ������ ��������� �� ������ ��������� �������� ���������� � �� ������ ��������� ������ switch. 
 */
package Exam2;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
        System.out.println("������� ���� ������(���������, ������ �������)");
        String day = id.nextLine(); 
		
        WeekDay.IfMethod(day);
        WeekDay.SwitchMethod(day);
    
	}
}

