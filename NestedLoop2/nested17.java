class Nested17{
	public static void main(String[]args){
	char ch='A';
	char bh='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(ch+" ");
					
				}
				else{
					System.out.print(bh+" ");
					
				}
				
				bh++;
				ch++;
			}
			System.out.println();
		}
	}
}
					