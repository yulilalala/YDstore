package domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {
	
	private Integer order_id;//订单编号
	private Date order_dates;//下单日期
	private Date pay_date;//支付日期
	private Integer condition;//交付状态
	private Double freight;//运费
	private Double order_totalmoney;//订单总额
	private Double guarantee_money;//应付金额
	//属于某个用户
	private User user;
	//关联shop
	private Shop shop;
	//有多个商品
	private Set<Order_product> order_products=new HashSet<Order_product>();
	
	public Set<Order_product> getOrder_products() {
		return order_products;
	}
	public void setOrder_products(Set<Order_product> order_products) {
		this.order_products = order_products;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Date getOrder_dates() {
		return order_dates;
	}
	public void setOrder_dates(Date order_dates) {
		this.order_dates = order_dates;
	}
	public Date getPay_date() {
		return pay_date;
	}
	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}
	public Integer getCondition() {
		return condition;
	}
	public void setCondition(Integer condition) {
		this.condition = condition;
	}
	public Double getFreight() {
		return freight;
	}
	public void setFreight(Double freight) {
		this.freight = freight;
	}
	public Double getOrder_totalmoney() {
		return order_totalmoney;
	}
	public void setOrder_totalmoney(Double order_totalmoney) {
		this.order_totalmoney = order_totalmoney;
	}
	public Double getGuarantee_money() {
		return guarantee_money;
	}
	public void setGuarantee_money(Double guarantee_money) {
		this.guarantee_money = guarantee_money;
	}
	
}
