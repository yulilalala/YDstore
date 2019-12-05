package service;

import java.util.List;

import domain.Vattribute;

public interface VattributeService {
	public boolean save(Vattribute vattribute);//添加
	public boolean update(Vattribute vattribute);//更新
	public boolean delete(Integer id);//删除
	public Vattribute findById(Integer id);//通过ID查找
	public List<Vattribute> findAll();//查找所有
}
