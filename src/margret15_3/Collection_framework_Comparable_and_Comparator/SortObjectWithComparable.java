package margret15_3.Collection_framework_Comparable_and_Comparator;

public class SortObjectWithComparable implements Comparable<SortObjectWithComparable> {
	private String fruitName;
	private String fruitDesc;
	private int quantity;
	public SortObjectWithComparable(String fruitName, String fruitDesc,
			int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int compareTo(SortObjectWithComparable o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
