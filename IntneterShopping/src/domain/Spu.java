package domain;

import java.util.HashSet;
import java.util.Set;

public class Spu {
	private Integer spu_id;//SPU编号
	private String spu_name;//SPU名称
	private String spu_details;//SPU描述
	//属于某个Classification
	private Classification classification;
	//属于某个Brand
	private Brand brand;
	//关联Specification
	private Set<Specification> specifications=new HashSet<Specification>();
	//有多个Sku
	private Set<Sku> skus=new HashSet<Sku>();
	//有多个picture
	private Set<Picture> pictures=new HashSet<Picture>();
	//关联order_product
	private Order_product order_product;
	//关联order_cart
	private Order_cart order_cart;
	
	public Order_cart getOrder_cart() {
		return order_cart;
	}
	public void setOrder_cart(Order_cart order_cart) {
		this.order_cart = order_cart;
	}
	public Order_product getOrder_product() {
		return order_product;
	}
	public void setOrder_product(Order_product order_product) {
		this.order_product = order_product;
	}	
	public Set<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(Set<Picture> pictures) {
		this.pictures = pictures;
	}
	public Set<Sku> getSkus() {
		return skus;
	}
	public void setSkus(Set<Sku> skus) {
		this.skus = skus;
	}
	public Set<Specification> getSpecifications() {
		return specifications;
	}
	public void setSpecifications(Set<Specification> specifications) {
		this.specifications = specifications;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Classification getClassification() {
		return classification;
	}
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	public Integer getSpu_id() {
		return spu_id;
	}
	public void setSpu_id(Integer spu_id) {
		this.spu_id = spu_id;
	}
	public String getSpu_name() {
		return spu_name;
	}
	public void setSpu_name(String spu_name) {
		this.spu_name = spu_name;
	}
	public String getSpu_details() {
		return spu_details;
	}
	public void setSpu_details(String spu_details) {
		this.spu_details = spu_details;
	}
}
