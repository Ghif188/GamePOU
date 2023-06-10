import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
public class Selai extends Makanan{
    public Selai(){
            setPoint(100);
            Image imgChar = new ImageIcon("src/Assets/cake.jpg").getImage().getScaledInstance(50,50, java.awt.Image.SCALE_DEFAULT);
            ImageIcon img = new ImageIcon(imgChar);
            setMakananLabel(new JLabel(img));
    }
    public Selai(int posisiX, int posisiY){
            setPoint(10);
            setPosisiX(posisiX);
            setPosisiY(posisiY);
            ImageIcon imgChar = new ImageIcon("src/Assets/cake.jpg");
            setMakananLabel(new JLabel(imgChar));
    }
}
