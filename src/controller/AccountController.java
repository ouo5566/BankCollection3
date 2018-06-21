package controller;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

public class AccountController {
	public void basicAccount() {
		AccountBean account = new AccountBean();
		AccountService service = new AccountServiceImpl();
		account.setName(JOptionPane.showInputDialog("이릅"));
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPassWord(JOptionPane.showInputDialog("비밀번호"));
		service.createBasic(account);
	}
	public void minusAccount() {
		AccountBean account = new AccountBean();
		AccountService service = new AccountServiceImpl();
		account = new MinusAccountBean();
		account.setName(JOptionPane.showInputDialog("이릅"));
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPassWord(JOptionPane.showInputDialog("비밀번호"));
		((MinusAccountBean) account).setLimit(JOptionPane.showInputDialog("대출한도"));
		service.createMinus(account);
	}
	public void list() {
		AccountService service = new AccountServiceImpl();
		JOptionPane.showMessageDialog(null,service.list());
	}
	public void minusList() {
		AccountService service = new AccountServiceImpl();
		JOptionPane.showMessageDialog(null,service.minusList());
	}
	public void findById() {
		AccountBean account = new AccountBean();
		AccountService service = new AccountServiceImpl();
		account.setUid((JOptionPane.showInputDialog("아이디")));
		account.setPassWord(JOptionPane.showInputDialog("패스워드"));
		JOptionPane.showMessageDialog(null,service.findById(account));
	}
	public void findByName() {
		AccountService service = new AccountServiceImpl();
		JOptionPane.showMessageDialog(null,service.findByName(JOptionPane.showInputDialog("이름")));
	}
	public void changePassWord() {
		AccountBean account = new AccountBean();
		AccountService service = new AccountServiceImpl();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPassWord(JOptionPane.showInputDialog("비밀번호") + "/" + JOptionPane.showInputDialog("새비밀번호"));
		service.updateAccount(account);
	}
	public void deleteAccount() {
		AccountBean account = new AccountBean();
		AccountService service = new AccountServiceImpl();
		account.setUid(JOptionPane.showInputDialog("아이디"));
		account.setPassWord(JOptionPane.showInputDialog("비밀번호") + "/" + JOptionPane.showInputDialog("비밀번호확인"));
		service.deleteAccount(account);
	}
}
