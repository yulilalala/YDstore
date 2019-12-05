package service;

import java.util.List;

import domain.Classification;

public interface ClassificationService {
	public boolean save(Classification classification);//添加
	public boolean update(Classification classification);//更新
	public boolean delete(Integer id);//删除
	public Classification findById(Integer id);//通过ID查询
	public List<Classification> findAll();//查询所有
}
