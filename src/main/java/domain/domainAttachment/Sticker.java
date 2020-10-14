package domain.domainAttachment;

public class Sticker {
    private int productId;
    private int stickerId;
    private Image[] images;
    private ImagesWithBackground[] imagesWithBackgrounds;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStickerId() {
        return stickerId;
    }

    public void setStickerId(int stickerId) {
        this.stickerId = stickerId;
    }

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }

    public ImagesWithBackground[] getImagesWithBackgrounds() {
        return imagesWithBackgrounds;
    }

    public void setImagesWithBackgrounds(ImagesWithBackground[] imagesWithBackgrounds) {
        this.imagesWithBackgrounds = imagesWithBackgrounds;
    }
}
