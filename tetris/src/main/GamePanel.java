package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    public static final int WIDTH = 1280;
    public static final int HEIGHT= 1280;
    final int FPS = 60;
    Thread gameThread;
    
    public GamePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);
    }

    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override public void run() {
        // GAME LOOP
        double drawInterval = 1000000000/FPS;
        
    }

    public void update() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
}
