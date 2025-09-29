package in.sandeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sandeep.binding.Product;

@Controller
public class ProductController {

	//Display form
	@GetMapping("/")
	public String LoadForm(Model model)
	{
	model.addAttribute("product", new Product());
		return "index";
	}
	
	//Add the Foelds
	@PostMapping("/product")
	public String submitBtn(Model model, Product p){
		System.out.println(p);
		model.addAttribute("msg","Product saved");
		return "index";
	}
	
}
