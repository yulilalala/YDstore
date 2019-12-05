package service;

import java.util.List;

import domain.Shop;

public interface ShopService {
	public boolean save(Shop shop);//添加
	public boolean update(Shop shop);//更新
	public boolean delete(Integer id);//删除
	public Shop findById(Integer id);//通过ID查询
	public List<Shop> findAll();//查询所有
}
