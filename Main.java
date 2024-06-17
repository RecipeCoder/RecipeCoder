/**
 * Nussecken a la Guildo Horn
 * Heuchelheim, June 17th 2024
 * Java project to demonstrate the production process of nussecken.
 * Examine code to figure out ingredients and what to do.
 * CAUTION: Nussecken is high caloric nutrition. (Small children should be supervised...)
 * Provided by Almut and Armin.
 */


public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Today we will prepare Nussecken...");
        Cleaning cleaning=new Cleaning("Eric",10);
        // first, make dough for base layer
        BaseLayer baseLayer=new BaseLayer("Knethaken","Nudelholz");
        baseLayer.prepare();

        Oven oven=new Oven(175, false);
        // heat-up oven while preparing top layer
        oven.heatUp();

        // prepare topping for base layer
        TopLayer topLayer=new TopLayer("Topf");
        topLayer.applyJelly();
        topLayer.prepareNutMass();
        topLayer.applyNutMass();
        // make sure oven is hot enough
        System.out.println("checking oven...");
        while (!oven.hasDesiredTemperature()){
            // wait for oven to reach desired temperature
            Thread.sleep(3000);
        }
        System.out.println("Temperature OK. Loading oven.");

        oven.bake(30);
        oven.shutDown();

        cleaning.execute();

        System.out.println("Enjoy!");

    }
}