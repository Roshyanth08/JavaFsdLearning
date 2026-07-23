class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

public class ShoppingCart {

    private Product[] items = new Product[10]; // Maximum 10 products
    private int count = 0;

    public void addProduct(Product product) {

        if (count < items.length) {
            items[count] = product;
            count++;
            System.out.println(product.name + " added to cart.");
        } else {
            System.out.println("Cart is full!");
        }
    }
}