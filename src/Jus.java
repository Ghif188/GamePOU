import javax.swing.*;

public class Jus extends Makanan{
    public Jus(){
        setPoint(100);
        ImageIcon imgChar = new ImageIcon("src/Assets/jus.png");
        setMakananLabel(new JLabel(imgChar));
    }
    public Jus(int posisiX, int posisiY){
        setPoint(200);
        setPosisiX(posisiX);
        setPosisiY(posisiY);
        ImageIcon imgChar = new ImageIcon("src/Assets/jus.png");
        setMakananLabel(new JLabel(imgChar));
    }
}
