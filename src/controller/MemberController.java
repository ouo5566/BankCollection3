package controller;

import javax.swing.JOptionPane;
import domain.*;
import serviceImpl.*;

public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {return instance;}
	private MemberController() {}
	public void createUser(UserBean member) {
		System.out.println("======MemberController======");
		System.out.print("[화면에서 넘어온 객체]\n" + member);
		MemberServiceImpl.getInstance().createUser(member);
//		service.createUser(member);
	}

	public void list() {
//		JOptionPane.showMessageDialog(null, service.list());
	}
	
	public void update() {
		MemberBean member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPassword(JOptionPane.showInputDialog("비밀번호")+"/"+JOptionPane.showInputDialog("새로운비밀번호"));
//		service.updatePassWord(member);
	}
	public void delete() {
		MemberBean member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPassword(JOptionPane.showInputDialog("비밀번호")+"/"+JOptionPane.showInputDialog("새로운비밀번호"));
//		service.deleteMember(member);
	}
}
