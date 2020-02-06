package cn.coderzhx.service;

import cn.coderzhx.entity.Comment;
import cn.coderzhx.pojo.PageBean;

/**
 *
 *
 */
public interface CommentService {
    PageBean listComment(PageBean pageBean2);
    PageBean listComment2(PageBean pageBean2);
    void addLike(Integer id);
    void addComment(Comment comment);
    void editStatus(Comment comment);
    void delComment(Integer id);
    void batchdelComment(String id);
}
