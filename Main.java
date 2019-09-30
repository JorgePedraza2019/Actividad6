import java.util.*;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String Decision;
        do {
            try {
                try
        {
            Thread.sleep(500);
        }catch(InterruptedException e){}
                System.out.println("\n------------------------------------------------------------------------------");
                System.out.println("|    Hardware    |    Software    |    Network    |    Todo    |    Salir    |");
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("\nIngrese la Opción: \n");
                System.out.print("= ");

                String opc; 
                opc = sc.nextLine();
                switch(opc) { 
                    
                    case "Hardware":
                    case "hardware":
                    case "HARDWARE":
                    System.out.println("\n------------------------------------------------------------------------------");
                    HardwareInfo.getCPUInfo();
                    System.out.println("\n------------------------------------------------------------------------------");
                    break;

                    case "Software":
                    case "software":
                    case "SOFTWARE":
                    System.out.println("\n------------------------------------------------------------------------------");
                    SoftwareInfo.getCPUInfo();
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                    
                    case "Network":
                    case "network":
                    case "NETWORK":
                    System.out.println("\n------------------------------------------------------------------------------\n");
                    NetworkInfo.getCPUInfo();
                    NetworkInfo.Internet();
                    System.out.println("------------------------------------------------------------------------------");
                    break;

                    case "Todo":
                    case "todo":
                    case "TODO":
                    System.out.println("\n------------------------------------------------------------------------------");
                    HardwareInfo.getCPUInfo();
                    SoftwareInfo.getCPUInfo();
                    NetworkInfo.getCPUInfo();
                    NetworkInfo.Internet();
                    System.out.println("------------------------------------------------------------------------------");
                    break;

                    case "Salir":
                    case "salir":
                    case "SALIR":
                    System.exit(0);
                    break;

                    default:
                    System.out.println("\nPorfavor valide que su opción escrita sea correcta");
                    Main.main (null); 
            }
                } catch (Exception e) {
                    System.out.println("Hubo un error. Favor de escribir una opción válida.");
                    Main.main (null); 
                } 
            
                Scanner entrada=new Scanner(System.in);     
                System.out.println("\n¿Desea escoger otra opción?");
                System.out.println("\n----------------------- ");
                System.out.println("|    Si    |    No    |): ");
                System.out.println("-----------------------\n");
                System.out.print("= ");
                Decision=sc.nextLine();
           
        } while (Decision.equals("si") || Decision.equals("Si") || Decision.equals("SI")); {
            if (Decision.equals("no") || Decision.equals("No") || Decision.equals("NO")) {
                System.out.println("\nFin del programa");
                System.exit(0);
            
            } else {
                System.out.println("\nPorfavor valide que su opción escrita sea correcta");
                Main.main (null); 
            }
        }
    }
}
