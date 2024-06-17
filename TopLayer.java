public class TopLayer {
    // ingredients
    // use cheap brand that contains no fruit pieces,
    // otherwise smearing on top of base layer is more difficult
    private int apricotMarmelade=7; // spoons
    private int butter  = 250; // g
    private int vanillaSugar=2; // packages
    private int water=4; // spoons
    // chopped / ground  => 50% / 50%
    private int almonds=200; // g
    private int hazelnuts=200;// g
    private String tool;
    public TopLayer(String tool){
        this.tool=tool;
    }

    public void applyJelly() throws InterruptedException {
        System.out.println("Apply jelly on base layer.");
        Thread.sleep(10000);
    }

    public void prepareNutMass() throws InterruptedException {
        System.out.println("Use tool: >"+tool+ "< to melt butter.");
        System.out.println("Add sugar and vanilla sugar.");
        System.out.println("Cook shortly.");
        System.out.println("Add almonds and hazelnuts. Mix quickly.");
        Thread.sleep(10000);

    }

    public void applyNutMass(){
        System.out.println("Apply nut mass on top of marmelade layer.");
    }


}
