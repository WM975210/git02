package com.month_3.test_328;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
/*
    水果清单 : 每天上货的清单
        水果类型,水果数量
        有些水果存在默认上货数量
        有些水果不存在默认的上货数量

    注意: 如果想要通过反射操作的注解类型,需要定义注解类型的声明周期为运行期
 */
public class FruitList_2807 {
    public static void main(String[] args) throws Exception {
        FruitList list=new FruitList();
        list.pair=15;
        System.out.println(list);
        testFruitList(list,FruitList.class);
        System.out.println(list);
    }
    // 注解解析器：获取当前对象的每一个属性，判断属性是否存在指定的上货数量，如果没有存在，进一步判断是否存在默认的上货数量，存在获取数量进行复制，不存在不上货
    public static FruitList testFruitList(FruitList list,Class<FruitList> cls) throws Exception {
        // 判断是否存在水果清单的实例
        if (list==null){
            throw  new NullPointerException("哪有清单");
        }
        // 获取水果清单类型中的所有属性
        Field[] fields=cls.getDeclaredFields();
        // 遍历每一个属性
        for (Field field:fields){
            // 判断list清单中当前属性是否已经赋值，已经赋值就按照当前已经赋予的值上货
            if (field.get(list)==null){
                // 没有赋值，判断当前属性上是否存在Num注解，如果不存在证明没有默认值
                if (field.isAnnotationPresent(Num.class)){
                    // 如果存在，获取默认值，赋值给list对象当前属性
                    Num num=field.getAnnotation(Num.class);
                    field.set(list,num.value());
                }
            }
        }
        return list;
    }
}
// 水果清单 类型
class FruitList{
    @Num(20)
    Integer apple;

    Integer pair;
    Integer banana;

    public FruitList() {
    }
    public FruitList(Integer apple, Integer pair, Integer banana) {
        this.apple = apple;
        this.pair = pair;
        this.banana = banana;
    }
    @Override
    public String toString() {
        return "FruitList{" +
                "apple=" + apple +
                ", pair=" + pair +
                ", banana=" + banana +
                '}';
    }
}
//  注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Num{
    int value() default 10;
}
