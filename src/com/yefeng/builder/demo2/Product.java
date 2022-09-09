package com.yefeng.builder.demo2;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author 夜枫
 */

@Data
@Accessors(chain = true)
public class Product {
    String stepA;
    String stepB;
    String stepC;
    String stepD;

    @Override
    public String toString() {
        return "Product{" +
                "stepA='" + stepA + '\'' +
                ", stepB='" + stepB + '\'' +
                ", stepC='" + stepC + '\'' +
                ", stepD='" + stepD + '\'' +
                '}';
    }
//
//    public String getStepA() {
//        return stepA;
//    }
//
//    public void setStepA(String stepA) {
//        this.stepA = stepA;
//    }
//
//    public String getStepB() {
//        return stepB;
//    }
//
//    public void setStepB(String stepB) {
//        this.stepB = stepB;
//    }
//
//    public String getStepC() {
//        return stepC;
//    }
//
//    public void setStepC(String stepC) {
//        this.stepC = stepC;
//    }
//
//    public String getStepD() {
//        return stepD;
//    }
//
//    public void setStepD(String stepD) {
//        this.stepD = stepD;
//    }
}
