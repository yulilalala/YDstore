package domain;

import java.util.HashSet;
import java.util.Set;

public class Specification_group {
	private Integer specification_group_id;//规格组ID
	private String specification_group_name;//规格组名称
	//属于某个classification
	private Classification classification;
	//有多个Specification_options
	private Set<Specification_options> specification_options=new HashSet<Specification_options>();
	public Set<Specification_options> getSpecification_options() {
		return specification_options;
	}
	public void setSpecification_options(Set<Specification_options> specification_options) {
		this.specification_options = specification_options;
	}
	public Classification getClassification() {
		return classification;
	}
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	public Integer getSpecification_group_id() {
		return specification_group_id;
	}
	public void setSpecification_group_id(Integer specification_group_id) {
		this.specification_group_id = specification_group_id;
	}
	public String getSpecification_group_name() {
		return specification_group_name;
	}
	public void setSpecification_group_name(String specification_group_name) {
		this.specification_group_name = specification_group_name;
	}
	
}
