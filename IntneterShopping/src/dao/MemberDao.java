package dao;

import java.util.List;

import domain.Member;

public interface MemberDao {
	public int save(Member member);//添加数据
	public int delete(Integer id);//删除数据
	public int update(Member member);//更新数据
	public Member findById(Integer id);//通过ID查询数据
	public List<Member> findAll();//查询所有数据
}
