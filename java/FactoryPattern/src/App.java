public class App {
    public static void main(String[] args) throws Exception {
        // we can do this 
        Android android = new Android();
        //android.specs();

        // but if we need to chnage later
        // or based on some condition
        // user input you need to load the os
        // then we will create a factory


        // think this file will go to
        // client 
        // and you dont want to modify this
        // because you have to release again

        OSFactory osFactory = new OSFactory();
        OS os = osFactory.getOS("Open");
        os.specs();
        // this can a user input
    }
}
