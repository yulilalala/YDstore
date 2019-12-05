package domain;

public class Order_product {
	
	private Integer id;//编号
	private String sku_username;//商品名称
	private Integer sku_num;//商品数量
	private Double price;//商品价格
	//属于某个order
	private Order order;
	//属于某个shop
	private Shop shop;
	//关联spu
	private Spu spu;
	//关联SKU
	private Sku sku;
	
	public Sku getSku() {
		return sku;
	}
	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public Spu getSpu() {
		return spu;
	}
	public void setSpu(Spu spu) {
		this.spu = spu;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSku_username() {
		return sku_username;
	}
	public void setSku_username(String sku_username) {
		this.sku_username = sku_username;
	}
	public Integer getSku_num() {
		return sku_num;
	}
	public void setSku_num(Integer sku_num) {
		this.sku_num = sku_num;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
