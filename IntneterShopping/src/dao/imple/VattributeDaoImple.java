package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.VattributeDao;
import domain.Vattribute;

public class VattributeDaoImple implements VattributeDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Vattribute vattribute) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(vattribute);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Vattribute vattribute) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(vattribute);
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
			Vattribute vattribute=this.hibernateTemplate.get(Vattribute.class, id);
			this.hibernateTemplate.delete(vattribute);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Vattribute findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Vattribute.class, id);
	}
	//查找所有
	@Override
	public List<Vattribute> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Vattribute");
	}

}
