package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
    System.out.println("type in a number");
    double pay = input.nextDouble();
    if (pay<1000){
        System.out.println("tax is 0%");
    }
    else  if (pay>1000&& pay <1200){
        System.out.println("tax is 10%");
    }
    else  if (pay > 1200 && pay <1500){
        System.out.println("tax is 10%");
    }
    else  if (pay<=1500){
        System.out.println("tax is 15%");
    }
    }
}
