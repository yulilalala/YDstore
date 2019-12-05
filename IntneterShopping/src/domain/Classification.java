package domain;

import java.util.HashSet;
import java.util.Set;

public class Classification {
	private Integer classification_id;//分类编号
	private String classification_name;//分类名称
	private Integer fclassification_id;//父分类编号
	//有多个Nattribute
	private Set<Nattribute> nattributes=new HashSet<Nattribute>();
	
	/**
	 * @return the nattributes
	 */
	//有多个Specification_group
	private Set<Specification_group> specification_groups=new HashSet<Specification_group>();
	//有多个SPU
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
	 * @return the specification_groups
	 */
	public Set<Specification_group> getSpecification_groups() {
		return specification_groups;
	}
	/**
	 * @param specification_groups the specification_groups to set
	 */
	public void setSpecification_groups(Set<Specification_group> specification_groups) {
		this.specification_groups = specification_groups;
	}
	public Set<Nattribute> getNattributes() {
		return nattributes;
	}
	/**
	 * @param nattributes the nattributes to set
	 */
	public void setNattributes(Set<Nattribute> nattributes) {
		this.nattributes = nattributes;
	}
	public Integer getClassification_id() {
		return classification_id;
	}
	public void setClassification_id(Integer classification_id) {
		this.classification_id = classification_id;
	}
	public String getClassification_name() {
		return classification_name;
	}
	public void setClassification_name(String classification_name) {
		this.classification_name = classification_name;
	}
	public Integer getFclassification_id() {
		return fclassification_id;
	}
	public void setFclassification_id(Integer fclassification_id) {
		this.fclassification_id = fclassification_id;
	}
}
