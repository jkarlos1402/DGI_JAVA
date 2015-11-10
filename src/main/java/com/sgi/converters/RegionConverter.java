package com.sgi.converters;

import com.sgi.pojos.Catregion;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("regionConverter")
public class RegionConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {        
        if(value != null && value.trim().length() > 0) {            
            try {
                Catregion regionT = new Catregion();                
                regionT.setIdReg(new Integer(value));
                ServletContext sc = (ServletContext)context.getExternalContext().getContext();
                List<Catregion> regiones = (List<Catregion>)sc.getAttribute("catalogo_regiones");
                for (Catregion region : regiones) {
                    if(region.equals(regionT)){
                        return region;
                    }
                }
            } catch(NumberFormatException e) {
                return null;
            }
            return null;
        }
        else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            if (value instanceof Catregion) {
                Catregion region = (Catregion) value;
                return region.getIdReg()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
}
