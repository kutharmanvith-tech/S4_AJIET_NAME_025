class main{
    public static void main(String[]args){
        int arr[]={43,65,23,54,3,55};
        int register=arr[0];
        int cut=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<register){
                cut++;
                register=arr[i];
            }
        }
        System.out.println(cut);
    }
}
