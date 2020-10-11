package domain;

public class Repost {
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUser_reposted() {
        return user_reposted;
    }

    public void setUser_reposted(int user_reposted) {
        this.user_reposted = user_reposted;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    private int count;
    private int user_reposted;
    private Post post;

}
