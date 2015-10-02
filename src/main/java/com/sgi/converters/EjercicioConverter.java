package com.sgi.converters;

import com.sgi.pojos.Catejercicio;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("ejercicioConverter")
public class EjercicioConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                Catejercicio ejercicio = new Catejercicio();                
                ejercicio.setEjercicio(new Integer(value));
                ServletContext sc = (ServletContext)context.getExternalContext().getContext();
                List<Catejercicio> ejercicios = (List<Catejercicio>)sc.getAttribute("catalogo_ejercicio");
                for (Catejercicio ejer : ejercicios) {
                    if(ejer.equals(ejercicio)){
                        return ejer;
                    }
                }
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
            }
            return null;
        }
        else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if(value != null) {
            return value.toString();
        }
        else {
            return null;
        }
    }
    
}
