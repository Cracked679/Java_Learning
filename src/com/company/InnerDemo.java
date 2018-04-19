package com.company;

class outerClass{
    int a;

    public void show(){

    }

    class innerClass{
        public void display(){
            System.out.println("In display");
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {

        outerClass obj1=new outerClass();
        obj1.show();

        outerClass.innerClass obj2 = obj1.new innerClass();
        obj2.display();

    }
}
