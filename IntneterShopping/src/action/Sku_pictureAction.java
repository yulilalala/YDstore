package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Sku_picture;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.Sku_pictureService;

public class Sku_pictureAction extends ActionSupport implements ModelDriven<Sku_picture> {

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
	//依赖注入Sku_pictureService
	private Sku_pictureService sku_pictureService;
	
	public void setSku_pictureService(Sku_pictureService sku_pictureService) {
		this.sku_pictureService = sku_pictureService;
	}
	//数据封装
	private Sku_picture sku_picture=new Sku_picture();
	@Override
	public Sku_picture getModel() {
		// TODO Auto-generated method stub
		return sku_picture;
	}
	//添加
	public String save() {
		b=this.sku_pictureService.save(sku_picture);
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
		b=this.sku_pictureService.update(sku_picture);
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
		b=this.sku_pictureService.delete(sku_picture.getSku_picture_id());
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
		Sku_picture sku_pictures=this.sku_pictureService.findById(sku_picture.getPicture_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(sku_pictures,jsonConfig).toString();
		return "findById";
	}
	//查找所有
	public String findAll() {
		List<Sku_picture> sku_picturesMessage=this.sku_pictureService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(sku_picturesMessage,jsonConfig).toString();
		return "findAll";
	}

}
