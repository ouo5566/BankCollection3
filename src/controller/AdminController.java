package controller;

import javax.swing.JOptionPane;
import domain.*;
import serviceImpl.*;

public class AdminController {
	private static AdminController instance = new AdminController();
	public static AdminController getInstance() {return instance;}
	private AdminController() {}
	public void createStaff(StaffBean member) {
		AdminServiceImpl.getInstance().createStaff(member);
	}
	
	public void memberList(){
		
	}
	public void findByMemberName() {
//		JOptionPane.showMessageDialog(null,service.findByName(JOptionPane.showInputDialog("이름")));
	}
	public void findByMemberId() {
		MemberBean member = new MemberBean();
		member.setUid(JOptionPane.showInputDialog("아이디"));
		member.setPassword(JOptionPane.showInputDialog("비밀번호"));
//		JOptionPane.showMessageDialog(null,service.findById(member));
	}
	public void accountList(){
		
	}
	public void findByAccountName() {
//		JOptionPane.showMessageDialog(null,service.findByName(JOptionPane.showInputDialog("이름")));
	}
	public void createAccountNo(String random) {}
	public void createRandom(int start, int end) {}
	public void createDate() {}
	public static void main(String[] args) {
		
	}
	
}
