class splitArrayOfLargestSum {
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int low=Integer.MIN_VALUE,high=0,mid=0,ans=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            low=Math.max(arr[i],low);
            high+=arr[i];
        }
        while(low<=high){
            mid=(low+high)/2;
            if(isPossible(arr,N,mid,K)){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    
    static boolean isPossible(int arr[],int N,int mid,int K){
        int count=1,sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(sum>mid){
                count++;
                sum=arr[i];
            }
        }
        return K>=count;
    }
};

