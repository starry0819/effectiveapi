package com.zhanghuanfa;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author zhanghuanfa
 * @date 2018-05-04 13:26
 */
public class LittleTest {

    @Test
    public void bigDecimalTest() {
        BigDecimal bigDecimal = new BigDecimal("29.9");
        System.out.println(bigDecimal);
    }
}
