import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(cifradoCesar("hOLA"));

    }

    public static String cifradoCesar(String palabra){

        String palCifrar;
        String palCifrada = "";
        String aux;
        Integer posicionsLista = 26;
        Integer posicio, posicioCifrada;
        List<String> lista = new ArrayList<String>();
        lista.addAll(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N","O", "P", "Q", "R", "S","T","U","V","W","X","Y","Z"));

        //TODO: check palabra is a word
        try{

            //UpperCase
            palCifrar = palabra.toUpperCase();

            //Check word by word
            for(int i = 0; i < palCifrar.length(); i++){

                aux = String.valueOf(palCifrar.charAt(i));

                if(!lista.contains(aux)) {
                    throw new Exception ("Error: incorrect word");
                } else {
                    posicio = lista.indexOf(aux);

                    posicioCifrada = (posicio+13)%posicionsLista;
                    palCifrada = palCifrada + lista.get(posicioCifrada);
                }
            }
            return palCifrada;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return "";
        }
    }
}