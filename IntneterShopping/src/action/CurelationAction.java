package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Curelation;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.CurelationService;

public class CurelationAction extends ActionSupport implements ModelDriven<Curelation> {

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
	//依赖注入CurelationService
	private CurelationService curelationService;
	
	public void setCurelationService(CurelationService curelationService) {
		this.curelationService = curelationService;
	}
	//数据封装
	private Curelation curelation=new Curelation();
	@Override
	public Curelation getModel() {
		// TODO Auto-generated method stub
		return curelation;
	}
	//添加
	public String save() {
		b=this.curelationService.save(curelation);
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
		b=this.curelationService.update(curelation);
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
		b=this.curelationService.delete(curelation.getCurelation_id());
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
		Curelation curelations=this.curelationService.findById(curelation.getCurelation_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(curelations,jsonConfig).toString();
		return "findById";
	}
	//查找所有
	public String findAll() {
		List<Curelation> curelationMessage=this.curelationService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(curelationMessage,jsonConfig).toString();
		return "findAll";
	}

}
