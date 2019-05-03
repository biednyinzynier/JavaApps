
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class OyunEkrani extends JFrame{

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
        ekran.setResizable(false);      
        ekran.setFocusable(false);       // focusu jframede olmamasını sağlarız
        ekran.setSize(800, 600);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        oyun.requestFocus();             // klavyeden gelen inputları anlaması için odağı veriyoruz
        oyun.addKeyListener(oyun);       // klavye işlemleri almasını sağlıyor
        oyun.setFocusable(true);         // focusu jframeden alıp jpanele verme işlemi
        oyun.setFocusTraversalKeysEnabled(false);       // klavye işlemlerini anlaması için
        
        ekran.add(oyun);                 // Jpanelimizi Jframeye eklemiş oluyoruz.
        ekran.setVisible(true);          // Jframemiz oluşacak
        
        
    }
}
