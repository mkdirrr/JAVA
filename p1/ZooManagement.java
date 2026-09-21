import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();
        do{
            System.out.print("zoo name : ");
            zoo.zooName = scanner.nextLine().trim();
        }while(zoo.zooName.isEmpty());
        

        do{
            System.out.print("nbcage : ");      
            while(!scanner.hasNextInt()){
                System.out.println("Please enter a valid number");
                scanner.next();
                System.out.print("nbcage : ");  
            }  

            zoo.nbrCages = scanner.nextInt();
        }while(zoo.nbrCages <= 0);


        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
    
    }
}


