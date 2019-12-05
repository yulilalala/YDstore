package service.imple;

import java.util.List;

import dao.SpecificationDao;
import domain.Picture;
import domain.Specification;
import service.SpecificationService;

public class SpecificationServiceImple implements SpecificationService {
	private int flag;
	//依赖注入SpecificationDao
	private SpecificationDao specificationDao;
	
	public void setSpecificationDao(SpecificationDao specificationDao) {
		this.specificationDao = specificationDao;
	}

	//添加
	@Override
	public boolean save(Specification specification) {
		// TODO Auto-generated method stub
		flag=this.specificationDao.save(specification);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Specification specification) {
		// TODO Auto-generated method stub
		flag=this.specificationDao.update(specification);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//删除
	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		flag=this.specificationDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找
	@Override
	public Specification findById(Integer id) {
		// TODO Auto-generated method stub
		return specificationDao.findById(id);
	}
	//查找所有
	@Override
	public List<Specification> findAll() {
		// TODO Auto-generated method stub
		return	this.specificationDao.findAll();
	}	

}
