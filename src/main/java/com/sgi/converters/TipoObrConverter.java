package com.sgi.converters;

import com.sgi.pojos.Ctipobr;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("tipoObrConverter")
public class TipoObrConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {        
        if (value != null && value.trim().length() > 0) {
            try {
                Ctipobr tipoT = new Ctipobr();
                tipoT.setIdTipObr(new Integer(value));
                ServletContext sc = (ServletContext) context.getExternalContext().getContext();
                List<Ctipobr> tipos = (List<Ctipobr>) sc.getAttribute("catalogo_tipo_obra");
                for (Ctipobr tipo : tipos) {
                    if (tipo.equals(tipoT)) {
                        return tipo;
                    }
                }
            } catch (NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Tipo de obra", "Seleccione una opci\u00f3n"));
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null) {
            if (value instanceof Ctipobr) {
                Ctipobr tipo = (Ctipobr) value;
                return tipo.getIdTipObr()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
}
