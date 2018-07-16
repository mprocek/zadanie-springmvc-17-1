package procek.marek.productlist;

public class Product {
    private String name;
    private int price;
    private ProductCategory productCategory;

    public Product(String name, int price, ProductCategory productCategory) {
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return name + " ," + price + " ," + productCategory ;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }
}
