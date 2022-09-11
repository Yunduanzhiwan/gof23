package com.yefeng.structure.adapter.demo2;

abstract class Adapter implements Target {
    //持有现有接口具体实现对象的引用
    AbstractAdaptee adaptee;

    public Adapter(AbstractAdaptee adaptee) {
        this.adaptee = adaptee;
    }
}