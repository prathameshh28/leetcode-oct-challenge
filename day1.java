class day1{
    public String reverseWords(String s) {
        int ptr1 = 0;
        int ptr2 = 0;
        char arr[] = s.toCharArray();
        while(ptr1<arr.length){
            while(ptr2<arr.length && arr[ptr2]!=' '){
                ptr2++;
            }
            reverse(arr,ptr1,ptr2-1);
            ptr1 = ptr2+1;
            ptr2 = ptr1;
        }
       return new String(arr); 
    }
    public void reverse(char [] s,int start,int end){
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++; end--;
        }
    }
}