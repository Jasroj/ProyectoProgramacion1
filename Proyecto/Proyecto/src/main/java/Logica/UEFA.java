/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author JRS
 */
public class UEFA {
    private ArrayList<Resultados> tablaPartidoUEFA = new ArrayList<>();
private ArrayList<Selecion> tablaUEFA = new ArrayList<>();

    public void jugarPartido() {
        Random random = new Random();
        boolean partidoNoValido = false;
        int equipo1 = 0;
        int equipo2 = 0;
        do {
            equipo1 = random.nextInt(this.getTablaUEFA().size());
            equipo2 = random.nextInt(this.getTablaUEFA().size());
            while (equipo1 == equipo2) {
                equipo2 = random.nextInt(this.getTablaUEFA().size());
            }
            for (Resultados result : this.getTablaPartidoUEFA()) {
                if (result.getSelecion1().equals(this.getTablaUEFA().get(equipo1).getSelecion())
                        && result.getSelecion2().equals(this.getTablaUEFA().get(equipo2).getSelecion())) {
                    partidoNoValido = true;
                    break;
                } else {
                    partidoNoValido = false;
                }
            }
        } while (partidoNoValido);
        if (!partidoNoValido) {
            this.resultadoPartido(this.getTablaUEFA().get(equipo1), this.getTablaUEFA().get(equipo2));
        }

    }

   public void resultadoPartido(Selecion equipo1, Selecion equipo2) {
        Random random = new Random();

        int golE1 = random.nextInt(10);
        int golE2 = random.nextInt(10);

        Resultados p = new Resultados(golE1, equipo1.getSelecion(), equipo2.getSelecion(), golE2);
        this.tablaPartidoUEFA.add(p);

        this.ActualizarResultado(equipo1, golE1, golE2);
        this.ActualizarResultado(equipo2, golE2, golE1);

//te parece si comentas lo que intentaste para ver intentar la idea que llevaba ayer? es que ya se me hizo enredo :D jjjj si si sorry jejejeje
       /* for (int i = 0; i > seleciones.size(); i++) {
            if (equipo1.equals(seleciones.get(i).getSelecion())) {
                seleciones.get(i).setGolesFavor(p.getPos());//pos son goles del equipo 1
                seleciones.get(i).setGolesContra(p.getPuntos());//puntos son goles del equipo 2
                if (p.getPos() == p.getPuntos()) {
                    seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 1);
                    seleciones.get(i).setPartidosJugados(seleciones.get(i).getPartidosJugados() + 1);
                    seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 1);
                }
            } else if (p.getPos() > p.getPuntos()) {
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);

            } else if (p.getPos() < p.getPuntos()) {
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);

            } else if (equipo2.equals(seleciones.get(i).getSelecion())) {
                //seleciones.get(i).setGolesFavor(p.golE1);
                //seleciones.get(i).setGolesContra(p.golE2);
                if (p.getPos() == p.getPuntos()) {
                    seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 1);
                    seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 1);
                    seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 1);
                    seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 1);
                }
            } else if (p.getPos() > p.getPuntos()) {
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);

            } else if (p.getPos() < p.getPuntos()) {
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);
                seleciones.get(i).setPuntos(seleciones.get(i).getPuntos() + 3);

            }
        }*/
    }
    
     public void ActualizarResultado(Selecion equipo, int golFavor, int golEncontra) {
        for (Selecion sele : this.getTablaUEFA()) {
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
  public ArrayList<Resultados> getTablaPartidoUEFA() {
      return tablaPartidoUEFA;}

  
  public void setTablaPartidoUEFA(ArrayList<Resultados> tablaPartidoUEFA) {
      this.tablaPartidoUEFA = tablaPartidoUEFA;}

    /**
     * @return the tablaUEFA
     */
    public ArrayList<Selecion> getTablaUEFA() {
        return tablaUEFA;
    }

    /**
     * @param tablaUEFA the tablaUEFA to set
     */
    public void setTablaUEFA(ArrayList<Selecion> tablaUEFA) {
        this.tablaUEFA = tablaUEFA;
    }
    
}
