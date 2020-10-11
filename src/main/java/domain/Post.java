package domain;

public class Post {
    private String id;
    private String title;
    private String description;
    private String date;
    private long likesNumber;
    private long reportNumber;
    private long viewingNumber;
    private Icon icon;
    private PostBlock postBlock;
    private Comment[] comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getLikesNumber() {
        return likesNumber;
    }

    public void setLikesNumber(long likesNumber) {
        this.likesNumber = likesNumber;
    }

    public long getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(long reportNumber) {
        this.reportNumber = reportNumber;
    }

    public long getViewingNumber() {
        return viewingNumber;
    }

    public void setViewingNumber(long viewingNumber) {
        this.viewingNumber = viewingNumber;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public PostBlock getPostBlock() {
        return postBlock;
    }

    public void setPostBlock(PostBlock postBlock) {
        this.postBlock = postBlock;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
}
