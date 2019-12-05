package service;

import java.util.List;

import domain.Details;

public interface DetailsService {
	public boolean save(Details details);//添加
	public boolean update(Details details);//更新
	public boolean delete(Integer id);//删除
	public Details findById(Integer id);//通过ID查找
	public List<Details> findAll();//查找所有
}
