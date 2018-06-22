package repository;
import java.util.List;
import domain.*;
public interface MemberDAO {
	public void insertMember(MemberBean member);
	public List<MemberBean> selectMemberlist(); // Map으로는 DB에 넣을 수 없기에 List를 쓴다.
	public List<MemberBean> selectMemberByName(String name);
	public MemberBean selectMemberById(MemberBean member);
	public MemberBean login(MemberBean member);
	public int countMembers();
	public void updateMember(MemberBean member);
	public void deleteMember(MemberBean member);
}
