package assignmentday6;

public class address {
	int flatNumber;
	String flatName;
	String roadName;
	String cityName;
	
	public address(int flatNumber, String flatName, String roadName, String cityName) {
		this.flatNumber = flatNumber;
		this.flatName = flatName;
		this.roadName = roadName;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return flatNumber + "/" + flatName + "\n" + roadName + "\n" + cityName;
	}
	
}
