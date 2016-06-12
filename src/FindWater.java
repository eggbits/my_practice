
import java.util.ArrayList;

public class FindWater {
	
	static int waterQuantity;
	static int start = 0;
	static int end;
	static ArrayList<Integer> b = new ArrayList<Integer>();
	
	
	public static void main(String[] args) {
		b.add(4);b.add(6);b.add(3);b.add(2);b.add(8);b.add(5);b.add(1);b.add(8);
		//b.add(5);b.add(0);b.add(0);b.add(5);b.add(1);b.add(6);
		//b.add(5);b.add(3);b.add(1);b.add(2);b.add(8);
		
		for(int i=0;i<b.size();i++){
			if(b.get(i)<b.get(i+1))
				b.remove(i);
			else
				break;
			if(b.size()==1)
				System.out.println("No water saved oops");
		}
		System.out.println("the array after inital removal is "+b);
		//iterate();
		System.out.println("the water quantity is "+iterate(start,end));
	}
	
	private static int iterate(int start,int end){
		
		for(int i=start+1;i<b.size();i++){
			if(b.get(i)>b.get(0)){
				end = i;
				//System.out.println(start+" ::: "+end);
				waterQuantity += (b.get(start)*(end-start-1))-calSum(start,end);
				break;
			}
		}
		
		
		//System.out.println("start "+start+" end "+end);
		start = end;
		//System.out.println("start "+start+" end "+end);
		
		if(end == b.size()-1)
			return waterQuantity;
		else
			iterate(start,end);
		
		return waterQuantity;
	}

	private static int calSum(int start, int end) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i = start+1;i<end;i++){
			System.out.println("&&&"+i);
			sum+=b.get(i);
		}
		System.out.println("the water bw buildings "+start+" and "+end+" is "+sum);
		return sum;
		
	}

}
