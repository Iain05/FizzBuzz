class Main {
  	public static void main(String[] args) {
	
	int[] num = {3 ,5};
	String[] name = {"Fizz", "Buzz"};
	String output = "";

    	for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < num.length; j++) {
				if (i % num[j]==0) {
					output += name[j];
				}				
			}

		if (output == "") {output += i;}
		System.out.println(output);
		output = "";
		}
  	}
}
