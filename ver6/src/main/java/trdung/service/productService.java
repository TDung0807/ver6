package trdung.service;

import java.util.List;

import trdung.model.Product;

public interface productService {
	public List<Product> getAllPrd();
	public List<Product> getAllPrdContain(String key);
}
