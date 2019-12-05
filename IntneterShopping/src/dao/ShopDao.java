package dao;

import java.util.List;
import domain.Shop;

public interface ShopDao {
	public int save(Shop shop);//添加
	public int update(Shop shop);//更新
	public int delete(Integer id);//删除
	public Shop findById(Integer id);//通过ID查询
	public List<Shop> findAll();//查询所有
}
