import javax.swing.*;

public class Burger extends Makanan{
    public Burger(){
        setPoint(100);
        ImageIcon imgChar = new ImageIcon("src/Assets/burger2.png");
        setMakananLabel(new JLabel(imgChar));
    }
    public Burger(int posisiX, int posisiY){
        setPoint(300);
        setPosisiX(posisiX);
        setPosisiY(posisiY);
        ImageIcon imgChar = new ImageIcon("src/Assets/burger2.png");
        setMakananLabel(new JLabel(imgChar));
    }
}
