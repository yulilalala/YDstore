package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.Sku_pictureDao;
import domain.Sku_picture;

public class Sku_pictureDaoImple implements Sku_pictureDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Sku_picture sku_picture) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(sku_picture);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Sku_picture sku_picture) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(sku_picture);
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
			Sku_picture sku_picture=this.hibernateTemplate.get(Sku_picture.class, id);
			this.hibernateTemplate.delete(sku_picture);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Sku_picture findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Sku_picture.class, id);
	}
	//查找所有
	@Override
	public List<Sku_picture> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Sku_picture");
	}

}
