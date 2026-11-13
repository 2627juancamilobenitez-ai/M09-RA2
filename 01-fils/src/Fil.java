public class Fil extends Thread{
    
    private String nombre;

    public Fil(String nombre){
        super(nombre);
        this.nombre = nombre;
    }

    @Override 
    public void run(){

        for(int i = 1; i <= 1000; i++){

            System.out.println(nombre + ": " + i );
            if(i == 1000){
                System.out.println("Acaba el Fil " + nombre);
            }
        }

    }

}