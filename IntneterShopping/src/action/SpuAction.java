package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Spu;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.SpuService;

public class SpuAction extends ActionSupport implements ModelDriven<Spu> {

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
	private Spu spu=new Spu();
	//依赖注入Spuservice
	private SpuService spuService;
	
	public void setSpuService(SpuService spuService) {
		this.spuService = spuService;
	}
	//封装数据
	@Override
	public Spu getModel() {
		// TODO Auto-generated method stub
		return spu;
	}
	//添加数据
	public String save() {
		b=this.spuService.save(spu);
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
		b=this.spuService.update(spu);
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
		b=this.spuService.delete(spu.getSpu_id());
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "删除数据成功!");
		}
		else {
			jsonObject.put("result", "删除数据失败！");
		}
		return "delete";
	}
	//通过ID查找数据
	public String findById() {
		Spu spus=this.spuService.findById(spu.getSpu_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(spus,jsonConfig).toString();
		return "findById";
	}
	//查询所有
	public String findAll() {
		List<Spu> spuMessage=this.spuService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(spuMessage,jsonConfig).toString();
		return "findAll";
	}

}
