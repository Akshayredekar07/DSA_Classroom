package First;

import java.util.Scanner;

class Game{
    private int counter = 0;
    private int myNumber;
    private int compNumber;

    public Game(){
        compNumber = (int) (Math.random()*100);
    }
    public void setNumber(int n){
        myNumber = n;
    }
    public int isCorrect(){
        if(myNumber == compNumber){
            return 0;
        }
        else if(myNumber > compNumber){
            return -1;
        }
        else{
            return 1;
        }
    }
    public void setCounter(){
        counter++;
    }
    public void getCounter(){
        System.out.println("The number of guesses were "+ counter);
    }
}

public class T43__GuessNumber{
    public static void main(String[] args) {
        Game obj = new Game();
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("Enter a number between 1 to 100 (1-100): ");
            int n = sc.nextInt();
            obj.setNumber(n);

            if(obj.isCorrect() == 0){
                obj.setCounter();
                System.out.println("Congratulations!! You have guessed the correct number");
                obj.getCounter();
                break;
            }
            else if(obj.isCorrect() == -1){
                obj.setCounter();
                System.out.println("Enter smaller number!!");
            }
            else if(obj.isCorrect() == 1){
                obj.setCounter();
                System.out.println("Enter larger number!!");
            }
        }
    }
}

/*
        create a class Game, which allows user to play "Guess tne Number"
        game once's Game should have the following methods:
        1. Constructor to generate the random number
        2. takeUserInput() of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
           use properties such as noOfGuesses(int), etc. to get this task done

*/
