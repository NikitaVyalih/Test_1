package org.nikita.example_1;

public class Test_2 {
    public static void main(String [] args){

        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.showParameter(1);
        int a = 500;
        methodOverloading.showParameter(a);
        System.out.println();

        methodOverloading.showParameter(true);
        boolean b = false;
        methodOverloading.showParameter(b);
        System.out.println();

        methodOverloading.showParameter("Пишу код");
        String s = "Пишу много кода";
        methodOverloading.showParameter(s);
        System.out.println();

        methodOverloading.showParameter(new Car_2("VAZ", "Gray"));

        Car_2 car2 = new Car_2("VOLGA", "Black");
        methodOverloading.showParameter(car2);
    }
}

class MethodOverloading{
    void showParameter(int i){ // i - int
        System.out.println(i);
    }
//    void showParameter(int a){ // a - int
//        System.out.println(a);
//    }
    void showParameter(boolean b){
        System.out.println(b);
    }
    void showParameter(String s){
        System.out.println(s);
    }

    void showParameter(Car_2 car2){
        car2.printInfo();
    }
}

class Car_2 {

    String model;
    String color;

    public Car_2(String modelParam, String colorParam){
        model = modelParam;
        color = colorParam;
    }

    void printInfo(){
        System.out.println("Марка машины: " + model);
        System.out.println("Цвет машины: " + color);
    }

}