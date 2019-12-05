package service;

import java.util.List;

import domain.Specification;

public interface SpecificationService {
	public boolean save(Specification specification);//添加
	public boolean update(Specification specification);//更新
	public boolean delete(Integer id);//删除
	public Specification findById(Integer id);//通过ID查找
	public List<Specification> findAll();//查找所有
}
