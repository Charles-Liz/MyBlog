package com.lizhao.pojo;
/** 
* @author by lizhao
* @version 2019年7月4日 下午3:16:50 
* 类说明 
*论坛主题类
*/
public class Topic extends BaseDomain{
    private int topcId;
    private String topicTitle;
    private long createTime;
    private long lastPost;
    private int views;
    private int replies;
    private int digest;
    private User user;
    public int getTopcId() {
        return topcId;
    }
    public void setTopcId(int topcId) {
        this.topcId = topcId;
    }
    public String getTopicTitle() {
        return topicTitle;
    }
    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }
    public long getCreateTime() {
        return createTime;
    }
    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }
    public long getLastPost() {
        return lastPost;
    }
    public void setLastPost(long lastPost) {
        this.lastPost = lastPost;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getReplies() {
        return replies;
    }
    public void setReplies(int replies) {
        this.replies = replies;
    }
    public int getDigest() {
        return digest;
    }
    public void setDigest(int digest) {
        this.digest = digest;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    
}
