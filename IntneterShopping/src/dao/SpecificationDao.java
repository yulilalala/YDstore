package dao;

import java.util.List;

import domain.Specification;


public interface SpecificationDao {
	public int save(Specification specification);//添加
	public int update(Specification specification);//更新
	public int delete(Integer id);//删除
	public Specification findById(Integer id);//通过ID查找
	public List<Specification> findAll();//查找所有
}
