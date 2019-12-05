package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Specification_options;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.Specification_optionsService;

public class Specification_optionsAction extends ActionSupport implements ModelDriven<Specification_options> {

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
	//依赖注入Specification_optionsService
	private Specification_optionsService specification_optionsService;
	
	public void setSpecification_optionsService(Specification_optionsService specification_optionsService) {
		this.specification_optionsService = specification_optionsService;
	}
	//封装数据
	private Specification_options specification_options=new Specification_options();
	@Override
	public Specification_options getModel() {
		// TODO Auto-generated method stub
		return specification_options;
	}
	//添加
	public String save() {
		b=this.specification_optionsService.save(specification_options);
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
		b=this.specification_optionsService.update(specification_options);
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
		b=this.specification_optionsService.delete(specification_options.getSpecification_options_id());
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
		Specification_options specification_options1=this.specification_optionsService.findById(specification_options.getSpecification_options_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(specification_options1,jsonConfig).toString();
		return "findById";
	}
	//查找所有
	public String findAll() {
		List<Specification_options> specification_optionsMessage=this.specification_optionsService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(specification_optionsMessage,jsonConfig).toString();
		return "findAll";
				
	}

}
