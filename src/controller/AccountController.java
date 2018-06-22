package controller;

import javax.swing.JOptionPane;
import domain.*;
import serviceImpl.*;

public class AccountController {
	private static AccountController instance = new AccountController();
	public static AccountController getInstance() {return instance;}
	private AccountController() {}

	public void basicAccount(AccountBean account) {
		AccountServiceImpl.getInstance().createBasic(account);
	}
	public void minusAccount(AccountBean account) {
		AccountServiceImpl.getInstance().createMinus(account);
	}
	
	public void findById() {
		AccountBean account = new AccountBean();
		account.setUid((JOptionPane.showInputDialog("아이디")));
		account.setPassWord(JOptionPane.showInputDialog("패스워드"));
	}
	public int selectCount() {
		return 0;
	}
	public void changePassWord() {
		AccountBean account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPassWord(JOptionPane.showInputDialog("비밀번호") + "/" + JOptionPane.showInputDialog("새비밀번호"));
	}
	public void deleteAccount() {
		AccountBean account = new AccountBean();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPassWord(JOptionPane.showInputDialog("비밀번호") + "/" + JOptionPane.showInputDialog("비밀번호확인"));
	}
}
