package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Classification;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.ClassificationService;

public class ClassificationAction extends ActionSupport implements ModelDriven<Classification> {

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
	//依赖注入ClassificationService
	private ClassificationService classificationService;
	
	public void setClassificationService(ClassificationService classificationService) {
		this.classificationService = classificationService;
	}
	private Classification classification=new Classification();
	//封装数据
	@Override
	public Classification getModel() {
		// TODO Auto-generated method stub
		return classification;
	}
	//添加
	public String save() {
		b=this.classificationService.save(classification);
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
		b=this.classificationService.update(classification);
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
		b=this.classificationService.delete(classification.getClassification_id());
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
		Classification classifications=this.classificationService.findById(classification.getClassification_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(classifications,jsonConfig).toString();
		return "findById";
	}
	//查询所有
	public String findAll() {
		List<Classification> classificationMessage=this.classificationService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(classificationMessage,jsonConfig).toString();
		return "findAll";
	}

}
