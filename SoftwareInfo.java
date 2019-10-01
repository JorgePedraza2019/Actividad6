public class SoftwareInfo {

    public static void getCPUInfo() {
    
    System.out.println(" ");
    String os_name = System.getProperty("os.name");
    String version_message = String.format("- Os name: %s", os_name);
    String os_version = System.getProperty("os.version");
    String version_message2 = String.format("- Os version: %s", os_version);
    String os_arch = System.getProperty("os.arch");
    String version_message3 = System.getProperty("- Os arquitectura %s", os_arch);
    
    try {
        Thread.sleep(150);
    } catch(InterruptedException e){}
    
    System.out.println(version_message);
    System.out.println(" ");
    
    try {
        Thread.sleep(150);
    } catch(InterruptedException e){}

    System.out.println(version_message2);
    System.out.println(" ");
    
    try {
        Thread.sleep(150);
    } catch(InterruptedException e){}
    
    System.out.print("- CPU architecture: ");
    System.out.println(version_message3);
    
    try {
        Thread.sleep(150);
    } catch(InterruptedException e){}
    
    System.out.println("\n- Available processors (cores): " + Runtime.getRuntime().availableProcessors());
    
    try {
        Thread.sleep(150);
    } catch(InterruptedException e){}
    
    System.out.println("\n- Free memory (bytes): " + Runtime.getRuntime().freeMemory());
    long maxMemory = Runtime.getRuntime().maxMemory();
    
    try {
        Thread.sleep(150);
    } catch(InterruptedException e){}
    
    System.out.println("\n- Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
    
    try {
        Thread.sleep(150);
    } catch(InterruptedException e){}
    
    System.out.println("\n- Total memory available to JVM (bytes): " + Runtime.getRuntime().totalMemory());
    System.out.println(" ");    
    
}
}
