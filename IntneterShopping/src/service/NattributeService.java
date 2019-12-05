package service;

import java.util.List;

import domain.Nattribute;

public interface NattributeService {
	public boolean save(Nattribute nattribute);//添加数据
	public boolean delete(Integer id);//删除数据
	public boolean update(Nattribute nattribute);//更新数据
	public Nattribute findById(Integer id);//通过ID查询数据
	public List<Nattribute> findAll();//查询所有数据
}
