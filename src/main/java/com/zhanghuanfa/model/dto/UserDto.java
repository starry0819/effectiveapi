package com.zhanghuanfa.model.dto;

import com.zhanghuanfa.model.po.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zhanghuanfa
 * @date 2018-01-02 20:14
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends User implements Serializable {
    private static final long serialVersionUID = 7559704555914671472L;
    /**用户所属机构名称*/
    private String institutionName;
}
