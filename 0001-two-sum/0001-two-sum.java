import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {

        for(int i=0; i<nums.length;i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                if (nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int [] {};
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length:");
        int n = sc.nextInt();
        int [] nums = new int[n];
        System.out.println("enter the values: ");
        for(int i =0; i<n; i++){
            nums [i] = sc.nextInt();
        }
        
        System.out.println("enter the Target: ");
        int target = sc.nextInt();
        int result[]= twoSum(nums, target);
        sc.close();
    }


    }
