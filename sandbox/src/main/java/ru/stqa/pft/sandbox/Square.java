package ru.stqa.pft.sandbox;

public class Square {

  public double l;

  /* Конструктор класса */
  public Square (double l) {
    this.l = l;
  }
 /* Функция вычисления площади квадрата*/
  public double area() {
    return this.l * this.l;
  }
}
