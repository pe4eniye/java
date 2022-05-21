package packages.test_project_1;

public class MyFirstProgram {

  public static void main (String[] args) {

    Kvadrati k = new Kvadrati(4);
    System.out.println("Площадь квадрата с длиной стороны " + k.dlinaa + " = " + k.razmer() + " см");

    Pryamougolnik p = new Pryamougolnik(4,6);
    System.out.println("Площадь прямоугольника со сторономи " + p.dlina + p.shirina + " = " + p.razmer() + " см");

    }
  }
