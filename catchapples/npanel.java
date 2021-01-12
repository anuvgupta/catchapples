/*     */ import java.awt.Graphics;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.KeyListener;
/*     */ import java.util.Random;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.Timer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class npanel
/*     */   extends JPanel
/*     */   implements KeyListener, ActionListener
/*     */ {
/*  63 */   Timer time = new Timer(3, this);
/*  64 */   static int x = 250;
/*  65 */   static int y = 350;
/*  66 */   static int ax = 250;
/*  67 */   static int ay = 0;
/*  68 */   static int score = 0;
/*  69 */   static int health = 5; static boolean ap = true; static int randomNumber; static boolean startif = false;
/*  70 */   static int ox = x + 210;
/*     */   
/*     */   static boolean left = true;
/*     */   
/*     */   static boolean right = true;
/*     */   
/*     */   public npanel() {
/*  77 */     addKeyListener(this);
/*     */   }
/*     */   public void paint(Graphics g) {
/*  80 */     super.paint(g);
/*  81 */     g.drawImage(game.bg, 0, 0, this);
/*  82 */     g.drawImage(game.sprite, x, y, this);
/*  83 */     g.drawImage(game.apple, ax, ay, this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void keyPressed(KeyEvent e) {
/*  88 */     this.time.start();
/*  89 */     switch (e.getKeyCode()) {
/*     */       case 37:
/*  91 */         System.out.println("LEFT");
/*  92 */         x -= 50;
/*     */         break;
/*     */       case 39:
/*  95 */         System.out.println("RIGHT");
/*  96 */         x += 50;
/*  97 */         System.out.println(x);
/*     */         break;
/*     */     } 
/* 100 */     repaint();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void keyReleased(KeyEvent e) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void keyTyped(KeyEvent e) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void actionPerformed(ActionEvent e) {
/* 116 */     if (health < 1) {
/* 117 */       JOptionPane.showMessageDialog(null, "You dropped five apples. You lost! Your score was " + score + ".\nClick ok to play again.");
/* 118 */       x = 250;
/* 119 */       y = 350;
/* 120 */       health = 5;
/* 121 */       score = 0;
/* 122 */       this.time.stop();
/*     */     }
/* 124 */     else if (score == 50) {
/* 125 */       JOptionPane.showMessageDialog(null, "You Won! You collected fifty apples. Click ok to play again.");
/* 126 */       x = 250;
/* 127 */       y = 350;
/* 128 */       health = 5;
/* 129 */       score = 0;
/* 130 */       this.time.stop();
/*     */     
/*     */     }
/* 133 */     else if (ap) {
/* 134 */       if (ay > y && ax > x && ax < ox) {
/* 135 */         ay = 10000;
/* 136 */         score++;
/* 137 */         ap = false;
/*     */       }
/* 139 */       else if (ay == 400) {
/* 140 */         ay = 10000;
/* 141 */         health--;
/* 142 */         ap = false;
/*     */       } else {
/*     */         
/* 145 */         ay++;
/*     */       } 
/*     */     } else {
/*     */       
/* 149 */       getrandint(0, 545);
/* 150 */       ax = randomNumber;
/* 151 */       ay = 0;
/* 152 */       ap = true;
/* 153 */       ay++;
/*     */     } 
/*     */     
/* 156 */     repaint();
/*     */   }
/*     */   private static void getrandint(int aStart, int aEnd) {
/* 159 */     Random rand = new Random();
/* 160 */     if (aStart > aEnd) {
/* 161 */       throw new IllegalArgumentException("Start cannot exceed End.");
/*     */     }
/*     */     
/* 164 */     long range = aEnd - aStart + 1L;
/*     */     
/* 166 */     long fraction = (long)(range * rand.nextDouble());
/* 167 */     randomNumber = (int)(fraction + aStart);
/*     */   }
/*     */ }


/* Location:              /Users/anuv/Documents/GitHub/game/catchapples/archive/catch-the-apples.jar!/npanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */