package com.company;

class student{
    String snm,sdiv;
    int rno;

    public void display(){
        System.out.println(snm+" : "+sdiv+" : "+rno);
    }
}
public class ClassObjectDemo {

    public static void main(String[] args) {
	// write your code here
        student obj1 = new student();

        obj1.snm="Shyam";
        obj1.sdiv="A";
        obj1.rno=20;

        obj1.display();
    }
}
