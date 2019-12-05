package service.imple;

import java.util.List;

import dao.Sku_chooseDao;
import domain.Sku_choose;
import service.Sku_chooseService;

public class Sku_chooseServiceImple implements Sku_chooseService {
	private int flag;
	//依赖注入Sku_chooseDao
	private Sku_chooseDao sku_chooseDao;
	
	public void setSku_chooseDao(Sku_chooseDao sku_chooseDao) {
		this.sku_chooseDao = sku_chooseDao;
	}
	//添加
	@Override
	public boolean save(Sku_choose sku_choose) {
		// TODO Auto-generated method stub
		flag=this.sku_chooseDao.save(sku_choose);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Sku_choose sku_choose) {
		// TODO Auto-generated method stub
		flag=this.sku_chooseDao.update(sku_choose);
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
		flag=this.sku_chooseDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找
	@Override
	public Sku_choose findById(Integer id) {
		// TODO Auto-generated method stub
		return this.sku_chooseDao.findById(id);
	}
	//查找所有
	@Override
	public List<Sku_choose> findAll() {
		// TODO Auto-generated method stub
		return this.sku_chooseDao.findAll();
	}

}
