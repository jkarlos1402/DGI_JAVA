package com.sgi.converters;

import com.sgi.pojos.Catfte2015;
import com.sgi.pojos.Cmodeje;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("ftesFederalesConverter")
public class FtesFederalesConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {        
        if (value != null && value.trim().length() > 0) {
            try {
                Catfte2015 fuenteT = new Catfte2015();
                fuenteT.setIdFte(new Integer(value));
                ServletContext sc = (ServletContext) context.getExternalContext().getContext();
                List<Catfte2015> fuentes = (List<Catfte2015>) sc.getAttribute("catalogo_fuentes_federales");
                for (Catfte2015 fuente : fuentes) {
                    if (fuente.equals(fuenteT)) {
                        return fuente;
                    }
                }
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Fuentes federales", "Seleccione una opci\u00f3n"));
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            if (value instanceof Catfte2015) {
                Catfte2015 fuente = (Catfte2015) value;
                return fuente.getIdFte()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
}
