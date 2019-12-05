package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import dao.SpecificationDao;
import domain.Details;
import domain.Specification;

public class SpecificationDaoImple implements SpecificationDao {
	//依赖注入Hibernate模板
		private HibernateTemplate hibernateTemplate;
		
		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		}
		//添加
		@Override
		public int save(Specification specification) {
			// TODO Auto-generated method stub
			try {
				this.hibernateTemplate.save(specification);
				return 1;
			} catch (Exception e) {
				return 0;
				// TODO: handle exception
			}
		}
		//更新
		@Override
		public int update(Specification specification) {
			// TODO Auto-generated method stub
			try {
				this.hibernateTemplate.update(specification);
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
				Specification specification=this.hibernateTemplate.get(Specification.class, id);
				this.hibernateTemplate.delete(specification);
				return 1;
			} catch (Exception e) {
				return 0;
				// TODO: handle exception
			}
		}
		//通过ID查找
		@Override
		public Specification findById(Integer id) {
			// TODO Auto-generated method stub
			return this.hibernateTemplate.get(Specification.class, id);
		}
		//查找所有
		@Override
		public List<Specification> findAll() {
			// TODO Auto-generated method stub
			return this.hibernateTemplate.find("from Specification");
		}


}
