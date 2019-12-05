package service.imple;

import java.util.List;

import dao.DetailsDao;
import domain.Details;
import service.DetailsService;

public class DetailsServiceImple implements DetailsService {
	private int flag;
	//依赖注入detailsDao
	private DetailsDao detailsDao;
	
	public void setDetailsDao(DetailsDao detailsDao) {
		this.detailsDao = detailsDao;
	}
	//添加
	@Override
	public boolean save(Details details) {
		// TODO Auto-generated method stub
		flag=this.detailsDao.save(details);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override	
	public boolean update(Details details) {
		// TODO Auto-generated method stub
		flag=this.detailsDao.update(details);
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
		flag=this.detailsDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//根据ID查找
	@Override
	public Details findById(Integer id) {
		// TODO Auto-generated method stub
		return this.detailsDao.findById(id);
	}
	//查找所有
	@Override
	public List<Details> findAll() {
		// TODO Auto-generated method stub
		return this.detailsDao.findAll();
	}

}
