package test.java;

import org.junit.Test;


import model.java.Duck;
import model.java.FlyNoWay;
import model.java.FlyWithRocket;
import model.java.FlyWithWings;
import model.java.MallarDuck;
import model.java.MuteQuack;
import model.java.Quack;
import model.java.QuackBehavior;
import model.java.RedheadDuck;
import model.java.RubberDuck;
import model.java.Squeak;
public class DuckTest{

 @Test
//ҰѼ
 public void duckTest(){
    Duck MallardDuck=new MallarDuck();
    MallardDuck.setFlyBehavior(new FlyWithWings());
    MallardDuck.setQuackBehavior(new Quack());
    System.out.println(MallardDuck.display());
    System.out.println(MallardDuck.swim());
    System.out.println(MallardDuck.performFly());
    System.out.println(MallardDuck.performQuack());
    //��Ѽ
    Duck RubberDuck = new RubberDuck();
    RubberDuck.setQuackBehavior(new Squeak());
    RubberDuck.setFlyBehavior(new FlyNoWay());
    System.out.println(RubberDuck.display());
    System.out.println(RubberDuck.swim());
    System.out.println(RubberDuck.performFly());
    System.out.println(RubberDuck.performQuack());
    
  //���Ѽ
    Duck RedheadDuck = new RedheadDuck();
    RedheadDuck.setQuackBehavior(new MuteQuack());
    RedheadDuck.setFlyBehavior(new FlyWithRocket());
    System.out.println(RedheadDuck.display());
    System.out.println(RedheadDuck.swim());
    System.out.println(RedheadDuck.performFly());
    System.out.println(RedheadDuck.performQuack());
 
}
}

