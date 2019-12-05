package service;

import java.util.List;

import domain.Sku;

public interface SkuService {
	public boolean save(Sku sku);//添加数据
	public boolean update(Sku sku);//更新数据
	public boolean delete(Integer id);//删除数据
	public Sku findById(Integer id);//通过ID查找数据
	public List<Sku> findAll();//查询所有数据
}
