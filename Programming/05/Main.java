/*
 * @Description: 7-5 求集合交集
 * @Author: Catop
 * @Date: 2021-06-23 23:13:50
 * @LastEditTime: 2021-06-24 17:07:57
 */

//考察点：Collection相关类的使用

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        //本题所要求有顺序、不重复的集合，故采用LinkedHashSet<>存储
        //整数集合，元素类型指定为String或者int均可
        LinkedHashSet<String> hs1 = new LinkedHashSet<>();
        LinkedHashSet<String> hs2 = new LinkedHashSet<>();

        //读入元素
        while((m--) > 0){
            hs1.add(sc.next());
        }
        while((n--) > 0){
            hs2.add(sc.next());
        }

        //在hs1中保留hs2中有的元素
        hs1.retainAll(hs2);
        
        if(hs1.size() == 0){
            System.out.print("NULL");
        }
        else{
            //获取迭代器
            //LinkedHashSet为Collection接口的实现类，而Collection接口继承了Iterable接口，该接口具有iterator()的方法返回迭代器。
            Iterator<String> it = hs1.iterator();
            while(it.hasNext()){
                System.out.print(it.next());
                if(it.hasNext()){
                    System.out.print(" ");
                }
            }
        }

        
    }
}