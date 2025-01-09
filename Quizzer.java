import java.util.Scanner;

class Quizzer {
    public static void main(String[] args){
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program asks you pirate-themed questions.");
        System.out.println("Please enter options such as 1,2,3 and 4");
        System.out.println("What was the primary goal of most pirates?");
        System.out.println("1)To explore new lands\n2)To find treasure and riches\n3)To create peace treaties\n4)To establish trade routes");
        int answer = scanner.nextInt();                   
        if (answer == 2){
            System.out.println("Correct");
            score++;
        }
        else{        
            System.out.println("Incorrect"); 
            System.out.println("The right answer is 2")  ;                 
        }
        answer = 0;
        System.out.println("What be the meanin’ o’ the phrase “shiver me timbers”?");
        System.out.println("1)The ship’s wood is breaking.\n2) A cry of surprise or shock.\n3) A command to lower the sails.\n4) A pirate’s way of laughing.");
        answer = scanner.nextInt();
        if(answer == 2){
            System.out.println("Correct");
            score++;
        }
        else{
            System.out.println("Incorrect");
            System.out.println("The right answer is 2");           
        }
        System.out.println("What would a pirate mean if they called ye a “bilge rat”?");
        System.out.println("1) Ye be their trusted friend.\n2) Ye be as lowly as the rats in the ship’s bilge.\n3) Ye be a skilled sailor.\n4) Ye be their captain.");
        answer = 0;
        answer = scanner.nextInt();
        if (answer == 2){
        System.out.println("Correct");
        score++;
        }
        else{
            System.out.println("Incorrect");
            System.out.println("the right answer is 2");
        }
        answer = 0;
        System.out.println("What does a pirate mean when they say, “Get yer sea legs”?");
        System.out.println("1) Put on your boots.\n2) Learn to walk steadily on a ship.\n3) Prepare to climb the mast.\n4) Start rowing the ship.");               
        answer = scanner.nextInt();
        if(answer ==2){
            System.out.println("Correct");
            score++;
        }
        else{
            System.out.println("Incorrect");
            System.out.println("The right answer is 2");
        }
        answer = 0;
        System.out.println("What be “Davy Jones’ Locker”?");
        System.out.println("1) A treasure chest on a pirate ship\n2) The place where drowned sailors and ships rest at the bottom of the sea\n3) A secret compartment in the captain’s quarters\n4) A famous pirate’s hiding spot");
        answer = scanner.nextInt();
        if (answer == 2){
        System.out.println("Correct");
        score++;
        }
        else{System.out.println("Incorrect");
        System.out.println("The right answer is 2");
        }
        answer = 0;
        System.out.println("If a pirate says, “Hoist the Jolly Roger,” what are they tellin’ ye to do?");
        System.out.println("1) Raise the pirate flag.\n2) Lower the anchor.\n3) Prepare the cannons.\n4) Start rowing the ship.");
        answer = scanner.nextInt();
        if(answer == 1){
        System.out.println("Correct");
        score++;
        }
        else{System.out.println("Incorrect");
        System.out.println("The right answer is 1");
        }
        answer = 0 ;
        System.out.println("What does it mean when a pirate says, “Avast, ye scallywags!”?");
        System.out.println("1) Stop what you’re doing, you rascals!\n2) Get ready to fight, crew!\n3) Start cleaning the ship, mates!\n4) Hoist the treasure chest, sailors!");
        answer = scanner.nextInt();
        if(answer ==1){
            System.out.println("Correct");
            score++;
        }
        else{System.out.println("Incorrect");
        System.out.println("The right answer is 1");
        }
        answer = 0;
        System.out.println("What be the job o’ the sailor in the crow’s nest?");
        System.out.println("1) To steer the ship.\n2) To keep watch for land or enemy ships.\n3) To clean the deck.\n4) To prepare the cannons.");
        answer = scanner.nextInt();
        if (answer == 2){
            System.out.println("Correct");
            score++;
        }
        else{System.out.println("Incorrect");
        System.out.println("The right answer is 2");
        }
        answer = 0;
        System.out.println("What does it mean when a pirate says, “Batten down the hatches”?");
        System.out.println("1) Prepare for a storm.\n2) Lower the anchor.\n3) Hoist the sails.\n4) Clean the deck.");
        answer = scanner.nextInt();
        if (answer==1){
            System.out.println("Correct");
            score++;
        }
        else{
            System.out.println("Incorrect");
            System.out.println("The right answer is 1");
        }
        answer = 0;
        System.out.println("If a pirate offers ye “grog,” what are they givin’ ye?");
        System.out.println("1) Fresh water\n2) A type of stew\n3) A mixture of rum and water\n4) A treasure map");
        answer = scanner.nextInt();
        if (answer == 3){
            System.out.println("Correct");
            score++;
        }
        else{
            System.out.println("Incorrect");
            System.out.println("The right answer is 3");
        }
        System.out.println("You got " + score + " out of 10 questions right in the quiz ");
        System.out.println("Thank you for using Quizzer");    
    }  
}













