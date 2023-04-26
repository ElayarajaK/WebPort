class Manager1{
    public static void main(String[] args) {
        
        ()=>

        int arr[]={10,20,30,40,40,40,50,10};
        int length =arr.length;
        

        for(int i=0;i <arr.length;i++){
            for(int j=i+1; j <arr.length;j++){
                if(arr[i] ==arr[j])
                {
                    arr[j-1] = arr[j];
                    
                    
                }
            }
        }

        for(int temp : arr){
            System.out.println(temp);
        }
    }
}