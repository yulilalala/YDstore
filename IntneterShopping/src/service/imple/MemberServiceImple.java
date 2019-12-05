package service.imple;

import java.util.List;

import dao.MemberDao;
import domain.Member;
import service.MemberService;

public class MemberServiceImple implements MemberService {
	private int flag;
	//依赖注入MemberDao
	private MemberDao memberDao;

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	//查询所有数据
	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return this.memberDao.findAll();
	}
	//添加数据
	@Override
	public boolean save(Member member) {
		// TODO Auto-generated method stub
		flag=this.memberDao.save(member);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	//删除数据
	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		flag=this.memberDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查询数据
	@Override
	public Member findById(Integer id) {
		// TODO Auto-generated method stub
		return this.memberDao.findById(id);
	}
	//更新数据
	@Override
	public boolean update(Member member) {
		// TODO Auto-generated method stub
		flag=this.memberDao.update(member);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}

}
