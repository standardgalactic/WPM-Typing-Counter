package com.javaProjects;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class typingProgram {

    //Random words for user to type
    static String[] words = {"monkey", "tonight", "unbreakable", "man", "ambulance", "eating", "beautiful", "sad", "apple",
            "pillow", "envelope", "temple", "of", "the", "king"};

    public static void main(String[] args) throws InterruptedException {
	    //Countdown Timer
        System.out.println("Ready!");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        //Random generator to get random words
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            System.out.print(words[rand.nextInt(10)] + " "); //This will print this 10 times. " " so words separate
        }
        System.out.println(); //So it starts on a new line

        //To count the moment user begins to type
        double start = LocalTime.now().toNanoOfDay();

        //User typing inputs
        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();

        //Timer to calculate after end user typing
        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;

        //WPM formula - (x characters / 5) / 1min = y WPM
        int numOfChars = typedWords.length();
        int wpm = (int) ((((double)numOfChars / 5) / seconds) * 60); //Type casting

        System.out.println("Your wpm is " + wpm + "!");
    }
}
