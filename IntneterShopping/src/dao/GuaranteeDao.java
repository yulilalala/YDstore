package dao;

import java.util.List;

import domain.Guarantee;

public interface GuaranteeDao {
	public int save(Guarantee guarantee);//添加
	public int update(Guarantee guarantee);//更新
	public int delete(Integer id);//删除
	public Guarantee findById(Integer id);//通过ID查找
	public List<Guarantee> findAll();//查找所有
}
