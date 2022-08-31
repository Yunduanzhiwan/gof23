package com.yefeng.single.destroy;


import com.yefeng.single.EnumSingle;
import com.yefeng.single.Hunger;
import com.yefeng.single.lazyMan.DoubleCheck;
import com.yefeng.single.lazyMan.DoubleCheckProMax;
import com.yefeng.single.lazyMan.DoubleCheckPro;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//反射破坏单例  --除了枚举外都能破坏
public class Reflection {


    public static void testHunger() throws Exception {
        Class<Hunger> hungerClass = Hunger.class;
        Constructor<Hunger> constructor = hungerClass.getDeclaredConstructor(null);

        constructor.setAccessible(true);
        Hunger hunger = constructor.newInstance();
        Hunger hunger2 = constructor.newInstance();

        System.out.println(hunger);
        System.out.println(hunger2);
    }


    public static void testDoubleCheck() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Class<DoubleCheck> checkClass = DoubleCheck.class;

        Constructor<DoubleCheck> declaredConstructor = checkClass.getDeclaredConstructor(null);

        declaredConstructor.setAccessible(true);
        DoubleCheck instance = declaredConstructor.newInstance();
        DoubleCheck instance1 = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(instance1);

    }

    public static void testDoubleCheckPro() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        //这种先正常获取一次就会触发检测
        //如果去点这行就不会触发
        DoubleCheckPro instance = DoubleCheckPro.getInstance();

        Class<DoubleCheckPro> checkClass = DoubleCheckPro.class;

        Constructor<DoubleCheckPro> declaredConstructor = checkClass.getDeclaredConstructor(null);

        declaredConstructor.setAccessible(true);
        DoubleCheckPro instance1 = declaredConstructor.newInstance();
        DoubleCheckPro instance2 = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);

    }

    public static void testDoubleCheckProMax() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {


        //以下代码是是被第二道防住了
//        Class<DoubleCheckMax> checkClass = DoubleCheckMax.class;
//        Constructor<DoubleCheckMax> declaredConstructor = checkClass.getDeclaredConstructor(null);
//        declaredConstructor.setAccessible(true);
//        DoubleCheckMax instance1 = declaredConstructor.newInstance();
//        DoubleCheckMax instance2 = declaredConstructor.newInstance();
//
//        System.out.println(instance1);
//        System.out.println(instance2);


        //以下是攻破第二道防反射
        Class<DoubleCheckProMax> checkClass = DoubleCheckProMax.class;
        Constructor<DoubleCheckProMax> declaredConstructor = checkClass.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);

        //获取成员变量
        Field flag = checkClass.getDeclaredField("flag");
        flag.setAccessible(true);//设置为可改动的

        DoubleCheckProMax doubleCheckProMax1 = declaredConstructor.newInstance();
        flag.set(doubleCheckProMax1, false);
        DoubleCheckProMax doubleCheckProMax2 = declaredConstructor.newInstance();

        System.out.println(doubleCheckProMax1);
        System.out.println(doubleCheckProMax2);

    }


    public static void testEnum() throws Exception {
        Class<EnumSingle> checkClass = EnumSingle.class;


        //通过获取枚举的有参构造，，，参数为string.class,int.class
        Constructor<EnumSingle> declaredConstructor = checkClass.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);

        EnumSingle enumSingle = declaredConstructor.newInstance();
        EnumSingle enumSingle1 = declaredConstructor.newInstance();
        System.out.println(enumSingle);
        System.out.println(enumSingle1);

    }

    public static void main(String[] args) throws Exception {
        testEnum();

    }

}
