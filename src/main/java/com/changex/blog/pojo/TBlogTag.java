package com.changex.blog.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author Xie Chenxi
 * @Date 2018/11/18 4:45
 */
@Data
@TableName(value = "blog_tag")
public class TBlogTag extends Model<TBlogTag> {
    private Integer id;
    private Integer authorId;
    private String name;
    private String createDate;
    private String updateDate;
    @TableLogic
    private Integer isValid;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
