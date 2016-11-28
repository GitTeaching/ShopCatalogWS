package org.soa.ws.tp3;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "org.soa.ws.tp3.ShopCatalog")
public class ShopCatalogImpl implements ShopCatalog{
	
	private ArrayList<Product> products;
	
	public ShopCatalogImpl() {
		products = new ArrayList<Product>();
		products.add(new Product("prodB1","Books", 100));
		products.add(new Product("prodM2","Magazines", 200));
		products.add(new Product("prodM3","CD Music", 300));
		products.add(new Product("prodB4","Vinyl", 150));
	}

	@Override
	@WebMethod
	public boolean addProduct(String id, String categ, double prix) {
		Product p = new Product(id, categ, prix);
		return products.add(p);
	}

	@Override
	@WebMethod
	public ArrayList<Product> getProducts() {
		return products;
	}

	@Override
	@WebMethod
	public Product getProductById(String id) {
		for(int i=0; i<products.size();i++)
			if(id.equals(products.get(i).getId()))
				return products.get(i);
		return null;
	}

}
