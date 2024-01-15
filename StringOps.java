import javax.print.attribute.SetOfIntegerSyntax;

public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        //System.out.println(capVowelsLowRest("vowels are fun"));
        System.out.println(camelCase(" Intro to  coMPUter   sCIEncE" ));
        //int [] array = new int [allIndexOf("MMMM",'M').length];
        //array = allIndexOf("MMMM",'M');
        //for (int i = 0; i < array.length; i++){
         //   System.out.print(array[i] + " ");
        //}
    }

    public static String capVowelsLowRest (String string) {
        String s = "";
        for (int i = 0; i < string.length(); i++){
                int ascnum = (int) string.charAt(i);
                if (string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i'|| string.charAt(i)=='o'||string.charAt(i)=='u') {
                    ascnum -= 32;
                    s += (char) ascnum;
                }
                else if ((ascnum > 64 && ascnum <91) && (string.charAt(i)!='A' && string.charAt(i)!='E' && string.charAt(i)!='I'&& string.charAt(i)!='O' && string.charAt(i)!='U') ){
                    ascnum +=32;
                    s += (char) ascnum;
                 }
                 else{
                    s+= (char) ascnum;
                 }
                
        }

        // Write your code here:
        return s;
    }

    public static String camelCase (String string) {
        String s = "";
        int firstLetter = 0;
        while ( (int) string.charAt(firstLetter) == 32){
            firstLetter++;
            }
        if (((int) string.charAt(firstLetter)<91) && ((int) string.charAt(firstLetter)>64)){
            s += (char)((int) string.charAt(firstLetter) + 32);
        }
        else if ((int) string.charAt(firstLetter)!=32){
             s += (char)((int) string.charAt(firstLetter));
        }

    

        for (int i = firstLetter+1; i < string.length(); i ++){
            if (((int) string.charAt(i) != 32) && ((int) string.charAt(i-1)!=32) ){
                if (((int) string.charAt(i)<91) && ((int) string.charAt(i)>64)){
                    s+= (char)((int)string.charAt(i)+32);
                    }
                    else{
                    s+= (char)((int)string.charAt(i));
                    }
              
            }  
            if (((int)string.charAt(i-1) == 32) && ((int) string.charAt(i)<123 && (int) string.charAt(i)>96)){
                 s = s+ (char)((int) string.charAt(i)-32);
            }
            else if (((int)string.charAt(i-1) == 32) && ((int) string.charAt(i)<91) && ((int) string.charAt(i)>64)){
                s+= (char)((int)string.charAt(i));
            }
        }
        return s;
    }

    public static int[] allIndexOf (String string, char chr) {
        int arrayLength = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i)==chr){
                arrayLength++;
            }

        }
        int [] array = new int[arrayLength];
        int count = 0;
        for (int j = 0; j<string.length(); j++){
            if ( string.charAt(j) == chr){
                array[count] = j;
                count++;
            }
        }

        return array;
    }
}
