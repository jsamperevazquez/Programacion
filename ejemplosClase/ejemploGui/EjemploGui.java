package ejemploGui;

import ejemploGui.Angel.Componentes.Componentes;
import ejemploGui.Angel.Layout.Layout;
import ejemploGui.Angel.eventos.Evento;
import ejemploGui.Angel.eventos.EventoClaseInterna;
import ejemploGui.Angel.ventana1.Ventana;
import ejemploGui.Angel.ventana1.VentanaCopia;

/**
 * Creado por @autor: angel
 * El  15 de abr. de 2021.
 * //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
public class EjemploGui {

    public static void main(String[] args) {
       /* Ventana objVentana=new Ventana();
        objVentana.iniciar();*/
        /* Componentes objComponentes = new Componentes();
        objComponentes.iniciar();*/
       /* VentanaCopia objVentanaCopia = new VentanaCopia();
        objVentanaCopia.iniciar(); */
        /*Layout layout = new Layout();
        layout.iniciar();
        //layout.ejemFlowLayout();
        //layout.ejemBoxLayout();
        //layout.borderLayout();
        // layout.gridLayout();
        // layout.cerrarVentana();*/
       // Evento evento=new Evento();
       // evento.iniciar();
        EventoClaseInterna eventoClaseInterna= new EventoClaseInterna();
        eventoClaseInterna.iniciar();
    }
}
