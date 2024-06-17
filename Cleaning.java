public class Cleaning {
    private String responsiblePerson;
    private int tidynessLevel;

    public Cleaning(String responsiblePerson, int level){
        this.responsiblePerson=responsiblePerson;
        tidynessLevel=level;
    }

    public void execute() throws InterruptedException {
        System.out.println("Hey, "+responsiblePerson+"!");
        System.out.println("Please clean up...");
        Thread.sleep(10000);
        System.out.println("Thank you!!");
    }

}
