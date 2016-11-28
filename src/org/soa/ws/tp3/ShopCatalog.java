package org.soa.ws.tp3;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name="CatalogMagasin")
public interface ShopCatalog {
	
	@WebMethod
	public boolean addProduct(String id, String categ, double prix);
	
	@WebMethod(operationName="tousLesProduits")
	public ArrayList<Product> getProducts();
	
	@WebMethod
	@WebResult(name="produitRetourné")
	public Product getProductById(@WebParam(name="produitID") String id);

}
