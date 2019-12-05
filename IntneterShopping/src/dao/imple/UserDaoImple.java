package dao.imple;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mysql.cj.Query;
import com.mysql.cj.Session;
import com.mysql.cj.xdevapi.SessionFactory;

import dao.UserDao;
import domain.User;

public class UserDaoImple implements UserDao {
	//提供Hibernate模板
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	//通过ID查询用户
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.get(User.class, id);
	}
	//查询所有用户
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.hibernateTemplate.find("from User");
	}
	//添加数据
	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		try {
			List<User> list=hibernateTemplate.find("from User where user_phone in ("+user.getUser_phone()+")");
			if(list.size()>0) {
				return 0;
			}
			else {
				this.hibernateTemplate.save(user);
				return 1;
			}
		}
		catch(Exception e) {
			return 0;
		}
	}
	//删除数据
	@Override
	public int delete(Integer number) {
		// TODO Auto-generated method stub
		try {
			User user=this.hibernateTemplate.get(User.class, number);
			List list=this.hibernateTemplate.find("from Member where user_id in ("+number+")");
			this.hibernateTemplate.deleteAll(list);
			this.hibernateTemplate.delete(user);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	//更新数据
	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		try {
			this.hibernateTemplate.update(user);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
	//通过电话删除
	@Override
	public int deleteByPhone(String user_phone) {
		// TODO Auto-generated method stub
		try {
			List<User> list=hibernateTemplate.find("from User where user_phone in ("+user_phone+")");
			for(User u:list) {
				Integer id=u.getUser_id();
				this.delete(id);
			}
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}
}
