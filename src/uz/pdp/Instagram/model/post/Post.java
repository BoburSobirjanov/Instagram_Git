package uz.pdp.Instagram.model.post;

import uz.pdp.Instagram.model.BaseModel;

public class Post extends BaseModel {
    private PostType postType;
    private Long userId;
    private String description;

    public Post(PostType postType, Long userId, String description) {
        this.postType = postType;
        this.userId = userId;
        this.description = description;
    }

    public Post(PostType postType, Long userId) {
        this.postType = postType;
        this.userId = userId;
    }

    public PostType getPostType() {
        return postType;
    }

    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
