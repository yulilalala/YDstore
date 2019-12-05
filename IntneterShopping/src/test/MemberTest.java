package test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.Member;
import domain.User;
import service.MemberService;
import service.UserService;

public class MemberTest {
	//@Test
	public void demo01() {
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		MemberService memberService=applicationContext.getBean("memberService", MemberService.class);
		List<Member> members=memberService.findAll();
		for(Member m: members) {
			System.out.println(m.getMember_id());
			System.out.println(m.getMember_grade());
			System.out.println(m.getMember_jifen());
			System.out.println(m.getMember_remain());
		}
	}
	@Test
	public void demo02() {
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		MemberService memberService=applicationContext.getBean("memberService", MemberService.class);
		Member member=new Member();
		member.setMember_jifen(100);
		member.setMember_grade(2);
		member.setMember_remain(2);
		memberService.save(member);
	}
	//@Test
	public void demo03() {
		Member member=new Member();
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		MemberService memberService=applicationContext.getBean("memberService", MemberService.class);
		member.setMember_id(2018);
		Member members=memberService.findById(member.getMember_id());
		System.out.println(""+members.getMember_grade());
		System.out.println(""+members.getMember_id());
		System.out.println(""+members.getMember_jifen());
		System.out.println(""+members.getMember_remain());
	}
	//@Test
	public void demo04() {
		Member member=new Member();
		String xmlpath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
		MemberService memberService=applicationContext.getBean("memberService", MemberService.class);
		member.setMember_id(2018);
		Member members=memberService.findById(member.getMember_id());
		memberService.delete(member.getMember_id());
	}
	
}	
