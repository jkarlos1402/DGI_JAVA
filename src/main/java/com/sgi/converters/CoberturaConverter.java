package com.sgi.converters;

import com.sgi.pojos.Catbeneficiario;
import com.sgi.pojos.Catcobertura;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("coberturaConverter")
public class CoberturaConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {        
        if(value != null && value.trim().length() > 0) {            
            try {
                Catcobertura coberturaT = new Catcobertura();                
                coberturaT.setIdCob(new Integer(value));
                ServletContext sc = (ServletContext)context.getExternalContext().getContext();
                List<Catcobertura> coberturas = (List<Catcobertura>)sc.getAttribute("catalogo_coberturas");
                for (Catcobertura cobertura : coberturas) {
                    if(cobertura.equals(coberturaT)){
                        return cobertura;
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
            if (value instanceof Catcobertura) {
                Catcobertura cobertura = (Catcobertura) value;
                return cobertura.getIdCob()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
    
}
