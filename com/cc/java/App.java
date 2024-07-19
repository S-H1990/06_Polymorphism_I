package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();

        pollObj(queen);
        pollObj(worker);
        pollObj(drone);
        // output(queen.doYourJob());
        // output(queen.fly());
      
        // output(worker.doYourJob());
        // output(worker.fly());

        // output(drone.doYourJob());
        // output(drone.fly());

    }

   
 // Overloading
 private static void pollObj(Queen obj){
    output(obj.doYourJob());
    output(obj.fly());
    output("----------------");
}


// Overloading
private static void pollObj(Worker obj){
    output(obj.doYourJob());
    output(obj.fly());
    output("----------------");
}


// Overloading
private static void pollObj(Drone obj){
    output(obj.doYourJob());
    output(obj.fly());
    output("----------------");
}


   
   
    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}



