package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.SkuDao;
import domain.Sku;

public class SkuDaoImple implements SkuDao {
	//依赖注入HibernateTemplate
	private HibernateTemplate HibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		HibernateTemplate = hibernateTemplate;
	}
	//添加数据
	@Override
	public int save(Sku sku) {
		// TODO Auto-generated method stub
		try {
			this.HibernateTemplate.save(sku);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新数据
	@Override
	public int update(Sku sku) {
		// TODO Auto-generated method stub
		try {
			this.HibernateTemplate.update(sku);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
		
	}
	//通过ID查询数据
	@Override
	public Sku findById(Integer id) {
		// TODO Auto-generated method stub
		return this.HibernateTemplate.get(Sku.class, id);
	}
	//查询所有数据
	@Override
	public List<Sku> findAll() {
		// TODO Auto-generated method stub
		return this.HibernateTemplate.find("from Sku");
	}
	//删除数据
	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		try {
			Sku sku=this.HibernateTemplate.get(Sku.class, id);
			this.HibernateTemplate.delete(sku);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}

}
