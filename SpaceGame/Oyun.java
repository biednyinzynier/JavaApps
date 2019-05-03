
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ates{
    private int x;  // koordinatlar hareket etmesi için
    private int y;

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Oyun extends JPanel implements KeyListener,ActionListener{    // Keylistener : tuşa bastığımızda gerekli olan metotları 
    Timer timer = new Timer(5, this);
    
    private int gecenSure = 0;
    private int harcananAtes = 0;
    private BufferedImage image;
    private ArrayList<Ates> atesler = new ArrayList<Ates>();    // ateşler birden fazla olcağı için araylistle yapıyoz
    private int atesdirY = 5;        // her action performed olduğunda ateşler hareket olmuş olcak yukarı doğru
    private int topX = 0;            // sağa sola gitmeyi ayarlıcak bir artarak top hareket etmiş olacak
    private int topdirX = 4;    
    private int uzayGemisiX = 0;     // uzay gemisinin nerden başlıcağını söyler
    private int dirUzayX = 40;       // klavye sağ tuşuna basıldığında uzaygemisiX e eklencek 20 birim kaymış olacak

    public boolean kontrolEt(){
        for (Ates ates : atesler) {
            if(new Rectangle(ates.getX(), ates.getY(), 10, 20).intersects(new Rectangle(topX, 0, 20, 20))){
                // daireler çarpışıyormu diye kontrol
                return true;
            }
        }
        return false;
    }
    
    public Oyun() {
        try {
            // png yi imageye okuma işlemi.  
            image = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        setBackground(Color.black);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        gecenSure += 5;
        g.setColor(Color.red);
        g.fillOval(topX, 0, 20, 20);        // top
        g.drawImage(image, uzayGemisiX, 490, image.getWidth() / 10, image.getHeight() / 10, this);  // uzay gemisi
        for (Ates ates : atesler) {
            if(ates.getY() < 0)     // ateş Jframeden cıkarsa
                atesler.remove(ates);
        }
        g.setColor(Color.blue);
        for (Ates ates : atesler) 
            g.fillRect(ates.getX(), ates.getY(), 5, 20);
    }

    @Override
    public void repaint() {
        // painti çağırıyor şekilleri tekrar oluşturuyor.
        super.repaint(); 
    }
    
    

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();     // bastığımız tuşa göre değer dönen
        if(c == KeyEvent.VK_LEFT){
            if(uzayGemisiX <= 0)
                uzayGemisiX = 0;
            
            else
                uzayGemisiX -= dirUzayX;        // sola hareket
        }
        else if(c == KeyEvent.VK_RIGHT){
            if(uzayGemisiX >= 740)
                uzayGemisiX = 740;
            else
                uzayGemisiX += dirUzayX;        // sağa hareket
        }
        else if(c == KeyEvent.VK_CONTROL){  // ctrl tusuna basılırsa
            atesler.add(new Ates(uzayGemisiX + 15, 475));
            harcananAtes++;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {    // actionlistenerın metotu
                  // kullanmamızı sağlayan bir interfacedir. Actionlistener : Action performedı kullanmak için kullanılak bir interface
                  // timer ile topu hareket etmesini sağlamak için
        for(Ates ates : atesler){
            ates.setY(ates.getY() - atesdirY);
        }
                  
        topX += topdirX;
        if(topX >= 750)
            topdirX = -topdirX;     // geriye doğru gidecek
        
        if(topX <= 0)
            topdirX = -topdirX;
        
        if(kontrolEt()){
            timer.stop();
            String message = "Kazandınız...\n" +
                             "Harcanan Ateş : " + harcananAtes +
                             "\nGeçen süre : " + gecenSure / 1000.0 + "s";
            JOptionPane.showMessageDialog(this, message);
            System.exit(0); 
        }
        repaint();      // her çalıştığında top hareket etmiş olur.
    }
}
