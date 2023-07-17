
package Logica;

/**
 *
 * @author JRS
 */
public class Pais {

    public Object[] cargarPais(String Seleccion, int Pos,  int Pts, int PJ, int PG, int PE, int PP, int GF, int GC, int Dif) {
        Object[] Pais = {Seleccion, Pos, Pts, PJ, PG, PE, PP, GF, GC, Dif};
        return Pais;
    }
    

    public Object[][] cargarPaisConcacaf() {
        Object[][] concacaf = {
            this.cargarPais("Estados Unidos",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Canada",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Mexico",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Costa Rica",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("El Salvador",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Honduras",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Republica Dominicana",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Haiti",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Republica Dominicana", 0, 0, 0, 0, 0, 0, 0, 0, 0),};
        return concacaf;
    }

    public Object[][] cargarPaisCAF() {
        Selecion sele = new Selecion("Camerun",0,0, 0, 0, 0, 0, 0, 0, 0);

        Object[][] caf = {
            this.cargarPais("Camerun",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Nigeria", 0, 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Maruecos", 0, 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Tunez",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Argelia",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Ghana",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Sudafrica",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Costa de Marfil",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Egipto",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Senegal", 0, 0, 0, 0, 0, 0, 0, 0, 0),};
        return caf;
    }

    public Object[][] cargarPaisCONMEBOL() {
        Object[][] conmebol = {
            this.cargarPais("Argentina",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Brasil",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Colombia",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Chile",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Paraguay",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Bolivia",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Peru",0,  0, 0, 0, 0, 0, 0, 0, 0),};
        return conmebol;
    }

    public Object[][] cargarPaisOFC() {
        Object[][] ofc = {
            this.cargarPais("Nueva Zelanda",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Papua Nueva Guinea",0,  0, 0, 0, 0, 0, 0, 0, 0),};
        return ofc;
    }

    public Object[][] cargarPaisUEFA() {
        Object[][] uefa = {
            this.cargarPais("España",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Alemania",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Italia",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Francia",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Belgica",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Suiza",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Croacia",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Dinamarca",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Reino Unido",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Grecia",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Paises Bajos",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Ucrania",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Polonia",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Austria", 0, 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Suecia",0,  0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais("Inglaterra",0,  0, 0, 0, 0, 0, 0, 0, 0),};
        return uefa;
    }

}
