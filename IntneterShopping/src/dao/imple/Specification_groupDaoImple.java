package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.Specification_groupDao;
import domain.Specification_group;

public class Specification_groupDaoImple implements Specification_groupDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Specification_group specification_group) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(specification_group);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
		
	}
	//更新
	@Override
	public int update(Specification_group specification_group) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(specification_group);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//删除
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		try {
			Specification_group specification_group=this.hibernateTemplate.get(Specification_group.class, id);
			this.hibernateTemplate.delete(specification_group);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Specification_group findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Specification_group.class, id);
	}
	//查找所有
	@Override
	public List<Specification_group> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Specification_group");
	}

}
