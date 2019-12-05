package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Sku_choose;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.Sku_chooseService;

public class Sku_chooseAction extends ActionSupport implements ModelDriven<Sku_choose> {

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
	//依赖注入Sku_chooseService
	private Sku_chooseService sku_chooseService;
	
	public void setSku_chooseService(Sku_chooseService sku_chooseService) {
		this.sku_chooseService = sku_chooseService;
	}
	private Sku_choose sku_choose=new Sku_choose();
	//封装数据
	@Override
	public Sku_choose getModel() {
		// TODO Auto-generated method stub
		return sku_choose;
	}
	//添加数据
	public String save() {
		b=this.sku_chooseService.save(sku_choose);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "添加数据成功!");
		}
		else {
			jsonObject.put("result", "添加数据失败！");
		}
		return "save";
	}
	//更新数据
	public String update() {
		b=this.sku_chooseService.update(sku_choose);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "更新数据成功!");
		}
		else {
			jsonObject.put("result", "更新数据失败！");
		}
		return "update";
	}
	//删除数据
	public String delete() {
		b=this.sku_chooseService.delete(sku_choose.getSku_choose_id());
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
		Sku_choose sku_chooses=this.sku_chooseService.findById(sku_choose.getSku_choose_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(sku_chooses,jsonConfig).toString();
		return "findById";
	}
	//查找所有
	public String findAll() {
		List<Sku_choose> sku_chooseMessage=this.sku_chooseService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(sku_chooseMessage,jsonConfig).toString();
		return "findAll";
	}

}
