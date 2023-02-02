package uz.pdp.Instagram.service;

public interface BaseService<T> {
    int add(T model);
T getById(Long id);
 int edit(T update);
 int deleteById(Long Id);

}
