package domain;

import java.util.HashSet;
import java.util.Set;

public class Vattribute {
	private Integer vattribute_id;//属性值编号
	private String vattribute_value;//属性值
	//属于某个nattribute
	private Nattribute nattribute;
	//关联sku
	private Set<Sku> skus=new HashSet<>();
	
	/**
	 * @return the skus
	 */
	public Set<Sku> getSkus() {
		return skus;
	}
	/**
	 * @param skus the skus to set
	 */
	public void setSkus(Set<Sku> skus) {
		this.skus = skus;
	}
	/**
	 * @return the nattribute
	 */
	public Nattribute getNattribute() {
		return nattribute;
	}
	/**
	 * @param nattribute the nattribute to set
	 */
	public void setNattribute(Nattribute nattribute) {
		this.nattribute = nattribute;
	}
	public Integer getVattribute_id() {
		return vattribute_id;
	}
	public void setVattribute_id(Integer vattribute_id) {
		this.vattribute_id = vattribute_id;
	}
	public String getVattribute_value() {
		return vattribute_value;
	}
	public void setVattribute_value(String vattribute_value) {
		this.vattribute_value = vattribute_value;
	}
}
