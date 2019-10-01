import java.io.*;
import java.net.*;
import java.util.*;
import static java.lang.System.out;
import java.math.BigInteger; 
import java.net.URL; 
import java.net.HttpURLConnection; 
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.util.ArrayList; 

public class NetworkInfo {
    static Scanner sc = new Scanner(System.in);
    public static void getCPUInfo () throws SocketException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets))
            displayInterfaceInformation(netint);
        }
        
        static void displayInterfaceInformation(NetworkInterface netint) throws SocketException {
        try {
            Thread.sleep(50);
        } catch(InterruptedException e){}
        
        out.printf("- Display name: %s\n", netint.getDisplayName());
        out.printf("  Name: %s\n", netint.getName());
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            out.printf("  InetAddress: %s\n", inetAddress);
        }
        out.printf("\n");
        }
        
        public static void Internet () throws Exception {
            System.out.println("  Ingrese un sitio web para corroborar su conexión a internet: ");
            System.out.println("  (Ejemplo: www.apple.com)\n");
            System.out.print("= ");
            String opc; 
            opc = sc.nextLine();
            Process process = java.lang.Runtime.getRuntime().exec("ping "+ opc); 
            int x = process.waitFor(); 
            if (x == 0) { 
            System.out.println("\n- Connexión Exitosa, " + "Output was " + x); 
            } 
            else { 
            System.out.println("\n- Error de conexión, " + "Output was " + x); 
            System.out.println(" ");
        } 

        BigInteger size = new BigInteger("1"); 
        URL url = new URL( "https://"+ opc); 
        HttpURLConnection conn; 
        try {   
            conn = (HttpURLConnection)url.openConnection();  
            conn.setRequestMethod("HEAD"); 
            conn.getInputStream(); 
            size = BigInteger.valueOf(conn.getContentLength()); 
            System.out.println("\n- El tamaño de la página es de: " + size + " bytes\n"); 
            conn.getInputStream().close(); 
        } 
        catch (Exception e) 
        { 
            System.out.println("\n- Verifique la dirección correcta de la página, de lo contrario no tiene conexión a internet.\n"); 
        }
        
        ArrayList<String> commandList = new ArrayList<String>();   
        
        commandList.add("ping"); 
        commandList.add(opc);   
        NetworkInfo.commands(commandList); 
        }

        
        static void commands(ArrayList<String> commandList)  throws Exception {  
        
            ProcessBuilder build = new ProcessBuilder(commandList); 
            Process process = build.start();    
            BufferedReader input = new BufferedReader(new InputStreamReader (process.getInputStream())); 
            BufferedReader Error = new BufferedReader(new InputStreamReader (process.getErrorStream())); 
            String s = null; 
          
            System.out.println("Standard output: "); 
            while((s = input.readLine()) != null) 
            { 
                System.out.println(s); 
            } 
            while((s = Error.readLine()) != null) 
            { 
                System.out.println(s); 
            } 
        } 
    
    }
