package service.imple;

import java.util.List;

import dao.BrandDao;
import domain.Brand;
import service.BrandService;

public class BrandServiceImple implements BrandService {
	private int flag;
	//依赖注入BrandDao
	private BrandDao brandDao;
	
	public void setBrandDao(BrandDao brandDao) {
		this.brandDao = brandDao;
	}
	//添加数据
	@Override
	public boolean save(Brand brand) {
		// TODO Auto-generated method stub
		flag=this.brandDao.save(brand);
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
		flag=this.brandDao.delete(id);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新数据
	@Override
	public boolean update(Brand brand) {
		// TODO Auto-generated method stub
		flag=this.brandDao.update(brand);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//查询所有数据
	@Override
	public List<Brand> findAll() {
		// TODO Auto-generated method stub
		return this.brandDao.findAll();
	}
	//通过ID查询数据
	@Override
	public Brand findById(Integer id) {
		// TODO Auto-generated method stub
		return this.brandDao.findById(id);
	}

}
