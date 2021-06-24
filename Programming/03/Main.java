/*
 * @Description: 7-3 sdust-Java-字符串集合求并集
 * @Author: Catop
 * @Date: 2021-06-24 16:55:34
 * @LastEditTime: 2021-06-24 17:38:51
 */

//考察点：Collection相关类的使用

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //注意要求读入不重复的元素，直到读满5个
        
        //初始化两个LinkedHashSet
        LinkedHashSet<String> arr1 = new LinkedHashSet<>();
        LinkedHashSet<String> arr2 = new LinkedHashSet<>();

        //读入元素
        int i=0;
        while(i<=4){
            String str = sc.next();
            if(! arr1.contains(str)){
                //非重复元素
                i++ ;
                arr1.add(str);
            }
        }

        //读入元素
        i=0;
        while(i<=4){
            String str = sc.next();
            if(! arr2.contains(str)){
                //非重复元素
                i++ ;
                arr2.add(str);
            }
        }

        //求出并集
        arr1.addAll(arr2);
        //转为ArrayList，方便排序
        //注意List与Set互转的方法，ArrayList(Collection<? extends E> c)
        ArrayList<String> retArr = new ArrayList<>(arr1);
        
        //排序
        retArr.sort(new OrderByDict());

        //输出
        for(String str : retArr){
            System.out.println(str);
        }


    }
}


class OrderByDict implements Comparator<String>{
    //用于字典序排序，Comparator接口的实现类，注意指定类型

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}