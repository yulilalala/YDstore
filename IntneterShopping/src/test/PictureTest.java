package test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Picture;
import domain.User;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import service.PictureService;
import service.UserService;

public class PictureTest {
	@Test
	public void demo01() {
		Picture picture=new Picture();
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		PictureService pictureService=applicationContext.getBean("pictureService", PictureService.class);
		//List<Picture> pList=pictureService.findAll();
		picture.setPicture_id(1);
		Picture pictures=pictureService.findById(picture.getPicture_id());
		/*for(Picture p:pList) {
		System.out.println(p);
		}*/
		//转换为JSON数组
		JSONArray json = JSONArray.fromObject(pictures);
		//System.out.println(JSONArray.fromObject(users));
		//遍历
		if(json.size()>0) {
			for(int i=0;i<json.size();i++){
				 // 遍历 jsonarray 数组，把每一个对象转成 json 对象
				JSONObject job = json.getJSONObject(i); 
				 String sourceStr =(String) job.get("big_url");
				 String[] sourceStrArray = sourceStr.split(" ");
			        for (int j = 0; j < sourceStrArray.length; j++) {
			            sourceStr=sourceStr+sourceStrArray[j];
			            System.out.println(sourceStr);
			        }  	 
				// 得到 每个对象中的属性值
				//System.out.println(job.get("big_url")+"=") ;
			}
		}		
	}
}
