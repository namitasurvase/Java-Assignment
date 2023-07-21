class Nested18{
    public static void main(String[]args){
        
        int x=1;
        for(int i=1;i<=3;i++){
            
            int num=3;
            char ch='C';
            for(int j=1;j<=3;j++){
                System.out.print(x*x+""+ch--+ ""+num-- +" " );
                x++;
                
            }
            System.out.println();
        }
    }
}