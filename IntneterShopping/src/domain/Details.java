package domain;

public class Details {
	private Integer details_id;//详情图片编号
	private Integer spu_id;//SPU编号
	private String details_url;//URL
	public Integer getDetails_id() {
		return details_id;
	}
	public void setDetails_id(Integer details_id) {
		this.details_id = details_id;
	}
	public Integer getSpu_id() {
		return spu_id;
	}
	public void setSpu_id(Integer spu_id) {
		this.spu_id = spu_id;
	}
	public String getDetails_url() {
		return details_url;
	}
	public void setDetails_url(String details_url) {
		this.details_url = details_url;
	}

}
