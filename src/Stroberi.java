import javax.swing.*;

public class Stroberi extends Makanan{
    public Stroberi(){
        setPoint(100);
        ImageIcon imgChar = new ImageIcon("src/Assets/strawberry.png");
        setMakananLabel(new JLabel(imgChar));
    }
    public Stroberi(int posisiX, int posisiY){
        setPoint(50);
        setPosisiX(posisiX);
        setPosisiY(posisiY);
        ImageIcon imgChar = new ImageIcon("src/Assets/strawberry.png");
        setMakananLabel(new JLabel(imgChar));
    }
}
