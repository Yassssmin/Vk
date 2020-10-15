package domain.domainAttachment;

public class Photo {
    private int id;
    private int albumId;
    private int ownerId;
    private int userId;
    private int date;
    private int width;
    private int height;
    private String text;
    private Size[] sizes;
    private MarketAlbum marketAlbum;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

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

    public Size[] getSizes() {
        return sizes;
    }

    public void setSizes(Size[] sizes) {
        this.sizes = sizes;
    }

    public MarketAlbum getMarketAlbum() {
        return marketAlbum;
    }

    public void setMarketAlbum(MarketAlbum marketAlbum) {
        this.marketAlbum = marketAlbum;
    }
}
