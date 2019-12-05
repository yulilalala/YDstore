package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.Specification_optionsDao;
import domain.Specification_options;

public class Specification_optionsDaoImple implements Specification_optionsDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Specification_options specification_options) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(specification_options);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Specification_options specification_options) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(specification_options);
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
			Specification_options specification_options=this.hibernateTemplate.get(Specification_options.class, id);
			this.hibernateTemplate.delete(specification_options);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Specification_options findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Specification_options.class, id);
	}
	//查找所有
	@Override
	public List<Specification_options> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Specification_options");
	}

}
