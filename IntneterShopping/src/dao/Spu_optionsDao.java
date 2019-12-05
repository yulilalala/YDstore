package dao;

import java.util.List;

import domain.Spu_options;
public interface Spu_optionsDao {
	public int save(Spu_options spu_options);//添加数据
	public int delete(Integer id);//删除数据
	public int update(Spu_options spu_options);//更新数据
	public List<Spu_options> findAll();//查询所有数据
	public Spu_options findById(Integer id);//通过ID查询数据
}
