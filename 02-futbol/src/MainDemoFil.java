public class MainDemoFil{

    public static void main(String[] args) {
        
        Thread actual = Thread.currentThread();

        System.out.println("Nom --> " + actual.getName());
        System.out.println("prioritat --> " + actual.getPriority());
        System.out.println(actual.toString());
    }

}