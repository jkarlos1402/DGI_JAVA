package com.sgi.converters;

import com.sgi.pojos.Catacuerdo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("acuerdoFederalConverter")
public class AcuerdoFederalConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                Catacuerdo acuerdoT = new Catacuerdo();                
                acuerdoT.setIdAcu(new Integer(value));
                ServletContext sc = (ServletContext)context.getExternalContext().getContext();
                List<Catacuerdo> acuerdos = (List<Catacuerdo>)sc.getAttribute("catalogo_acuerdos_federales");
                for (Catacuerdo acuerdo : acuerdos) {
                    if(acuerdo.equals(acuerdoT)){
                        return acuerdo;
                    }
                }
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Acuerdos", "Seleccione una opci\u00f3n"));
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
            if (value instanceof Catacuerdo) {
                Catacuerdo acuerdo = (Catacuerdo) value;
                return acuerdo.getIdAcu()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
}
