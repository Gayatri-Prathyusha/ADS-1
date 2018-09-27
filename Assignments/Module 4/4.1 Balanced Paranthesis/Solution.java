
public final class Solution {
    private Solution() {

    }
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) { 
        BalancedParan bp = new BalancedParan();
        char exp[] = {'{','(',')','}','[',']'}; 
        if (bp.areParenthesisBalanced(exp)) {
        System.out.println("YES");            
        } else {
                System.out.println("NO");   
        } 
    }
}