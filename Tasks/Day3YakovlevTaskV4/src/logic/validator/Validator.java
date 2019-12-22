package logic.validator;

public class Validator {

    public static boolean isWeightCorrect(int weight){
        if(weight >0){
            return true;
        } else {
            return false;
        }
    }
}
