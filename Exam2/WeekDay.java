package Exam2;

public class WeekDay {
	
	static void IfMethod(String d) {
		String day = d; 
		System.out.println("������ ��������� �� ������ ��������� �������� ����������");
     int dayN = 0;
         if (day == "�����������") {
             dayN = 1;
             if (day == "�������") {
                 dayN = 2;
                 if (day == "�����") {
                     dayN = 3;
                     if (day == "�������") {
                         dayN = 4;
                         if (day == "�������") {
                             dayN = 5;
                             if (day == "�������") {
                                 dayN = 6;
                                 if (day == "�����������") {
                                     dayN = 7;
                                 }
                                 else {
                                     System.out.println(day + " ������������ �������� ��� ������");
                                 }

                             }
                         }
                     }
                 }
             }
         }
         System.out.printf("%s ��� %i-� ���� ������" ,day ,dayN);
	}
	
	static void SwitchMethod(String d) {
		System.out.println("������ ��������� �� ������ ��������� ������ switch");
		String day = d;    
		switch(day)
	        {
	            case "�����������":
	                System.out.println(day + " ��� 1-�� ���� ������");
	                break; 
	            case "�������":
	                System.out.println(day + " ��� 2-�� ���� ������");
	                break;
	            case "�����":
	                System.out.println(day + " ��� 3-�� ���� ������");
	                break; 
	            case "�������":
	                System.out.println(day + " ��� 4-�� ���� ������");
	                break; 
	            case "�������":
	                System.out.println(day + " ��� 5-�� ���� ������");
	                break; 
	            case "�������":
	                System.out.println(day + " ��� 6-�� ���� ������");
	                break; 
	            case "�����������":
	                System.out.println(day + " ��� 7-�� ���� ������");
	                break; 
	            default: 
	                System.out.println(day + " ������������ �������� ��� ������");
	                break; 
	        }
	}

}
