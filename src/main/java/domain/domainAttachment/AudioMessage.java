package domain.domainAttachment;

public class AudioMessage {
    private int duration;
    private int linkOgg;
    private int linkMp3;
    private Preview preview;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getLinkOgg() {
        return linkOgg;
    }

    public void setLinkOgg(int linkOgg) {
        this.linkOgg = linkOgg;
    }

    public int getLinkMp3() {
        return linkMp3;
    }

    public void setLinkMp3(int linkMp3) {
        this.linkMp3 = linkMp3;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }
}
