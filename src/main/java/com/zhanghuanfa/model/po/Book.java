package com.zhanghuanfa.model.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zhanghuanfa
 * @date 2018-05-04 8:58
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    private Integer id;
    private String name;
    private BigDecimal price;
}
