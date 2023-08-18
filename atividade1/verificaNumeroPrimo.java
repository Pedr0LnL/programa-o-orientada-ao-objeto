package atividade1;

public class verificaNumeroPrimo {

    public static void main(String[] args) {
        int numero = 17; // Altere o número que deseja verificar aqui
        
        int resultado = verificaNumeroPrimo(numero);
        
        if (resultado == 1) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
    
    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        
        return 1;
    }
}
