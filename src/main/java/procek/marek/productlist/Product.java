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

    public Product() {
    }

    @Override
    public String toString() {
        return name + " ," + price + " ," + productCategory;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
}
