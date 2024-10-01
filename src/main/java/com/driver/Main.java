package com.driver;

public class Main {
  public class Product{
    public int product(int x,int y){}
    public int product(int x,int y,int z){}
    public double product(double x, double y){}
  }

  public static void main(String []args)
  {
  Product p = new Product();
  p.product(1,1);
  p.product(1,1,1);
  p.product(11.02,1.33);
  }
}
