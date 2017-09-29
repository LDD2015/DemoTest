package com.liuxj.user.mvvm.base;

import com.liuxj.user.mvvm.net.inter.AccountService;
import com.liuxj.user.mvvm.net.manager.AccountManager;

/**
 * Created by LiuXJ on 2017/9/15.
 */

public class DataLayer {

    private AccountService accountService;

    public AccountService getAccountService() {
        return accountService;
    }

    public DataLayer(){
        accountService = new AccountManager();
    }

}
