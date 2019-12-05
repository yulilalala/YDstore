package service;

import java.util.List;

import domain.Brand;

public interface BrandService {
	public boolean save(Brand brand);//添加数据
	public boolean delete(Integer id);//删除数据
	public boolean update(Brand brand);//更新数据
	public List<Brand> findAll();//查询所有数据
	public Brand findById(Integer id);//通过ID查询数据
}
