package service;
import domain.*;

public interface MemberService {
	public void createUser(UserBean member); // 인터페이스에서 객체를 파라미터로 던질 때 최상위의 상속구조를 타입으로 던져라. 캐스팅은 메소드 내부에서 한다.
	public String login(MemberBean member);
	public void updatePassWord(MemberBean member);
	public void deleteMember(MemberBean member);
}