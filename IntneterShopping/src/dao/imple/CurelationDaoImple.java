package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.CurelationDao;
import domain.Curelation;

public class CurelationDaoImple implements CurelationDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Curelation curelation) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(curelation);
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	//更新
	@Override
	public int update(Curelation curelation) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(curelation);
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
			Curelation curelation=this.hibernateTemplate.get(Curelation.class, id);
			this.hibernateTemplate.delete(curelation);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Curelation findById(Integer id) {
		// TODO Auto-generated method stub
		return 	this.hibernateTemplate.get(Curelation.class, id);
	}
	//查找所有
	@Override
	public List<Curelation> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Curelation");
	}

}
