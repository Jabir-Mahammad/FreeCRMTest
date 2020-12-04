class Border{
	public static void main(String arggs[]){
		int i,j;
		for(i=1;i<5;i++){
			for(j=1;j<5;j++){
				if(i==1 || i==4 || j==1 || j==4){
					System.out.print(" 1 ");

				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}