import javax.swing.*;
import java.awt.event.*;
public class ActionListner {

    public ActionListner()
    {
        frame();
    }

    public void frame()
    {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();
        JButton b1 = new JButton("Action Listner");

        p.add(b1);
        f.add(p);

    }

    public static void main(String[] args) {
        ActionListner a = new ActionListner();
    }
}
