package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.MemberDao;
import domain.Member;

public class MemberDaoImple implements MemberDao {
	//提供Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//查询所有数据
	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Member");
	}
	//添加数据
	@Override
	public int save(Member member) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(member);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//删除数据
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		try {
			Member member=this.hibernateTemplate.get(Member.class, id);
			this.hibernateTemplate.delete(member);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查询数据
	@Override
	public Member findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Member.class, id);
	}
	//更新数据
	@Override
	public int update(Member member) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(member);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}

}
