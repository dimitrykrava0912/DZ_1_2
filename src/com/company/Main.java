package com.company;
//Описать класс «Triangle». В качестве свойств возьмите длины сторон
//треугольника. Реализуйте метод, который будет возвращать площадь этого
//треугольника. Создайте несколько объектов этого класса и протестируйте их.
public class Main {

    public static void main(String[] args) {
	// write your code here
        Triangle first=new Triangle(2,2,3);
        Triangle second=new Triangle(2,3,4);

        System.out.println(first.getSquare());
        System.out.println(second.getSquare());

    }
}
