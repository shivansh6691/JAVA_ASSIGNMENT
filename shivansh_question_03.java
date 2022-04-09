abstract class Vegetable
{
public String color;
}

class Potato extends Vegetable
{
 public String toString()
 {
  color = "Brown, Skinned Color";
  return "Potato, "+color;
 }
}

class Brinjal extends Vegetable
{
 public String toString()
 {
  color = "Purple Color";
  return "Brinjal, "+this.color;
 }
}

class Tomato extends Vegetable
{ 
 public String toString()
 {
  color="Red Color";
  return "Tomato, "+color;
 }
}

class veg_dis
{
 public static void main(String [] args)
 {
  Potato p = new Potato();
  Brinjal b = new Brinjal();
  Tomato t = new Tomato();
  System.out.println(p);
  System.out.println(b);
  System.out.println(t);
 }
}