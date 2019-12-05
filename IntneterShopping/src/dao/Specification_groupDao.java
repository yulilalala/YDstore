package dao;

import java.util.List;

import domain.Specification_group;

public interface Specification_groupDao {
	public int save(Specification_group specification_group);//添加
	public int update(Specification_group specification_group);//更新
	public int delete(Integer id);//删除
	public Specification_group findById(Integer id);//通过ID查找
	public List<Specification_group> findAll();//查找所有
	
}
