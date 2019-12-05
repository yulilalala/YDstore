package domain;

import java.sql.Date;

public class Curelation {
	private Integer curelation_id;//编号
	private Integer coupon_id;//优惠券编号
	private Date curelation_time;//优惠券领取时间
	private Integer user_id;//用户编号
	public Integer getCurelation_id() {
		return curelation_id;
	}
	public void setCurelation_id(Integer curelation_id) {
		this.curelation_id = curelation_id;
	}
	public Integer getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(Integer coupon_id) {
		this.coupon_id = coupon_id;
	}
	public Date getCurelation_time() {
		return curelation_time;
	}
	public void setCurelation_time(Date curelation_time) {
		this.curelation_time = curelation_time;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
}
