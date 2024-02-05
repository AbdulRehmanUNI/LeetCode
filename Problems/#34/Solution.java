class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int first = -1, last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] != target) {
                    first = mid;
                    break;
                } else {
                    end = mid - 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (first == -1) {
            return new int[]{-1, -1};
        }
        start = first;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    last = mid;
                    break;
                } else {
                    start = mid + 1;
                }
            } else {
                end = mid - 1;
            }
        }
        return new int[]{first, last};
    }
}


//-------------- revision -----------------------
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = findFirst(nums, target);
        if (firstIndex == -1) {
            return new int[]{-1, -1};
        }

        int lastIndex = firstIndex;
        while (lastIndex < nums.length - 1 && nums[lastIndex + 1] == target) {
            lastIndex++;
        }

        return new int[]{firstIndex, lastIndex};
    }

    public int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] >= target) end = mid - 1;
            else start = mid + 1;
        }
        return (start < nums.length && nums[start] == target) ? start : -1;
    }
}