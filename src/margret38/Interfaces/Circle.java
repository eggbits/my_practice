package margret38.Interfaces;

public class Circle implements Comparable<Circle>{
	private double radius;
	public Circle(double r)
	{
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String toString()
	{
		return "c:"+ radius;

	}
	@Override
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
