package margret22.NestedLoops;

public class DemoNestedLoop {

	public static void main(String[] args) {
		pattern1();	
	}
	public static void pattern1()
	{
		for(int i = 0; i <= 5; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.println("o ");
			}
			for(int j = 0; j < 5-i; j++)
			{
				System.out.println(". ");
			}
			System.out.println();
		}
	}

}
