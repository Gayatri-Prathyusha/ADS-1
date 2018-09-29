class AddLargeNumbers {
	AddLargeNumbers() {

	}
    
    public static LinkedList numberToDigits(String number) {
    	LinkedList digits = new LinkedList();
    	for(int i =0; i < number.length(); i++) {
    		digits.addData(number.charAt(i));
    	}
    return digits;
}

    public static String digitsToNumber(LinkedList list) {
        String num = "";
        String num1 = "";
        Iterator flow = new Iterator(list.getFirst());
        while (flow.hasNext()) {
            num += flow.next();
        }

        for (int i = num.length() - 1; i >= 0; i--) {
            num1 += num.charAt(i);
        }
        return num1;
    }


    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        LinkedList lis = new LinkedList();
        return lis;

    }
}