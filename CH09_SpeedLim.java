public class CH09_SpeedLim {
	private int speed; 
	private int limit;
	public CH09_SpeedLim(int l, int s) {
	 limit = l;
	 speed=s;
	}
	public void SpeedWarning() {
		try {
			if(limit<speed)
				throw new Exception("Speed Limit "+limit+"km exceeded!\nyou are being fined.");
			System.out.println("You are a law abiding\ncitizen!");
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Your current speed: "+speed);
		}
		
	}
}
