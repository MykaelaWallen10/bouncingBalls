
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
            xSpeed = -(int)(Math.random()*40+1);
          }

          if(x<= 0 ){
            xSpeed =(int)(Math.random()*40+1);
          }
            // if(x>= bPanel.getWidth()+size){
            //    x=1-size;
            // }
          
            // if(x<=0-size){
            //     x= bPanel.getWidth()-1;
            // }

         

          
            if(y>= bPanel.getHeight()- size ){
              
                 ySpeed = -(int)(Math.random()*5+1);
               
              

            }
         if(y<0){

             ySpeed =  (int)(Math.random()*5+1);
             
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
    

