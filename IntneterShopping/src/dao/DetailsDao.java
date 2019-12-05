package dao;

import java.util.List;

import domain.Details;

public interface DetailsDao {
	public int save(Details details);//添加
	public int update(Details details);//更新
	public int delete(Integer id);//删除
	public Details findById(Integer id);//通过ID查找
	public List<Details> findAll();//查找所有
}
