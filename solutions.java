import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class solutions{
    
    //this solution handles the case of multiple magic indexes.
    public static int[] magicIndex(int[] A){
        int[] magic = new int[0];
        int[] temp;
        for(int i = 0; i<A.length; i++){
            if(A[i] == i){
                temp = magic;
                magic = new int[temp.length + 1];
                for(int j=0; j<temp.length; j++){
                    magic[j] = temp[j];
                }
                magic[magic.length -1] = i;
            }
        }
        return magic;
    }

    public static <T> Set<Set<T>> powerSet(Set<T> set){
        Set<Set<T>> powSet = new HashSet<Set<T>>();
        powSet.add(set);
        if(set.isEmpty()){
            return powSet;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()){
            Set<T> temp = new HashSet<T>(set);
            temp.remove(it.next());
            powSet.add(temp);
            powSet.addAll(powerSet(temp));
        }
        return powSet;
    }

    public static int recursiveMultiply(int a, int b){
        if(b == 0){
            return 0;
        }else{
            return a + recursiveMultiply(a, b-1);
        }
    }
}