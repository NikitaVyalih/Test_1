package org.nikita.example_3;

public class Test_1 {
    public static void main(String[] args) {

        //Cat cat_1 = new Cat();
        //Теперь создать нового кода без параметров нельзя

        Cat cat_1 = new Cat(1,"Barsik");
        System.out.println(cat_1);
    }
}

class Cat {
    int id;
    String name;
    String bread;
    String nameCatOwner;
    String surnameCatOwner;

    public Cat(int idParam, String nameParam){
        id = idParam;
        name = nameParam;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", nameCatOwner='" + nameCatOwner + '\'' +
                ", surnameCatOwner='" + surnameCatOwner + '\'' +
                '}';
    }
}