package packages.test_project_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {

  @Test
  public void testArea() {
    Kvadrati k = new Kvadrati(4);
    Assert.assertEquals(k.razmer(),16);
  }
}