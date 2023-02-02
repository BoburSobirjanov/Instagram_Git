package uz.pdp.Instagram.service.postservice;

import uz.pdp.Instagram.model.post.Post;
import uz.pdp.Instagram.repository.PostRepository;

import java.util.UUID;

public class PostServiceImpl implements PostService, PostRepository {

    @Override
    public int add(Post model) {
        posts.add(model);
        return 1;
    }

    @Override
    public Post getById(UUID id) {
        for (Post post:posts) {
            if(post.getId().equals(id)){
                return post;
            }
        }
        return null;
    }

    @Override
    public int edit(Post update) {
        for (int i = 0; i < posts.size(); i++) {
            if(posts.get(i).getId().equals(update.getId())){

                return 1;
           }

        }
        return -1;
    }

    @Override
    public int deleteById(UUID Id) {
        for (Post post:posts) {
            if(post.getId().equals(Id)){
                return 1;
            }
        }
        return -1;
    }
}
