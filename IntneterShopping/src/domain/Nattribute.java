package domain;

import java.util.HashSet;
import java.util.Set;

public class Nattribute {
	private Integer nattribute_id;//属性名编号
	private String nattribute_name;//属性名称
	//属于某个classification
	private Classification classification;
	//有多个vattibute
	private Set<Vattribute> vattributes=new HashSet<Vattribute>();
	
	/**
	 * @return the vattributes
	 */
	public Set<Vattribute> getVattributes() {
		return vattributes;
	}
	/**
	 * @param vattributes the vattributes to set
	 */
	public void setVattributes(Set<Vattribute> vattributes) {
		this.vattributes = vattributes;
	}
	/**
	 * @return the classification
	 */
	public Classification getClassification() {
		return classification;
	}
	/**
	 * @param classification the classification to set
	 */
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	public Integer getNattribute_id() {
		return nattribute_id;
	}
	public void setNattribute_id(Integer nattribute_id) {
		this.nattribute_id = nattribute_id;
	}
	public String getNattribute_name() {
		return nattribute_name;
	}
	public void setNattribute_name(String nattribute_name) {
		this.nattribute_name = nattribute_name;
	}
}
