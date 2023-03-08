package cw_1;
/*
 * Дан массив nums. Определить текущую сумму массива как runningSum[i] = sum(nums[0]…nums[i]).
 * Возвратить текущую сумму чисел.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

Constraints:
1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6
 */

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        System.out.println(solution());
    }

    public static int[] solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] resArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        resArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            resArray[i] = arr[i] + resArray[i - 1];
        }
        for (int i = 0; i < resArray.length; i++) {
            System.out.println(resArray[i]);
        }
        return null;
    }
}
