package com.jimi.springframework.pet.service.impl;

import com.jimi.springframework.pet.dao.jpa.JpaAccountDao;
import com.jimi.springframework.pet.dao.jpa.JpaItemDao;
import com.jimi.springframework.pet.service.PetStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

public class PetStoreServiceImpl implements PetStoreService {
    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }

    private JpaAccountDao accountDao;


    private JpaItemDao itemDao;

    @Override
    public List<String> getUsernameList() {
        return null;
    }
}
