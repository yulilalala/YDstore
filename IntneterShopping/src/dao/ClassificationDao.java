package dao;

import java.util.List;

import domain.Classification;

public interface ClassificationDao {
	public int save(Classification classification);//添加
	public int update(Classification classification);//更新
	public int delete(Integer id);//删除
	public Classification findById(Integer id);//通过ID查询
	public List<Classification> findAll();//查询所有
}
