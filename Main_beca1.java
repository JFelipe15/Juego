package Reto1Emily;

public class Main_beca1 {
    public static void main(String[] args) {
        BecaUniversitaria1 becaUniversitaria = new BecaUniversitaria1(48, 10000, 2.0); 
        System.out.println(becaUniversitaria.calcularInteresSimple()); 
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion());
    }
}