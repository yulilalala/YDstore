package dao;

import domain.User;
import java.util.List;
public interface UserDao {
	public int save(User user);//添加数据
	public int delete(Integer number);//删除数据
	public int update(User user);//更新数据
	public User findById(Integer id);//通过ID查询数据
	public List<User> findAll();//查询所有数据
	public int deleteByPhone(String user_phone);//根据电话删除用户
}
