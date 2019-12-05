package action;

import java.util.List;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.UserService;

public class UserAction extends ActionSupport  implements ModelDriven<User>{
	/**
	 * 
	 */
	private boolean b;
	private static final long serialVersionUID = 1L;
	//返回json数据
	private String result;
	JSONObject jsonObject=new JSONObject();
	
	public JSONObject getJsonObject() {
		return jsonObject;
	}
	public String getResult() {
		return result;
	}
	private User user=new User();
	//封装数据
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return this.user;
	}
	//依赖注入UserService
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	//通过ID查询数据
	public String findById() {
		User users=this.userService.findById(user.getUser_id());
		/*result = JSONObject.fromObject(users).toString();*/
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(users,jsonConfig).toString();
		return "findById";
	}
	//查询所有数据
	public String findAll() {
		List<User> userMessage=this.userService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(userMessage,jsonConfig).toString();
		return "findAll";
	}
	//添加数据
	public String save() {
		b=this.userService.save(user);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "添加数据成功!");
		}
		else {
			jsonObject.put("result", "添加数据失败！");
		}
		return "save";
	}
	//删除数据
	public String delete() {
		b=this.userService.delete(user.getUser_id());
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "删除数据成功!");
		}
		else {
			jsonObject.put("result", "删除数据失败！");
		}
		return "delete";
	}
	//通过电话号码删除用户
	public String deleteByPhone() {
		b=this.userService.deleteByPhone(user.getUser_phone());
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "删除数据成功!");
		}
		else {
			jsonObject.put("result", "删除数据失败！");
		}
		return "deleteByPhone";
	}
	//更新数据
	public String update() {
		b=this.userService.update(user);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "更新数据成功!");
		}
		else {
			jsonObject.put("result", "更新数据失败！");
		}
		return "update";
	}

}
