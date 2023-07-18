/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author JRS
 * 
 **/
public class CAF {
    private ArrayList<Resultados> tablaPartido = new ArrayList<>();
    private ArrayList<Selecion> tablaCAF = new ArrayList<>();

    public void jugarPartido() {
        Random random = new Random();
        int equipo1 = random.nextInt(this.gettablaCAF().size());
        int equipo2 = random.nextInt(this.gettablaCAF().size());
        while (equipo1 == equipo2) {
            equipo2 = random.nextInt(this.gettablaCAF().size());
        }
        this.resultadoPartido(this.gettablaCAF().get(equipo1), this.gettablaCAF().get(equipo2));
    }

    public void resultadoPartido(Selecion equipo1, Selecion equipo2) {
        Random random = new Random();

        int golE1 = random.nextInt(10);
        int golE2 = random.nextInt(10);

        Resultados p = new Resultados(golE1, equipo1.getSelecion(), equipo2.getSelecion(), golE2);
        this.tablaPartido.add(p);

        this.ActualizarResultado(equipo1, golE1, golE2);
        this.ActualizarResultado(equipo2, golE2, golE1);
    }

    public void simularTodo() {
        for (int i = 0; i < 10; i++) { // Simular 10 partidos para cada equipo
            for (Selecion equipo : this.gettablaCAF()) {
                jugarPartido();
            }
        }
    }

    public void ActualizarResultado(Selecion equipo, int golFavor, int golEncontra) {
        for (Selecion sele : this.gettablaCAF()) {
            if (sele.getSelecion().equals(equipo.getSelecion())) {
                sele.setPartidosJugados(sele.getPartidosJugados() + 1);
                sele.setGolesFavor(sele.getGolesFavor() + golFavor);
                sele.setGolesContra(sele.getGolesContra() + golEncontra);
                if (golFavor > golEncontra) {
                    sele.setPartidosGanados(sele.getPartidosGanados() + 1);
                } else if (golFavor < golEncontra) {
                    sele.setPartidosPerdidos(sele.getPartidosPerdidos() + 1);
                } else {
                    sele.setPartidosEmpatados(sele.getPartidosEmpatados() + 1);
                }
                sele.setDiferenciaGoles(sele.getGolesFavor() - sele.getGolesContra());
                sele.setPuntos(sele.getPartidosGanados() * 3 + sele.getPartidosEmpatados() * 1);
                break; // Detener el bucle después de modificar el objeto
            }
        }
    }

  public ArrayList<Resultados> getTablaPartido() {
      return tablaPartido;}

  
  public void setTablaPartido(ArrayList<Resultados> tablaPartido) {
      this.tablaPartido = tablaPartido;}

    /**
     * @return the tablaCAF
     */
    public ArrayList<Selecion> gettablaCAF() {
        return tablaCAF;
    }

    /**
     * @param tablaCAF the tablaCAF to set
     */
    public void settablaCAF(ArrayList<Selecion> tablaCAF) {
        this.tablaCAF = tablaCAF;
    }
}





