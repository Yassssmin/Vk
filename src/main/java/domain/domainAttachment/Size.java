package domain.domainAttachment;

public class Size {
    private int width;
    private int height;
    private String type;
    private String url;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Photo getFoto() {
        return foto;
    }

    public void setFoto(Photo foto) {
        this.foto = foto;
    }

    private Photo foto;
}
