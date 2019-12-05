package service.imple;

import java.util.List;

import dao.Specification_optionsDao;
import domain.Specification_options;
import service.Specification_optionsService;

public class Specification_optionsServiceImple implements Specification_optionsService {
	private int flag;
	//依赖注入Specification_optionsDao
	private Specification_optionsDao specification_optionsDao;
	
	public void setSpecification_optionsDao(Specification_optionsDao specification_optionsDao) {
		this.specification_optionsDao = specification_optionsDao;
	}
	//添加
	@Override
	public boolean save(Specification_options specification_options) {
		// TODO Auto-generated method stub
		flag=this.specification_optionsDao.save(specification_options);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Specification_options specification_options) {
		// TODO Auto-generated method stub
		flag=this.specification_optionsDao.update(specification_options);
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
		flag=this.specification_optionsDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找
	@Override
	public Specification_options findById(Integer id) {
		// TODO Auto-generated method stub
		return this.specification_optionsDao.findById(id);
	}
	//查找所有
	@Override
	public List<Specification_options> findAll() {
		// TODO Auto-generated method stub
		return this.specification_optionsDao.findAll();
	}

}
