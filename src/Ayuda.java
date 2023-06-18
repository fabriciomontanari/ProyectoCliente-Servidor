
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ayuda {
    
    private static final String HOST="localhost";
   private static final int PUERTO=5000;
   private Socket sc;
   private DataOutputStream salida;
   private DataInputStream entrada;
   private String mensajeRecibido;
   
   public void inicializarCliente(){
       try{
           Scanner lectur=new Scanner(System.in);
           sc=new Socket(HOST,PUERTO);
           salida=new DataOutputStream(sc.getOutputStream());
           entrada=new DataInputStream(sc.getInputStream());
           String mensaje="";
           while(!mensaje.equals("SALIR")){
               System.out.println("Digite el mensaje que desea enviar: ");
               mensaje=lectur.nextLine();
               salida.writeUTF(mensaje);
               mensajeRecibido=entrada.readUTF();
               System.out.println("Recibiste este mensaje: "+mensajeRecibido);
               
           }
           
       }catch(IOException ex){
           JOptionPane.showMessageDialog(null,"¡Ningún gerente esta conectado en este momento, Intentar más tarde!");
       }
   }
}
