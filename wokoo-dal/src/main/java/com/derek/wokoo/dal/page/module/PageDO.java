package com.derek.wokoo.dal.page.module;

import java.util.Date;

/**
 * 页面DO
 * Created by derek.wu on 2017-05-19.
 */
public class PageDO {

    /**
     * 页面id，自增，主键
     */
    private Long    id;
    /**
     * 页面标题
     */
    private String  tilte;
    /**
     * 访问路径.不能为空
     */
    private String  accessPage;
    /**
     * 页面正文
     */
    private String  content;
    /**
     * 文本类型。 1: Markdown；2: 富文本
     */
    private Integer type;
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

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public String getAccessPage() {
        return accessPage;
    }

    public void setAccessPage(String accessPage) {
        this.accessPage = accessPage;
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
        return "PageDO{" + "id=" + id + ", tilte='" + tilte + '\'' + ", accessPage='" + accessPage + '\''
               + ", content='" + content + '\'' + ", type=" + type + ", status=" + status + ", hits=" + hits
               + ", allowComment=" + allowComment + ", allowPing=" + allowPing + ", gmtCreate=" + gmtCreate
               + ", gmtModified=" + gmtModified + '}';
    }
}
