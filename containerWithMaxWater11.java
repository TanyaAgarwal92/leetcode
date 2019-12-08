// Problem : 11. Container With Most Water

//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

//Note: You may not slant the container and n is at least 2.

class Solution {
    public int maxArea(int[] height) {
      int pillars = height.length;
      int left = 0;
      int right = pillars-1;
      int area = 0;
      while ( left < right){
        area = Math.max(area, Math.min(height[left], height[right]) * (right - left));
        if ( height[left] < height[right]){
          left++ ;
        }
        else{
          right-- ;
        }
      }
      return area;
    }
}    
