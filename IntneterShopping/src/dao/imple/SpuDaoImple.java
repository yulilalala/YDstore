package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.SpuDao;
import domain.Spu;

public class SpuDaoImple implements SpuDao {
	//依赖注入Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//添加数据
	@Override
	public int save(Spu spu) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.save(spu);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//更新数据
	@Override
	public int update(Spu spu) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(spu);
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
			Spu spu=this.hibernateTemplate.get(Spu.class, id);
			this.hibernateTemplate.delete(spu);
			return 1;
		} catch (Exception e) {
			return 0;
			// TODO: handle exception
		}
	}
	//通过ID查询数据
	@Override
	public Spu findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(Spu.class, id);
	}
	//查询所有数据
	@Override
	public List<Spu> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from Spu");
	}

}
