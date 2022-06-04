import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        initializeDogList();
        initializeMonkeyList();
        boolean start = true;
        Scanner scnr = new Scanner(System.in);
         
        while(start) {
            displayMenu();
            char option = scnr.nextLine().charAt(0);

            if(option == '1'){
                intakeNewDog(scnr);
            } else if(option == '2'){
                intakeNewMonkey(scnr);
            } else if(option == '3') {
                reserveAnimal(scnr);
            }else if (option == '4') {
                printAnimals("dog");
            }else if(option == '5'){
                printAnimals("monkey");
            }else if(option == '6') {
                printAnimals("available");
            }else if(option == 'q') {
                start = false;
            }else {
                System.out.println("Invalid option, please enter a valid option.");
            }
        }
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("Tommy", "male", "5", "6.0", "Africa", "in service", false, "United States", "chimpanze", 3, 6, 12);
        Monkey monkey2 = new Monkey("Mikey", "male", "5", "6.0", "Africa", "in service", false, "United States", "chimpanze", 3, 6, 12);
        Monkey monkey3 = new Monkey("Jane", "female", "5", "6.0", "Africa", "in service", false, "United States", "chimpanze", 3, 6, 12);   

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        
        System.out.println("What is the dog's acquisition date?");
        String acquistionDate = scanner.nextLine();
        
        System.out.println("What is the dog's acquisition country?");
        String acquistionCountry = scanner.nextLine();
        
        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is the dog reserved?");
        boolean reserve = scanner.nextBoolean();
        
        System.out.println("What is the dog's service country?");
        String serviceCountry = scanner.nextLine();
        
        Dog newDogObject = new Dog(
                name,
                breed,
                gender,
                age,
                weight,
                acquistionDate,
                acquistionCountry,
                trainingStatus,
                reserve,
                serviceCountry
        );
        dogList.add(newDogObject);
    }

    

     public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }

 
        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        
        System.out.println("What is the monkey's acquisition country?");
        String acquistionCountry = scanner.nextLine();
        
        System.out.println("What is the monkey's training status?");
        String trainingStatus = scanner.nextLine();
        
        System.out.println("Is the monkey reserved?");
        boolean reserve = scanner.nextBoolean();
        
        System.out.println("What is the monkey's service country?");
        String serviceCountry = scanner.nextLine();
        
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine().toLowerCase();
        
        System.out.println("What is the monkey's body length?");
        double bodyLength = scanner.nextInt();
        
        System.out.println("What is the monkey's tail length?");
        double tailLength = scanner.nextInt();
        
        System.out.println("What is the monkey's height?");
        double height = scanner.nextInt();

        Monkey newMonkeyObj = new Monkey(
                name,
                gender,
                age,
                weight,
                acquistionCountry,
                trainingStatus,
                reserve,
                serviceCountry,
                species,
                tailLength,
                height,
                bodyLength
        );
        monkeyList.add(newMonkeyObj);
    }

  

        // Complete reserveAnimal
        // You will need to find the animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            
           System.out.println("What tye of animal are you reservering? (Dog, Monkey)");
           String animalChoice = scanner.nextLine().trim().toLowerCase();
           System.out.println("Enter animal service country: ");
           String serviceCountry = scanner.nextLine();
        

           if(animalChoice.equalsIgnoreCase("dog")) {
                 for(Dog dog: dogList) {
                   if(dog.getInServiceLocation().equalsIgnoreCase(serviceCountry) && !dog.getReserved()) {

                     dog.setReserved(true);
                     System.out.println("Great! " + dog.getName() + " has been reserved.");
                     return; 
                   } else {

                     System.out.println("Sorry, " + dog.getName() + " is already reserved");
                     return;
                   }
                 }
            }else if(animalChoice.equalsIgnoreCase("monkey")) {
                for(Monkey monkey: monkeyList) {
                   if(monkey.getInServiceLocation().equalsIgnoreCase(serviceCountry) && !monkey.getReserved()) {

                     monkey.setReserved(true);
                     System.out.println("Great! " + monkey.getName() + " has been reserved.");
                     return; 
                   }else {

                    System.out.println("Sorry, " + monkey.getName() + " is already reserved");
                   }
                 }
           
            }else {
              return;
            }
        }


        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String type) {

            if(type.equals("dog")){

                for(Dog dog: dogList) {

                    String name = dog.getName();
                    String status = dog.getTrainingStatus();
                    String country = dog.getAcquisitionLocation();
                    boolean reserved = dog.getReserved();

                    System.out.println("name: " + name);
                    System.out.println("status: " + status);
                    System.out.println("country: " +  country);
                    System.out.println("reserved: " +  reserved);
                }
            }

             if(type.equals("monkey")) {
                   for(Monkey monkey: monkeyList) {

                      String name = monkey.getName();
                      String status = monkey.getTrainingStatus();
                      String country = monkey.getAcquisitionLocation();
                      boolean reserved = monkey.getReserved();

                      System.out.println("name: " + name);
                      System.out.println("status: " + status);
                      System.out.println("country: " +  country);
                      System.out.println("reserved: " +  reserved);
                  }
             }

        }
}

