CREATE DATABASE IF NOT EXISTS  `wokoo`;
USE `wokoo`;

# 文章表
CREATE TABLE `wo_article`(
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '文章id，自增，主键',
	`title` VARCHAR(50) NOT NULL COMMENT '文章标题',
	`self_access_path` VARCHAR(20) UNIQUE COMMENT '自定义访问路径。可以为空，为空时，访问路径默认为：文章id',
	`content` MEDIUMBLOB COMMENT '文章正文',
	`type` TINYINT NOT NULL DEFAULT 2 COMMENT '文本类型。 1: Markdown；2: 富文本',
	`thumb_img_url` VARCHAR(50) COMMENT '缩略图URL路径',
	`tags` VARCHAR(256) COMMENT '文章标签。list，标签之间通过 “,” 分隔',
	`categories` VARCHAR(256) COMMENT '文章分类。list，通过“,”分隔',
	`status` TINYINT NOT NULL DEFAULT 0 COMMENT '文章状态。-1: 删除; 0: 未发布; 1: 已发布。默认0',
	`hits` INT DEFAULT 0 COMMENT '点击数',
	`allow_comment` TINYINT NOT NULL DEFAULT 0 COMMENT '是否允许评论。0: 不允许；1: 允许',
	`allow_ping`	TINYINT NOT NULL DEFAULT 0 COMMENT '是否允许ping。0: 不允许；1: 允许',
	`gmt_create` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`gmt_modified` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '文章表';


# 页面表
CREATE TABLE `wo_page`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '页面id，自增，主键',
  `title` VARCHAR(50) NOT NULL COMMENT '页面标题',
	`access_path` VARCHAR(20) NOT NULL UNIQUE COMMENT '访问路径.不能为空',
	`content` MEDIUMBLOB COMMENT '页面正文',
	`type` TINYINT NOT NULL DEFAULT 2 COMMENT '文本类型。 1: Markdown；2: 富文本',
  `status` TINYINT NOT NULL DEFAULT 0 COMMENT '页面状态。-1: 删除; 0: 未发布; 1: 已发布。默认0',
	`hits` INT DEFAULT 0 COMMENT '点击数',
	`allow_comment` TINYINT NOT NULL DEFAULT 0 COMMENT '是否允许评论。0: 不允许；1: 允许',
	`allow_ping`	TINYINT NOT NULL DEFAULT 0 COMMENT '是否允许ping。0: 不允许；1: 允许',
	`gmt_create` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`gmt_modified` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '页面表';


# 友链表
CREATE TABLE `wo_friend_link`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '友链id，自增，主键',
  `name` VARCHAR(30) COMMENT '友链名称',
  `url` VARCHAR(256) COMMENT '友链url地址',
  `logo_img_url` VARCHAR(256) COMMENT '友链Logo地址',
  `sort_num` INT COMMENT '排序编号. 唯一，不指定，则取最大的，再自增一',
  `gmt_create` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`gmt_modified` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '友链表';


# 评论表
CREATE TABLE `wo_comment`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '评论id，自增，主键',
  `source_type` TINYINT COMMENT '评论的资源类型。1: 文章；2：页面',
  `source_id` BIGINT COMMENT '资源id。若source_type为文章，则source_id为wo_article表的id；若为页面，则source_id为wo_page表的id；',
  `content` VARCHAR(2048) NOT NULL COMMENT '评论内容。目前只支持文本类型的评论。',
  `username` VARCHAR(50) NOT NULL COMMENT '评论人名称',
  `email` VARCHAR(50) NOT NULL COMMENT '评论人邮箱',
  `website_url` VARCHAR(256) NOT NULL COMMENT '评论人网址',
  `status` TINYINT NOT NULL DEFAULT 1 COMMENT '评论状态',
  `gmt_create` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`gmt_modified` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '评论表';


# 用户表
CREATE TABLE `wo_user`(
  `id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户id，自增，主键',
  `username` VARCHAR(20) NOT NULL UNIQUE COMMENT '用户名',
  `nickname` VARCHAR(40) COMMENT '昵称',
  `password` VARCHAR(50) NOT NULL COMMENT '密码',
  `salt` VARCHAR(30) NOT NULL COMMENT '盐',
  `email` VARCHAR(50) NOT NULL UNIQUE COMMENT '邮箱',
  `phone` VARCHAR(20) UNIQUE COMMENT '电话',
  `gmt_create` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	`gmt_modified` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';
