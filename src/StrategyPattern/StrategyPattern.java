package StrategyPattern;

import java.io.IOException;
import java.util.Scanner;

public class StrategyPattern {
    public static void main(String[] args)  throws IOException {
        Dog dog;

        System.out.println("1 for small dog, 2 for big dog, anything for dumb dog");
        Scanner myInput = new Scanner( System.in );
        int n = myInput.nextInt();
        System.out.println(n);
        if (n == 1){
             dog = new SmallDog();
        }
        else{if (n == 2 ){
            dog = new BigDog();
        }
        else{

            dog = new DumbSmolDog();
        }
        }

            dog.display();
            dog.bark();
            dog.performChase();
            dog.performBite();
    }
}
