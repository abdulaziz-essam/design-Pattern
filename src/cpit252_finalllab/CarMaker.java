/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit252_finalllab;

/**
 *
 * @author aek
 */
public class CarMaker {
    

private CarBuilder carBuilder;

    // OldRobotBuilder specification is sent to the engineer

    public CarMaker(CarBuilder carBuilder){

        this.carBuilder = carBuilder;

    }

    // Return the Robot made from the OldRobotBuilder spec

  
  

    public void makeCar() {

         
        this.carBuilder.buildCarBody();

        this.carBuilder.buildCarEngine();

        this.carBuilder.buildCarbattery();

        this.carBuilder.buildCartires();

    }

     

    
}
