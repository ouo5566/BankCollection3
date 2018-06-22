package serviceImpl;
import java.text.SimpleDateFormat;
import java.util.*;

import domain.*;
import service.*;

public class AdminServiceImpl implements AdminService{
	private static AdminService instance = new AdminServiceImpl();
	public static AdminService getInstance() {return instance;}
	public AdminServiceImpl() {}

	@Override
	public void createStaff(MemberBean staff) {
		((StaffBean) staff).setAccessNum("1234");
//		list.add(staff);
	}

	@Override
	public List<MemberBean> memberList() {
		return null;
	}

	@Override
	public List<MemberBean> findMemberByName(String param) {
		List<MemberBean> arr = new ArrayList<>();
//		for(MemberBean e : list) {
//			if(param.equals(e.getName())){
//				arr.add(e);
//			}
//		}
		return arr;
	}

	@Override
	public MemberBean findMemberById(MemberBean member) {
		MemberBean temp = new MemberBean();
//		for(MemberBean e : list) {
//			if(member.getUid().equals(e.getUid()) && member.getPassword().equals(e.getPassword())) {
//				temp = e;
//				break;
//			}
//		}
		return temp;
	}

	@Override
	public List<AccountBean> accountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findAccountByName(String param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createAccountNo(String random) {
		return String.format("%s-%s-%s",random.substring(0,3),random.substring(3,6),random.substring(6,9));
	}

	@Override
	public String createRandom(int start, int end) {
		return String.format("%09d",((int)(Math.random() * end) + start));
	}

	@Override
	public String createDate() {
		return new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}
	
}
