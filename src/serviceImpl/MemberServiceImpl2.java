package serviceImpl;
import java.util.List;
import domain.*;
import service.MemberService2;
import java.util.ArrayList;

public class MemberServiceImpl2 implements MemberService2{
	List<MemberBean> list;
	public MemberServiceImpl2() {
		list = new ArrayList<MemberBean>();
	}
	@Override
	public void createUser(UserBean user) {
		user.setCreditRating("7등급");
//		boolean flag = list.add(user);
//		String result = (flag)?"등록성공":"등록실패";
//		System.out.println("실행결과 : " + result);
		System.out.println("실행결과 : " + ((list.add(user))?"등록성공":"등록실패"));
	}

	@Override
	public void createStaff(StaffBean staff) {
		staff.setAccessNum("1234");
		System.out.println("실행결과 : " + ((list.add(staff))?"등록성공":"등록실패"));
	}

	@Override
	public List<MemberBean> list() {
		return list;
	}

	@Override
	public List<MemberBean> search(String param) {
		List<MemberBean> arr = new ArrayList<>();
		for(MemberBean e : list) {
			if(param.equals(e.getName())){
				arr.add(e);
			}
		}
		return arr;
	}

	@Override
	public MemberBean search(MemberBean member) {
		MemberBean temp = new MemberBean();
		for(MemberBean e : list) {
			if(member.getUid().equals(e.getUid()) && member.getPassword().equals(e.getPassword())) {
				temp = e;
				break;
			}
		}
		return temp;
	}

	@Override
	public void update(MemberBean member) {
		search(member).setPassword(member.getPassword());
	}

	@Override
	public void delete(MemberBean member) {
		list.remove(list.indexOf(search(member)));
		//list.remove(search(member));
	}
	
}