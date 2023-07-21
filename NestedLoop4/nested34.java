class Nested34{
    public static void main(String[]args){
        int row=4;
      char ch='A';
        for(int i=1;i<=row;i++){
               char temp=ch;
            for(int j=i;j<=4;j++){

                System.out.print(temp +" ");
                temp++;
            }
             ch++;
            System.out.println();
        }
       
    }
}