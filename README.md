# 技术栈

## SpringBoot +Shiro+Mybatis +Thymeleaf +Layui+mysql+Lunece


## 数据库设计

- 用户表user

| 字段     | 类型    | 描述 |
| -------- | ------- | ---- |
| id       | int     |      |
| username | varchar | 帐号 |
| password | varchar | 密码 |

- 文章分类表blog_category

| 字段        | 类型     |      | 描述       |
| ----------- | -------- | ---- | ---------- |
| id          | int      |      |            |
| name        | varchar  |      |            |
| create_time | datetime |      |            |
| update_time | datetime |      |            |
| order_no    | int      |      | 用于排序   |
| url         | varchar  |      | 访问路径   |
| count       | int      |      | 该类文章数 |
|             |          |      |            |

- 标签表tags

| 字段     | 类型    | 描述         |
| -------- | ------- | ------------ |
| id       | int     |              |
| blog_id  | int     | 文章id       |
| tag_name | int     | 标签名       |
| url      | varchar | 标签下的文章 |

- 文章表blog

| 字段         | 类型     | 描述       |
| ------------ | -------- | ---------- |
| id           | int      |            |
| summary      | varchar  | 简介       |
| content      | longtext | 内容       |
| html_content | longtext | 有标签内容 |
| img_url      | varchar  | 图片地址   |
| title        | varchar  | 标题       |
| create_time  | datetime | 创建日期   |
| update_time  | datetime | 修改日期   |
| state        | int      | 发布状态   |
| hits         | int      | 浏览量     |
| category_id  | int      | 分类id     |
| likeit       | int      | 点赞       |
|              |          |            |

- 留言表comment

| 字段        | 类型     |      | 描述     |
| ----------- | -------- | ---- | -------- |
| id          | int      |      |          |
| username    | varchar  |      | 昵称     |
|             |          |      |          |
| qq          | varchar  |      | QQ号     |
| common      | varchar  |      | 留言     |
| create_time | datetime |      | 评论时间 |
| status      | int      |      | 是否通过 |
| hits        | int      |      | 点赞数   |

- 后台菜单表menu_admin

| 字段     | 类型    | 描述           |
| -------- | ------- | -------------- |
| id       | int     | 一级菜单标识   |
| pid      | int     | 0一级菜单      |
| name     | varchar | 菜单名         |
| order_no | int     | 显示顺序       |
| status   | int     | 是否显示       |
| icon     | varchar | 图片(或许没用) |
| url      | varchar | 路径           |
|          |         |                |

- 前台菜单表menu

| 字段   | 类型    | 描述           |
| ------ | ------- | -------------- |
| id     | int     | 一级菜单标识   |
| pid    | int     | 0一级菜单      |
| name   | varchar | 菜单名         |
| order  | int     | 显示顺序       |
| status | int     | 是否显示       |
| icon   | varchar | 图片(或许没用) |
| url    | varchar | 路径           |
|        |         |                |

- 友情链接表link

| 字段        | 类型    | 描述     |
| ----------- | ------- | -------- |
| id          | int     |          |
| isuse       | int     | 是否在用 |
| name        | varchar | 名字     |
| order_no    | int     | 显示顺序 |
| create_time | int     | 是否显示 |
| url         | varchar | 链接     |
|             |         |          |

- 网站配置表config<font color="green">后期完善</font>

| 字段        | 类型     |      | 描述              |
| ----------- | -------- | ---- | ----------------- |
| id          | int      |      |                   |
| name        | varchar  |      | 昵称              |
| icon        | varchar  |      | 头像              |
| username    | varchar  |      | 帐号              |
| description | varchar  |      | 简介              |
| html_desc   | varchar  |      | html样式的 关于我 |
| qq          | varchar  |      | qq                |
| beian       | varchar  |      | 备案              |
| keyword     | varchar  |      | 网站关键字        |
| title       | varchar  |      | 网站标题          |
| create_time | datetime |      | 建站时间          |
| job         | varchar  |      | 职业              |
| github      | varchar  |      |                   |
|             |          |      |                   |

