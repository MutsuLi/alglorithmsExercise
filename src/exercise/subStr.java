package exercise;

public class subStr {
    public static int IndexOf(String source,String target,int fromIndex){
        final int sourceLength=source.length();
        final int targetLength=target.length();
        if(fromIndex>=sourceLength) {
            return(targetLength==0)?sourceLength:-1;
        }
        if(fromIndex<0) fromIndex=0;
        if(targetLength==0) return fromIndex;
        int first=target.charAt(0);
        int max=sourceLength-targetLength;
        for(int i=fromIndex;i<=max;i++){
            if(source.charAt(i)!=first){
                while(++i<=max&&source.charAt(i)!=first);
            }
            if(i<=max){
                int j=i+1;
                int end=j+targetLength-1;
                for(int k=1;j<end&&source.charAt(j)==target.charAt(k);j++,k++);
                if(j==end) {
                    return i;
                }
            }
        }
        return -1;
    }
}
