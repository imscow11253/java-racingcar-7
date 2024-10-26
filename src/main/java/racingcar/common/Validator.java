package racingcar.common;

import racingcar.model.CarName;

import java.util.List;

import static racingcar.common.ErrorMessage.*;

public class Validator {

    public static void validateCarNameLength(String carName){
        if(carName.length() > 5){
            throw new IllegalArgumentException(TOO_LONG_CAR_NAME.getMessage());
        }
    }

        public static void validateCarNameListLength(List<CarName> carNameList){
        if(carNameList.isEmpty()){
            throw new IllegalArgumentException(NO_CAR_NAME.getMessage());
        }
        if(carNameList.size() > 100){
            throw new IllegalArgumentException(TOO_MANY_CAR_NAME.getMessage());
        }
    }
}