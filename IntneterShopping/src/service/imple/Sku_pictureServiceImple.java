package service.imple;

import java.util.List;
import dao.Sku_pictureDao;
import domain.Sku_picture;
import service.Sku_pictureService;

public class Sku_pictureServiceImple implements Sku_pictureService {
	private int flag;
	//依赖注入Sku_pictureDao
	private Sku_pictureDao sku_pictureDao;
	
	public void setSku_pictureDao(Sku_pictureDao sku_pictureDao) {
		this.sku_pictureDao = sku_pictureDao;
	}
	//添加
	@Override
	public boolean save(Sku_picture sku_picture) {
		// TODO Auto-generated method stub
		flag=this.sku_pictureDao.save(sku_picture);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新
	@Override
	public boolean update(Sku_picture sku_picture) {
		// TODO Auto-generated method stub
		flag=this.sku_pictureDao.update(sku_picture);
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
		flag=this.sku_pictureDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//通过ID查找
	@Override
	public Sku_picture findById(Integer id) {
		// TODO Auto-generated method stub
		return this.sku_pictureDao.findById(id);
	}
	//查找所有
	@Override
	public List<Sku_picture> findAll() {
		// TODO Auto-generated method stub
		return this.sku_pictureDao.findAll();
	}

}
