package domain;

public class PostBlockVideo extends PostBlock {
    private String videoBlock;
    private String name;
    private long viewing;

    public String getVideoBlock() {
        return videoBlock;
    }

    public void setVideoBlock(String videoBlock) {
        this.videoBlock = videoBlock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getViewing() {
        return viewing;
    }

    public void setViewing(long viewing) {
        this.viewing = viewing;
    }
}
