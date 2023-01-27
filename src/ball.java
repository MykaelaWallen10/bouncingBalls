
    import javax.swing.*;
import java.awt.*;


    public class ball{

        private int x,y, size,xSpeed, ySpeed;
        private Color color;
        private int xAdd = 1;


        public ball(int inx, int iny, int insize, int inxSpeed, int inySpeed){
            x = inx;
            y = iny;
            xSpeed = inxSpeed;
            ySpeed = inySpeed;
            size = insize;
           color = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));

        }

        public void draw(Graphics g){

            g.fillOval(x,y,size,size);
            g.setColor(color);

        }

        public void move(JPanel bPanel){
            x += xSpeed;
            y += ySpeed;
            if(x>= bPanel.getWidth()-size){
               x=1;

            }
            if(x<=0){
                x= bPanel.getWidth()-size-1;
            }
            if(y>= bPanel.getHeight()-size||y<0){
                ySpeed*= -1;
            }


        }
        public int getX(){
            return x;
        }

        public int getY(){
            return y;
        }
        public int getSize(){
            return size;
        }
    }

