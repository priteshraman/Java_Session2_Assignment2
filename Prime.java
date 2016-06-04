class Prime{
	public static void main(String args[]){
		int i,j;
		boolean pr=true;
		System.out.println("Prime Numbers between 1 and 100 are:");
		for(i=1;i<=100;i++){
			pr=true;
			for(j=2;j<i;j++){
				if(i%j==0)
					pr=false;
			}
			if(pr==true)
				System.out.print(i+" ");
		}
		
		
	}
}
