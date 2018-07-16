package procek.marek.productlist;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public ProductRepository(){
        this.productList.add(new Product("Chleb żytni",6,ProductCategory.GROCERIES));
        this.productList.add(new Product("Bounty",3,ProductCategory.GROCERIES));
        this.productList.add(new Product("Kret",8,ProductCategory.HOUSEHOLD));
        this.productList.add(new Product("Róże",14,ProductCategory.OTHER));
    }

    public String getProduct(){
        String result = "";
        int sumPrice = 0;

        for (Product prod:productList){
            result+=prod.toString() + "<br/>";
            sumPrice+=prod.getPrice();
        }


        return result + "<br/>" + "Suma cen produktow to " + sumPrice;
    }

    public String getProductCategory(ProductCategory productCat){
        String result="";
        for (Product prod:productList){
            if(prod.getProductCategory().equals(productCat)){
                result+=prod.toString() + "<br/>";
            }
        }
        return result;
    }
}
