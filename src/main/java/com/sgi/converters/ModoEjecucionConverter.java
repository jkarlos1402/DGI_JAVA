package com.sgi.converters;

import com.sgi.pojos.Cmodeje;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("modoEjecucionConverter")
public class ModoEjecucionConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {        
        if (value != null && value.trim().length() > 0) {
            try {
                Cmodeje modoT = new Cmodeje();
                modoT.setIdModEje(new Integer(value));
                ServletContext sc = (ServletContext) context.getExternalContext().getContext();
                List<Cmodeje> modos = (List<Cmodeje>) sc.getAttribute("catalogo_modo_ejecucion");
                for (Cmodeje modo : modos) {
                    if (modo.equals(modoT)) {
                        return modo;
                    }
                }
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Modalidad de ejecuci\u00f3n", "Seleccione una opci\u00f3n"));
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            if (value instanceof Cmodeje) {
                Cmodeje modEje = (Cmodeje) value;
                return modEje.getIdModEje() + "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }

}
