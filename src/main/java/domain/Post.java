package domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private int canEdit;
    private int isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private boolean likesInfo;
    private boolean commentInfo;
    private boolean copyrightInfo;
    private boolean donutInfo;
    private boolean followerInfo;
    private boolean geoInfo;
    private boolean informationInfo;
    private boolean placeholderInfo;
    private boolean postSourceInfo;
    private boolean reclameInfo;
    private boolean repostInfo;
    private boolean viewsInfo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public boolean isLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(boolean likesInfo) {
        this.likesInfo = likesInfo;
    }

    public boolean isCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(boolean commentInfo) {
        this.commentInfo = commentInfo;
    }

    public boolean isCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(boolean copyrightInfo) {
        this.copyrightInfo = copyrightInfo;
    }

    public boolean isDonutInfo() {
        return donutInfo;
    }

    public void setDonutInfo(boolean donutInfo) {
        this.donutInfo = donutInfo;
    }

    public boolean isFollowerInfo() {
        return followerInfo;
    }

    public void setFollowerInfo(boolean followerInfo) {
        this.followerInfo = followerInfo;
    }

    public boolean isGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(boolean geoInfo) {
        this.geoInfo = geoInfo;
    }

    public boolean isInformationInfo() {
        return informationInfo;
    }

    public void setInformationInfo(boolean informationInfo) {
        this.informationInfo = informationInfo;
    }

    public boolean isPlaceholderInfo() {
        return placeholderInfo;
    }

    public void setPlaceholderInfo(boolean placeholderInfo) {
        this.placeholderInfo = placeholderInfo;
    }

    public boolean isPostSourceInfo() {
        return postSourceInfo;
    }

    public void setPostSourceInfo(boolean postSourceInfo) {
        this.postSourceInfo = postSourceInfo;
    }

    public boolean isReclameInfo() {
        return reclameInfo;
    }

    public void setReclameInfo(boolean reclameInfo) {
        this.reclameInfo = reclameInfo;
    }

    public boolean isRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(boolean repostInfo) {
        this.repostInfo = repostInfo;
    }

    public boolean isViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(boolean viewsInfo) {
        this.viewsInfo = viewsInfo;
    }
}