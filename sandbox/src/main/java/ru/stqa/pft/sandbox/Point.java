package ru.stqa.pft.sandbox;
/* Класс для представления точек на двумерной плоскости */
public class Point {

  public double x;
  public double y;
/* Конструктор класса Point */
  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }
 /* Функция вычисляет расстояние между двумя точками */
  public double distance(Point p2) {

    return Math.sqrt(Math.pow((this.x - p2.x),2) + Math.pow((this.y - p2.y),2));
  }

}
