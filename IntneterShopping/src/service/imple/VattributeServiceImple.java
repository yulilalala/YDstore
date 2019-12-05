package service.imple;

import java.util.List;

import dao.VattributeDao;
import domain.Vattribute;
import service.VattributeService;

public class VattributeServiceImple implements VattributeService {
	private int flag;
	//依赖注入VattributeDao
	private VattributeDao vattributeDao;
	
 
	public void setVattributeDao(VattributeDao vattributeDao) {
		this.vattributeDao = vattributeDao;
	}
	//添加
	@Override
	public boolean save(Vattribute vattribute) {
		// TODO Auto-generated method stub
		flag=this.vattributeDao.save(vattribute);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Vattribute vattribute) {
		// TODO Auto-generated method stub
		flag=this.vattributeDao.update(vattribute);
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
		flag=this.vattributeDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找
	@Override
	public Vattribute findById(Integer id) {
		// TODO Auto-generated method stub
		return this.vattributeDao.findById(id);
	}
	//查找所有
	@Override
	public List<Vattribute> findAll() {
		// TODO Auto-generated method stub
		return this.vattributeDao.findAll();
	}	
}
