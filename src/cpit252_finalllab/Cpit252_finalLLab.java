
package cpit252_finalllab;


public class Cpit252_finalLLab {
//i use singleton and builder to make car 

    public static void main(String[] args) {
      Car c=new Car();
        CarBuilder carBuilder=new CarBuilder(c);
       CarMaker carMaker=new CarMaker(carBuilder);
       carMaker.makeCar();
        System.out.println( carBuilder.toString());
        Singleton s=Singleton.getInstance("d\\");
        
    }
    
}
