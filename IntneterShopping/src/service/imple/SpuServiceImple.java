package service.imple;

import java.util.List;

import dao.SpuDao;
import domain.Spu;
import service.SpuService;

public class SpuServiceImple implements SpuService {
	private int flag;
	//依赖注入SpuDao
	private SpuDao spuDao;
	
	public void setSpuDao(SpuDao spuDao) {
		this.spuDao = spuDao;
	}
	//添加数据
	@Override
	public boolean save(Spu spu) {
		// TODO Auto-generated method stub
		flag=this.spuDao.save(spu);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新数据
	@Override
	public boolean update(Spu spu) {
		// TODO Auto-generated method stub
		flag=this.spuDao.update(spu);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//删除数据
	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		flag=this.spuDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查询数据
	@Override
	public Spu findById(Integer id) {
		// TODO Auto-generated method stub
		return this.spuDao.findById(id);
	}
	//查询所有数据
	@Override
	public List<Spu> findAll() {
		// TODO Auto-generated method stub
		return this.spuDao.findAll();
	}

}
