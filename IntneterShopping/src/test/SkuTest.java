package test;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Sku;
import service.SkuService;

public class SkuTest {
	@Test
	public void demo01() {
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		SkuService skuService=applicationContext.getBean("skuService", SkuService.class);
		Sku sku=new Sku();
		sku.setCprice(20.0);
		sku.setMain("123");
		sku.setPrice(21.0);
		Date date=new Date(1998-01-01);
		sku.setRelease_time(date);
		sku.setSku_name("京东");
		sku.setStock(3);
		skuService.save(sku);
	}
}
