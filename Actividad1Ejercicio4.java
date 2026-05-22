/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.pkg1.ejercicio.pkg4;

/**
 *
 * @author valle
 */
public class Actividad1Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double edalberto, edana, edmama;
        double edjuan = 9;
        edalberto = Edades.calcular_edalberto(edjuan);
        edana = Edades.calcular_edana(edjuan);
        edmama = Edades.calcular_edmama(edjuan, edalberto, edana);
        System.out.println("Las edades son: Alberto= " + edalberto + " Juan= " + edjuan + " Ana=" + edana + " Mama= " + edmama);
    }
    
}
