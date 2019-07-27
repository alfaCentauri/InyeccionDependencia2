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
package Interceptor;

import InterceptorBinding.LogginInterceptorBinding;
import java.util.logging.Level; 
import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
/**
 * Clase para procesar la información del log.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
@LogginInterceptorBinding
@Interceptor
public class LoggingInterceptor {
    private static final Logger logger = Logger.getLogger(
            LoggingInterceptor.class.getName());
    @AroundInvoke
    public Object LogMethodCall(InvocationContext invocationContext) throws Exception{
        logger.log(Level.INFO, new StringBuilder("Entrando ").append(
                invocationContext.getMethod().getName()).append("method").toString());
        Object retVal = invocationContext.proceed();
        logger.log(Level.INFO, new StringBuilder("Saliendo ").append(
                invocationContext.getMethod().getName()).append("method").toString());
        return retVal;
    }
}
