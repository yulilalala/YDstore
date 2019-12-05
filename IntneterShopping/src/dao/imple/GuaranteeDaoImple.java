package dao.imple;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.GuaranteeDao;
import domain.Guarantee;

public class GuaranteeDaoImple implements GuaranteeDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Guarantee guarantee) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(guarantee);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Guarantee guarantee) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(guarantee);
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
			Guarantee guarantee=this.hibernateTemplate.get(Guarantee.class, id);
			this.hibernateTemplate.delete(guarantee);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//根据ID查找
	@Override
	public Guarantee findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Guarantee.class, id);
	}
	//查找所有
	@Override
	public List<Guarantee> findAll() {
		// TODO Auto-generated method stub
		return	this.hibernateTemplate.find("from Guarantee");
	}

}
