package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.Spu_optionsDao;
import domain.Spu_options;

public class Spu_optionsDaoImple implements Spu_optionsDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Spu_options spu_options) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(spu_options);
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
			Spu_options spu_options=this.hibernateTemplate.get(Spu_options.class, id);
			this.hibernateTemplate.delete(spu_options);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Spu_options spu_options) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(spu_options);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//查找所有
	@Override
	public List<Spu_options> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Spu_options");
	}
	//通过ID查找
	@Override
	public Spu_options findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Spu_options.class, id);
	}

}
