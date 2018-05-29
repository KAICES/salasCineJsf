/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackingBean;

import ValueObjects.PersonaVo;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author TIC-SCI
 */
@ManagedBean
@RequestScoped
public class CineBb {

    private String nombre;
    
    private String silla;
    
    private List<PersonaVo>miLista;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSilla() {
        return silla;
    }

    public void setSilla(String silla) {
        this.silla = silla;
    }

    public List<PersonaVo> getMiLista() {
        return miLista;
    }

    public void setMiLista(List<PersonaVo> miLista) {
        this.miLista = miLista;
    }
    
    public CineBb() {
    }
    
    public void mostrarInfo (){
        
        PersonaVo miPersona;
        miLista = new ArrayList<PersonaVo>();
        
        
        miPersona= new PersonaVo(getNombre(),getSilla()); 
        miLista.add(miPersona);
        
    }
    
}
