package manager;

import domain.Post;

public class PostManager {
    private int ownerId;
    private int postId;
    private String domain;
    private String query;
    private boolean ownersOnly;
    private int offset = 0;
    private int count = 20;

    private domain.Post[] posts;

    public Post[] wallSearch() {

        return null;
    }

    public void wallDelete() {

    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isOwnersOnly() {
        return ownersOnly;
    }

    public void setOwnersOnly(boolean ownersOnly) {
        this.ownersOnly = ownersOnly;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }
}
