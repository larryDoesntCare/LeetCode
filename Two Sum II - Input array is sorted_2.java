public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            if(target!=0&&numbers[i]==0)continue;
            if(map.containsKey(target-numbers[i]))
            {
                return new int[]{map.get(target-numbers[i])+1,i+1};
            }
            else map.put(numbers[i],i);
        }
        return null;
    }