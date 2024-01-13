package org.nikita.example_2;

public class Test_1 {
    public static void main(String[] args) {


        MethodOverloading methodOverloading = new MethodOverloading();

        int a = methodOverloading.sum(5, 13);
        System.out.println(a);
        System.out.println();

        String s = methodOverloading.sum("Lupa", "Pupa");
        System.out.println(s);

    }
}

class MethodOverloading {
    // Метод мождет быть разный Access Modifier
    //  Может быть разный Return type
    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    protected String sum(String a, String b) {
        return a + " " + b;
    }
    // Методы отличающиеся только return type или Access Modifier не являются перегруженными
//    void sum(int q, int w) {
//        System.out.println(q+w);
//    }
}
