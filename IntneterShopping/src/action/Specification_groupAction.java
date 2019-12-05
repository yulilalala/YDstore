package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Specification_group;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.Specification_groupService;

public class Specification_groupAction extends ActionSupport implements ModelDriven<Specification_group> {

	/**
	 * 
	 */
	private boolean b;
	//返回json数据
	private String result;
	JSONObject jsonObject=new JSONObject();
	
	public JSONObject getJsonObject() {
		return jsonObject;
	}
	public String getResult() {
		return result;
	}
	private static final long serialVersionUID = 1L;
	//依赖注入Specification_groupService
	private Specification_groupService specification_groupService;
	
	public void setSpecification_groupService(Specification_groupService specification_groupService) {
		this.specification_groupService = specification_groupService;
	}
	private Specification_group specification_group=new Specification_group();
	//封装数据
	@Override
	public Specification_group getModel() {
		// TODO Auto-generated method stub
		return specification_group;
	}
	//添加
	public String save() {
		b=this.specification_groupService.save(specification_group);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "添加数据成功!");
		}
		else {
			jsonObject.put("result", "添加数据失败！");
		}
		return "save";
	}
	//更新
	public String update() {
		b=this.specification_groupService.update(specification_group);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "更新数据成功!");
		}
		else {
			jsonObject.put("result", "更新数据失败！");
		}
		return "update";
	}
	//删除
	public String delete() {
		b=this.specification_groupService.delete(specification_group.getSpecification_group_id());
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "删除数据成功!");
		}
		else {
			jsonObject.put("result", "删除数据失败！");
		}
		return "delete";
	}
	//通过ID查找
	public String findById() {
		Specification_group specification_groups=this.specification_groupService.findById(specification_group.getSpecification_group_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(specification_groups,jsonConfig).toString();
		return "findById";
	}
	//查找所有
	public String findAll() {
		List<Specification_group> specification_groupMessage=this.specification_groupService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(specification_groupMessage,jsonConfig).toString();
		return "findAll";
	}

}
