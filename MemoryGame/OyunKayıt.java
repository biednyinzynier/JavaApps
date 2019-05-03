
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class OyunKayıt {
    public static void oyunKaydet(Kart[][] kartlar){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("kayıt.bin"))){
            System.out.println("Oyun Kaydediliyor......");
            out.writeObject(kartlar);
            
            
        } catch (IOException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Kart[][] kayittanAl(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("kayıt.bin"))){
            Kart[][] cikti = (Kart[][])in.readObject();
            return cikti;
            
        } catch (IOException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OyunKayıt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
