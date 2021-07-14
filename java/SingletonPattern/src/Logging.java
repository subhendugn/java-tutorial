public class Logging {
    public String writer;

    private static Logging counter = null;

    // public String getWriter() {
    //     return writer;
    // }

    // public void setWriter(String writer) {
    //     this.writer = writer;
    // }

    // public Logging(String writer) {
    //     this.writer = writer;
    // }

    // make constructor private 
    // create static method that will return the object of the singleton class
    
    //1
    private Logging(String writer) {
        this.writer = writer;
    }

    //2
    public static Logging getInstance(String writer) {
        // object already already created or not
        // if not create one 
        // if yes use the same one

        if(counter == null) counter = new Logging(writer);
        
        return counter;
    }
}
