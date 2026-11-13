public class PrincipalsDiferents {
    
    public static void main(String[] args) {
        
        Fil f1 = new Fil("Juan");
        Fil f2 = new Fil("Pepe");

        f1.setPriority(10);
        f2.setPriority(1);

        f1.start();
        f2.start();


    }

}
