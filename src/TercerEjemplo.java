public class TercerEjemplo {
    public static void main(String[] args) {
        //imprimir los numeros del 1-D al 100-L
        int numero = 1;
        String letra;
        while (numero <= 100){
            if (numero % 2 == 0){
                letra = "L";

            }else {
                letra ="D";

            }
            System.out.println(numero + "-" +letra);
            numero = numero +1;
        }



    }
}
