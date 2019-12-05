package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Nattribute;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.NattributeService;

public class NattributeAction extends ActionSupport implements ModelDriven<Nattribute> {

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
	//依赖注入nattributeService
	private NattributeService nattributeService;
	
	public void setNattributeService(NattributeService nattributeService) {
		this.nattributeService = nattributeService;
	}

	private static final long serialVersionUID = 1L;
	private Nattribute nattribute=new Nattribute();
	//封装数据
	@Override
	public Nattribute getModel() {
		// TODO Auto-generated method stub
		return nattribute;
	}
	//添加
	public String save() {
		b=this.nattributeService.save(nattribute);
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
		b=this.nattributeService.update(nattribute);
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
		b=this.nattributeService.delete(nattribute.getNattribute_id());
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
		Nattribute nattributes=this.nattributeService.findById(nattribute.getNattribute_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(nattributes,jsonConfig).toString();
		return "findById";
	}
	//查询所有
	public String findAll() {
		List<Nattribute> nattributeMessage=this.nattributeService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(nattributeMessage,jsonConfig).toString();
		return "findAll";
	}

}
