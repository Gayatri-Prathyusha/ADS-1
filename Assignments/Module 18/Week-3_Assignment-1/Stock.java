/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
	/**
	 * Class variable for company name.
	 */
	private String companyname;
	/**
	 * Class variable for change in stock by hour.
	 */
	private float change;

	/**
	 * Constructs the object.
	 *
	 * @param      companyname1   The company Name.
	 * @param      change1   The change
	 */
	Stock(final String companyname1, final float change1) {
		this.companyname = companyname1;
		this.change = change1;
	}

	/**
	 * Gets the companyName.
	 *
	 * @return     The companyname.
	 */
	public String getCompanyName() {
		return companyname;
	}

	/**
	 * Gets the change.
	 *
	 * @return     The change.
	 */
	public float getChange() {
		return change;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */
	public String toString() {
		return companyname + " " + change;
	}

	/**
	 * Compares two stocks.
	 *
	 * @param      other  The other
	 *
	 * @return     Integer value to compare.
	 */
	public int compareTo(Stock other) {
		if (this.change > other.getChange()) {
			return 1;
		}
		if (this.change < other.getChange()) {
			return -1;
		}
		if (this.companyname.compareTo(other.getCompanyName()) > 0) {
			return 1;
		}
		if (this.companyname.compareTo(other.getCompanyName()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}
