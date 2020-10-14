package domain.domainAttachment;

public class Poll {
    private int id;
    private int ownerId;
    private int authorId;
    private int created;
    private int votes;
    private int endDate;
    private String question;
    private boolean anonymous;
    private boolean multiple;
    private boolean closed;
    private boolean isBoard;
    private boolean canEdit;
    private boolean canVote;
    private boolean canReport;
    private boolean canShare;
    private Answer[] answers;
    private AnswerIds[] answerIds;
    private Photo photo;

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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public boolean isBoard() {
        return isBoard;
    }

    public void setBoard(boolean board) {
        isBoard = board;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanVote() {
        return canVote;
    }

    public void setCanVote(boolean canVote) {
        this.canVote = canVote;
    }

    public boolean isCanReport() {
        return canReport;
    }

    public void setCanReport(boolean canReport) {
        this.canReport = canReport;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public AnswerIds[] getAnswerIds() {
        return answerIds;
    }

    public void setAnswerIds(AnswerIds[] answerIds) {
        this.answerIds = answerIds;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }
}
