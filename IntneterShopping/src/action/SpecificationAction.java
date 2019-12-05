package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Specification;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.SpecificationService;

public class SpecificationAction extends ActionSupport implements ModelDriven<Specification> {

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
	//依赖注入SpecificationService
	private SpecificationService specificationService;
	
	public void setSpecificationService(SpecificationService specificationService) {
		this.specificationService = specificationService;
	}
	//数据封装
	private Specification specification=new Specification();
	@Override
	public Specification getModel() {
		// TODO Auto-generated method stub
		return specification;
	}
	//添加
	public String save() {
		b=this.specificationService.save(specification);
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
		b=this.specificationService.update(specification);
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
		b=this.specificationService.delete(specification.getSpecification_id());
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
		Specification specifications=this.specificationService.findById(specification.getSpecification_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(specifications,jsonConfig).toString();
		return "findById";
	}
	//查询所有
	public String findAll() {
		List<Specification> specificationMessage=this.specificationService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(specificationMessage,jsonConfig).toString();
		return "findAll";
	}		



}
