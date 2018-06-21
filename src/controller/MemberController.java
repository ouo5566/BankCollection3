package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

public class MemberController {
	public void join() {
		MemberBean member = new UserBean();
		MemberService service = new MemberServiceImpl();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPassword(JOptionPane.showInputDialog("비밀번호"));
		member.setName(JOptionPane.showInputDialog("이름"));
		member.setSsn(JOptionPane.showInputDialog("주민등록번호"));
		member.setAddress(JOptionPane.showInputDialog("주소"));
		member.setPhone(JOptionPane.showInputDialog("전화번호"));
		member.setEmail(JOptionPane.showInputDialog("주소"));
		service.createUser(member);
	}
	public void add() {
		MemberBean member = new StaffBean();
		MemberService service = new MemberServiceImpl();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPassword(JOptionPane.showInputDialog("비밀번호"));
		member.setName(JOptionPane.showInputDialog("이름"));
		member.setSsn(JOptionPane.showInputDialog("주민등록번호"));
		member.setAddress(JOptionPane.showInputDialog("주소"));
		member.setPhone(JOptionPane.showInputDialog("전화번호"));
		member.setEmail(JOptionPane.showInputDialog("주소"));
		service.createStaff(member);
	}
	public void list() {
		MemberService service = new MemberServiceImpl();
		JOptionPane.showMessageDialog(null, service.list());
	}
	public void findById() {
		MemberBean member = new MemberBean();
		MemberService service = new MemberServiceImpl();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPassword(JOptionPane.showInputDialog("비밀번호"));
		JOptionPane.showMessageDialog(null,service.findById(member));
	}
	public void findByName() {
		MemberService service = new MemberServiceImpl();
		JOptionPane.showMessageDialog(null,service.findByName(JOptionPane.showInputDialog("이름")));
	}
	public void count() {
	}
	public void update() {
		MemberBean member = new MemberBean();
		MemberService service = new MemberServiceImpl();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPassword(JOptionPane.showInputDialog("비밀번호")+"/"+JOptionPane.showInputDialog("새로운비밀번호"));
		service.updatePassWord(member);
	}
	public void delete() {
		MemberBean member = new MemberBean();
		MemberService service = new MemberServiceImpl();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPassword(JOptionPane.showInputDialog("비밀번호")+"/"+JOptionPane.showInputDialog("새로운비밀번호"));
		service.deleteMember(member);
	}
}
