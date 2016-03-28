package Module2.Implementation;

import Module2.Interfaces.Validator;


public class OddValidator implements Validator <Number> {

    @Override
    public boolean isValid(Number result) {
        return (result.longValue() % 2 == 0);
    }


}
