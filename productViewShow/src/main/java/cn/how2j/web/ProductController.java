package cn.how2j.web;
import java.util.List;

import cn.how2j.pojo.Product;
import cn.how2j.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


 
@Controller
@RefreshScope
public class ProductController {
 
	@Autowired
    ProductService productService;

    @Value("${version}")
    String version;
	
    @RequestMapping("/products")
    public Object products(Model m) {
    	List<Product> ps = productService.listProducts();
    	m.addAttribute("ps", ps);
        m.addAttribute("version", version);
        return "products";
    }
}