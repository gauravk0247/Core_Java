// 11/08/23
class While4{
	public static void main(String[] args){
	int i = 1;
	while(i<=10){
		if(i==3){
		System.out.println("Hello"+i);
		//break;
		}
		System.out.println(i);
		i++;
	}
	}
}

class While5{
	public static void main(String[] args){
		int i = 1;
		while(i<=10)
		{
			if(i==5){
				//System.out.println("Hello");
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}