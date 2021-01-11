package Exam2;

public class WeekDay {
	
	static void IfMethod(String d) {
		String day = d; 
		System.out.println("версия программы на основе вложенных условных операторов");
     int dayN = 0;
         if (day == "понедельник") {
             dayN = 1;
             if (day == "вторник") {
                 dayN = 2;
                 if (day == "среда") {
                     dayN = 3;
                     if (day == "четверг") {
                         dayN = 4;
                         if (day == "пятница") {
                             dayN = 5;
                             if (day == "суббота") {
                                 dayN = 6;
                                 if (day == "воскресенье") {
                                     dayN = 7;
                                 }
                                 else {
                                     System.out.println(day + " некорректное значение дня недели");
                                 }

                             }
                         }
                     }
                 }
             }
         }
         System.out.printf("%s это %i-й день недели" ,day ,dayN);
	}
	
	static void SwitchMethod(String d) {
		System.out.println("версия программы на основе оператора выбора switch");
		String day = d;    
		switch(day)
	        {
	            case "понедельник":
	                System.out.println(day + " это 1-ый день недели");
	                break; 
	            case "вторник":
	                System.out.println(day + " это 2-ой день недели");
	                break;
	            case "среда":
	                System.out.println(day + " это 3-ий день недели");
	                break; 
	            case "четверг":
	                System.out.println(day + " это 4-ый день недели");
	                break; 
	            case "пятница":
	                System.out.println(day + " это 5-ый день недели");
	                break; 
	            case "суббота":
	                System.out.println(day + " это 6-ой день недели");
	                break; 
	            case "воскресенье":
	                System.out.println(day + " это 7-ой день недели");
	                break; 
	            default: 
	                System.out.println(day + " некорректное значение дня недели");
	                break; 
	        }
	}

}
