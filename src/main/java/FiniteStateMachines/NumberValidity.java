package main.java.FiniteStateMachines;

/**
 * Created by rasn on 8/26/16.
 */
public class NumberValidity {
    public static void main(String[] args) {
        System.out.println("isNumber = " + isNumber("3."));
    }

    public static boolean isNumber(String s) {
        if( s == null) return false;
        s = s.trim();
        if( s.length() == 0) return false;
        States currentState = States.BEGIN;
        States[][] fsm = new States[][]{
                {States.NUM1, States.DOT, States.BAD, States.NUM1, States.BAD},
                {States.NUM1, States.DOT, States.E, States.BAD, States.BAD},
                {States.NUM2, States.BAD, States.BAD, States.BAD, States.BAD},
                {States.NUM3, States.BAD, States.BAD, States.BAD, States.BAD},
                {States.NUM3, States.BAD, States.BAD, States.BAD, States.BAD},
                {States.BAD, States.BAD, States.BAD, States.BAD, States.BAD},
                {States.BAD, States.BAD, States.BAD, States.BAD, States.BAD},
        };
        for(int i = 0; i < s.length() ; i++){
            CharType charType = findCharType(s.charAt(i));
            currentState = fsm[currentState.ordinal()][charType.ordinal()];
            System.out.println("charType.name() = " + charType.name());
            System.out.println("currentState = " + currentState.name());
            if(currentState == States.BAD){
                return false;
            }

        }
        if(currentState == States.NUM1 || currentState == States.NUM2 || currentState == States.NUM3 || currentState == States.DOT){
            return true;
        } else {
           return false;
        }
    }

    private static CharType findCharType(char c){
        if(c >= '0' && c <= '9'){
            return CharType.DIGIT;
        } else if (c == '+' || c == '-'){
            return CharType.SIGN;
        } else if (c == '.'){
            return CharType.DOT;
        } else if(c == 'e'){
            return CharType.E;
        } else {
            return CharType.OTHER;
        }
    }
}

enum States{
    BEGIN,
    NUM1,
    DOT,
    NUM2,
    E,
    NUM3,
    PRENUM,
    BAD
}

enum CharType{
    DIGIT,
    DOT,
    E,
    SIGN,
    OTHER
}