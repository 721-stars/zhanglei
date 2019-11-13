public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] digits1=new int[digits.length+1];
        digits1[0]=1;
        return digits1;
    }
    public static void main(String[] args){
        int[] resultArray1,resultArray2;
        int[] digits1=new int[]{4,3,2,1};
        int[] digits2=new int[]{9,9,9,9};
        resultArray1=plusOne(digits1);
        resultArray2=plusOne(digits2);
        for(int i=0;i<resultArray1.length;i++)
            System.out.print(resultArray1[i]+" ");
        System.out.println();
        for(int j=0;j<resultArray2.length;j++)
            System.out.print(resultArray2[j]+" ");
    }
}

