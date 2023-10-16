// 14/10/23
// pending
class PVRMovies{
	private static PVRMovies ticketID=null;
	private static boolean ticketStatus=false;
	private PVRMovies(){
		System.out.println("Welcome to PVRMovies your ticket book");
	}
	public static PVRMovies bookMtTicket(){
		System.out.println("Kindly wait check your ticket status");
	}
	if(ticketID==null){
		ticketID=new PVRMovies();
		return 20;
	}
}
class BookMyShow{
	public static void main(String[] args){
		PVRMovies eticket1 = PVRMovies.bookMyTicket();
		System.out.println(eticket1);
		PVRMovies eticket2 = PVRMovies.bookMyTicket();
		System.out.println(eticket2);
	}
}