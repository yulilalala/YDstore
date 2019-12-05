package dao;

import java.util.List;
import domain.Nattribute;

public interface NattributeDao {
	public int save(Nattribute nattribute);//添加数据
	public int delete(Integer id);//删除数据
	public int update(Nattribute nattribute);//更新数据
	public Nattribute findById(Integer id);//通过ID查询数据
	public List<Nattribute> findAll();//查询所有数据
}
