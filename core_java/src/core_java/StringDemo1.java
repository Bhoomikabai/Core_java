package core_java;

public class StringDemo1 
{
 public static void main(String[] args) 
 {
  String s1 ="BHOOMIKA";
  String s2=s1.toLowerCase();
  System.out.println(s2);
  
  String s3= s1.toUpperCase();
  System.out.println(s3);
  
  int s4= s1.length();
  System.out.println(s4);
  
  String s5 ="malayalam";
  String s6 = s5.replace('m', 'p');
  System.out.println(s6);
  
  String s7 ="core java";
  String s8 = s7.trim();
  System.out.println(s8);

  String s9 = "puneeth";
  String s10 = "rajkumar";
  String sv = s9.concat(s10);
  System.out.println(sv);
  
  
  String s11 = "";
  boolean val=s11.isEmpty();
  System.out.println(val);
  
  String x = "crome";
  String  y ="Crome";
  boolean c = x.equalsIgnoreCase(y);
  System.out.println(c);
   
 }
}