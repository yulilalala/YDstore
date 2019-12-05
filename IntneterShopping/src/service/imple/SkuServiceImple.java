package service.imple;

import java.util.List;

import dao.SkuDao;
import domain.Sku;
import service.SkuService;

public class SkuServiceImple implements SkuService {
	private int flag;
	//依赖注入SkuDao
	private SkuDao skuDao;
	
	public void setSkuDao(SkuDao skuDao) {
		this.skuDao = skuDao;
	}
	//添加数据
	@Override
	public boolean save(Sku sku) {
		// TODO Auto-generated method stub
		flag=this.skuDao.save(sku);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新数据
	@Override
	public boolean update(Sku sku) {
		// TODO Auto-generated method stub
		flag=this.skuDao.update(sku);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找数据
	@Override
	public Sku findById(Integer id) {
		// TODO Auto-generated method stub
		return this.skuDao.findById(id);
	}
	//查询所有数据
	@Override
	public List<Sku> findAll() {
		// TODO Auto-generated method stub
		return this.skuDao.findAll();
	}
	//删除数据
	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		flag=this.skuDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}

}
