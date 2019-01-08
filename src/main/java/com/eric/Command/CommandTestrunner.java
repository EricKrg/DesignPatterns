package com.eric.Command;

public class CommandTestrunner {
    public static void main(String args[]){

        Home mySmartHome = new Home();
        QuickNav homeController = new QuickNav(mySmartHome);

        System.out.println(homeController.smartHome);
        homeController.select(1);

        System.out.println(homeController.smartHome);

        homeController.select(3);
        System.out.println(homeController.smartHome);

        //kombo
        int[] kombo = new int[]{2,2,1};
        homeController.select(kombo);
        System.out.println(homeController.smartHome);


    }
}
