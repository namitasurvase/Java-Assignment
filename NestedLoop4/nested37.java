class Nested37{
    public static void main(String[]args){
        int row=4;
        int num=1;
        for(int i=1;i<=row;i++){
            int temp=i;
            for(int j=1;j<=i;j++){
                if(j%2!=0){
                    System.out.print(temp*temp*temp +" ");
                }
                else{
                    System.out.print(temp*temp +" ");
                }
                
                temp++;

            }
            System.out.println();
        }
    }
}