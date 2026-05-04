class sqpr
{
	public static void main(String[] args){
		int n=8,pro=1;
		for(int i=1;i<=n;i++){
			pro=(i*i) * pro;
		}
		System.out.println(pro);
	}
}