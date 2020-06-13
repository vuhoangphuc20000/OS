/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class Panel extends javax.swing.JPanel {

    /**
     * Creates new form Panel
     */
    private MediaTracker mt;
    Graphics g;
    private Graphics2D g2d,g2;
    private BufferedImage buff_img;
    private int width = 800;
    private int height = 500;
    private Image img = new ImageIcon("/image/1f914.png").getImage();
    private int dishX[]= {360,250,480,280,450};
    private int dishY[]={100,180,180,300,300};
    public Panel() {
        initComponents();
        buff_img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        g2d = (Graphics2D) buff_img.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        this.setSize(width, height);
        this.setLocation(0, 0);
        g2d.setColor(new Color(255, 255, 255));
        g2d.fillRect(0, 0, width, height); 
        this.drawTable(g2d);
    }
    private void doDrawing(Graphics g) {
        g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawImage(buff_img, null, 0, 0);
        g2.drawImage(img,0 ,0,null);

    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
    public void drawTable(Graphics g)
    {
       g2 =(Graphics2D)g;
       g2.setColor(Color.GRAY);
       g2.fillOval(240,90,300,300);
       g2.setColor(Color.WHITE);
       for(int i=0;i<5;i++){
       g2.fillOval(dishX[i], dishY[i], 50,50);
       }
       repaint();
    }    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
