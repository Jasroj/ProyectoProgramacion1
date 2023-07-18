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
    private ArrayList<Selecion> tablaCaf = new ArrayList<>();

    public void jugarPartido() {
        Random random = new Random();
        int equipo1 = random.nextInt(this.gettablaCaf().size());
        int equipo2 = random.nextInt(this.gettablaCaf().size());
        while (equipo1 == equipo2) {
            equipo2 = random.nextInt(this.gettablaCaf().size());
        }
        this.resultadoPartido(this.gettablaCaf().get(equipo1), this.gettablaCaf().get(equipo2));
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
            for (Selecion equipo : this.gettablaCaf()) {
                jugarPartido();
            }
        }
    }

    public void ActualizarResultado(Selecion equipo, int golFavor, int golEncontra) {
        for (Selecion sele : this.gettablaCaf()) {
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
    
    public void simularYActualizarPartido(int team1, int team2) {
        // Simular el partido y obtener el resultado (puedes usar el código que tenías previamente aquí)
        
        // Actualizar las tablas de posiciones con los resultados del partido
        // (puedes usar el código que tenías previamente aquí para actualizar las tablas de posiciones)
    }
      
  public ArrayList<Resultados> getTablaPartido() {
      return tablaPartido;}

  
  public void setTablaPartido(ArrayList<Resultados> tablaPartido) {
      this.tablaPartido = tablaPartido;}

    /**
     * @return the tablaCaf
     */
    public ArrayList<Selecion> gettablaCaf() {
        return tablaCaf;
    }

    /**
     * @param tablaCaf the tablaCaf to set
     */
    public void settablaCaf(ArrayList<Selecion> tablaCaf) {
        this.tablaCaf = tablaCaf;
    }
}





