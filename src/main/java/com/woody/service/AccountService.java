package com.woody.service;

import com.woody.domain.Account;

import java.util.List;

/**
 * 账户业务层接口
 */
public interface AccountService {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     * 保存账户
     * @param account
     */
    void saveAccount(Account account);
}
