public class BubbleSort {



        public static void main(String[] args) {

            int[] intArray= {20,35,-15,7,55,1,-22};

            // this assumes the total array is unsorted and the last index of that unsorted array is the last index
            // and eventually it will grow from back means unsorted array will get smaller
            // and from the beginning every two elements will switch position if array[i]>array[i+1]
            //

            for(int lastUnsortedIndex=intArray.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
                for(int i=0; i<lastUnsortedIndex; i++){
                    if(intArray[i]>intArray[i+1]){
                        swap(intArray, i, i+1);
                    }
                }
            }


           for(int i=0; i<intArray.length; i++){
               System.out.println(intArray[i]);
           }


        }

        public static void swap(int[] a, int i , int j){
            if(i==j){
                // if both index number are same not the value
                return;
            }
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
        }












}
