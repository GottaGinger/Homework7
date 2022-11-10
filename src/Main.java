import java.util.Scanner;

public class Main { //input validation and error checking
    public static void main(String[] args) {
        // what is input validation :
        String lastQuestion = "yes";
        String[] names = {"tony","tamy","bill","craig","gary1","elsworth","clyde","bob","gary","george w bush"};
        String[] homeTowns = {"1twon1","2town2","3town3","4town4","5town5","cleveland","akron","cincinatti","town9","tentownten"};
        String[] favoriteFood = {"salad", "big salad","small salad", "wide salad","glide salad", "sly salad", "cry salad", "two cucumbers with sauce","nothing", "test"};

        Scanner scan = new Scanner(System.in);
        int chosenStudent = -1;
        int chosenStudentIndex = -1;
        String getStudentIndexMessage = "Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1-10):";


        do {
            if(chosenStudentIndex == -1 && chosenStudent == -1){
                System.out.println(getStudentIndexMessage);
                chosenStudent = scan.nextInt();
                if(chosenStudent >= 1 && chosenStudent <= 10){
                    chosenStudentIndex = chosenStudent - 1;
                } else {
                    scan.nextLine();
                    chosenStudent = -1;
                    getStudentIndexMessage = "That student does not exist.  Please try again. (enter a number 1-10):";
                }
            } else {
                scan.nextLine();
                System.out.println("Student " + chosenStudent + " is " + names[chosenStudentIndex] + ". What would you like to know about "+ names[chosenStudentIndex] +" (enter “" +
                        "hometown” or “favorite food”):");
                String chosenFoodOrHometown = scan.nextLine();
                if (chosenFoodOrHometown.equals("favorite food")) {
                    System.out.println(names[chosenStudentIndex] + "'s favorite food is " + favoriteFood[chosenStudentIndex] +
                            ". Would you like to know more? (enter “yes” or “no):");
                    lastQuestion = scan.next();
                } else if(chosenFoodOrHometown.equals("hometown")) {
                    System.out.println(names[chosenStudentIndex] + "'s hometown is " + homeTowns[chosenStudentIndex] +
                            ". Would you like to know more? (enter “yes” or “no):");
                    lastQuestion = scan.next();
                } else {
                    System.out.println("That data does not exist.  Please try again. (enter or “hometown” or “favorite food”):");
                }
            }
        } while(lastQuestion.equals("yes"));
    }
}



