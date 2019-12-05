package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.DetailsDao;
import domain.Details;

public class DetailsDaoImple implements DetailsDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Details details) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(details);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Details details) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(details);
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
			Details details=this.hibernateTemplate.get(Details.class, id);
			this.hibernateTemplate.delete(details);
			return 1;
			
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Details findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Details.class, id);
	}
	//查找所有
	@Override
	public List<Details> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Details");
	}

}
