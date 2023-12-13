package com.casting;

public class Casting_Prog {

public static void main(String[] args) {
Parent_Class p1=new Child1_Class();
p1.add();
Child1_Class c1=(Child1_Class) new Parent_Class();
c1.add();
}
}
