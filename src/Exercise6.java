import java.util.Scanner;
public class Exercise6 {
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the equation");
    String theEquation =scanner.nextLine();
    boolean goodOrNot = checkQuadrticEquation(theEquation);
    System.out.println(goodOrNot);
    if(!goodOrNot){
        System.out.println("the equation is not good");
    }
    else{
        System.out.print(returnTheParameterA(theEquation));
        System.out.print(returnTheParameterB(theEquation));
    }

}






    public static boolean checkQuadrticEquation(String equation){
    boolean goodOrNot = true;

    int lengthOfEquaton = equation.length();

    String equalToZero = "=0";

    int indexOfFirstX = equation.indexOf('x');
    String fromFirstX = "x^2";

    int indexOfSecondX=0;
    String secondXWithPlus = "x+";
    String secondXWithMinus = "x-";
    String secondXWithEqual = "x=";
    int counter = 0;
    for(int i = 0; i < equation.length() ; i++){
        if(equation.charAt(i)=='x'){
            indexOfSecondX = i;
            counter++;
            if(counter == 2){
                break;
            }
        }
    }


    if(!equation.substring(lengthOfEquaton-2).equals(equalToZero)){
        goodOrNot = false;
    }
    else if(!equation.substring(indexOfFirstX,indexOfFirstX+3).equals(fromFirstX)){
        goodOrNot = false;
    }
    else if(!(equation.substring(indexOfSecondX,indexOfSecondX+2).equals(secondXWithPlus)||
        equation.substring(indexOfSecondX,indexOfSecondX+2).equals(secondXWithMinus)||
        equation.substring(indexOfSecondX,indexOfSecondX+2).equals(secondXWithEqual))) {
        goodOrNot = false;
    }

    return goodOrNot;
    }

    public static int returnTheParameterA(String equation){
    int a = 0;
    int indexOfFirstX = equation.indexOf('x');
    String beforFirstX = equation.substring(0,indexOfFirstX);
    if(indexOfFirstX == 0)
        a = 1;
    else{
        a=Integer.parseInt(beforFirstX);   ;
    }

    return a;
    }

    public static int returnTheParameterB(String equation){
    int b = 0;
    return b;
    }

    public static int returnTheParameterC(String equation) {
        int c = 0;
        return c;
    }
}
