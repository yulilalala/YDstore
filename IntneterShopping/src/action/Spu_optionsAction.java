package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Spu_options;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.Spu_optionsService;

public class Spu_optionsAction extends ActionSupport implements ModelDriven<Spu_options> {

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
	//依赖注入Spu_optionsService
	private Spu_optionsService spu_optionsService;
	
	public void setSpu_optionsService(Spu_optionsService spu_optionsService) {
		this.spu_optionsService = spu_optionsService;
	}
	//数据封装
	private Spu_options spu_options=new Spu_options();
	@Override
	public Spu_options getModel() {
		// TODO Auto-generated method stub
		return spu_options;
	}
	//添加
	public String save() {
		b=this.spu_optionsService.save(spu_options);
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
		b=this.spu_optionsService.update(spu_options);
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
		b=this.spu_optionsService.delete(spu_options.getSpu_options_id());
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "删除数据成功!");
		}
		else {
			jsonObject.put("result", "删除数据失败！");
		}
		return "delete";
	}
	//通过ID查询
	public String findById() {
		Spu_options spu_options1=this.spu_optionsService.findById(spu_options.getSpecification_option_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(spu_options1,jsonConfig).toString();
		return "findById";
	}
	//查询所有
	public String findAll() {
		List<Spu_options> spu_optionsMessage=this.spu_optionsService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(spu_optionsMessage,jsonConfig).toString();
		return "findAll";
	}
	

}
