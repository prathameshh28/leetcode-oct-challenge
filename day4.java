class day4{
   private static final int size = 1000; // here arrayList would have been taken so we can initialise less space and increase whenever needed
   private List<int[]> buckets[];

   public MyHashMap(){
       buckets = new ArrayList[size];
       for(int i=0;i<size;i++){
           buckets[i] = new ArrayList<>();
       }
   }
   public void put(int key, int value){
       int index = key % size;
       List<int[]> bucket = buckets[index];
       boolean added = false;
       for(int[] pair : bucket){
           if(pair[0] == key){
               pair[1] = value;
               added = true;
               return;
           }
       }
       // does not exist so add new.
       if(added==false){
           bucket.add(new int[]{key , value});
       }
   }

   public int get(int key){
       int index  = key % size;
       List<int[]> bucket = buckets[index];
       for(int[] pair : bucket){
           if(pair[0]==key){
               return pair[1];
           }
       }
       return -1;
   }

   public void remove(int key){
       int index = key % size;
       List<int[]> bucket = buckets[index];
       for(int i=0;i<bucket.size();i++){
           int[] pair = bucket.get(i);
           if(pair[0]==key){
               bucket.remove(i);
               return;
           }
       }
   }
}