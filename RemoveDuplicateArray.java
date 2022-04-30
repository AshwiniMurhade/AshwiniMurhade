package arrrayjava;

public  class RemoveDuplicateArray {

	public static void main(String[] args) {
		    
		int a[]= {7,5,2,7,6,4,2,};
		int k=0;
		outer:
		for(int i=0;i<a.length;i++) {
			inner:
				for(int j=0;j<i;j++){
					if(a[i]==a[j]) {
						continue outer;
					}
				System.out.println(a[i]);
				//k++;
			}
			int b[]=new int[k];
			k=0;
			outer:
				for(int i=0;i<a.length;i++) {
			System.out.println();
			
		}
	}

}
