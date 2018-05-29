public class BinaryAdd {
    public static void main(String[] args) {
        String str1= "10101";
        String str2 ="01110";

        char[] strAr1 =str1.toCharArray();
        char[] strAr2 = str2.toCharArray();
        StringBuilder sb= new StringBuilder();
        int lastPointer=0;
        int carry=0;
        while(strAr1.length-1 >=lastPointer || strAr2.length-1 >=lastPointer){
            int first=0;
            int second=0;
            int sum=0;
            if(strAr1.length-1>=lastPointer) {
                first =  Character.getNumericValue(strAr1[strAr1.length-1 - lastPointer]);
            }
            if(strAr2.length-1>=lastPointer) {
                second =  Character.getNumericValue(strAr2[strAr2.length-1 - lastPointer]);
            }
            sum=first+second+carry;
            carry=0;
            if(sum>=2){
                carry=1;
                sum=0;
            }
            sb.append(sum);
            lastPointer++;

        }
        System.out.print(carry+sb.reverse().toString());
    }
}
