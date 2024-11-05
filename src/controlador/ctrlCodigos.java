package controlador;

import java.awt.event.MouseListener;
import modelo.Codigos;
import vista.crud;


public class ctrlCodigos implements  MouseListener{
    
     private Codigos modelo;
     private crud vista;
     
     public ctrlCodigos(Codigos modelo, crud vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnAgregar.addMouseListener(this);
        modelo.Mostrar(vista.Vehiculos);
        vista.btnElimnar.addMouseListener(this);
        vista.jtbCodigos.addMouseListener(this);
        vista.btnActualizar.addMouseListener(this);
    
    }
}
    

