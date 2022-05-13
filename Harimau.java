class Harimau {
	private static String jenis_Mamalia = "harimau";
	private static int Jumlah_kaki = 4;
	
	public static String getJenisMamalia() {
		return jenis_Mamalia;
	}
	
	public static int getJumlahKaki() {
		return Jumlah_kaki;
	}
	
	private static void meraung(){
		System.out.println("aku meraung");
	}
	
	private static void berjalan(){
		System.out.println("aku berjalan");
	}
	
	public static void main(String[]args) {
		System.out.println(String.format("Jenis Mamalia: %s",getJenisMamalia()));
		
		System.out.println(String.format("Jumlah Kaki: %s",getJumlahKaki()));
		
		meraung();
		berjalan();
	}
}
