package ru.stqa.pft.sandbox;

public class Rectangle {

  public double a;
  public double b;
/* Конструктор класса */
  public Rectangle ( double a, double b) {
    this.a = a;
    this.b = b;
  }
  /* Функция вычисления площади прямоугольника*/
  public double area () {
    return this.a * this.b;
  }
}
