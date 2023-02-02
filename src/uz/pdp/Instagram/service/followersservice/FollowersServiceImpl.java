package uz.pdp.Instagram.service.followersservice;

import uz.pdp.Instagram.model.Followers;
import uz.pdp.Instagram.repository.FollowersRepository;

import java.util.UUID;

public class FollowersServiceImpl implements FollowersService, FollowersRepository{
    @Override
    public int add(Followers model) {
        return 0;
    }

    @Override
    public Followers getById(UUID id) {
        return null;
    }

    @Override
    public int edit(Followers update) {
        return 0;
    }

    @Override
    public int deleteById(UUID Id) {
        return 0;
    }
}
