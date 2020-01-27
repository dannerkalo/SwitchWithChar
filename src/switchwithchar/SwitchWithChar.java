package switchwithchar;

public class SwitchWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// swithWithChar('a');
		// printDaysOfTheWeek(3);
		//printDaysOfTheWeekWithIf(0);
		for(int x = 0; x <= 10; x++) {
			printNumberinWord(x);
		}
	}
	
	
	 public static void printNumberinWord(int number){
	        switch(number){
	            case 0:
	                System.out.println("ZERO");
	                break;
	                  case 1:
	                System.out.println("ONE");
	                break;
	                 case 2:
	                System.out.println("TWO");
	                break;
	                 case 3:
	                System.out.println("THREE");
	                break;
	                 case 4:
	                System.out.println("FOUR");
	                break;
	                 case 5:
	                System.out.println("FIVE");
	                break;
	                 case 6:
	                System.out.println("SIX");
	                break;
	                 case 7:
	                System.out.println("SEVEN");
	                break;
	                 case 8:
	                System.out.println("EIGHT");
	                break;
	                 case 9:
	                System.out.println("NINE");
	                break;
	                default:
	                System.out.println("OTHER");
	                break;
	        }
	    }
	 

	public static void printDaysOfTheWeek(int days) {

		switch (days) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Thusday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saterday");
			break;
		default:
			System.out.println(
					"Unkown day of the week. Week days start from 0-6 and intotal there are 7 days in one week.");
		}
	}

	public static void printDaysOfTheWeekWithIf(int days) {

		if (days == 0) {
			System.out.println("Sunday");
		} else if (days == 1) {
			System.out.println("Monday");

		} else if (days == 2) {
			System.out.println("Thusday");
		} else if (days == 3) {
			System.out.println("Wednesday");
		} else if (days == 4) {
			System.out.println("Thursday");
		} else if (days == 5) {
			System.out.println("Friday");
		} else if (days == 6) {
			System.out.println("Saterday");

		} else if (days < 0 || days > 6) {
			System.out.println(
					"Unkown day of the week. Week days start from 0-6 and intotal there are 7 days in one week.");
		}

	}

	// Swith witha char value
	public static void swithWithChar(char x) {
		// char abcde = 'E';

		switch (x) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
		case 'c':
		case 'd':
		case 'e':
			System.out.println(x + " Was found.");
			break;
		default:
			System.out.println("Unknown letter");
			break;
		}
	}

}
