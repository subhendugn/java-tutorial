public class App {
    public static void main(String[] args) throws Exception {
        // Logging logging = new Logging("App1");

        // System.out.println(logging.getWriter());


        // Logging logging2 = new Logging("App2");

        // System.out.println(logging2.getWriter());

        // Logging logging3 = new Logging("App2");

        // System.out.println(logging3.getWriter());

        // we dont want this

        Logging l1 = Logging.getInstance("App 1");
        Logging l2 = Logging.getInstance("App 2");

        System.out.println(l1.writer);
        System.out.println(l2.writer);
    }
}
