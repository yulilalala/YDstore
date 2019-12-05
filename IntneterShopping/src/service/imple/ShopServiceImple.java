package service.imple;

import java.util.List;

import dao.ShopDao;
import domain.Shop;
import service.ShopService;

public class ShopServiceImple implements ShopService {
	private int flag;
	//依赖注入shopDao
	private ShopDao shopDao;
	
	public void setShopDao(ShopDao shopDao) {
		this.shopDao = shopDao;
	}
	//添加
	@Override
	public boolean save(Shop shop) {
		// TODO Auto-generated method stub
		flag=this.shopDao.save(shop);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Shop shop) {
		// TODO Auto-generated method stub
		flag=this.shopDao.update(shop);
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
		flag=this.shopDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查询
	@Override
	public Shop findById(Integer id) {
		// TODO Auto-generated method stub
		return this.shopDao.findById(id);
	}
	//查询所有
	@Override
	public List<Shop> findAll() {
		// TODO Auto-generated method stub
		return this.shopDao.findAll();
	}

}
