package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import com.wt.mybatisplus.base.baseEntity.BaseEntity;
import lombok.Data;

@Data
@Table(name = "t_my_test")
@TableName(value = "t_my_test")
public class MyTest extends BaseEntity {

    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String name;

}
