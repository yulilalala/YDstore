package service.imple;

import java.util.List;

import dao.NattributeDao;
import domain.Nattribute;
import service.NattributeService;

public class NattributeServiceImple implements NattributeService {
	private int flag;
	//依赖注入NattributeDao
	private NattributeDao nattributeDao;
	
	public void setNattributeDao(NattributeDao nattributeDao) {
		this.nattributeDao = nattributeDao;
	}
	//添加
	@Override
	public boolean save(Nattribute nattribute) {
		// TODO Auto-generated method stub
		flag=this.nattributeDao.save(nattribute);
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
		flag=this.nattributeDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Nattribute nattribute) {
		// TODO Auto-generated method stub
		flag=this.nattributeDao.update(nattribute);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找
	@Override
	public Nattribute findById(Integer id) {
		// TODO Auto-generated method stub
		return this.nattributeDao.findById(id);
	}
	//查询所有
	@Override
	public List<Nattribute> findAll() {
		// TODO Auto-generated method stub
		return this.nattributeDao.findAll();
	}

}
