// 4. Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int num1Len = nums1.length;
        int num2Len = nums2.length;
        int i = 0, j = 0, k = 0;
        double result;
        int[] temp = new int[num1Len + num2Len];
        while( i < num1Len && j < num2Len){
            if( nums1[i] < nums2[j] ){
                temp[k] = nums1[i];
                i++;
            } else{
                temp[k] = nums2[j];
                j++;
            }
            k++;
        }
        while( i < num1Len ){
            temp[k] = nums1[i];
            k++;
            i++;
        }
        while( j < num2Len ){
            temp[k] = nums2[j];
            k++;
            j++;
        }
        if ( temp.length % 2 == 0){
            result = (double)(temp[temp.length/2] + temp[(temp.length/2) - 1]) / 2;
        }
        else{
            result = temp[temp.length/2];
        }
        return result;
    }
}
