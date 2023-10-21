class Solution {
    public int compress(char[] chars) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char last = 0;
      
        for (char current : chars) {
            if (stack.empty()) {
                stack.push(current);
                count++;
            } else {
                last = stack.pop();
                if (last == current) {
                    count++;
                    stack.push(current);
                } else {
                    if (count > 0) {
                        if (count == 1) {
                            sb.append(last);
                        } else {
                            String countStr = String.valueOf(count);
                            sb.append(last).append(countStr);
                        }
                        count = 0;
                    }
                    stack.push(current);
                    count++;
                }
            }
            last = current;
        }

        if (count > 0) {
            if (count == 1) {
                sb.append(last);
            } else {
                String countStr = String.valueOf(count);
                sb.append(last).append(countStr);
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
      
        stack.clear();
        return sb.length();
    }
}
