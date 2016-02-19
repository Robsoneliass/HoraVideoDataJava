import java.awt.*;

public class Tela{
  public static void main(String[]args){

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    System.out.println("O tamanho da tela e: " +
     dim.width + " pixels de largura por " + dim.height +
     " pixels de altura.");
  }
}
