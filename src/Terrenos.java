
import javax.swing.JOptionPane;


public class Terrenos extends Thread{
    private String terrenos;
    
    public Terrenos(String terrenos){
        this.terrenos=terrenos;
        
    }
    public void run(){
        JOptionPane.showMessageDialog(null,"Los visitantes estan pasando por el terreno "+terrenos);
    }
    
}
