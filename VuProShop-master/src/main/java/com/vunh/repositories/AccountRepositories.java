package com.vunh.repositories;

import com.vunh.service.CRUD;
import com.vunh.entities.Account;
import com.vunh.utils.EncryptUtil;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Optional;

public class AccountRepositories extends CRUD<Account> {
    public Optional<Account> login(String username, String password) {
        TypedQuery<Account> query = this.em.createQuery("SELECT account FROM Account account WHERE (account.username = :username OR account.email = :username)", Account.class);
        query.setParameter("username", username);
        List<Account> resultList = query.getResultList();
        if (!resultList.isEmpty()) {
            if (EncryptUtil.verify(password, resultList.get(0).getPassword())) {
                return Optional.of(resultList.get(0));
            }else{
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    private boolean checkExistUser(String username, String email) {
        TypedQuery<Account> query = this.em.createQuery("FROM Account WHERE username LIKE :username OR email LIKE :email", Account.class);
        query.setParameter("username", username.trim());
        query.setParameter("email", email.trim());
        return query.getResultList().isEmpty();
    }

    @Override
    public Boolean save(Account object) {
        try {
            if (checkExistUser(object.getUsername(), object.getEmail())) {
                object.setPassword(EncryptUtil.encrypt(object.getPassword()));
                return super.save(object);
            }
        } catch (Exception e) {
            throw e;
        }
        return false;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account findById(int id) {
        return this.em.find(Account.class, id);
    }

    @Override
    public Boolean update(Account object) {
        object.setPassword(EncryptUtil.encrypt(object.getPassword()));
        return super.update(object);
    }
}
