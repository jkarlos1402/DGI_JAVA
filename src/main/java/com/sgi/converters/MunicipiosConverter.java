package com.sgi.converters;

import com.sgi.pojos.Catmunicipio;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("municipiosConverter")
public class MunicipiosConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {                  
        if (value != null && value.trim().length() > 0) {
            try {
                Catmunicipio municipioT = new Catmunicipio();
                municipioT.setIdMun(new Integer(value));
                ServletContext sc = (ServletContext) context.getExternalContext().getContext();
                List<Catmunicipio> municipios = (List<Catmunicipio>) sc.getAttribute("catalogo_municipios");
                for (Catmunicipio municipio : municipios) {
                    if (municipio.equals(municipioT)) {
                        return municipio;
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
            if (value instanceof Catmunicipio) {
                Catmunicipio municipio = (Catmunicipio) value;
                return municipio.getIdMun()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
}
