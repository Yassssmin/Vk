package domain.domainAttachment;

public class Preview {
    private Photo photo;
    private Size[] sizes;
    private Graffiti graffiti;
    private AudioMessage audioMessage;
    private Doc doc;

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Size[] getSizes() {
        return sizes;
    }

    public void setSizes(Size[] sizes) {
        this.sizes = sizes;
    }

    public Graffiti getGraffiti() {
        return graffiti;
    }

    public void setGraffiti(Graffiti graffiti) {
        this.graffiti = graffiti;
    }

    public AudioMessage getAudioMessage() {
        return audioMessage;
    }

    public void setAudioMessage(AudioMessage audioMessage) {
        this.audioMessage = audioMessage;
    }

    public Doc getDoc() {
        return doc;
    }

    public void setDoc(Doc doc) {
        this.doc = doc;
    }
}
