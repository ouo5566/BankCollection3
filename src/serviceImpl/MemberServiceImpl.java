package serviceImpl;
import java.util.*;
import domain.*;
import service.MemberService;

public class MemberServiceImpl implements MemberService{
	Map<String, MemberBean> map;
	public MemberServiceImpl() {
		map = new HashMap<>();
	}
	@Override
	public void createUser(MemberBean user) {
		((UserBean) user).setCreditRating("7등급");
		map.put(user.getUid(),user);
	}

	@Override
	public void createStaff(MemberBean staff) {
		((StaffBean) staff).setAccessNum("1234");
		map.put(staff.getUid(), staff);
	}

	@Override
	public Map<String, MemberBean> list() {
		return map;
	}
	
	@Override
	public List<MemberBean> findByName(String param) {
		List<MemberBean> arr= new ArrayList<>();
		Set<MemberBean> set = new HashSet<>();
		for(Map.Entry<String, MemberBean> e : map.entrySet()) {// value를 entry로 생각한다.
			if(param.equals(e.getValue().getName())) {//e의 value값들 중 name이 param과 같으면
				set.add(e.getValue()); // set에 value만 add한다. set에 담을 때서야 키 떼고서 value만 담는다. value는 인스턴스.
			}
		}
		Iterator<MemberBean> it = set.iterator(); // set을 마구잡이로 뒤지고 다닌다. >> 더 빠르다.
		while(it.hasNext()) {// 다음이 있으면 계속 while 
				arr.add(it.next());
		}
		return arr;
	}

	@Override
	public MemberBean findById(MemberBean member) {
		return map.get(member.getUid());
	}

	@Override
	public void updatePassWord(MemberBean member) {
		String id = member.getUid();
		String oldPass = member.getPassword().split("/")[0];
		String newPass = member.getPassword().split("/")[1];
		MemberBean mem = map.get(id);
		member.setPassword(oldPass);
		if(mem == null) {
			System.out.println("존재하는 아이디가 없습니다.");
		}else {
			if(oldPass.equals(mem.getPassword())) {
				mem.setPassword(newPass);
				map.put(id, mem);
			}	
		}
	}

	@Override
	public void deleteMember(MemberBean member) {
		map.remove(findById(member).getUid());
	}
	
}