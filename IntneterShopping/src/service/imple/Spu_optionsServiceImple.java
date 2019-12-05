package service.imple;

import java.util.List;

import dao.Spu_optionsDao;
import domain.Spu_options;
import service.Spu_optionsService;

public class Spu_optionsServiceImple implements Spu_optionsService {
	
	private int flag;
	//依赖注入Spu_optionsDao
	private Spu_optionsDao spu_optionsDao;
	
	public void setSpu_optionsDao(Spu_optionsDao spu_optionsDao) {
		this.spu_optionsDao = spu_optionsDao;
	}
	//添加
	@Override
	public boolean save(Spu_options spu_options) {
		// TODO Auto-generated method stub
		flag=this.spu_optionsDao.save(spu_options);
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
		flag=this.spu_optionsDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Spu_options spu_options) {
		// TODO Auto-generated method stub
		flag=this.spu_optionsDao.update(spu_options);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//查找所有
	@Override
	public List<Spu_options> findAll() {
		// TODO Auto-generated method stub
		return this.spu_optionsDao.findAll();
	}
	//通过ID查找
	@Override
	public Spu_options findById(Integer id) {
		// TODO Auto-generated method stub
		return this.spu_optionsDao.findById(id);
	}	
}
