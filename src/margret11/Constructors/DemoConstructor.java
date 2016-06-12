package margret11.Constructors;

public class DemoConstructor {
	DemoConstructor(int l ,int w)
	{
		System.out.println(l * w);
	}
	void m()
	{
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		DemoConstructor dc = new DemoConstructor(4, 4);
		dc.m();
	}
}
