package com.sgi.converters;

import com.sgi.pojos.Ctiploc;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("tipoLocConverter")
public class TipoLocalidadConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {                  
        if (value != null && value.trim().length() > 0) {
            try {
                Ctiploc tipoLocT = new Ctiploc();
                tipoLocT.setIdTipLoc(new Integer(value));
                ServletContext sc = (ServletContext) context.getExternalContext().getContext();
                List<Ctiploc> tiposLocalidad = (List<Ctiploc>) sc.getAttribute("catalogo_tipos_localidad");
                for (Ctiploc tipoLocalidad : tiposLocalidad) {
                    if (tipoLocalidad.equals(tipoLocT)) {
                        return tipoLocalidad;
                    }
                }
            } catch (NumberFormatException e) {
                return null;
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            if (value instanceof Ctiploc) {
                Ctiploc tipoLoc = (Ctiploc) value;
                return tipoLoc.getIdTipLoc()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
}
