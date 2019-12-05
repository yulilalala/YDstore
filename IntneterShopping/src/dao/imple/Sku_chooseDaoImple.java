package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.Sku_chooseDao;
import domain.Sku_choose;

public class Sku_chooseDaoImple implements Sku_chooseDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Sku_choose sku_choose) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(sku_choose);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Sku_choose sku_choose) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(sku_choose);
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
			Sku_choose sku_choose=this.hibernateTemplate.get(Sku_choose.class, id);
			this.hibernateTemplate.delete(sku_choose);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Sku_choose findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Sku_choose.class, id);
	}
	//查询所有
	@Override
	public List<Sku_choose> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Sku_choose");
	}

}
