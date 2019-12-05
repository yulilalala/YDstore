package service;

import java.util.List;

import domain.Sku_choose;

public interface Sku_chooseService {
	public boolean save(Sku_choose sku_choose);//添加
	public boolean update(Sku_choose sku_choose);//更新
	public boolean delete(Integer id);//删除
	public Sku_choose findById(Integer id);//通过ID查找
	public List<Sku_choose> findAll();//查询所有
}
