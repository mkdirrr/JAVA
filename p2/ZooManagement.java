package p2;
import p2.Animal;
import p2.Zoo;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("lion1", "lion1", 10, true);
        Animal tiger = new Animal("Felidae", "Rajah", 6, true);
        Animal parrot = new Animal("Psittacidae", "Rio", 2, false);
        Zoo myZoo = new Zoo("Esprit Zoo", "Tunis", 25);

        System.out.println("Animal : " + lion.name + " (" + lion.family + "), age : "
            + lion.age + ", mammifere : " + lion.isMammal);
        System.out.println("Animal : " + tiger.name + " (" + tiger.family + "), age : "
            + tiger.age + ", mammifere : " + tiger.isMammal);
        System.out.println("Animal : " + parrot.name + " (" + parrot.family + "), age : "
            + parrot.age + ", mammifere : " + parrot.isMammal);
        System.out.println(myZoo);
    }
    



























    /*int nbrCages;
    String zooName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement management = new ZooManagement();
        do{
            System.out.print("zoo name : ");
            management.zooName = scanner.nextLine().trim();
        }while(management.zooName.isEmpty());
        

        do{
            System.out.print("nbcage : ");      
            while(!scanner.hasNextInt()){
                System.out.println("Please enter a valid number");
                scanner.next();
                System.out.print("nbcage : ");  
            }  

            management.nbrCages = scanner.nextInt();
        }while(management.nbrCages <= 0);

    */
        
}


