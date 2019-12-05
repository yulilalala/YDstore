package service;

import java.util.List;

import domain.Guarantee;

public interface GuaranteeService {
	public boolean save(Guarantee guarantee);//添加
	public boolean update(Guarantee guarantee);//更新
	public boolean delete(Integer id);//删除
	public Guarantee findById(Integer id);//通过ID查找
	public List<Guarantee> findAll();//查找所有
}
