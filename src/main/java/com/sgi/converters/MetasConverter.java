package com.sgi.converters;

import com.sgi.pojos.Catmeta;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("metasConverter")
public class MetasConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {                  
        if (value != null && value.trim().length() > 0) {
            try {
                Catmeta metaT = new Catmeta();
                metaT.setIdMet(new Integer(value));
                ServletContext sc = (ServletContext) context.getExternalContext().getContext();
                List<Catmeta> metas = (List<Catmeta>) sc.getAttribute("catalogo_metas");
                for (Catmeta meta : metas) {
                    if (meta.equals(metaT)) {
                        return meta;
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
            if (value instanceof Catmeta) {
                Catmeta meta = (Catmeta) value;
                return meta.getIdMet()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
}
