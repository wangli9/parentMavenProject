package cn.how2j.web;

import cn.how2j.bean.Product;
import cn.how2j.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {
 
	@Autowired
    ProductService productService;

    @RequestMapping("/products")
    @ResponseBody
    public Object products() {
    	List<Product> ps = productService.listProducts();
        return ps;
    }
}