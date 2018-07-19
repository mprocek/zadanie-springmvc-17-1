package procek.marek.productlist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private ProductRepository productRepository;
    private Product newProduct = new Product();

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String menu(Model model){
        ProductCategory[] productCategory = ProductCategory.values();
        model.addAttribute("productList", productCategory);
        return "menu";
    }

    @ResponseBody
    @GetMapping("/list")
    public String products(@RequestParam(value = "kategoria",required = false) ProductCategory productCategory){
        return productRepository.getProduct(productCategory);
    }

    @GetMapping("/add")
    public String addProductFrom(Model model){
        model.addAttribute("product", newProduct);
        return "addProduct";
    }

    @PostMapping("/return")
    public String addProduct(){
        productRepository.addProduct(newProduct);
        return "redirect:/";
    }
}
