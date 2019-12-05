package dao;

import java.util.List;

import domain.Vattribute;

public interface VattributeDao {
	public int save(Vattribute vattribute);//添加
	public int update(Vattribute vattribute);//更新
	public int delete(Integer id);//删除
	public Vattribute findById(Integer id);//通过ID查找
	public List<Vattribute> findAll();//查找所有
}
