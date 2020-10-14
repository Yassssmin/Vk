package domain.domainAttachment;

public class Reposts {
    private int count;
    private int wallCount;
    private int mailCount;
    private int userReposted;
    private Video video;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWallCount() {
        return wallCount;
    }

    public void setWallCount(int wallCount) {
        this.wallCount = wallCount;
    }

    public int getMailCount() {
        return mailCount;
    }

    public void setMailCount(int mailCount) {
        this.mailCount = mailCount;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
