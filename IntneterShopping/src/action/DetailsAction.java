package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Details;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.DetailsService;

public class DetailsAction extends ActionSupport implements ModelDriven<Details>{

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
	//依赖注入DetailsService
	private DetailsService detailsService;
	
	public void setDetailsService(DetailsService detailsService) {
		this.detailsService = detailsService;
	}
	//数据封装
	private Details details=new Details();
	@Override
	public Details getModel() {
		// TODO Auto-generated method stub
		return details;
	}
	//添加
	public String save() {
		b=this.detailsService.save(details);
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
		b=this.detailsService.update(details);
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
		b=this.detailsService.delete(details.getDetails_id());
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
		Details details1=this.detailsService.findById(details.getDetails_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(details1,jsonConfig).toString();
		return "findById";
	}
	//查找所有
	public String findAll() {
		List<Details> detailsMessage=this.detailsService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(detailsMessage,jsonConfig).toString();
		return "findAll";
	}
	
}
