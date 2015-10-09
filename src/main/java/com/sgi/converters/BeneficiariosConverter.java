package com.sgi.converters;

import com.sgi.pojos.Catbeneficiario;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import javax.servlet.ServletContext;

@FacesConverter("beneficiariosConverter")
public class BeneficiariosConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                Catbeneficiario beneficiarioT = new Catbeneficiario();                
                beneficiarioT.setIdBen(new Integer(value));
                ServletContext sc = (ServletContext)context.getExternalContext().getContext();
                List<Catbeneficiario> beneficiarios = (List<Catbeneficiario>)sc.getAttribute("catalogo_beneficiarios");
                for (Catbeneficiario beneficiario : beneficiarios) {
                    if(beneficiario.equals(beneficiarioT)){
                        return beneficiario;
                    }
                }
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Beneficiarios", "Seleccione una opci\u00f3n"));
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
            if (value instanceof Catbeneficiario) {
                Catbeneficiario beneficiario = (Catbeneficiario) value;
                return beneficiario.getIdBen()+ "";
            }else{
                return null;
            }
        } else {
            return null;
        }
    }
}
