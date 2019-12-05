package action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Shop;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.ShopService;

public class ShopAction extends ActionSupport implements ModelDriven<Shop> {

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
	//依赖注入ShopService
	private ShopService shopService;
	
	public void setShopService(ShopService shopService) {
		this.shopService = shopService;
	}
	private static final long serialVersionUID = 1L;
	private Shop shop=new Shop();
	//封装数据
	@Override
	public Shop getModel() {
		// TODO Auto-generated method stub
		return shop;
	}
	//添加
	public String save() {
		b=this.shopService.save(shop);
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
		b=this.shopService.update(shop);
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
		b=this.shopService.delete(shop.getShop_id());
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
		Shop shops=this.shopService.findById(shop.getShop_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(shops,jsonConfig).toString();
		return "findById";
	}
	//查询所有
	public String findAll() {
		List<Shop> shopMessage=this.shopService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(shopMessage,jsonConfig).toString();
		return "findAll";
	}

}
