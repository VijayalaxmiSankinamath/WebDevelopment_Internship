class Today1{
	public static void main(String[] args){
		String s1="John    deom$eo89023   ";
		String res="";
		s1=s1.toLowerCase().trim();
		System.out.println(s1);
		s1=s1.replaceAll(" +","_");
		System.out.println(s1);
		s1=s1.replaceAll("[^a-zA-Z0-9_]","");
		System.out.println(s1);
		if(s1.length() > 6 && s1.length() <20){
			if(s1.matches("[A-Za-z]")){
				
			System.out.println("valid");
			}
		}else{
			System.out.println(" NOT valid");
		}
		
	}
}
   