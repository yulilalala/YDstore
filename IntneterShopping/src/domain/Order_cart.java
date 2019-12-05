package domain;

public class Order_cart {

	private Integer id;//编号
	private String sku_name;//商品名
	private Integer sku_num;//商品数量
	private Double price;//商品价格
	//关联User
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	//关联shop
	private Shop shop;
	//关联sku
	private Sku sku;
	//关联SPU
	private Spu spu;
	
	public Spu getSpu() {
		return spu;
	}
	public void setSpu(Spu spu) {
		this.spu = spu;
	}
	public Sku getSku() {
		return sku;
	}
	public void setSku(Sku sku) {
		this.sku = sku;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSku_name() {
		return sku_name;
	}
	public void setSku_name(String sku_name) {
		this.sku_name = sku_name;
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
