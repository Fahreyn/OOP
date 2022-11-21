package OOP;

// product ad�nda kendi veri tipimizi olu�turuyoruz
public class Product {
	// encapsulation
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;

	public Product() {

	}

	public Product(int id, String name, double unitPrice, String detail, double discount, double unitPriceAfterPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		//product clas�ndaki de�i�kenleri private tan�mlad���m�z i�in bu metodtaki de�i�kenleri this
		//anahtar kelimesini kullanarak private olan de�i�kenlere eri�meyi sa�l�yoruz.

	}
	// get yap�s�n� okumak i�in set yap�s�n� yazmak i�in kullan�yoruz.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {

		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}

}