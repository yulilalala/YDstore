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
import domain.Picture;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import service.PictureService;

public class PictureAction extends ActionSupport implements ModelDriven<Picture> {

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
	//依赖注入PictureService
	private PictureService pictureService;
	
	public void setPictureService(PictureService pictureService) {
		this.pictureService = pictureService;
	}
	//数据封装
	private Picture picture=new Picture();
	@Override
	public Picture getModel() {
		// TODO Auto-generated method stub
		return picture;
	}
	//添加
	public String save() {
		b=this.pictureService.save(picture);
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
		b=this.pictureService.update(picture);
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
		b=this.pictureService.delete(picture.getPicture_id());
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
		Picture pictures=this.pictureService.findById(picture.getPicture_id());
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(pictures,jsonConfig).toString();
		return "findById";
	}
	//查找所有
	public String findAll() {
		List<Picture> pictureMessage=this.pictureService.findAll();
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		result = JSONArray.fromObject(pictureMessage,jsonConfig).toString();
		return "findAll";
	}
	//图片上传
	private File[] bigimage; //上传的文件
	/*private File[] smallimage;
	private File[] middleimage;*/
	private String[] bigimageFileName;
	/*private String[] middleimageFileName;
    private String[] smallimageFileName;*/ //文件名称
    private String[] imageContentType; //文件类型
	public File[] getBigimage() {
		return bigimage;
	}
	public void setBigimage(File[] bigimage) {
		this.bigimage = bigimage;
	}
	/*public File[] getSmallimage() {
		return smallimage;
	}
	public void setSmallimage(File[] smallimage) {
		this.smallimage = smallimage;
	}
	public File[] getMiddleimage() {
		return middleimage;
	}
	public void setMiddleimage(File[] middleimage) {
		this.middleimage = middleimage;
	}*/
	public String[] getBigimageFileName() {
		return bigimageFileName;
	}
	public void setBigimageFileName(String[] bigimageFileName) {
		this.bigimageFileName = bigimageFileName;
	}
	/*public String[] getMiddleimageFileName() {
		return middleimageFileName;
	}
	public void setMiddleimageFileName(String[] middleimageFileName) {
		this.middleimageFileName = middleimageFileName;
	}
	public String[] getSmallimageFileName() {
		return smallimageFileName;
	}
	public void setSmallimageFileName(String[] smallimageFileName) {
		this.smallimageFileName = smallimageFileName;
	}*/
	public String[] getImageContentType() {
		return imageContentType;
	}
	public void setImageContentType(String[] imageContentType) {
		this.imageContentType = imageContentType;
	}
	public String upload() throws IOException {
		ServletActionContext.getRequest().setCharacterEncoding("UTF-8");
        String realpath = ServletActionContext.getServletContext().getRealPath("/images");
        //上传到tomcat
        /*String smallimageurl=saveImage(smallimage, smallimageFileName, realpath);
        String middleimageurl=saveImage(middleimage, middleimageFileName, realpath);*/
        String bigimageurl=saveImage(bigimage, bigimageFileName, realpath);
        /*picture.setSmall_url(smallimageurl);
        picture.setMiddle_url(middleimageurl);*/
        picture.setBig_url(bigimageurl);
		return SUCCESS;
	}
	public String saveImage(File[] image,String[] imageFileName,String realpath) throws IOException {
		 if (image != null) {
	        	//判断是否存在文件夹
	            File savedir=new File(realpath);
	            if(!savedir.getParentFile().exists())
	                savedir.getParentFile().mkdirs();
	            /*//循环上传
	            for(int i=0;i<image.length;i++){
	                File savefile = new File(savedir, imageFileName[i]);
	                FileUtils.copyFile(image[i], savefile);
	            }*/
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
