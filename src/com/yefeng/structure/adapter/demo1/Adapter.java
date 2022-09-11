package com.yefeng.structure.adapter.demo1;

class Adapter implements Target {
    /**
     * 持有现有接口具体实现对象的引用
     */
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void chargeBy220v() {
        //该对象的现有功能
        adaptee.chargeBy110V();
        //对现有功能扩展
        System.out.println("再加110V，达到220V，冲鸭！");
    }
}