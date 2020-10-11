package com.jimi.springframework.beans;

import com.jimi.springframework.beans.inter.AccountService;
import com.jimi.springframework.beans.inter.ClientBeanService;
import com.jimi.springframework.beans.inter.impl.AccountServiceImpl;
import com.jimi.springframework.beans.inter.impl.ClientBeanServiceImpl;

/**
 * One factory class can also hold more than one factory method.
 *
 */
public class DefaultServiceLocator {

    private static ClientBeanService clientBeanService = new ClientBeanServiceImpl();
    private static AccountService accountService = new AccountServiceImpl();

    public ClientBeanService createClientServiceInstance() {
        return clientBeanService;
    }

    public AccountService createAccountServiceInstance() {
        return accountService;
    }
}