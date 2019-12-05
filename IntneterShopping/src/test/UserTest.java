package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import action.TypeTransform;
import domain.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import service.UserService;
public class UserTest {
	//@Test
	public void demo01() {
		User user=new User();
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		UserService userService=applicationContext.getBean("userService", UserService.class);
		user.setUser_id(1);
		User users=userService.findById(user.getUser_id());
		/*TypeTransform typeTransform=new TypeTransform();
		typeTransform.handleAjaxRequest(null, users);*/
		//转换为JSON数组
		JSONArray json = JSONArray.fromObject(users);
		//遍历
		if(json.size()>0) {
			for(int i=0;i<json.size();i++){
				 // 遍历 jsonarray 数组，把每一个对象转成 json 对象
				JSONObject job = json.getJSONObject(i); 
				// 得到 每个对象中的属性值
				System.out.println(job.get("user_name")+"=") ;
			}
		}		
		//System.out.println(json.toString());
		/*System.out.println(""+users.getUser_address());
		System.out.println(""+users.getUser_name());
		System.out.println(""+users.getUser_nickname());
		System.out.println(""+users.getUser_password());
		System.out.println(""+users.getUser_phone());
		System.out.println(""+users.getUser_id());
		System.out.println(""+users.getUser_sex());
		System.out.println(""+users.getUser_types());
		System.out.println(""+users.getUser_regdate());*/
	}
	//@Test
	public void demo02() {
		User user=new User();
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		UserService userService=applicationContext.getBean("userService", UserService.class);
		List<User> users=userService.findAll();
		/*for(User u:users) {
			System.out.println(u);
		}*/
		//转换为JSON数组
		JSONArray json = JSONArray.fromObject(users);
		//System.out.println(JSONArray.fromObject(users));
		//遍历
		if(json.size()>0) {
			for(int i=0;i<json.size();i++){
				 // 遍历 jsonarray 数组，把每一个对象转成 json 对象
				JSONObject job = json.getJSONObject(i); 
				// 得到 每个对象中的属性值
				System.out.println(job.get("user_name")+"=") ;
			}
		}
	}
	@Test
	public void demo03() {
		User user=new User();
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		UserService userService=applicationContext.getBean("userService", UserService.class);
		user.setUser_address("123");
		user.setUser_name("张三");
		user.setUser_nickname("小三");
		user.setUser_password("123");
		user.setUser_phone("12345678910");
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd"); 
		user.setUser_regdate(date.format(System.currentTimeMillis()));
		user.setUser_sex((byte) 1);
		user.setUser_types(2);
		userService.save(user);
	}
	//@Test
	public void demo04() {
		User user =new User();
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		UserService userService=applicationContext.getBean("userService", UserService.class);
		user.setUser_phone("12345678910");
		userService.deleteByPhone(user.getUser_phone());
	}
}
