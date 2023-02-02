package uz.pdp.Instagram.model.post;

import uz.pdp.Instagram.model.BaseModel;

public class Post extends BaseModel {
    private PostType postType;
    private Long userId;
    private String description;
    private int likes;
    private int seenCount;
    private String comment;

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(int seenCount) {
        this.seenCount = seenCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Post(PostType postType, Long userId, String description, int likes, int seenCount, String comment) {
        this.postType = postType;
        this.userId = userId;
        this.description = description;
        this.likes = likes;
        this.seenCount = seenCount;
        this.comment = comment;
    }

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
