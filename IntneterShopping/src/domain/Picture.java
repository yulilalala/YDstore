package domain;

import java.util.HashSet;
import java.util.Set;

public class Picture {
	private Integer picture_id;//轮播图片编号
	private String big_url;//大图URL
	private String middle_url;//中图URL
	private String small_url;//小图URL
	//关联Sku
	private Set<Sku> skus=new HashSet<Sku>();
	//属于某个spu
	private Spu spu;
	
	/**
	 * @return the spu
	 */
	public Spu getSpu() {
		return spu;
	}
	/**
	 * @param spu the spu to set
	 */
	public void setSpu(Spu spu) {
		this.spu = spu;
	}
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
	public Integer getPicture_id() {
		return picture_id;
	}
	public void setPicture_id(Integer picture_id) {
		this.picture_id = picture_id;
	}
	public String getBig_url() {
		return big_url;
	}
	public void setBig_url(String big_url) {
		this.big_url = big_url;
	}
	public String getMiddle_url() {
		return middle_url;
	}
	public void setMiddle_url(String middle_url) {
		this.middle_url = middle_url;
	}
	public String getSmall_url() {
		return small_url;
	}
	public void setSmall_url(String small_url) {
		this.small_url = small_url;
	}
}
