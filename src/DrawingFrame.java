import javax.swing.*;
import java.awt.*;
public class DrawingFrame{
    public static void main(String[] args){
        JFrame myFrame = new JFrame();
        myFrame.setSize(400,300);
        AnimatePanel bPanel = new AnimatePanel();


        //myFrame.add(bPanel);
        myFrame.add(bPanel);
        myFrame.setVisible(true);
    }
}
