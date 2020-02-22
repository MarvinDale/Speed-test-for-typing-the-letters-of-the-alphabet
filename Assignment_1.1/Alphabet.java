import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Alphabet
{
    public static void main(String args[])
    {
        System.out.println("Type the alphabet in order (hit enter between letters)");
        System.out.println("Forwards or Backwards (f/b)?:");
        
        Scanner input = new Scanner(System.in); //Creating a new scanner object
        
        int j = 0; //while j equals 0 the program is looking for f or b as an input
        while(j == 0)
        {
            //the variable direction holds the user input
            String direction = input.nextLine();
            //changing the string into a character so the ascii code for the character can be used later on
            char fOrB = direction.charAt(0);
            if((direction.equals("f"))) //if forward is selected the loop is broken
            {
                j = fOrB;
            }
            else if(direction.equals("b")) //if backward is selected the loop is broken
            {
                j = fOrB;
            }
            else //if an invalid input is entered the user is instructed to enter a valid input
            {
                System.out.println("Invalid. You must enter either 'f' or 'b' to start");
            }
        }
        
        //ascii code is how charaters are represented as numbers, using this I compared the inputted character
        //to the expected character using their ascii codes, this made it easy to run through the alphabet
        //by either incrementing or decrementing a counter
        
        if(j == 102) //102 is the ascii code for 'f' so this section will run if forward is selected
        {
            int i = 97; //the ascii code for 'a' is 97 so thats where the counter starts
            long startTime = System.nanoTime(); //the start of a timer
            while (i < 123) //122 is the value of z in the ascii code so the loop runs while i is less than 123
            {
                String line = input.nextLine();
                char letter = line.charAt(0);
                
                //if the ascii code of the letter inputted is equal to the number of the counter and the string
                //is of lenght 1 and it isn't the last letter a success message is printed and the user is 
                //instructed to enter the next letter
                if ((int)letter == i && (line.length() == 1) && i < 122)
                {
                    i++; //i is incremented
                    System.out.println("[" + letter + ": Correct! Now type " + (char)i + "]");
                }
                //when the last letter is typed in the user is told well done instead of being told to 
                //enter the next letter
                else if ((int)letter == i && (line.length() == 1))
                {
                    i++; //i is incremented
                    System.out.println("[" + letter + ": Correct! Well done!]\n");
                }
            }
            long endTime = System.nanoTime(); //the end of the timer
            float timeElapsed = (endTime - startTime)/1000000000;//calculating the time taken to enter all the letters
            System.out.println("Time taken : " + timeElapsed + " seconds");//printing out the time taken
        }
        else //since there are only two valid ways to run through the alphabet if forward wasn't selected and the selection is valid
             //it's assumed backwards was selected
        {
            int i = 122; //122 is the ascii code for 'z' so that's where the counter starts
            long startTime = System.nanoTime();//start of a timer
            while (i > 96)
            {
                String line = input.nextLine();
                char letter = line.charAt(0);
            
                //if the ascii code of the letter inputted is equal to the number of the counter and the string
                //is of lenght 1 and it isn't the last letter a success message is printed and the user is 
                //instructed to enter the next letter
                if ((int)letter == i && line.length() == 1 && i > 97)
                {
                    i--; //i is decremented
                    System.out.println("[" + letter + ": Correct! Now type " + (char)i + "]");
                }
                //when the last letter is typed in the user is told well done instead of being told to 
                //enter the next letter
                else if ((int)letter == i && (line.length() == 1))
                {
                    i--; //i is decremented
                    System.out.println("[" + letter + ": Correct! Well done!]\n");
                }
            }
            long endTime = System.nanoTime();//the end of the timer
            float timeElapsed = (endTime - startTime)/1000000000; //calculating the time taken to enter all the letters
            System.out.println("Time taken : " + timeElapsed + " seconds");//printing out the time taken
        }
    }
}
