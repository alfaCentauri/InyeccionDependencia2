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
import Modelos.ClientePremium;
import Qualifiers.Premium;
import javax.inject.Named;
import javax.inject.Inject;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import InterceptorBinding.LogginInterceptorBinding;
/**
 * Clase para eñ controlador del cliente premium.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
@LogginInterceptorBinding
@Named
@RequestScoped
public class ClientePremiumController {
    /***/
    private static final Logger logger = Logger.getLogger(
            ClientePremiumController.class.getName());
    @Inject
    @Premium
    private Cliente cliente;
    /**
     * Acción del botón enviar del formulario.
     * @return Regresa el nombre de la página de destino.
     */
    public String salvarCliente(){
        ClientePremium clientePremium = (ClientePremium)cliente;
        logger.log(Level.INFO,"Salvando la siguiente información:\n"
        +"{0} {1}, código de descuento = {2}", new Object[]{
        clientePremium.getNombre(),
        clientePremium.getPrimerApellido(),
        clientePremium.getCodigoDescuento()});
        return "cliente_premium_confirmacion";
    }
}
