package domain;

import java.util.HashSet;
import java.util.Set;

public class Brand {
	private Integer brand_id;//品牌ID
	private String brand_name;//品牌名
	//有多个Spu
	private Set<Spu> spus=new HashSet<Spu>();
	
	/**
	 * @return the spus
	 */
	public Set<Spu> getSpus() {
		return spus;
	}
	/**
	 * @param spus the spus to set
	 */
	public void setSpus(Set<Spu> spus) {
		this.spus = spus;
	}
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
}
