package test;

import java.text.SimpleDateFormat;

import org.hibernate.Session;
import org.junit.Test;

import domain.Brand;
import domain.Classification;
import domain.Member;
import domain.Nattribute;
import domain.Picture;
import domain.Shop;
import domain.Sku;
import domain.Specification;
import domain.Specification_group;
import domain.Specification_options;
import domain.Spu;
import domain.User;
import domain.Vattribute;
public class OneToManyTest {
	// 1.添加数据,classification-->nattribute-->vattribute
	@Test
	public void test1() {
		// 创建session
		Session session = HibernateUtils.getSession();
		// 开启事务
		session.beginTransaction();
		// 1.创建一个客户
		Classification c1=new Classification();
		c1.setClassification_name("食品");
		c1.setFclassification_id(0);
		Nattribute n1=new Nattribute();
		n1.setNattribute_name("大米");
		Nattribute n2=new Nattribute();
		n2.setNattribute_name("高粱");
		Vattribute v1=new Vattribute();
		v1.setVattribute_value("多粉");
		Specification_group s1=new Specification_group();
		s1.setSpecification_group_name("热带");
		Specification_group s2=new Specification_group();
		s2.setSpecification_group_name("中国");
		Specification_group g1=new Specification_group();
		g1.setSpecification_group_name("家具");
		Specification_options o1=new Specification_options();
		o1.setSpecification_options_name("红木");
		Specification_options o2=new Specification_options();
		o2.setSpecification_options_name("黄木");
		Specification ss1=new Specification();
		ss1.setSpecification_name("手工");
		Specification ss2=new Specification();
		ss2.setSpecification_name("机器");
		o1.setSpecification_group(g1);
		o2.setSpecification_group(g1);
		ss1.setSpecification_options(o1);
		ss2.setSpecification_options(o1);
		ss1.setSpecification_options(o2);
		ss2.setSpecification_options(o2);
		ss2.setSpecification_options(o1);
		s2.setClassification(c1);
		s1.setClassification(c1);
		n1.setClassification(c1);
		n2.setClassification(c1);
		v1.setNattribute(n1);
		session.save(c1);
		session.save(n1);
		session.save(n2);
		session.save(v1);
		session.save(s1);
		session.save(s2);
		session.save(g1);
		session.save(o1);
		session.save(o2);
		session.save(ss2);
		session.save(ss1);
		// 提交事务
		session.getTransaction().commit();
		// 关闭session
		session.close();
	}
	//2.添加数据,classification-->specification_group-->specification_options-->specification
	@Test
	public void test2() {
		// 创建session
		Session session = HibernateUtils.getSession();
		// 开启事务
		session.beginTransaction();
		// 1.创建一个客户
		Classification c1=new Classification();
		c1.setClassification_name("水果");
		Specification_group s1=new Specification_group();
		s1.setSpecification_group_name("热带");
		Specification_group s2=new Specification_group();
		s2.setSpecification_group_name("中国");
		s2.setClassification(c1);
		s1.setClassification(c1);
		session.save(c1);
		session.save(s1);
		session.save(s2);
		// 提交事务
		session.getTransaction().commit();
		// 关闭session
		session.close();
	}
	//2.添加数据,specification_group-->specification_options-->specification
		@Test
		public void test3() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户
			Specification_group g1=new Specification_group();
			g1.setSpecification_group_name("家具");
			Specification_options o1=new Specification_options();
			o1.setSpecification_options_name("红木");
			Specification_options o2=new Specification_options();
			o2.setSpecification_options_name("黄木");
			Specification s1=new Specification();
			s1.setSpecification_name("手工");
			Specification s2=new Specification();
			s2.setSpecification_name("机器");
			s2.setSpecification_options(o1);
			o1.setSpecification_group(g1);
			o2.setSpecification_group(g1);
			s1.setSpecification_options(o1);
			s2.setSpecification_options(o1);
			s1.setSpecification_options(o2);
			s2.setSpecification_options(o2);
			session.save(g1);
			session.save(o1);
			session.save(o2);
			session.save(s2);
			session.save(s1);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();
		}
		//2.添加数据,classification-->spu
		@Test
		public void test4() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户
			Classification c1=new Classification();
			c1.setClassification_name("服装");
			Spu s1=new Spu();
			s1.setSpu_name("衬衫");
			Spu s2=new Spu();
			s2.setSpu_name("牛仔");
			s1.setClassification(c1);
			s2.setClassification(c1);
			session.save(c1);
			session.save(s1);
			session.save(s2);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();
		}
		//2.添加数据,brand-->spu
		@Test
		public void test5() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户
			Brand b1=new Brand();
			b1.setBrand_name("安踏");
			Spu s1=new Spu();
			s1.setSpu_name("衣服");
			Spu s2=new Spu();
			s2.setSpu_name("鞋子");
			session.save(b1);
			session.save(s1);
			session.save(s2);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();
		}	
		//2.添加数据,specification<-spu_options->spu
		@Test
		public void test6() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户;
			Spu s1=new Spu();
			s1.setSpu_name("西装");
			Specification sp1=new Specification();
			sp1.setSpecification_name("红色");
			Specification sp2=new Specification();
			sp2.setSpecification_name("黄色");
			s1.getSpecifications().add(sp1);
			s1.getSpecifications().add(sp2);
			session.save(sp1);
			session.save(sp2);
			session.save(s1);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();
		}	
		//2.添加数据,spu-->sku
		@Test
		public void test7() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户;
			Spu s1=new Spu();
			s1.setSpu_name("唐装");
			Sku u1=new Sku();
			u1.setSku_name("马褂");
			Sku u2=new Sku();
			u2.setSku_name("旗袍");
			u1.setSpu(s1);
			u2.setSpu(s1);
			session.save(s1);
			session.save(u1);
			session.save(u2);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();
		}	
		//2.添加数据,shop-->sku
		@Test
		public void test8() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户;
			Shop s1=new Shop();
			s1.setShop_name("懒洋洋");
			Sku u1=new Sku();
			u1.setSku_name("马褂");
			Sku u2=new Sku();
			u2.setSku_name("旗袍");
			u1.setShop(s1);
			u2.setShop(s1);
			session.save(s1);
			session.save(u1);
			session.save(u2);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();	
		}
		//2.添加数据,picture<-->sku
		@Test
		public void test9() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户;
			Picture p1=new Picture();
			p1.setBig_url("124");
			Sku s1=new Sku();
			s1.setSku_name("苹果");
			p1.getSkus().add(s1);
			session.save(s1);
			session.save(p1);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();	
		}
		//2.添加数据,vattribute-->sku
		@Test
		public void test10() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户;
			Vattribute v1=new Vattribute();
			v1.setVattribute_value("十斤装");
			Sku s1=new Sku();
			s1.setSku_name("苹果");
			v1.getSkus().add(s1);
			session.save(s1);
			session.save(v1);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();	
		}
		//spu-->picture
		@Test
		public void test11() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户;
			Spu s1=new Spu();
			s1.setSpu_name("交通");
			Picture p1=new Picture();
			p1.setBig_url("1");
			p1.setSpu(s1);
			session.save(s1);
			session.save(p1);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();	
		}
		//user-->member
		@Test
		public void test12() {
			// 创建session
			Session session = HibernateUtils.getSession();
			// 开启事务
			session.beginTransaction();
			// 1.创建一个客户;
			Member m1=new Member();
			User u1=new User();
			u1.setUser_address("123");
			u1.setUser_name("张三");
			u1.setUser_nickname("小三");
			u1.setUser_password("123");
			u1.setUser_phone("12345678910");
			SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd"); 
			u1.setUser_regdate(date.format(System.currentTimeMillis()));
			u1.setUser_sex((byte) 1);
			u1.setUser_types(2);
			m1.setMember_grade(2);
			m1.setUser(u1);
			session.save(u1);
			session.save(m1);
			// 提交事务
			session.getTransaction().commit();
			// 关闭session
			session.close();	
		}	
}
