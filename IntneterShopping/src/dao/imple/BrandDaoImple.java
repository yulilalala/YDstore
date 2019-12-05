package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.BrandDao;
import domain.Brand;

public class BrandDaoImple implements BrandDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加数据
	@Override
	public int save(Brand brand) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(brand);
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
			Brand brand=this.hibernateTemplate.get(Brand.class, id);
			this.hibernateTemplate.delete(brand);
			return 1;
			
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新数据
	@Override
	public int update(Brand brand) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(brand);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	//查询所有数据
	@Override
	public List<Brand> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Brand");
	}	
	//通过ID查询数据
	@Override
	public Brand findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Brand.class, id);
	}

}
