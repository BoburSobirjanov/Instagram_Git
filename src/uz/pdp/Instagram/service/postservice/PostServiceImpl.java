package uz.pdp.Instagram.service.postservice;

import uz.pdp.Instagram.model.post.Post;
import uz.pdp.Instagram.repository.PostRepository;

import java.util.UUID;

public class PostServiceImpl implements PostService, PostRepository {

    @Override
    public int add(Post model) {
        return 0;
    }

    @Override
    public Post getById(UUID id) {
        return null;
    }

    @Override
    public int edit(Post update) {
        return 0;
    }

    @Override
    public int deleteById(UUID Id) {
        return 0;
    }
}
