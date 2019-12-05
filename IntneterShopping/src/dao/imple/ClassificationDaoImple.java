package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.ClassificationDao;
import domain.Classification;

public class ClassificationDaoImple implements ClassificationDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Classification classification) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(classification);
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	//更新
	@Override
	public int update(Classification classification) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(classification);
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	//删除
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		try {
			Classification classification=this.hibernateTemplate.get(Classification.class, id);
			this.hibernateTemplate.delete(classification);
			return 1;
			
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	//通过ID查询
	@Override
	public Classification findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Classification.class, id);
	}
	//查询所有
	@Override
	public List<Classification> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Classification");
	}

}
