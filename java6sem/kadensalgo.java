public class kadensalgo {
    public static void main (String[] args)
    {
        // steps of kadanes algo:
        // intilization:
        // [1,-2,3,4,-1,2,1,-4,5]
        //start:currentSum = 0 ,maxsum = integr.min_value
        //first ele(1):currentSum = max(1,0+1)1,maxSum = max(_in,1)1
        //second e,emt(-2):currentsum :max(-2,1-2) = -1,maxsum(1,-1)=1
        //third elemnt(3):currentsum:max(3,-1+3)= 3maxsum = 3
        int[]nums={1,-2,3,4,-1,2,1,-5,4};
        System.out.println("maximum subarray sum" +maxSubarray(nums));
    }
    public static int maxSubarray(int[]nums)
    {
        if(nums == null || nums.length == 0)
        {
            return 0;
        }
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num :nums)
        {
            currentSum = Math.max(num,currentSum+num);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
