public class selectionsort {
    public static void print (int array[] ) {
        for(int i=0;i<array.length;i++){
            System.err.print(array[i]+" ");
    
    } System.out.println();
    }
    public static void main(String[] args) {
        int array[]= {7 ,8,3,2,1};
        for(int i=0;i<array.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<array.length;j++){
                if (array[smallest]>array[j])
                {
                    smallest=j;

                }
            }
            int tmp=array[smallest];
            array [smallest]=array [i];
            array [i]= tmp;
        }
        print(array);
    } 
}

