package trdung.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import trdung.model.*;
import trdung.repository.accountRepo;
import trdung.repository.productRepo;
import trdung.repository.productServiceImpl;

@Controller
public class testController {
	
	@Autowired
	private accountRepo accRepo;
	@Autowired
	private productRepo prdRepo;
	@Autowired 
	productServiceImpl prdService;
	public account createAcc(account acc) {
		return accRepo.save(acc);
	}
	public List<account> getAllAccount(){
		return accRepo.findAll();
	}
	
	
	 @RequestMapping(value="/home", method = RequestMethod.GET)
	    public String home(Model model) {
		 	List<Product> list = prdRepo.findAll();
		 	System.out.println("Get ne");
		 	model.addAttribute("list_prd",list);
		 
	        return "index";
	    }
	 @RequestMapping(value="/home", method = RequestMethod.POST)
	    public String search(Model model,@RequestParam(name = "idSearch") String params) {
		 	
		 	List<Product> list = prdService.getAllPrdContain(params);
		 	model.addAttribute("list_prd",list);
		 
	        return "index";
	    }
	 @RequestMapping(value="/cart", method = RequestMethod.GET)
	    public String cart(Model model) {
		 
	        return "cart";
	    }
}