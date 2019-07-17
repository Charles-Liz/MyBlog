package com.lizhao.pojo;
/** 
* @author by lizhao
* @version 2019年7月4日 下午3:11:15 
* 类说明 
*帖子类
*/
public class Post extends BaseDomain{
    private int postId;
    private int topicId;//主题ID
    private int postType;
    private String postTitle;
    private String postText;
    private String createTime;
    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public int getTopicId() {
        return topicId;
    }
    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }
    public int getPostType() {
        return postType;
    }
    public void setPostType(int postType) {
        this.postType = postType;
    }
    public String getPostTitle() {
        return postTitle;
    }
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }
    public String getPostText() {
        return postText;
    }
    public void setPostText(String postText) {
        this.postText = postText;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    
}
