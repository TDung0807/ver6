package trdung.repository;

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

}
