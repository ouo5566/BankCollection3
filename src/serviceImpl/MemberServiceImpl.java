package serviceImpl;
import domain.*;
import service.*;

public class MemberServiceImpl implements MemberService{
	private static MemberService instance = new MemberServiceImpl();
	public static MemberService getInstance() {return instance;}
	private MemberServiceImpl() {}
	
	@Override
	public void createUser(UserBean member) {
		
		member.setCreditRating("7등급");
		System.out.println("=======MemberService========");
		System.out.print("[컨트롤러에서 넘어온 객체]\n" + member);
//		dao.insertMember(member);
	}
	

	@Override
	public String login(MemberBean user) {
//		MemberBean temp = new MemberBean();
		String login = "실패";
//		for(MemberBean e : list) {
//			if(user.getUid().equals(e.getUid()) && user.getPassword().equals(e.getPassword())) {
////				temp = e;
//				login = "성공";
//				break;
//			}
//		}0
		return login;
	}

	@Override
	public void updatePassWord(MemberBean member) {
//		String id = member.getUid();
//		String oldPass = member.getPassword().split("/")[0];
//		String newPass = member.getPassword().split("/")[1];
//		MemberBean mem = map.get(id);
//		member.setPassword(oldPass);
//		if(mem == null) {
//			System.out.println("존재하는 아이디가 없습니다.");
//		}else {
//			if(oldPass.equals(mem.getPassword())) {
//				mem.setPassword(newPass);
//				map.put(id, mem);
//			}	
//		}
	}

	@Override
	public void deleteMember(MemberBean member) {
//		map.remove(login(member).getUid());
	}
	
}