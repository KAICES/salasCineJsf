/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ValueObjects;

public class PersonaVo {
    
    private String nombreVo;
    
    private String sillaVo;

    public PersonaVo(String nombreVo, String sillaVo) {
        this.nombreVo = nombreVo;
        this.sillaVo = sillaVo;
    }

    public String getNombreVo() {
        return nombreVo;
    }

    public void setNombreVo(String nombreVo) {
        this.nombreVo = nombreVo;
    }

    public String getSillaVo() {
        return sillaVo;
    }

    public void setSillaVo(String sillaVo) {
        this.sillaVo = sillaVo;
    }
    
    
    
}
