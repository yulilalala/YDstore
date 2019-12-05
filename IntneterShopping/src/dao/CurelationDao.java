package dao;

import java.util.List;
import domain.Curelation;

public interface CurelationDao {
	public int save(Curelation curelation);//添加
	public int update(Curelation curelation);//更新
	public int delete(Integer id);//删除
	public Curelation findById(Integer id);//通过ID查找
	public List<Curelation> findAll();//查找所有
}
