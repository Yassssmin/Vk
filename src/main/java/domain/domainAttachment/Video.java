package domain.domainAttachment;

public class Video {
    private int id;
    private int userId;
    private int ownerId;
    private int duration;
    private int date;
    private int addingDate;
    private int views;
    private int localViews;
    private int comments;
    private int canAdd;
    private int canComment;
    private int canLike;
    private int canRepost;
    private int canSubscribe;
    private int canAddToFaves;
    private int canAttachLink;
    private int width;
    private int height;
    private int converting;
    private int added;
    private int isSubscribed;
    private int balance;
    private int spectators;
    private String title;
    private String description;
    private String player;
    private String platform;
    private String accessKey;
    private String type;
    private String liveStatus;
    private boolean isFavorite;
    private int canEdit = 1;
    private int isPrivate = 1;
    private int processing = 1;
    private int repeat = 1;
    private int live = 1;
    private int upcoming = 1;
    private Image[] image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(int addingDate) {
        this.addingDate = addingDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLocalViews() {
        return localViews;
    }

    public void setLocalViews(int localViews) {
        this.localViews = localViews;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getCanAdd() {
        return canAdd;
    }

    public void setCanAdd(int canAdd) {
        this.canAdd = canAdd;
    }

    public int getCanComment() {
        return canComment;
    }

    public void setCanComment(int canComment) {
        this.canComment = canComment;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanRepost() {
        return canRepost;
    }

    public void setCanRepost(int canRepost) {
        this.canRepost = canRepost;
    }

    public int getCanSubscribe() {
        return canSubscribe;
    }

    public void setCanSubscribe(int canSubscribe) {
        this.canSubscribe = canSubscribe;
    }

    public int getCanAddToFaves() {
        return canAddToFaves;
    }

    public void setCanAddToFaves(int canAddToFaves) {
        this.canAddToFaves = canAddToFaves;
    }

    public int getCanAttachLink() {
        return canAttachLink;
    }

    public void setCanAttachLink(int canAttachLink) {
        this.canAttachLink = canAttachLink;
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

    public int getConverting() {
        return converting;
    }

    public void setConverting(int converting) {
        this.converting = converting;
    }

    public int getAdded() {
        return added;
    }

    public void setAdded(int added) {
        this.added = added;
    }

    public int getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(int isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getSpectators() {
        return spectators;
    }

    public void setSpectators(int spectators) {
        this.spectators = spectators;
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

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(String liveStatus) {
        this.liveStatus = liveStatus;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(int isPrivate) {
        this.isPrivate = isPrivate;
    }

    public int getProcessing() {
        return processing;
    }

    public void setProcessing(int processing) {
        this.processing = processing;
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(int upcoming) {
        this.upcoming = upcoming;
    }

    public Image[] getImage() {
        return image;
    }

    public void setImage(Image[] image) {
        this.image = image;
    }

    public FirstFrame[] getFirstFrame() {
        return firstFrame;
    }

    public void setFirstFrame(FirstFrame[] firstFrame) {
        this.firstFrame = firstFrame;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public Reposts getReposts() {
        return reposts;
    }

    public void setReposts(Reposts reposts) {
        this.reposts = reposts;
    }

    private FirstFrame[] firstFrame;
    private Likes likes;
    private Reposts reposts;
}
