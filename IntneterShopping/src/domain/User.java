package domain;

import java.util.HashSet;
import java.util.Set;

public class User {
	private Integer user_id;//用户编号
	private String user_password;//密码
	private String user_name;//姓名
	private String user_nickname;//昵称
	private Integer user_types;//用户类型:1普通用户，2会员，3管理员
	private Byte user_sex;//性别:0女，1男
	private String user_address;//联系地址
	private String user_phone;//联系电话
	private String user_regdate;//注册日期
	//关联member
	private Member member;
	//有多个订单
	private Set<Order> orders;
	//关联order_cart
	private Order_cart order_cart;
	
	public Order_cart getOrder_cart() {
		return order_cart;
	}
	public void setOrder_cart(Order_cart order_cart) {
		this.order_cart = order_cart;
	}
	public Set<Order> getOrders() {
		return orders;
	}
	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public Integer getUser_types() {
		return user_types;
	}
	public void setUser_types(Integer user_types) {
		this.user_types = user_types;
	}
	public Byte getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(Byte user_sex) {
		this.user_sex = user_sex;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_regdate() {
		return user_regdate;
	}
	public void setUser_regdate(String date) {
		this.user_regdate = date;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_password=" + user_password + ", user_name=" + user_name
				+ ", user_nickname=" + user_nickname + ", user_types=" + user_types + ", user_sex=" + user_sex
				+ ", user_address=" + user_address + ", user_phone=" + user_phone + ", user_regdate=" + user_regdate
				+ "]";
	}
	
}
