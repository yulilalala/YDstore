package service;

import java.util.List;

import domain.Specification_group;

public interface Specification_groupService {
	public boolean save(Specification_group specification_group);//添加
	public boolean update(Specification_group specification_group);//更新
	public boolean delete(Integer id);//删除
	public Specification_group findById(Integer id);//通过ID查找
	public List<Specification_group> findAll();//查找所有
}
