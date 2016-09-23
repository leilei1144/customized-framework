package com.customized.commodity.config;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by grant on 16/8/29.
 * 最简单随机码生成器
 */
public class CommodityNum {
    public CommodityNum() {
    }
    public static Set<Integer> getCommodityNum(int num){
        Integer maxNum = 10000000;
        Set nums = Sets.newConcurrentHashSet();
        for (int i = 0 ; i < num ; i ++) {
            Integer lastNum = maxNum+(i+1);
            nums.add(lastNum);

        }
        return nums;
    }

    public static void main(String[] args) {
        Set<Integer> num = CommodityNum.getCommodityNum(100);
        for (Integer s : num){
            System.out.println(s);
        }
    }
}
