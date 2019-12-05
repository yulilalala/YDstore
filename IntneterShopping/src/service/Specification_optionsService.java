package service;

import java.util.List;

import domain.Specification_options;

public interface Specification_optionsService {
	public boolean save(Specification_options specification_options);//添加数据
	public boolean update(Specification_options specification_options);//更新数据
	public boolean delete(Integer id);//删除数据
	public Specification_options findById(Integer id);//通过
	public List<Specification_options> findAll();//查找所有
}
