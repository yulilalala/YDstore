package action;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Sku;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.SkuService;
import service.SpuService;

public class SkuAction extends ActionSupport implements ModelDriven<Sku> {
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
	//依赖注入skuService
	private SkuService skuService;
	public void setSkuService(SkuService skuService) {
		this.skuService = skuService;
	}
	private SpuService spuService;
	
	public void setSpuService(SpuService spuService) {
		this.spuService = spuService;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Sku sku=new Sku();
	@Override
	//封装数据
	public Sku getModel() {
		// TODO Auto-generated method stub
		return sku;
	}
	//添加数据
	public String save() {
		b=this.skuService.save(sku);
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
		b=this.skuService.update(sku);
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
		b=this.skuService.delete(sku.getSku_id());
		jsonObject.clear();
		if(b) {
			jsonObject.put("result", "删除数据成功!");
		}
		else {
			jsonObject.put("result", "删除数据失败！");
		}
		return "delete";
	}
	//通过ID查询数据
	public String findById(Integer id) {
		Sku skus=this.skuService.findById(id);
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(skus,jsonConfig).toString();
		return "findById";
	}
	//查询所有数据
	public String findAll(){
		List<Sku> skumessage=this.skuService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(skumessage,jsonConfig).toString();
		return "findAll";
	}
	//图片上传
		private File[] mainimage; //上传的文件
		private String[] mainimageFileName; //文件名称
	    private String[] imageContentType; //文件类型
		public File[] getMainimage() {
			return mainimage;
		}
		public void setMainimage(File[] mainimage) {
			this.mainimage = mainimage;
		}
		public String[] getMainimageFileName() {
			return mainimageFileName;
		}
		public void setMainimageFileName(String[] mainimageFileName) {
			this.mainimageFileName = mainimageFileName;
		}
		public String[] getImageContentType() {
			return imageContentType;
		}
		public void setImageContentType(String[] imageContentType) {
			this.imageContentType = imageContentType;
		}
		public String upload() throws IOException {
			ServletActionContext.getRequest().setCharacterEncoding("UTF-8");
	        String realpath = ServletActionContext.getServletContext().getRealPath("/images");
	        String bigimageurl=saveImage(mainimage, mainimageFileName, realpath);
	        sku.setMain(bigimageurl);
			return SUCCESS;
		}
		public String saveImage(File[] image,String[] imageFileName,String realpath) throws IOException {
			 if (image != null) {
		        	//判断是否存在文件夹
		            File savedir=new File(realpath);
		            if(!savedir.getParentFile().exists())
		                savedir.getParentFile().mkdirs();
		            //更名
		            for(int i=0;i<image.length;i++) {
		         	   Date date=new Date();	
		          	   SimpleDateFormat stingDateFormat  = new SimpleDateFormat("yyyyMMddHHmmss");
		          	   imageFileName[i]= stingDateFormat.format(date)+imageFileName[i];
		               FileUtils.copyFile(image[i], new File(savedir, imageFileName[i]));
		            }

		            ActionContext.getContext().put("message", "文件上传成功");
		        }
		        //路径保存到数据库
		        String imageurl=new String();
		        for(int j=0;j<image.length;j++) {
		        	imageurl=imageurl+" "+imageFileName[j];
		        }
			return imageurl;
		}

}
