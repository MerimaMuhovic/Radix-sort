package homework7RadixSort;

public class IPAddress implements Comparable<IPAddress> {

	public long ipFrom;
	public long ipTo;
	String countryCode;
	String countryName;
	String regionName;
	String cityName;
	
	
	public IPAddress(long ipFrom, long ipTo, String countryCode, String countryName, String regionName,
			String cityName) {
		super();
		this.ipFrom = ipFrom;
		this.ipTo = ipTo;
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionName = regionName;
		this.cityName = cityName;
	}


	@Override
	public int compareTo(IPAddress that) {
		if(this.ipFrom>that.ipFrom) {
			return 1;
		}
		else if(this.ipFrom<that.ipFrom) {
			return -1;
		}
		else {
			return 0;
		}
	}



	public String toString() {
		
		return "/ "+ this.ipFrom + " / " + this.ipTo + " / " + this.countryCode + " / "+ this.countryName + " / " + this.regionName + " / " + " / " + this.cityName;
	}

}