package Day10_IfStatementsContinue;

import java.sql.SQLOutput;

public class Alphabetic {
    public static void main(String[] args) {
        char character = '@';

        boolean isAlphabetic = (character>=65 && character<=90) || (character>=97 && character<=122);

        boolean isDigit = (character>=48 && character<=57);

        boolean isSpecialCharacter = !isAlphabetic && !isDigit;

        String alphabet="";

        if(isAlphabetic==true){
            alphabet= character+ " is Alphabetic character";
        }else{
            alphabet=character+ " is not Alphabetic character";
        }

        System.out.println(alphabet);

        String digit = "";

        if(isDigit==true){
            digit=character+ " is Digital number";
        }else {
            digit = character + " is not Digital number";
            System.out.println(digit);
        }

            String specialcharacter = "";

            if(isSpecialCharacter == true){
                specialcharacter = character+ " is special character";
            }else {
                specialcharacter = character + " is not special character";
            }

                System.out.println(specialcharacter);

            }

        }


