package procek.marek.productlist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @RequestMapping("/")
    public String startpage(){
        return "startpage.html";
    }

    @ResponseBody
    @RequestMapping("/list")
    public String products(){
        return productRepository.getProduct();
    }

    @ResponseBody
    @GetMapping("/groceries")
    public String productsGroceries(@RequestParam String category){
        return productRepository.getProductCategory(ProductCategory.valueOf(category));
    }

    @ResponseBody
    @RequestMapping("/household")
    public String productsHousehold(@RequestParam String category){
        return productRepository.getProductCategory(ProductCategory.valueOf(category));
    }

    @ResponseBody
    @RequestMapping("/other")
    public String productsOther(@RequestParam String category){
        return productRepository.getProductCategory(ProductCategory.valueOf(category));
    }


}
