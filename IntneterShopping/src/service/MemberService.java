package service;

import java.util.List;

import domain.Member;

public interface MemberService {
	public boolean save(Member member);//添加数据
	public boolean delete(Integer id);//删除数据
	public boolean update(Member member);//更新数据
	public Member findById(Integer id);//通过ID查询数据
	public List<Member> findAll();//查询所有数据
}
