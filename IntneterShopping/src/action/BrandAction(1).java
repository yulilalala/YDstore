package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Brand;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.BrandService;

public class BrandAction extends ActionSupport implements ModelDriven<Brand> {

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
	//依赖注入BrandService
	private BrandService brandService;
	public void setBrandService(BrandService brandService) {
		this.brandService = brandService;
	}
	private static final long serialVersionUID = 1L;
	private Brand brand=new Brand();
	//封装数据
	@Override
	public Brand getModel() {
		// TODO Auto-generated method stub
		return brand;
	}
	//添加数据
	public String save() {
		b=this.brandService.save(brand);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "添加数据成功!");
		}
		else {
			jsonObject.put("result", "添加数据失败！");
		}
		return "save";
	}
	//删除数据
	public String  delete() {
		b=this.brandService.delete(brand.getBrand_id());
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "删除数据成功!");
		}
		else {
			jsonObject.put("result", "删除数据失败！");
		}
		return "delete";
	}
	//更新数据
	public String update() {
		b=this.brandService.update(brand);
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "更新数据成功!");
		}
		else {
			jsonObject.put("result", "更新数据失败！");
		}
		return "update";
	}
	//通过ID查询数据
	public String findById() {
		Brand brands=this.brandService.findById(brand.getBrand_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(brands,jsonConfig).toString();
		return "findById";
	}
	//查询所有数据
	public String findAll() {
		List<Brand> brandsMessage=this.brandService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(brandsMessage,jsonConfig).toString();
		return "findAll";
	}
	

}
