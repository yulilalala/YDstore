package domain;

import java.util.HashSet;
import java.util.Set;

public class Shop {
	private Integer shop_id;//商店ID
	private String shop_name;//商店名
	//有多个sku
	private Set<Sku> skus=new HashSet<Sku>();
	//关联order
	private Order order;
	//有多个order_product
	private Set<Order_product> order_products=new HashSet<Order_product>();
	//关联order_cart
	private Order_cart order_cart;
	
	public Order_cart getOrder_cart() {
		return order_cart;
	}
	public void setOrder_cart(Order_cart order_cart) {
		this.order_cart = order_cart;
	}
	public Set<Order_product> getOrder_products() {
		return order_products;
	}
	public void setOrder_products(Set<Order_product> order_products) {
		this.order_products = order_products;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Set<Sku> getSkus() {
		return skus;
	}
	public void setSkus(Set<Sku> skus) {
		this.skus = skus;
	}
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
}
