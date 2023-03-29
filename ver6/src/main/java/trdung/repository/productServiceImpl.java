package trdung.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import trdung.model.Product;
import trdung.service.productService;
@Controller
public class productServiceImpl implements productService {

	@Autowired
	private productRepo prdRepo;
	
	@Override
	public List<Product> getAllPrd() {
		// TODO Auto-generated method stub
		return prdRepo.findAll();
	}

	@Override
	public List<Product> getAllPrdContain(String key) {
		// TODO Auto-generated method stub
		List<Product> result = new ArrayList<Product>();
		for(Product i:getAllPrd()) {
			System.out.println(i.getName());
			if(i.getName().toLowerCase().contains(key.toLowerCase())) {
				result.add(i);
			}
				
		}
		return result;
	}
}
