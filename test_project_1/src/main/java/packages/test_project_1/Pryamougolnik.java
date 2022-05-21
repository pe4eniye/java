package packages.test_project_1;

public class Pryamougolnik {
  public int dlina;
  public int shirina;

  public Pryamougolnik(int dlina, int shirina) {
    this.dlina = dlina;
    this.shirina = shirina;
  }

  public int razmer(){
    return this.dlina * this.shirina;
  }


}
