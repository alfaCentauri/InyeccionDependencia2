/*
 * Copyright (C) 2019 Ingeniero en Computación: Ricardo Presilla.
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
package Controladores;
import Modelos.Cliente;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
/**
 * Clase del controlador para el formulario con inyección de dependencia.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
@Named
@RequestScoped
public class Controller {
    @Inject
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**Acción del botón enviar del formulario.
     * @return Regresa el nombre de la página de destino
     */
    public String navegarAConfirmacion(){
        return "confirmacion";
    }
}
