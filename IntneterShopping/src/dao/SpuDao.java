package dao;

import java.util.List;
import domain.Spu;

public interface SpuDao {
	public int save(Spu spu);//添加数据
	public int update(Spu spu);//更新数据
	public int delete(Integer id);//删除数据
	public Spu findById(Integer id);//通过ID查找数据
	public List<Spu> findAll();//查询所有数据

}