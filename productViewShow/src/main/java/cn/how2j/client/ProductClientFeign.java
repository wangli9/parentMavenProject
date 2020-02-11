package cn.how2j.client;

import java.util.List;

import cn.how2j.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "PRODUCTDATESERVICE")
public interface ProductClientFeign {

	@GetMapping("/products")
	public List<Product> listProdcuts();
}
