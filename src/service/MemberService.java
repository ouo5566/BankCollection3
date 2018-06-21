package service;
import java.util.Map;
import java.util.List;
import domain.*;

public interface MemberService {
	public void createUser(MemberBean user);
	public void createStaff(MemberBean staff);
	public Map<String, MemberBean> list();
	public List<MemberBean> findByName(String param);
	public MemberBean findById(MemberBean member);
	public void updatePassWord(MemberBean member);
	public void deleteMember(MemberBean member);
}