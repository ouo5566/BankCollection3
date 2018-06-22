package domain;
import domain.MemberBean;
public class UserBean extends MemberBean{
	private String creditRating;
	
	public String getCreditRating() {
		return creditRating;
	}

	public void setCreditRating(String creditRating) {
		this.creditRating = creditRating;
	}

	@Override
	public String toString() {
		return String.format("[회원정보]\n 아이디 : %s\n 비밀번호 : %s\n 이름 : %s\n 주민등록번호 : %s\n 주소 : %s\n 핸드폰번호 : %s\n 신용등급 : %s\n"
				,uid,password,name,ssn,address,phone,creditRating);
	}

}
