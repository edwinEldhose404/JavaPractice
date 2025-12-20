class serverStability 
{
	public static void main(String[] args) 
	{
		float cpu = 84;
		float memory = 42;
		boolean maintenence = true;
		
		//stable but maintenence
		System.out.println(cpu<= 85 && memory <=90 &&maintenence == false ? "Server Running" : "Server inactive");
		
		//stable and no maintenence
		maintenence = false;
		System.out.println(cpu<= 85 && memory <=90 &&maintenence == false ? "Server Running" : "Server inactive");
		
		//unstable
		cpu = 94;
		System.out.println(cpu<= 85 && memory <=90 &&maintenence == false ? "Server Running" : "Server inactive");
		
	}
}
