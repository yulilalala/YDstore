package domain;

import java.util.HashSet;
import java.util.Set;

public class Specification_options {
	private Integer specification_options_id;//规格选项编号
	private String specification_options_name;//选项名称
	//属于某个Specification_group
	private Specification_group specification_group;
	//有多个specification
	private Set<Specification> specification=new HashSet<Specification>();
	
	/**
	 * @return the specification
	 */
	public Set<Specification> getSpecification() {
		return specification;
	}
	/**
	 * @param specification the specification to set
	 */
	public void setSpecification(Set<Specification> specification) {
		this.specification = specification;
	}
	public Specification_group getSpecification_group() {
		return specification_group;
	}
	/**
	 * @param specification_group the specification_group to set
	 */
	public void setSpecification_group(Specification_group specification_group) {
		this.specification_group = specification_group;
	}
	public Integer getSpecification_options_id() {
		return specification_options_id;
	}
	public void setSpecification_options_id(Integer specification_options_id) {
		this.specification_options_id = specification_options_id;
	}
	public String getSpecification_options_name() {
		return specification_options_name;
	}
	public void setSpecification_options_name(String specification_options_name) {
		this.specification_options_name = specification_options_name;
	}
}
