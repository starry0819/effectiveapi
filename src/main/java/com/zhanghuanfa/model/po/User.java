package com.zhanghuanfa.model.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhanghuanfa
 * @date 2018-01-02 20:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = 6656048183360808147L;
    /**主键id*/
    private Integer id;
    /**用户名*/
    private String name;
}
