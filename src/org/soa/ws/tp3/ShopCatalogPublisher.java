package org.soa.ws.tp3;

import javax.xml.ws.Endpoint;

public class ShopCatalogPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/shopcatalogws", new ShopCatalogImpl());
	}

}
