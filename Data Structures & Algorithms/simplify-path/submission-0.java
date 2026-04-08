class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] paths = path.split("/");

        for (String part : paths) {
            if (part.equals("") || part.equals(".")) {
                // ignore empty or current directory
                continue;
            } else if (part.equals("..")) {
                // go back one directory if possible
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                // valid folder name
                st.push(part);
            }
        }

        // build simplified path
        StringBuilder str = new StringBuilder();
        for (String p : st) {
            str.append("/").append(p);
        }

        // if empty, return root "/"
        return str.length() == 0 ? "/" : str.toString();
    }
}
