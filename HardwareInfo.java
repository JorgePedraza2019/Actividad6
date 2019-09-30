import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class HardwareInfo {
    
    public static void getCPUInfo() {
        
        InetAddress ip;
        String hostname;
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            
            try {
            Thread.sleep(150);
            } catch(InterruptedException e){}
            
            System.out.println("\n- Hostname : " + hostname);
            
            try {
            Thread.sleep(150);
            } catch(InterruptedException e){}
            
            System.out.println("\n- IP address : " + ip);
                    
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
 
    try {   
        ip = InetAddress.getLocalHost();
        NetworkInterface network = NetworkInterface.getByInetAddress(ip);   
        byte[] mac = network.getHardwareAddress();
        
        try {
            Thread.sleep(150);
        } catch(InterruptedException e){}
        
        System.out.print("\n- MAC address : "); 
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));        
        }
        System.out.println(sb.toString());
            
    } catch (UnknownHostException e) {
        e.printStackTrace();
        
    } catch (SocketException e){
        e.printStackTrace();    
    }
    try {
        Thread.sleep(150);
        } catch(InterruptedException e){}
    
        String java_version = System.getProperty("java.version");
        String version_message = String.format("\n- Java version: %s", java_version);
        System.out.println(version_message);
    }  
}
