package ujjlab11;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "Q1" width = 200 height = 200 />
*/
public class Q1 extends Applet implements MouseListener{
    int c = 0;
    @Override
    public void init() {
        addMouseListener(this);
    }

    void drawLine(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawLine(0, 0, 200, 200);
    }

    void drawSun(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 50, 50);
    }

    void drawSmiley(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 50, 50);
        g.drawOval(110, 115, 5, 5);
        g.drawOval(135, 115, 5, 5);
        g.drawArc(110, 120, 30 , 20, 180, 180);
    }

    void drawSad(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 50, 50);
        g.drawOval(110, 115, 5, 5);
        g.drawOval(135, 115, 5, 5);
        g.drawArc(110, 130, 30 , 20, 180, -180);
    }

    void drawText(Graphics g) {

        int fontSize = 14;
        g.setColor(Color.BLACK);

        try {
            while(true){
              for(int i=0; i<3; i++) {
                fontSize+=2;
                g.clearRect(0, 0, 2000, 2000);
                g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
                g.drawString("HELLO WORLD", 125, 100);
                Thread.sleep(1000);
              }
              for(int i=0; i<3; i++) {
                fontSize-=2;
                g.clearRect(0, 0, 2000, 2000);
                g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));
                g.drawString("HELLO WORLD", 125, 100);
                Thread.sleep(1000);
              }
            }
        }
        catch(InterruptedException ex) {
            System.err.println(ex);
        }
    }

    void drawPie(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillArc(100, 100, 50, 50, 0, 90);
        g.setColor(Color.RED);
        g.fillArc(100, 100, 50, 50, 90, 120);
        g.setColor(Color.BLUE);
        g.fillArc(100, 100, 50, 50, 210, 150);
    }

    void drawSpiral(Graphics g) {
        g.setColor(Color.BLACK);
        int x = 100;
        int y = 100;
        int width = 1;
        int height = 1;
        int startAngle = 0;
        int arcAngle = 20;
        for (int i = 0; i < 80; i++) {
            g.drawArc(x, y, width, height, startAngle, arcAngle);
            x = x -1;
            y = y -1;
            width += 2 ;
            height += 2 ;
            startAngle = startAngle + arcAngle;
        }
    }

    void drawHouse(Graphics g) {
        g.setColor(Color.red);
        int xs[] = {100,160,220};
        int ys[] = {100,50,100};
        Polygon poly=new Polygon(xs,ys,3);
        g.fillPolygon(poly);

        g.setColor(Color.blue);
        g.fillRect(100,100,120,120);

        g.setColor(Color.white);
        g.fillRect(145,160,30,60);

        g.setColor(Color.black);
        g.fillRect(120,55,10,30);
    }

    @Override
    public void paint(Graphics g) {
        switch(c) {
            case 0: drawLine(g); break;
            case 1: drawSun(g); break;
            case 2: drawSmiley(g); break;
            case 3: drawSad(g); break;
            case 4: drawText(g); break;
            case 5: drawPie(g); break;
            case 6: drawSpiral(g); break;
            case 7: drawHouse(g); break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        c = (c+1)%8;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
