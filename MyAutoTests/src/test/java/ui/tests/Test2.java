package ui.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

  System.out.println();

  //коллекция List = Для работы с динамическими массивами. Когда добавил элемент - массив увеличивается. Когда удаляю элемент - массив уменьшается.
  List<Integer> myList = new ArrayList<>();

  myList.add(55); // метод .add для добавления элемента в массив
  myList.add(66);
  myList.add(77);

  int yyy = myList.get(1); // метод .get для получения значения элемента из массива
  System.out.println(yyy);

  myList.set(1, 777); // метод .set для перезаписи значения элемента массива. Типа к "нулевому" элементу присвоить значение "888"
  System.out.println(myList.get(1));

  // myList.remove(1); // метод .remove для удаления элемента из массива
  // myList.get(1);
  // System.out.println(myList.size()); // метод .size чтобы узнать размер массива в данный момент
  // myList.clear(); // метод .clear для очистки массива

  List<Integer> list222 = new ArrayList<>();
  list222.add(123);

  myList.addAll(list222); // метод .addAll чтоб добавить все элементы одного массива в другой
  System.out.println(myList.size());

  System.out.println();

  // итератор - это интерфейс, кот позволяет работать с элементами списка или с какой-то коллекцией
  Iterator<Integer> myIterator = myList.iterator();
  System.out.println(myIterator.next()); // метод .next выводит следующий элемент (стартует с нулевого)

  while (myIterator.hasNext()){ // метод .hasNext проверяет есть ли дальше какой-то элемент после того, на котором метод .next остановился. Возвращает true либо false.
   System.out.println(myIterator.next());
  }

  System.out.println();

  for (int i : myList) {
   System.out.println(i);
  }

 }
}