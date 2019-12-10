package by.javatr.task1.logic;

public class Logic implements SquareLastDigit {

    @Override
    public int defineSquareLastDigit(int number) {

        int res = 0;

        switch (lastDigit(number)){
            case 1:
            case 9:{
                res = 1;
                break;
            }
            case 2:
            case 8:{
                res = 4;
                break;
            }
            case 3:
            case 7:{
                res = 9;
                break;
            }
            case 4:
            case 6:{
                res = 6;
                break;
            }
            case 5:{
                return 5;
            }
        }

        return res;
    }

    private int lastDigit(int number){

        return number%10;
    }
}
