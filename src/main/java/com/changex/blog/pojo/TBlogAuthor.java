package com.changex.blog.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author Xie Chenxi
 * @Date 2018/11/18 4:41
 */
@Data
@TableName(value = "blog_author")
public class TBlogAuthor extends Model<TBlogAuthor> {
    private Integer id;
    private Integer userId;
    private String realName;
    private String headImg;
    private Integer sex;
    private String birthDay;
    private String createDate;
    private String updateDate;
    @TableLogic
    private Integer isValid;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
