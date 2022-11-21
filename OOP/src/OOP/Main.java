package OOP;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram", 10, 14400);// refereans olu�turma

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("lenovo v15");
		product2.setDetail("16 GB Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
        
		ProductManager productmanager = new ProductManager();

		productmanager.addToCart(product1);
		productmanager.addToCart(product2);

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("i�ecek");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("yiyecek");
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		

	}
}
