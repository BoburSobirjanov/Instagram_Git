package uz.pdp.Instagram.service;

import uz.pdp.Instagram.model.User;

import java.util.UUID;

public interface BaseService<T> {
    int add(T model);
T getById(UUID id);
 int edit(T update);
 int deleteById(UUID Id);
 User signIn(String username, String password);

}
