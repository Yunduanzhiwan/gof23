package com.yefeng.single;

public enum EnumSingle {
    INSTANCE{
        private Integer age;
        public String name;

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

//        @Override
//        public EnumSingle getInstance() {
//            this.name="sss";
//            this.age=11;
//
//            return INSTANCE;
//        }

        @Override
        public String toString() {
            return "$classname{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    };


    public static   EnumSingle getInstance(){
        return INSTANCE;
    }

}

class Test{
    public static void main(String[] args) {
        EnumSingle instance = EnumSingle.getInstance();

        System.out.println(instance);
    }
}