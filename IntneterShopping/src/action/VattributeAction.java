package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Vattribute;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.VattributeService;

public class VattributeAction extends ActionSupport implements ModelDriven<Vattribute> {

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
	//依赖注入VattributeService
	private VattributeService vattributeService;
	
	public void setVattributeService(VattributeService vattributeService) {
		this.vattributeService = vattributeService;
	}
	//数据封装
	private Vattribute vattribute=new Vattribute();
	@Override
	public Vattribute getModel() {
		// TODO Auto-generated method stub
		return vattribute;
	}
	//添加
	public String save() {
		b=this.vattributeService.save(vattribute);
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
		b=this.vattributeService.update(vattribute);
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
		b=this.vattributeService.delete(vattribute.getVattribute_id());
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
		Vattribute vattributes=this.vattributeService.findById(vattribute.getVattribute_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(vattributes,jsonConfig).toString();
		return "findById";
	}
	//查找所有
	public String findAll() {
		List<Vattribute> vattributeMessage=this.vattributeService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(vattributeMessage,jsonConfig).toString();
		return "findAll";
	}

}
