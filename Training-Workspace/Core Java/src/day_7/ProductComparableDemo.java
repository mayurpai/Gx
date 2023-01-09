package day_7;

// Comparable Is An Interface Used To Compare 2 Objects

// Comparable - java.lang: compareTo();
// Comparator - java.util: compare(objectOne, objectTwo)

public class ProductComparableDemo implements Comparable<ProductComparableDemo> {
	private int productID;
	private String productName;
	private int quantityOnHand;
	private int price;

	public int getProductID() {
		return productID;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", price=" + price + "]";
	}

	public ProductComparableDemo(int productID, String productName, int quantityOnHand, int price) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.price = price;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(ProductComparableDemo pcd) {
		if (this.quantityOnHand > pcd.quantityOnHand)
			return 0;
		else
			return -1;

	}

	public static void main(String[] args) {
		System.out.println("Product");
	}

}
