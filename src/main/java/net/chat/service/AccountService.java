package net.chat.service;

import net.chat.domain.WxAccount;

public interface AccountService {

	public void saveAccount(WxAccount account);

	public void editAccount(WxAccount account);

	public void deleteAccount(Long accountId);

	public void ListAllAcount(int pageNo, int pageSize);

	public WxAccount findAcountById(Long accountId);

}
