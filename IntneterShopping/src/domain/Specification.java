package domain;

import java.util.HashSet;
import java.util.Set;

public class Specification {
	private Integer specification_id;//规格编号
	private String specification_name;//规格名称
	//属于某个specification_options
	private Specification_options specification_options;
	//关联Spu
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
	/**
	 * @return the specification_options
	 */
	public Specification_options getSpecification_options() {
		return specification_options;
	}
	/**
	 * @param specification_options the specification_options to set
	 */
	public void setSpecification_options(Specification_options specification_options) {
		this.specification_options = specification_options;
	}
	public Integer getSpecification_id() {
		return specification_id;
	}
	public void setSpecification_id(Integer specification_id) {
		this.specification_id = specification_id;
	}
	public String getSpecification_name() {
		return specification_name;
	}
	public void setSpecification_name(String specification_name) {
		this.specification_name = specification_name;
	}
	
}
