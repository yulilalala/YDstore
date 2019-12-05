package service.imple;

import java.util.List;

import dao.CurelationDao;
import domain.Curelation;
import service.CurelationService;

public class CurelationServiceImple implements CurelationService {
	private int flag;
	//依赖注入CurelationDao
	private CurelationDao curelationDao;
	
	public void setCurelationDao(CurelationDao curelationDao) {
		this.curelationDao = curelationDao;
	}
	//添加
	@Override
	public boolean save(Curelation curelation) {
		// TODO Auto-generated method stub
		flag=this.curelationDao.save(curelation);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Curelation curelation) {
		// TODO Auto-generated method stub
		flag=this.curelationDao.update(curelation);
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
		flag=this.curelationDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找
	@Override
	public Curelation findById(Integer id) {
		// TODO Auto-generated method stub
		return 	this.curelationDao.findById(id);
	}
	//查找所有
	@Override
	public List<Curelation> findAll() {
		// TODO Auto-generated method stub
		return this.curelationDao.findAll();
	}
	

}
