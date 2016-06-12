package margret15_2.Collection_framework_hashcode_and_equals;

import java.util.ArrayList;
import java.util.List;

public class ObjectEqualsAndHashCodeTest  {

	public static void main(String[] args) {
		Contact con1 = new Contact(278, "Hareesh", "961-882-0100");
		Contact con2 = new Contact(279, "Prasad", "998-531-9234");
		Contact con3 = con1;

		// == operator
		System.out.println("Are con1 and con2 equal? ===> " + (con1 == con2));
		System.out.println("Are con1 and con3 equal? ===> " + (con1 == con3));


		// equals method
		System.out.println("Are con1 and con2 equal? ===> " + (con1.equals(con2)));
		System.out.println("Are con1 and con3 equal? ===> " + (con1.equals(con3)));



		if(con1 == new Contact(278, "Hareesh", "961-882-0100"))
		{
			System.out.println("They are ==");	
		}
		else
		{
			System.out.println("They are not ==");
		}


		if(con1 == con3)
		{
			System.out.println("They are ==");	
		}
		else
		{
			System.out.println("They are not ==");
		}

		List<Contact> list = new ArrayList();
		list.add(con1);
		list.add(con2);

		if(list.contains(con1))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}

		if(list.contains(new Contact(278, "Hareesh", "961-882-0100")))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
