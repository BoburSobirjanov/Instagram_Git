package uz.pdp.Instagram.service;

import java.util.UUID;

public interface BaseService<T> {
    int add(T model);
T getById(UUID id);
 int edit(T update);
 int deleteById(UUID Id);

}
