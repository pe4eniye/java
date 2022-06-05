package ui.tests;

public class Test2 {
 public static void main(String[] args) {

  int cycle = 16;
  if (cycle > 5) {
   System.out.println("The number is bigger than 5");
   if (cycle < 10) {
    System.out.println("The number is less than 10");
   } else {
    System.out.println("The number is bigger then 5 and bigger than 10");
   }
  }
  else {
    System.out.println("The number is less then 5");
   }

    System.out.println();

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

  System.out.println();
  System.out.println();

  int[] array1 = new int[10];
  for (int i = 0; i < 10; i++){
   array1[i] = i * 2;
  }

  for (int element : array1){
   System.out.println("The value for the element is " + element);
  }

  System.out.println();

  int aq = 0;
  boolean qqq = true;
  while (qqq){
   System.out.println(aq);
   aq++;
   if (aq == 3) qqq = false;
  }

  System.out.println();

  int qwe = 0;
  do {
   System.out.println(qwe);
   qwe++;
  } while (qwe < 5);



 }
}