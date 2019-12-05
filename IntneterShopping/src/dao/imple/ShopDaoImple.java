package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.ShopDao;
import domain.Shop;

public class ShopDaoImple implements ShopDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Shop shop) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(shop);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Shop shop) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(shop);
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
			Shop shop=this.hibernateTemplate.get(Shop.class, id);
			this.hibernateTemplate.delete(shop);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Shop findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Shop.class, id);
	}
	//查询所有
	@Override
	public List<Shop> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Shop");
	}

}
