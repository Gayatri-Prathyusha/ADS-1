
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
        Iterator flow = new Iterator(list.getHead());
        while (flow.hasNext()) {
            num += flow.next();
        }

        for (int i = num.length() - 1; i >= 0; i--) {
            num1 += num.charAt(i);
        }
        return num1;
    }


    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	LinkedList lis1 = new LinkedList();
        Stacks s1 = new Stacks();
        Iterator flow1 = new Iterator(list1.getHead());
        while (flow1.hasNext()) {
            s1.push(flow1.next());
        }
        Stacks s2 = new Stacks();
        Iterator flow2 = new Iterator(list2.getHead());
        while (flow2.hasNext()) {
            s2.push(flow2.next());
        }
        int carryvalue = 0;
        while (!s1.isEmpty() && !s2.isEmpty()) {
            int sum = 0;
            int digit1 = (int) s1.pop();
            int digit2 = (int) s2.pop();
            if (carryvalue == 0) {
                sum = digit1 + digit2;
            } else if (carryvalue == 1) {
                sum = digit1 + digit2 + carryvalue;
            }
            if (sum > 9) {
                carryvalue = 1;
            }
            int addVal = sum % 10;
            char result = (char) (addVal + '0');
            lis1.addData(result);
        }
        if (s1.isEmpty() && s2.isEmpty() && carryvalue == 1) {
            char carrAdd = (char) (carryvalue + '0');
            lis1.addData(carrAdd);
        }
        while (!s1.isEmpty() && s2.isEmpty()) {
            int sum = 0;
            int digit1 =(int) s1.pop();
            if (carryvalue == 0) {
                sum = digit1;
            } else if (carryvalue == 1) {
                sum = digit1 + carryvalue;
            }
            if (sum > 9) {
                carryvalue = 1;
            }
            int addVal = sum % 10;
            char result = (char) (addVal + '0');
            lis1.addData(result);

        }

        while (!s2.isEmpty() && s1.isEmpty()) {
            int sum = 0;
            int digit2 =(int) s1.pop();
            if (carryvalue == 0) {
                sum = digit2;
            } else if (carryvalue == 1) {
                sum = digit2 + carryvalue;
            }
            if (sum > 9) {
                carryvalue = 1;
            }
            int addVal = sum % 10;
            char result = (char) (addVal + '0');
            lis1.addData(result);

        }

        return lis1;
    }
}
