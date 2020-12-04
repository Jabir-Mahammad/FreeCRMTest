 class Pattern {
      public static void main(String[] args) {
        int N=6;
        for(int i=0;i<=6;i++)       {
        for(int j=0;j<6-i;j++)System.out.print(" ");
        for(int j=0;j<(2*i-1);j++) System.out.print("1");
        System.out.println();
        }
     }
}