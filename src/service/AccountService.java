package service;
import java.util.List;
import java.util.Map;
import domain.*;

public interface AccountService {
	public void createBasic(AccountBean account);
	public void createMinus(AccountBean account);
	public String createAccountNo(String random);
	public String createRandom(int start, int end);
	public String createDate();
	public Map<String, AccountBean> list();
	public List<AccountBean> findByName(String param);
	public AccountBean findById(AccountBean account);
	public int selectCount();
	public void updateAccount(AccountBean account);
	public void deleteAccount(AccountBean account);
	public Map<String, AccountBean> minusList();
}
