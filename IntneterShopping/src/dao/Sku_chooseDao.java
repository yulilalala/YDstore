package dao;
import java.util.List;

import domain.Sku_choose;

public interface Sku_chooseDao {
	public int save(Sku_choose sku_choose);//添加
	public int update(Sku_choose sku_choose);//更新
	public int delete(Integer id);//删除
	public Sku_choose findById(Integer id);//通过ID查找
	public List<Sku_choose> findAll();//查询所有
}
