package ui.tests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {

  public static void main(String[] args){

    // Коллекция Set с методом реализации через HashSet. Похоже на коллекцию List, но хранит только УНИКАЛЬНЫЕ объекты. Нельзя создать дубликат значения.
    Set<Integer> mySet = new HashSet<>();

    mySet.add(111); // метод .add добавляет в сет элемент
    mySet.add(777);
    mySet.add(222);
    mySet.add(444);

    System.out.println(mySet.size()); // метод .size показывает количество объектов
    System.out.println();

    mySet.remove(44488); // метод .remove удаляет объект. Но нужно указывать конкретное значение элемента, а НЕ его индекс, как в коллекции List

    Iterator<Integer> myIterator = mySet.iterator();

    while (myIterator.hasNext()) {
      System.out.println(myIterator.next());
    }

    System.out.println();

    for (int i : mySet) {
      System.out.println(i);
    }
    //
    //
    //
    //

    

  }
}
