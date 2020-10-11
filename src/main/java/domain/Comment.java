package domain;

public class Comment {
    private String id;
    private String text;
    private String date;
    private String author;

    public int getCan_post() {
        return can_post;
    }

    public void setCan_post(int can_post) {
        this.can_post = can_post;
    }

    public int getGroups_can_post() {
        return groups_can_post;
    }

    public void setGroups_can_post(int groups_can_post) {
        this.groups_can_post = groups_can_post;
    }

    public boolean isCan_close() {
        return can_close;
    }

    public void setCan_close(boolean can_close) {
        this.can_close = can_close;
    }

    public boolean isCan_open() {
        return can_open;
    }

    public void setCan_open(boolean can_open) {
        this.can_open = can_open;
    }

    private int can_post;
    private int groups_can_post;
    private boolean can_close;
    private boolean can_open;
    private Comment parent;
    private Post post;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Comment getParent() {
        return parent;
    }

    public void setParent(Comment parent) {
        this.parent = parent;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
