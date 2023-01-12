package core_java;

public class SwitchDemo 
{
 public static void main(String[] args) 
 {
  int size = 78;
  switch(size)
  {
  case 34:
  {
	  System.out.println("small size");
	  break;
  }
  case 38:
  {
	  System.out.println("medium size");
	  break;
  }
  case 46:
  {
	  System.out.println("large size");
	  break;
  }
  case 48:
  {
	  System.out.println("xl size");
	  break;
  }
  default:
  {
	  System.out.println("size is unknown");
  }
  }
 }
}
