public class OSFactory {
    public OS getOS(String os) {
        if(os.equals("Open")) return new Android();
        else if (os.equals("Closed")) return new IOs();
        else return new Windows();
    }
}
