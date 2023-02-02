package uz.pdp.Instagram.service.userservice;

import uz.pdp.Instagram.model.User;
import uz.pdp.Instagram.service.BaseService;

public interface UserService extends BaseService<User> {
    User signIn(String username, String password);

}
