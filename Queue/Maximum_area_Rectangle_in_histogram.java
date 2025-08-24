class Solution {
    public static int getMaxArea(int arr[]) {
        // your code here
        int n = arr.length;
        int NSR[] = new int [n];
        int NSL[] = new int [n];
        Stack<Integer> stack = new Stack<>();

        // for getting NSR(next smaller to right)

        for(int i = n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            NSR[i] = stack.isEmpty() ? n:stack.peek();
            stack.push(i);
        }

        //  Before going to find the NSL(Next smaller from Left) clear the stack
        stack.clear();

        for(int i =0;i<n;i++){
             while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            NSL[i] = stack.isEmpty()? -1 : stack.peek();
            stack.push(i);

        }

        int maxArea =0;
        for(int i =0;i<n;i++){
           int width = NSR[i] - NSL[i] -1;
           int area = arr[i] * width;
           maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
