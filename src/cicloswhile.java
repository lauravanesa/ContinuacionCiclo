public class cicloswhile {
    public static void main (String[] arg){
        // ciclo while
        // pintar los numeros del 1 al 10
        boolean noHaTerminado = true;
        int numero = 1;
        while (noHaTerminado){
            System.out.println("numero:" + numero);
            numero = numero + 1;
            if (numero > 10){
                noHaTerminado = false;

            }
        }






    }
}
