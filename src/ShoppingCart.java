
public class ShoppingCart {

	public static void main(String[] args) {
		Item itemOne = new Item();
		itemOne.setItemName("Laptop");
		itemOne.setItemPrice(-100);
	}
	
}

class Item {
	
	private String itemName;
	private int itemPrice;
		
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void setItemPrice(int itemPrice) {
		if(itemPrice <= 0) {			
			throw new IllegalArgumentException("Item price cannot be negative!");
		}else {
			this.itemPrice = itemPrice;
		}
	}
}