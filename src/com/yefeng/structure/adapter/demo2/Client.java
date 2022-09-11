package com.yefeng.structure.adapter.demo2;

/**
 * @author 夜枫
 */
public class Client {

    public static void main(String[] args) {
        //我们去美国，酒店里有一个美国110V充电站，我们需要220V的电压
        System.out.println("我来美国了，需要220v来充电，但是只有110v的电压");
        AbstractAdaptee b = new AmericanCharger();
        //我们将这个充电站交给适配器以获取220V电压充电
        Adapter adapter1 = new UniversalAdapter(b);
        //接下来我们通过适配器充电就好了
        adapter1.chargeBy220v();

        System.out.println("--------------------------------");
        System.out.println("我来中国了，设备1需要220v来充电，设备2需要110v来充电，但是中国只有220v电压");
        //美国人来中国，酒店里有一个中国220V充电站，但他需要110V的电压
        AbstractAdaptee a = new ChineseCharger();
        //将这个充电站交给适配器以获取110V电压充电
        Adapter adapter2 = new UniversalAdapter(a);
        //接下来我们通过适配器充电就好了
        System.out.println("开启给设备2重电");
        adapter2.chargeBy110v();


        System.out.println("开启给设备1重电");
        adapter2.chargeBy220v();
    }
}
