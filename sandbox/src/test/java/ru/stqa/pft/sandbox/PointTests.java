package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test

  public void TestDistance1(){

    Point p1 = new Point(11, 10);
    Point p2 = new Point(11 ,1);
    Assert.assertEquals(p1.distance(p2), 9.0 );

  }
  @Test

  public void TestDistance2(){

    Point p1 = new Point(11, 10);
    Point p2 = new Point(11 ,1);
    Assert.assertNotEquals( 8.0,  (p1.distance(p2)));

  }
  @Test

  public void TestDistance3(){

    Point p1 = new Point(11, 12);
    Point p2 = new Point(11 ,19);
    assert ( p1.distance(p2) <= 9.0);


  }
}
