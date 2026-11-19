public class Principal {
    
    public static void main(String[] args) {
        
        Futbolista[] partidoFutbol = new Futbolista[11];

        String[] nombres = {
            "Piqué",
            "Vinicius",
            "Torres",
            "Ramos",
            "Ronaldo",
            "Lewan",
            "Belli",
            "Arnau",
            "Aspas",
            "Messi",
            "MBapé"
        };

        for(int i = 0; i < partidoFutbol.length; i++){
            partidoFutbol[i] = new Futbolista(nombres[i]);
        }


        for(int i = 0; i < partidoFutbol.length; i++){
            partidoFutbol[i].start();
        }

        for(int i = 0; i < partidoFutbol.length; i++){

            try{
                partidoFutbol[i].join();
            }catch(InterruptedException e){
                System.out.println("" + e.getMessage()) ;
            }
        }


    }

}
