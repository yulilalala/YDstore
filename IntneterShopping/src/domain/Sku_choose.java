package domain;

public class Sku_choose {
	private Integer sku_choose_id;//SKU属性选项编号
	private Integer sku_id;//SKU编号
	private String vattribute_value;//属性值
	private Integer nattribute_id;//属性名ID
	public Integer getSku_id() {
		return sku_id;
	}
	public void setSku_id(Integer sku_id) {
		this.sku_id = sku_id;
	}
	public String getVattribute_value() {
		return vattribute_value;
	}
	public void setVattribute_value(String vattribute_value) {
		this.vattribute_value = vattribute_value;
	}
	public Integer getNattribute_id() {
		return nattribute_id;
	}
	public void setNattribute_id(Integer nattribute_id) {
		this.nattribute_id = nattribute_id;
	}
	public Integer getSku_choose_id() {
		return sku_choose_id;
	}
	public void setSku_choose_id(Integer sku_choose_id) {
		this.sku_choose_id = sku_choose_id;
	}
	
}
