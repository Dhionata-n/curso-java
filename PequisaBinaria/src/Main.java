public class Main {
    public static void main(String[] args) {

        int [] minhaLista;
        minhaLista = new int[5];
        minhaLista[0]= 1;
        minhaLista[1]= 3;
        minhaLista[2]= 5;
        minhaLista[3]= 7;
        minhaLista[4]= 9;

        int baixo = 0;
        int alto = minhaLista.length-1;
        int item =9;
        boolean none = true;

        while (baixo<=alto) {
            int meio = (baixo + alto) / 2;
            int chute = minhaLista[meio];


            if (chute == item) {
                System.out.println(meio);
                none = false;
            }
            if (chute < item) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }
        if(none){
            System.out.println("None");
        }

    }
}