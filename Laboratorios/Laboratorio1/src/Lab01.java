public class Lab01{
    public static String[] Ordenar_arreglo(String[] palabras) {
        for(int i = 0; i < palabras.length - 1; i++) {
            for(int j = i+1; j < palabras.length; j++) {
                if(palabras[i].compareTo(palabras[j]) > 0){
                    String temp = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = temp;}
            }
        }
        return palabras;
    }
    public static void main(String[] args) {
        String[] Lista = {"Cuyate", "Torres", "Salazar", "Matos"};
        String[] Lista1 = Ordenar_arreglo(Lista);
        for(int i = 0; i < Lista1.length; i++)
            System.out.print(Lista1[i] + " ");
    }
}