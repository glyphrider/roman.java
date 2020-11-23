package org.glyphrider.roman;

public class Roman {
    private class RomanConversionDataItem {
	public int arabic;
	public String roman;
	public RomanConversionDataItem(int arabic, String roman) {
	    this.arabic = arabic;
	    this.roman = roman;
	}
    }

    private RomanConversionDataItem[] conversionData = {
	new RomanConversionDataItem(40,"XL"),
	new RomanConversionDataItem(10,"X"),
	new RomanConversionDataItem(9,"IX"),
	new RomanConversionDataItem(5,"V"),
	new RomanConversionDataItem(4,"IV"),
	new RomanConversionDataItem(1,"I")
    };
						     
    public String to(int arabic) {
        String result;
        result = "";

	for(RomanConversionDataItem item : conversionData) {
	    while(arabic >= item.arabic) {
		result += item.roman;
		arabic -= item.arabic;
	    }
	}

        return result;
    }
}
