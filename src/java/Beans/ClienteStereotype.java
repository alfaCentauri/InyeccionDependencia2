/*
 * Copyright (C) 2019 ricardo
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Beans;
import Stereotype.NamedSessionScoped;
import java.io.Serializable;
/**
 *
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
@NamedSessionScoped
public class ClienteStereotype implements Serializable{
    /**Atributos*/
    private String propiedad1;
    private String propiedad2;
    /**Gettes y Setters*/
    /**
     * @return Regresa una cadena con la propiedad 1.
     */
    public String getPropiedad1() {
        return propiedad1;
    }

    public void setPropiedad1(String propiedad1) {
        this.propiedad1 = propiedad1;
    }
    /**
     * @return Regresa una cadena con la propiedad 2.
     */
    public String getPropiedad2() {
        return propiedad2;
    }

    public void setPropiedad2(String propiedad2) {
        this.propiedad2 = propiedad2;
    }
        
}
