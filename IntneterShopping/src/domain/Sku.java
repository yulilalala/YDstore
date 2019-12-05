package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Sku {
	private Integer sku_id;//SKU编号
	private String sku_name;//SKU名称
	private Double cprice;//成本价
	private Double price;//SKU价格
	private Integer stock;//数量
	private Date release_time;//上架时间
	private String main;//主图
	//属于某个Spu
	private Spu spu;
	//属于某个Shop
	private Shop shop;
	//关联Picture
	private Set<Picture> pictures=new HashSet<Picture>();
	//关联varribute
	private Set<Vattribute> vattributes=new HashSet<Vattribute>();
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
	public Set<Vattribute> getVattributes() {
		return vattributes;
	}
	public void setVattributes(Set<Vattribute> vattributes) {
		this.vattributes = vattributes;
	}
	public Set<Picture> getPictures() {
		return pictures;
	}
	public void setPictures(Set<Picture> pictures) {
		this.pictures = pictures;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Spu getSpu() {
		return spu;
	}
	public void setSpu(Spu spu) {
		this.spu = spu;
	}
	public Double getCprice() {
		return cprice;
	}
	public void setCprice(Double cprice) {
		this.cprice = cprice;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public Integer getSku_id() {
		return sku_id;
	}
	public void setSku_id(Integer sku_id) {
		this.sku_id = sku_id;
	}
	public String getSku_name() {
		return sku_name;
	}
	public void setSku_name(String sku_name) {
		this.sku_name = sku_name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Date getRelease_time() {
		return release_time;
	}
	public void setRelease_time(Date release_time) {
		this.release_time = release_time;
	}
	
}
