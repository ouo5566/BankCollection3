package service;

import java.util.List;

import domain.AccountBean;
import domain.MemberBean;

public interface AdminService {
	public void createStaff(MemberBean staff);
	public List<MemberBean> memberList();
	public List<MemberBean> findMemberByName(String param);
	public MemberBean findMemberById(MemberBean member);
	public List<AccountBean> accountList();
	public List<AccountBean> findAccountByName(String param);
	public String createAccountNo(String random);
	public String createRandom(int start, int end);
	public String createDate();
}
