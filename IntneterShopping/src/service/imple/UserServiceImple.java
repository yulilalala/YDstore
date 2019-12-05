package service.imple;

import java.util.List;

import dao.UserDao;
import domain.User;
import service.UserService;

public class UserServiceImple implements UserService {
	private int flag;
	//用于依赖注入UserDao
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	//通过ID查询
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return this.userDao.findById(id);
	}

	@Override
	//查询所有
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.userDao.findAll();
	}
	//添加数据
	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		flag=this.userDao.save(user);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//删除数据
	@Override
	public boolean delete(Integer number) {
		// TODO Auto-generated method stub
		flag=this.userDao.delete(number);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}
	//更新数据
	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		flag=this.userDao.update(user);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean deleteByPhone(String user_phone) {
		// TODO Auto-generated method stub
		flag=this.userDao.deleteByPhone(user_phone);
		if(flag==1) {
			return true;
		}
		else {
			return false;
		}
	}

}
