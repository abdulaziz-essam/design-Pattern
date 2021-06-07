
package cpit252_finalllab;



    public class Car implements carPlan{
 
    private String engine;

    private String body;

    private String tires;

    private String battery;

  

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

  

    @Override
    public void setCarEngine(String en) {
        System.out.println(en);
    }

    @Override
    public void setCarBody(String b) {
        System.out.println(b);
    }

    @Override
    public void setCartires(String c) {
        System.out.println(c);
    }

    @Override
    public void setCarbattery(String b) {
        System.out.println(b);
    }

}


