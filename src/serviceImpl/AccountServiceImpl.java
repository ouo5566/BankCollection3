package serviceImpl;

import domain.*;
import service.AccountService;

public class AccountServiceImpl implements AccountService {
	private static AccountService instance = new AccountServiceImpl();
	public static AccountService getInstance() {return instance;}
	private AccountServiceImpl() {}

	@Override
	public void createBasic(AccountBean account) {
		account.setAccountType(AccountBean.ACCOUNT_TYPE);
		account.setAccountNo(AdminServiceImpl.getInstance().createAccountNo(AdminServiceImpl.getInstance().createRandom(0,999_999_999)));
		account.setCreateDate(AdminServiceImpl.getInstance().createDate());
		System.out.println(account);
//		list.add(account);
	}

	@Override
	public void createMinus(AccountBean account) {
//		account.setAccountNo(createAccountNo(createRandom(0,999_999_999)));
		account.setAccountType(MinusAccountBean.ACCOUNT_TYPE);
//		account.setCreateDate(createDate());
//		list.add(account);
	}
	
	@Override
	public AccountBean findById(AccountBean account) {
		AccountBean temp = new AccountBean();
//		for (int i = 0; i < list.size(); i++) {
//			if (account.getUid().equals(list.get(i).getUid()) && account.getPassWord().equals(list.get(i).getPassWord())) {
//				temp = list.get(i);
//				break;
//			}
//		}
		return temp;
	}

	@Override
	public int selectCount() {
		return 0;
	}

	@Override
	public void changePassWord(AccountBean account) {
		String pass = account.getPassWord().split("/")[0];
		String newPass = account.getPassWord().split("/")[1];
		account.setPassWord(pass);
//		list.get(list.indexOf(findById(account))).setPassWord(newPass);
	}

	@Override
	public void deleteAccount(AccountBean account) {
		String pass = account.getPassWord().split("/")[0];
		String confirmPass = account.getPassWord().split("/")[1];
		account.setPassWord(pass);
//		if(pass.equals(confirmPass)) list.remove(list.indexOf(findById(account)));
	}
}
