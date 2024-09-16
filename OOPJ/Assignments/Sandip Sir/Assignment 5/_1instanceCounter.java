public class _1instanceCounter {
    
    private static int instancecount = 0;// field of class
    
    
    public _1instanceCounter() {
        instancecount++;// Constructor to increment instance count each time a new object is created
    }

    
    public static int getInstancecount() {
        return instancecount;
    }

    public static void main(String[] args) {
        // Creating instances of _1instanceCounter
        _1instanceCounter i = new _1instanceCounter();
        _1instanceCounter j = new _1instanceCounter();
        
        
        System.out.println("Number of instances created: " + _1instanceCounter.getInstancecount());
    }
}