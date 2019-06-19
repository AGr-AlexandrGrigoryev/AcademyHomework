package cz.inventi.javaakademie.academyhomework.jsf.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;


@Named
public class YearValidator implements Validator {

    private static final int MIN = 1900;
    private static final int MAX = 2100;

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        Integer input = (Integer) value;
        //Doplnte validaci tak, aby byl rok mezi 1900 a 2100
        if (input < MIN || input > MAX) {
            throw new ValidatorException(
                    new FacesMessage(
                            " Your year should be between" + MIN + " and " + MAX));
        }
    }

}
