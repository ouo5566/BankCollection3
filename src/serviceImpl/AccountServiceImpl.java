package serviceImpl;

import java.util.*;
import domain.*;
import service.AccountService;
import java.text.SimpleDateFormat;

public class AccountServiceImpl implements AccountService {
	Map<String, AccountBean> map;

	public AccountServiceImpl() {
		map = new HashMap<>();
	}

	@Override
	public void createBasic(AccountBean account) {
		account.setAccountNo(createAccountNo(createRandom(0,999_999_999)));
		account.setAccountType(AccountBean.ACCOUNT_TYPE);
		account.setCreateDate(createDate());
		map.put(account.getUid(), account);
	}

	@Override
	public void createMinus(AccountBean account) {
		account.setAccountNo(createAccountNo(createRandom(0,999_999_999)));
		account.setAccountType(MinusAccountBean.ACCOUNT_TYPE);
		account.setCreateDate(createDate());
		map.put(account.getUid(), account);
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
	
	@Override
	public Map<String, AccountBean> list() {
		return map;
	}

	@Override
	public List<AccountBean> findByName(String param) {
		List<AccountBean> sameName = new ArrayList<>();
		Set<AccountBean> nameSet = new HashSet<>();
		for(Map.Entry<String, AccountBean> e : map.entrySet()) {
			if(param.equals(e.getValue().getName())) {
				nameSet.add(e.getValue());
			}
		}
		Iterator<AccountBean> it = nameSet.iterator();
		while(it.hasNext()) {
			sameName.add(it.next());
		}
		return sameName;
	}

	@Override
	public AccountBean findById(AccountBean account) {
		AccountBean temp = map.get(account.getUid());
		if(!(account.getPassWord().equals(temp.getPassWord()))) temp = null;
		return temp;
	}

	@Override
	public int selectCount() {
		return map.size();
	}

	@Override
	public void updateAccount(AccountBean account) {
		String pass = account.getPassWord().split("/")[0];
		String newPass = account.getPassWord().split("/")[1];
		account.setPassWord(pass);
		AccountBean temp = findById(account);
		if(temp == null) return;
		if(temp.getPassWord().equals(pass)) {
			temp.setPassWord(newPass);
			map.put(account.getUid(), temp);
//			map.get(account.getUid()).setPassWord(newPass);
		}
	}

	@Override
	public void deleteAccount(AccountBean account) {
//		String pass = account.getPassWord().split("/")[0];
		String confirmPass = account.getPassWord().split("/")[1];
		account.setPassWord(account.getPassWord().split("/")[0]);
		AccountBean temp = findById(account);
		if(temp == null) return;
		if(confirmPass.equals(temp.getPassWord())) {
			map.remove(temp.getUid());
		}
	}

	@Override
	public Map<String, AccountBean> minusList() {
		 Map<String, AccountBean> minusList = new HashMap<>();
		 
//		for(int i = 0 ; i < list.size() ; i++ ) {
//			if(list.get(i) instanceof MinusAccountBean) {
//				arr.add(list.get(i));
//			}
//		}
		return minusList;
	}
}
