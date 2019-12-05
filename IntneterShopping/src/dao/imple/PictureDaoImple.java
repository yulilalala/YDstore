package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.PictureDao;
import domain.Picture;

public class PictureDaoImple implements PictureDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加
	@Override
	public int save(Picture picture) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(picture);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新
	@Override
	public int update(Picture picture) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(picture);
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
			Picture picture=this.hibernateTemplate.get(Picture.class, id);
			this.hibernateTemplate.delete(picture);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查找
	@Override
	public Picture findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Picture.class, id);
	}
	//查找所有
	@Override
	public List<Picture> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Picture");
	}

}
