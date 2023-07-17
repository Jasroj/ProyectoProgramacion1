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
public class CONMEBOL {
    private ArrayList<Resultados> tablaPartido = new ArrayList<>();
    private ArrayList<Selecion> tablaCONMEBOL = new ArrayList<>();

    public void jugarPartido() {
        Random random = new Random();
        int equipo1 = random.nextInt(this.getTablaCONMEBOL().size());
        int equipo2 = random.nextInt(this.getTablaCONMEBOL().size());
        while (equipo1 == equipo2) {
            equipo2 = random.nextInt(this.getTablaCONMEBOL().size());
        }
        this.resultadoPartido(this.getTablaCONMEBOL().get(equipo1), this.getTablaCONMEBOL().get(equipo2));

    }

    public void resultadoPartido(Selecion equipo1, Selecion equipo2) {
        Random random = new Random();

        int golE1 = random.nextInt(10);
        int golE2 = random.nextInt(10);

        Resultados p = new Resultados(golE1, equipo1.getSelecion(), equipo2.getSelecion(), golE2);
        this.tablaPartido.add(p);
        
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
    
    public void ActualizarResultado(Selecion equipo, int golFavor, int golEncontra)
    {
         for (Selecion sele : this.getTablaCONMEBOL()) {
            if (sele.getSelecion().equals(equipo.getSelecion())) {
                sele.setPartidosJugados(sele.getPartidosJugados() + 1);
                sele.setGolesFavor(sele.getGolesFavor() + golFavor);
                sele.setGolesContra(sele.getGolesContra() + golEncontra);
                if (golFavor > golEncontra) {
                    sele.setPartidosGanados(sele.getPartidosGanados() + 1);
                } else if (golFavor < golEncontra) {
                    sele.setPartidosPerdidos(sele.getPartidosPerdidos() + 1);
                }
                else {
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
     * @return the tablaCONMEBOL
     */
    public ArrayList<Selecion> getTablaCONMEBOL() {
        return tablaCONMEBOL;
    }

    /**
     * @param tablaCONMEBOL the tablaCONMEBOL to set
     */
    public void setTablaCONMEBOL(ArrayList<Selecion> tablaCONMEBOL) {
        this.tablaCONMEBOL = tablaCONMEBOL;
    }
    
}
