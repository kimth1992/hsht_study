package taeho_study;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Swing extends JFrame {
  ManLabel manLabel;
  MonsterLabel monsterLabel;
  MoneyLabel moneyLabel;
  int Score = 0;
  int manX, manY;
  int monX, monY;
  int mnyX, mnyY;
  int height, width;
  private JTextField ScoreZ;
  Swing () {
    setTitle("Project");
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    manX = this.getWidth() / 2;
    manY = this.getHeight() / 2;
    GamePanel gamePanel = new GamePanel();
    setContentPane(gamePanel);

    JPanel ScoreP= new JPanel();
    ScoreP.setLayout(new FlowLayout());
    ScoreP.add(ScoreZ = new JTextField("    Score :" + Score +"    "));

    JPanel Exp = new JPanel();
    Exp.setLayout(new FlowLayout());
    Exp.add(new JTextField("조작 : 방향키 , 종료 : q"));
    setLayout(new BorderLayout());
    add(ScoreP, BorderLayout.NORTH);
    add(Exp, BorderLayout.SOUTH);
    setVisible(true);
  }

  public static void main(String [] args) {
    new Swing();
  }

  class MoneyLabel extends JLabel {
    MoneyLabel () {
      this.setText("$");
      this.setForeground(Color.green);
    }
  }
  class ManLabel extends JLabel {
    ManLabel () {
      this.setText("O");
    }
  }
  class MonsterLabel extends JLabel {
    MonsterLabel () {
      this.setText("M");
      this.setForeground(Color.red);
    }
  }
  class GamePanel extends JPanel {
    Random random = new Random();
    GamePanel () {
      setLayout(null);

      monX= (int)(Math.random()*getWidth());
      monY= (int)(Math.random()*getHeight());   

      manLabel = new ManLabel();
      manLabel.setBounds(manX, manY,15,15);
      this.addKeyListener(new ManKeyListener());   

      monsterLabel = new MonsterLabel();
      monsterLabel.setBounds(monX, monY, 15, 15);

      moneyLabel = new MoneyLabel();
      moneyLabel.setBounds(mnyX, mnyY, 15, 15);

      MonsterThread monsterTh = new MonsterThread();
      MoneyThread moneyTh = new MoneyThread();
      MoneyThread2 moneyTh2 = new MoneyThread2();
      add(manLabel);
      add(monsterLabel);
      add(moneyLabel);

      this.setFocusable(true);
      this.grabFocus();

      monsterTh.start();
      moneyTh.start();
      moneyTh2.start();
    }
  }


  class MoneyThread extends Thread {
    public void run() {
      while(true) {
        mnyX= (int)(Math.random()*getWidth());
        mnyY= (int)(Math.random()*getHeight());


        if(Score == 5) {
          ScoreZ.setText("Clear!!");
          break;
        }
        if(manX == monX && manY == monY) 
          break;
        moneyLabel.setLocation(mnyX, mnyY);
        try {
          Thread.sleep(5000);
          repaint();
        }
        catch(InterruptedException e) {
          return ;
        }
      }
    }
  }   
  class MoneyThread2 extends Thread {
    public void run() {
      while(true) {

        if(mnyX > manX) {
          mnyX -= 1;
        }
        if(mnyX < manX) {
          mnyX += 1;
        }
        if(mnyY > manY) {
          mnyY -= 1;
        }
        if(mnyY < manY) {
          mnyY += 1;
        }   
        if(mnyX == manX && mnyY == manY) {
          Score += 1;
          ScoreZ.setText("    Score : "+ Score + "    ");
          mnyX= (int)(Math.random()*getWidth());
          mnyY= (int)(Math.random()*getHeight());
        }
        if(Score == 3) {
          ScoreZ.setText("    Clear!!");
          break;
        }
        if(manX == monX && manY == monY) 
          break;
        moneyLabel.setLocation(mnyX, mnyY);
        try {
          Thread.sleep(200);
          repaint();
        }
        catch(InterruptedException e) {
          return ;
        }
      }
    }

  }
  class MonsterThread extends Thread {
    public void run() {
      while(true) {
        if(monX > manX) {
          monX -= 5;
        }
        if(monX < manX) {
          monX += 5;
        }
        if(monY > manY) {
          monY -= 5;
        }
        if(monY < manY) {
          monY += 5;
        }   
        if(monX == manX && monY == manY) {
          ScoreZ.setText("Gameover...");
          break;
        }
        if(Score == 5)
          break;
        monsterLabel.setLocation(monX, monY);
        try {
          Thread.sleep(300);
          repaint();
        }
        catch(InterruptedException e) {
          return ;
        }
      }
    }
  }
  class ManKeyListener extends KeyAdapter {
    public void keyPressed(KeyEvent e) {
      if(e.getKeyCode() == KeyEvent.VK_UP)
        manY -= 10;
      if(e.getKeyCode() == KeyEvent.VK_DOWN)
        manY += 10;
      if(e.getKeyCode() == KeyEvent.VK_LEFT)
        manX -= 10;
      if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        manX += 10;
      if(e.getKeyChar() == 'q')
        System.exit(0);
      manLabel.setLocation(manX, manY);
    }
  }
}