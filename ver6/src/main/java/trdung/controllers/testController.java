package trdung.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import trdung.model.*;
import trdung.repository.accountRepo;
import trdung.repository.productRepo;

@Controller
public class testController {
	
	@Autowired
	private accountRepo accRepo;
	@Autowired
	private productRepo prdRepo;
	public account createAcc(account acc) {
		return accRepo.save(acc);
	}
	public List<account> getAllAccount(){
		return accRepo.findAll();
	}
	
	
	 @GetMapping("/home")
	    public String home(Model model) {
		 	List<Product> list = prdRepo.findAll();
		 	model.addAttribute("list_prd",list);
		 
	        return "index";
	    }
	 @GetMapping("/accounts")
	 public List<account> getAll(){
		 return accRepo.findAll();
	 }
}