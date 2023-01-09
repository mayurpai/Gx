package day_5;

// Model Class - POJO (Plain Old Java Objects)
public class ProductException {
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

	public ProductException(int productID, String productName, int quantityOnHand, int price) {
		super();
		this.productID = productID;
		this.productName = productName;
		if (quantityOnHand < 0) {
			throw new NegativeQohException("Quantity Cannot Be Negative");
		}
		this.quantityOnHand = quantityOnHand;
		if (price < 0) {
			throw new NegativePriceException("Price Cannot Be Negative");
		}
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

	public static void main(String[] args) {
		System.out.println("Product");
	}

}
