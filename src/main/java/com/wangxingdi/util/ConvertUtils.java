package com.wangxingdi.util;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 转换类
 * @author wangxingdi1
 * @date 2023/12/5 16:25
 */
public class ConvertUtils {

    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 8, 5, 3, 5};
        String[] arr2 = {"2", "4", "7", "d", "f", "j", "o"};
        System.out.println(convertArray2List_1(arr1));
        System.out.println(convertArray2List_2(arr2));
    }

    /**
     * 数组转list
     * 不同类型
     */
    public static List<String> convertArray2List_1(int[] array){
        if(null == array || array.length == 0){
            return null;
        }
        //方式1
        List<String> list1 = new ArrayList<>();
        for(int arr : array){
            list1.add(String.valueOf(arr));
        }
        //方式2: 数组对应的是
        List<String> list2 = Arrays.stream(array).mapToObj(item -> String.valueOf(item)).collect(Collectors.toList());
        return list2;
    }

    /**
     * 数组转list
     * 同类型
     * @param array
     * @return
     */
    public static List<String> convertArray2List_2(String[] array){
        if(null == array || array.length == 0){
            return null;
        }
        //方式1
        List<String> list1 = Arrays.asList(array);
        //方式2
        List<String> list2 = new ArrayList<>(Arrays.asList(array));
        //方式3
        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3, array);
        //方式4
        List<String> list4 = Arrays.stream(array).collect(Collectors.toList());
        return list4;
    }

}
