class Nested26{
    public static void main(String[]args){
        int row=6;
        char ch='F';
        for(int i=1;i<=row;i++){
            char bh=ch;
            for(int j=1;j<=i;j++){
                System.out.print(bh+ " ");
                bh++;
            }
            ch--;
            System.out.println();
        }
    }
}