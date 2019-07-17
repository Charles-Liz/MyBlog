package com.lizhao.pojo;
/** 
* @author by lizhao
* @version 2019年7月4日 下午3:07:24 
* 类说明 
*论坛板块类
*/
public class Board extends BaseDomain{
    private long boardId;
    private String boardName;
    private String boardDesc;//描述
    private int topicNum;//帖子数量
    private MainPost mainPost;//主题帖子
    public long getBoardId() {
        return boardId;
    }
    public void setBoardId(long boardId) {
        this.boardId = boardId;
    }
    public String getBoardName() {
        return boardName;
    }
    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }
    public String getBoardDesc() {
        return boardDesc;
    }
    public void setBoardDesc(String boardDesc) {
        this.boardDesc = boardDesc;
    }
    public int getTopicNum() {
        return topicNum;
    }
    public void setTopicNum(int topicNum) {
        this.topicNum = topicNum;
    }
    public MainPost getMainPost() {
        return mainPost;
    }
    public void setMainPost(MainPost mainPost) {
        this.mainPost = mainPost;
    }
    
}
