package domain;

public class Guarantee {
	private Integer guarantee_id;//增值保障编号
	private String guarantee_name;//增值名称
	private double guarantee_price;//保障价格
	public Integer getGuarantee_id() {
		return guarantee_id;
	}
	public void setGuarantee_id(Integer guarantee_id) {
		this.guarantee_id = guarantee_id;
	}
	public String getGuarantee_name() {
		return guarantee_name;
	}
	public void setGuarantee_name(String guarantee_name) {
		this.guarantee_name = guarantee_name;
	}
	public double getGuarantee_price() {
		return guarantee_price;
	}
	public void setGuarantee_price(double guarantee_price) {
		this.guarantee_price = guarantee_price;
	}
	
}
