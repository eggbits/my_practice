package margret18.Switch;

public class DemoSwitch {

	public static void main(String[] args) {
		char c = 'h'; // char c = 'x'; default executes
		switch(c)
		{
		case 'h':System.out.println("Hello");
		break;
		case 't':System.out.println("this");
		break;
		case 'w':System.out.println("works");
		break;
		default :System.out.println("have a great day");
		}
	}

}
