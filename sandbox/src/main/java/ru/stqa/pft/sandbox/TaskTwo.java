package ru.stqa.pft.sandbox;

public class TaskTwo {
  public static void main(String[] args) {

    Point p1 = new Point(9, 9);
    Point p2 = new Point(9 ,1);

    System.out.println("Расстояние между точками ( " + p1.x + " ; " + p1.y + " ) и ( " + p2.x + " ; " + p2.y + " ) равно " + p1.distance(p2));
  }


}
