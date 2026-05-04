class Method01{
	public static void snap(String frd){
		System.out.println("Only one frd:" +frd);
	}
	public static void snap(String frd1,String frd2){
		System.out.println("More than one frd: " + frd1 +" " +frd2 );
	}
	public static void snap(String frd , String Caption,String filter){
		System.out.println("sending all:" +" "+  frd + " " + Caption + " " + filter);
	}
	public static void main(String[] args){
		snap("Raju");
		snap("Raju","Laxmi");
		snap("Raju","Good Day","Funny");
	}
}
	
	