
package cpit252_finalllab;


public class CarBuilder {
    


    private Car car;

    public CarBuilder(Car car) {
        this.car = new Car();
    }

  

//   engine, body, tires, and a battery

    public void buildCarEngine() {
car.setCarEngine("engine is ready");
     

    }

    public void buildCarBody() {

      car.setBody("body set");

    }

    public void buildCartires() {

      car.setCartires("Cartires has set");

    }

    public void buildCarbattery() {

     car.setBattery("battry is ready");

    }



    @Override
    public String toString() {
        return  car.getBattery() +"\n"+
                car.getBody();
    }

}



