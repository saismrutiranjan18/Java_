//Leet Code
//11. Container With Most Water

public class Container_Water {
    
        public static int maxSumArray(int height[]) {
            int n = height.length;
            int l = 0;
            int r = n - 1;
            int maxSum = 0;
    
            while (l < r) {
                int w = r - l;
                int h = Math.min(height[l], height[r]);
                int area = h * w; 
    
                if (area > maxSum) {
                    maxSum = area;
                }
    
                if (height[l] < height[r]) {
                    l++;
                } else {
                    r--;
                }
            }
            return maxSum;
        }

        public static void main(String[] args) {
            int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
            System.out.println(maxSumArray(height));
        }
    }

