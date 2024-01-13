package org.nikita.example_1;

public class Test_1 {
    public static void main(String[] args) {

        ShowIngo showIngo = new ShowIngo();

        showIngo.showIntParam(1);


        int a = 2;
        showIngo.showIntParam(a);
        System.out.println();

        showIngo.showBoolParam(true);

        boolean b = false;
        showIngo.showBoolParam(b);
        System.out.println();

        showIngo.showStringParam("Privet!");
        String s = "Poka!";
        showIngo.showStringParam(s);
        System.out.println();

        showIngo.showCarParam(new Car("Honda", "Red"));
        Car car1 = new Car("Kia", "White");
        showIngo.showCarParam(car1);
    }
}

class ShowIngo {

    void showIntParam(int a) {
        System.out.println(a);
    }

    void showBoolParam(boolean a) {
        System.out.println(a);
    }

    void showStringParam(String a) {
        System.out.println(a);
    }

    void showCarParam(Car car){
        car.printInfo();
    }
}

class Car{

    String model;
    String color;

    public Car(String modelParam, String colorParam){
        model = modelParam;
        color = colorParam;
    }

    void printInfo(){
        System.out.println("Марка машины: " + model);
        System.out.println("Цвет машины: " + color);
    }

}

