public class ArrayOps {
    public static void main(String[] args) {
       System.out.println("Missing number: " + findMissingInt(new int [] {2,0,3})); 
       System.out.println("Second highest number" + secondMaxValue(new int [] {2,10,-4,89,-100,140}));
       System.out.println("Arryas contain the same elements? " + containsTheSameElements(new int [] {1,2,3,4,6}, new int [] {4,6,2,1,3,6,1,4,7}));
       System.out.println("Is array Sorted? " + isSorted(new int [] {1,55,55,60,99,99,99,98}));
        
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int missingnum = -1;
        boolean isMissing = true;
        for(int i = 0;i <= n; i++){
            for (int j=0;j<n;j++){
                if (i==array[j]){
                    isMissing=false;
                    break;
                }
        
         }
         if(isMissing){    //only one missing number in [0,n]
            missingnum=i;
            break;
         }
         isMissing=true;

        
    }
        return missingnum;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secMax;
        if (array[1] > max) {
            secMax = max;
            max = array[1];
        }
        else{
            secMax = array[1];
        }

        for (int i = 2; i < array.length; i++){
            if (array[i]>max){
                secMax=max;
                max = array[i];
            }
        }

        // Write your code here:
        return secMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
       boolean inSecArray = false;
       boolean inFirstArray = false;
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i]==array2[j]){             //check if all array1 characters are in array2
                    inSecArray = true;
                    break;
                }
            }
            if (!inSecArray){
                return false;
            }
            inSecArray = false;
        }

              for (int i = 0; i < array2.length; i++){
            for (int j = 0;j < array1.length; j++){
                if (array2[i]==array1[j]){               //check if all array2 characters are in array1
                    inFirstArray = true;
                    break;
                }
            }
            if (!inFirstArray){
                return false;
            }
            inFirstArray = false;
        }




        return true;
    }

    public static boolean isSorted(int [] array) {
        int N = array.length;
        boolean Sorted = true;
        for (int i = 0; i < N -1; i++){
            for (int j = i+1; j < N; j++){
                if (array[i] <= array[j]){

                }
                else if (array[N-i-1] <= array[N-j-1]) {
                }

                else{
                    return false;
                }
                
              
            }
           // if ((array[i] <= array[i-1] && array[i] >= array[i+1]) || (array[i] >= array[i-1] && array[i] <= array[i+1] )){
        
        


    }
    return true;


}
}
