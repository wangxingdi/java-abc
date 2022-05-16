package com.wangxingdi.algorithm.leetcode.ok;

import com.wangxingdi.util.DateUtils;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1. 两数之和
 *
 * 给定一个整数数组numbs和一个目标值target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例:
 * 给定 numbs = [2, 7, 11, 15], target = 9
 * 因为 numbs[0] + numbs[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Q0001_TwoSum {

    public static void main(String[] args) {
        String timestamp = DateUtils.getToday();
        System.out.println("===当前时间戳: "+timestamp);
        Q0001_TwoSum clazz = new Q0001_TwoSum();
        int[] numbs = {2, 7, 11, 15};
        int target = 9;
        //solution 1
        int[] res_20200920211143 = clazz.twoSum_20200920211143(numbs, target);
        System.out.println(Arrays.toString(res_20200920211143));
        //solution 2
        int[] res_20200920212126 = clazz.twoSum_20200920212126(numbs, target);
        System.out.println(Arrays.toString(res_20200920212126));
    }

    /**
     * 暴力求解,双指针,固定其中一个指针,移动另一个指针;
     * 由于额外的存储空间为常数,所以空间复杂度为O(1);
     * 由于使用依次遍历的双指针方式,时间复杂度为i * (length-i),即O(n*n)
     * @param numbs
     * @param target
     * @return
     */
    public int[] twoSum_20200920211143(int[] numbs, int target) {
        int[] res = new int[2];
        for(int i=0;i<numbs.length-1;i++){
            for(int j=i+1;j<numbs.length;j++){
                if(numbs[i]+numbs[j] ==target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    /**
     * HashMap缓存法,一边遍历,一边缓存;
     * 由于使用了额外的空间用来缓存最多n个元素,所以空间复杂度是O(n);
     * 由于只有一次遍历,所以时间复杂度也是O(n);
     * @param numbs
     * @param target
     * @return
     */
    public int[] twoSum_20200920212126(int[] numbs, int target){
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<numbs.length;i++){
            if(map.containsKey(numbs[i])){
                res[0] = map.get(numbs[i]);
                res[1] = i;
            }else{
                map.put(target-numbs[i], i);
            }
        }
        return res;
    }

}
