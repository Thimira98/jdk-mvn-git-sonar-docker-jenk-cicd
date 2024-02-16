package sjp.msc.cs;

public class Car
{
  private String model;
  private double price;

  public Car()
  {
    model = "Honda CR-V";
    setPrice(124);  
  }
  public void setPrice(int val)
  {
    price = val;
  }
}

