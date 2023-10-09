// 09/10/23
interface PVRMovies{
	void bookSeat();
	void pvrReward();
}
interface BookMyShow extends PVRMovies{
	void bookSeat();
	void bookMyShowReward();
	
}
class Movies implements BookMyShow{
	public void bookSeat(){
		System.out.println("Book Seat for movie");
	}
	public void pvrReward(){
		System.out.println("Inside reward");
	}
	public void bookMyShowReward(){
		System.out.println("Inside show reward");
	}
	public static void main(String[] args){
		BookMyShow m1 = new Movies();
		m1.bookSeat();
		m1.pvrReward();
		m1.bookMyShowReward();
	}
}