package domain.domainAttachment;

public class Image {
    private int height;
    private int width;
    private int withPadding = 1;
    private String url;
    private Video video;
    private Sticker sticker;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWithPadding() {
        return withPadding;
    }

    public void setWithPadding(int withPadding) {
        this.withPadding = withPadding;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public void setSticker(Sticker sticker) {
        this.sticker = sticker;
    }
}
