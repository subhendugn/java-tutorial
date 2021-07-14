public class App {
    public static void main(String[] args) throws Exception {
        // IClass class1 = new IClass();
        // class1.display("Hello");

        // I i = new I(){
        //     @Override
        //     public void display(String message) {
        //         System.out.println(message);
        //     }
        // };

        // i.display("Hello!!");

        I i = (message) -> {
            System.out.println(message);
        };
        i.display("Hello!!");
    }
}
