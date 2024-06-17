public class Oven extends Thread {

    private int desiredTemperature;
    private boolean wasShutDown=false;
    private int currentTemperature=20;

    public Oven(int desiredTemperature, boolean useFan)
    {
        this.desiredTemperature=desiredTemperature;
        if (useFan==false){
            System.out.println("Do not use fan.");
        }
    }

    public void heatUp(){
        start();
    }

    public void run(){

        while (currentTemperature < desiredTemperature
                && !wasShutDown) {
            // increase temperature until desired temperature is reached
            currentTemperature=currentTemperature+5;

            try {
                System.out.println("Heating up. Current temperature: "+currentTemperature);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void shutDown(){
        wasShutDown=true;
        System.out.println("Oven has been shut down.");
    }

      public boolean hasDesiredTemperature(){
        return currentTemperature >=desiredTemperature;
    }

    public void bake(int minutes) throws InterruptedException {
        System.out.println("Baking for "+minutes +" minutes.");

        Thread.sleep(10000);
        System.out.println("Baking finished. Remove stuff and shut down.");
    }
}
