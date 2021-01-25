/*    */ import java.awt.Container;
/*    */ import java.awt.Image;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import javax.imageio.ImageIO;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ 
/*    */ 
import java.io.InputStream;
import java.io.OutputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class game
/*    */ {
/* 18 */   static npanel panel = new npanel();
/* 19 */   static Image sprite = null;
/* 20 */   static Image bg = null;
/* 21 */   static Image apple = null;
/*    */   static Container pane;
/*    */   
/*    */   public static void main(String[] args) {
/* 25 */     JOptionPane.showMessageDialog(null, "Catch the apples!\nMove with the arrow keys.\nYou are supposed to collect as many apples as you can. You win at fifty.\nYou can only drop five apples (Lose five lives).\nClick ok to start.");
/* 26 */     JFrame gui = new JFrame("Catch the Apples!");
/* 27 */     gui.setSize(600-10, 500-10);
/* 28 */     gui.setDefaultCloseOperation(3);
/* 29 */     gui.setVisible(true);
/* 30 */     panel.setFocusable(true);
/* 31 */     pane = gui.getContentPane();
/*    */     try {
/* 33 */       InputStream file = game.class.getClassLoader().getResourceAsStream("bucket.png");
/* 34 */       sprite = ImageIO.read(file);
/*    */     }
/* 36 */     catch (IOException e) {
/* 37 */       e.printStackTrace();
/* 38 */       System.out.println("\n" + dir);
/*    */     } 
/*    */     try {
/* 41 */       InputStream file2 = game.class.getClassLoader().getResourceAsStream("bg.jpg");
/* 42 */       bg = ImageIO.read(file2);
/*    */     }
/* 44 */     catch (IOException e) {
/* 45 */       e.printStackTrace();
/* 46 */       System.out.println("\n" + dir);
/*    */     } 
/*    */     try {
/* 49 */       InputStream file3 = game.class.getClassLoader().getResourceAsStream("apple.png");
/* 50 */       apple = ImageIO.read(file3);
/*    */     }
/* 52 */     catch (IOException e) {
/* 53 */       e.printStackTrace();
/* 54 */       System.out.println("\n" + dir);
/*    */     } 
             gui.setSize(600, 518);
/* 56 */     pane.add(panel);
              gui.setSize(600, 518);
/* 57 */     panel.requestFocus();
/*    */   }
/*    */   
/*    */   static String dir;
/*    */ }


/* Location:              /Users/anuv/Documents/GitHub/game/catchapples/archive/catch-the-apples.jar!/game.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */