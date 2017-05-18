package com.derek.wokoo.dal.article.module;

import java.util.Date;

/**
 * 文章表
 * Created by derek.wu on 2017-05-18.
 */
public class ArticleDO {

    /**
     * 文章id，自增，主键
     */
    private Long    id;
    /**
     * 文章标题
     */
    private String  title;
    /**
     * 自定义访问路径。可以为空，为空时，访问路径默认为：文章id
     */
    private String  selfAccessPath;
    /**
     * 文章正文
     */
    private String  content;
    /**
     * 文章类型。 1: Markdown；2: 富文本
     */
    private Integer type;
    /**
     * 缩略图URL路径
     */
    private String  thumbImgUrl;
    /**
     * 文章标签。list，标签之间通过 “,” 分隔
     */
    private String  tags;
    /**
     * 文章分类。list，通过“,”分隔
     */
    private String  categories;
    /**
     * 文章状态。-1: 删除; 0: 未发布; 1: 已发布。默认0
     */
    private Integer status;
    /**
     * 点击数
     */
    private Integer hits;
    /**
     * 是否允许评论。0: 不允许；1: 允许
     */
    private Integer allowComment;
    /**
     * 是否允许ping。0: 不允许；1: 允许
     */
    private Integer allowPing;
    /**
     * 创建时间
     */
    private Date    gmtCreate;
    /**
     * 修改时间
     */
    private Date    gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSelfAccessPath() {
        return selfAccessPath;
    }

    public void setSelfAccessPath(String selfAccessPath) {
        this.selfAccessPath = selfAccessPath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getThumbImgUrl() {
        return thumbImgUrl;
    }

    public void setThumbImgUrl(String thumbImgUrl) {
        this.thumbImgUrl = thumbImgUrl;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getAllowComment() {
        return allowComment;
    }

    public void setAllowComment(Integer allowComment) {
        this.allowComment = allowComment;
    }

    public Integer getAllowPing() {
        return allowPing;
    }

    public void setAllowPing(Integer allowPing) {
        this.allowPing = allowPing;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "ArticleDO{" + "id=" + id + ", title='" + title + '\'' + ", selfAccessPath='" + selfAccessPath + '\''
               + ", content='" + content + '\'' + ", type=" + type + ", thumbImgUrl='" + thumbImgUrl + '\'' + ", tags='"
               + tags + '\'' + ", categories='" + categories + '\'' + ", status=" + status + ", hits=" + hits
               + ", allowComment=" + allowComment + ", allowPing=" + allowPing + ", gmtCreate=" + gmtCreate
               + ", gmtModified=" + gmtModified + '}';
    }
}
