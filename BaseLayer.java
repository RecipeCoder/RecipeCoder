/**
 * Base layer, must be rolled out evenly on baking plate.
 */
public class BaseLayer {
    // ingredients
    private int wheatFlour=300; // g
    private int bakingPowder=1; // tea spoon
    private int sugar=130; // g
    private int vanillaSugar=1; // package
    private int eggs=2; // pcs

    private String tool1;
    private String tool2;
    public BaseLayer(String tool1, String tool2){
        this.tool1=tool1;
        this.tool2=tool2;
    }

    public void prepare() throws InterruptedException {
        mixStuff();
        rollOutDough();

    }

    private void mixStuff() throws InterruptedException {
        System.out.println("Preparing base dough....");
        System.out.println("Put all ingredients in a bin.");
        System.out.println("Use tool: "+tool1);
        System.out.println("mixing....");
        Thread.sleep(10000);
        System.out.println("... finished.");
    }

    private void rollOutDough() throws InterruptedException {
        System.out.println("Rolling out...");
        System.out.println("Use tool: "+tool2);
        System.out.println("Roll out evenly on baking paper.");
        System.out.println("Put onto baking plate afterwards.");
        Thread.sleep(10000);
        System.out.println("Rolling out finished.");
    }
}
