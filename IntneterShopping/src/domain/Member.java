package domain;

public class Member {
	private Integer member_id;//会员编号
	private Integer member_grade;///会员等级:1.普通2.铜牌3.银牌4.金牌5钻石
	private Integer member_jifen;//积分数
	private Integer member_remain;//所剩积分
	//关联user
	private User user;
	
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public Integer getMember_grade() {
		return member_grade;
	}
	public void setMember_grade(Integer member_grade) {
		this.member_grade = member_grade;
	}
	public Integer getMember_jifen() {
		return member_jifen;
	}
	public void setMember_jifen(Integer member_jifen) {
		this.member_jifen = member_jifen;
	}
	public Integer getMember_remain() {
		return member_remain;
	}
	public void setMember_remain(Integer member_remain) {
		this.member_remain = member_remain;
	}
	
}
