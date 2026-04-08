class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for (int a : asteroids) {
            // ✅ Fix 1: correct collision condition
            while (!st.isEmpty() && a < 0 && st.peek() > 0) {
                int sum = a + st.peek();
                if (sum < 0) {
                    st.pop();        // top asteroid destroyed
                } else if (sum > 0) {
                    a = 0;           // current asteroid destroyed
                } else {             // equal size -> both destroyed
                    st.pop();
                    a = 0;
                }
            }
            if (a != 0) {
                st.push(a);
            }
        }
        
        // ✅ Fix 2: result array should be of size st.size()
        int[] res = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            res[i] = st.get(i);
        }
        return res;
    }
}
