package in.sandeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.sandeep.binding.Product;
import jakarta.validation.Valid;

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
	public String submitBtn(@Valid Product p,BindingResult result,Model model){
		System.out.println(p);
		if(result.hasErrors()) {
			return "index";
		}else {
		model.addAttribute("msg","Product saved");
		
		}
		return "index";
		}
	
}
