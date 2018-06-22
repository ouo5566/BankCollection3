package service;
import java.util.List;
import domain.*;

public interface AccountService {
	public void createBasic(AccountBean account);
	public void createMinus(AccountBean account);
	public AccountBean findById(AccountBean account);
	public int selectCount();
	public void changePassWord(AccountBean account);
	public void deleteAccount(AccountBean account);
}
