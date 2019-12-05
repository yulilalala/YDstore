package service.imple;

import java.util.List;

import dao.Specification_groupDao;
import domain.Specification_group;
import service.Specification_groupService;

public class Specification_groupServiceImple implements Specification_groupService {
	private int flag;
	//依赖注入Specification_groupDao
	private Specification_groupDao specification_groupDao;
	
	public void setSpecification_groupDao(Specification_groupDao specification_groupDao) {
		this.specification_groupDao = specification_groupDao;
	}
	//添加
	@Override
	public boolean save(Specification_group specification_group) {
		// TODO Auto-generated method stub
		flag=this.specification_groupDao.save(specification_group);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Specification_group specification_group) {
		// TODO Auto-generated method stub
		flag=this.specification_groupDao.update(specification_group);
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
		flag=this.specification_groupDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找
	@Override
	public Specification_group findById(Integer id) {
		// TODO Auto-generated method stub
		return this.specification_groupDao.findById(id);
	}
	//查询所有
	@Override
	public List<Specification_group> findAll() {
		// TODO Auto-generated method stub
		return this.specification_groupDao.findAll();
	}

}
