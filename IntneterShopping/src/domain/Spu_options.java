package domain;

public class Spu_options {
	private Integer spu_options_id;//SPU规格选项编号
	private Integer spu_id;//SPU编号
	private Integer specification_option_id;//规格选项编号
	private Integer specification_id;//规格编号
	private Integer specification_group_id;//规格组编号
	public Integer getSpu_options_id() {
		return spu_options_id;
	}
	public void setSpu_options_id(Integer spu_options_id) {
		this.spu_options_id = spu_options_id;
	}
	public Integer getSpu_id() {
		return spu_id;
	}
	public void setSpu_id(Integer spu_id) {
		this.spu_id = spu_id;
	}
	public Integer getSpecification_option_id() {
		return specification_option_id;
	}
	public void setSpecification_option_id(Integer specification_option_id) {
		this.specification_option_id = specification_option_id;
	}
	public Integer getSpecification_id() {
		return specification_id;
	}
	public void setSpecification_id(Integer specification_id) {
		this.specification_id = specification_id;
	}
	public Integer getSpecification_group_id() {
		return specification_group_id;
	}
	public void setSpecification_group_id(Integer specification_group_id) {
		this.specification_group_id = specification_group_id;
	}
}
