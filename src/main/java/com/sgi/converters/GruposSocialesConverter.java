package com.sgi.converters;

import com.sgi.pojos.Catgposoc;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("gruposSocialesConverter")
public class GruposSocialesConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {                  
        if (value != null && value.trim().length() > 0) {
            try {
                Catgposoc grupoSocT = new Catgposoc();
                grupoSocT.setIdGpo(new Integer(value));
                ServletContext sc = (ServletContext) context.getExternalContext().getContext();
                List<Catgposoc> grupos = (List<Catgposoc>) sc.getAttribute("catalogo_grupos_sociales");
                for (Catgposoc grupo : grupos) {
                    if (grupo.equals(grupoSocT)) {
                        return grupo;
                    }
                }
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Grupo social", "Seleccione una opci\u00f3n"));
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            if (value instanceof Catgposoc) {
                Catgposoc grupo = (Catgposoc) value;
                return grupo.getIdGpo()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
}
