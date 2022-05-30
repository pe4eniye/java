package ui.tests;

public class Test2 {
 public static void main(String[] args) {
  String number = "30";
  int wow123 = Integer.parseInt(number);
  System.out.println(wow123);


  System.out.println();
  String woow = "Hi. My name is %s . I am %d years old.";
  String name = "Petya";
  int age = 32;
  System.out.println(String.format(woow, name, age));

  System.out.println();
  int b = 5;
  System.out.println(!(b > 10));
  System.out.println();

  String yurii = "Сравним строку!";
  String yurii222 = "С этой строкой. Будет Фолс, так как текст отличается";
  System.out.println(yurii.equals(yurii222));
  System.out.println();

  int[] yurec = {1, 2, 3, 4, 5, 6};
          for (int i=0; i<6; i++)
           System.out.println(i);

 }
}