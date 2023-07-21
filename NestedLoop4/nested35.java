class Nested35{
    public static void main(String[]args){
        int row=6;
        char ch='F';  
        int num=1;
        for(int i=1;i<=row;i++){
          
            char temp=ch;
            for(int j=1;j<=i;j++){
                
                
                if(j%2!=0){
                    System.out.print(temp +" ");
                    temp++;
                }
                else{
                    System.out.print(num +" ");
                    num=num+1;
                }
                
            }
            ch--;
            System.out.println();
        }
    }
}