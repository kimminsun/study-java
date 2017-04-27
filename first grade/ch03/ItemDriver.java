class ItemDriver
{
	public static void main(String[] args) 
	{
		Item i1 = new Item("tv", 100000, 20);
		Item i2 = new Item("notebook", 500000, 30);

		i1.setQuantity(35);
		i2.setPrice(600000);

		System.out.println("제품명 : " + i1.getName() + " 가격 : " + i1.getPrice() + " 수량 : " + i1.getQuantity());
		System.out.println("제품명 : " + i2.getName() + " 가격 : " + i2.getPrice() + " 수량 : " + i2.getQuantity() + "\n");

		System.out.println(i1.getName() + " 매출 : " + i1.getSales());
		System.out.println(i2.getName() + " 매출 : " + i2.getSales());
	}
}

class Item
{
	private String name;
	private int price;
	private int quantity;

	public Item(String name, int price, int quantity){
		setName(name);
		setPrice(price);
		setQuantity(quantity);
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public int getSales(){
		return price * quantity;
	}
}