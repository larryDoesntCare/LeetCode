 public void rotate(int[] nums, int k) {
        if(k==0) return;
        int factor;
        if(nums.length>k) factor=k;
        else
        {
            factor=k%nums.length;
        }
        if (factor==0)return;
        int media;
        int[] newArray= new int[factor];

        for(int i=nums.length-factor,j=0;i<nums.length;i++,j++)
        {
            newArray[j]=nums[i];
        }

        for(int j=nums.length-1,i=nums.length-factor-1;i>=0;j--,i--)
        {
            nums[j]=nums[i];
        }

        for(int i=0;i<factor;i++){
            nums[i]=newArray[i];
        }

    }