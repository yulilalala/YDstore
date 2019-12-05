package dao;

import java.util.List;

import domain.Specification_options;

public interface Specification_optionsDao {
	public int save(Specification_options specification_options);//添加数据
	public int update(Specification_options specification_options);//更新数据
	public int delete(Integer id);//删除数据
	public Specification_options findById(Integer id);//通过ID查找
	public List<Specification_options> findAll();//查找所有
}
