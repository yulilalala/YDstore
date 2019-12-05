package service;

import java.util.List;

import domain.Spu;

public interface SpuService {
	public boolean save(Spu spu);//添加数据
	public boolean update(Spu spu);//更新数据
	public boolean delete(Integer id);//删除数据
	public Spu findById(Integer id);//通过ID查找数据
	public List<Spu> findAll();//查询所有数据
}
