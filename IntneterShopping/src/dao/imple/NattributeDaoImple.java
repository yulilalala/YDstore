package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.NattributeDao;
import domain.Nattribute;

public class NattributeDaoImple implements NattributeDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Nattribute nattribute) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(nattribute);
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
			Nattribute nattribute=this.hibernateTemplate.get(Nattribute.class, id);
			this.hibernateTemplate.delete(nattribute);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Nattribute nattribute) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(nattribute);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Nattribute findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Nattribute.class, id);
	}
	//查询所有
	@Override
	public List<Nattribute> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Nattribute");
	}

}
