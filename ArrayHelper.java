public class ArrayHelper {
    public static void display(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[nums.length - 1] + "]");
    }

    public static void display(double[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println(nums[nums.length - 1] + "]");
    }

    public static void fill(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = x;
        }
    }

    public static void fill(double[] nums, double x) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = x;
        }
    }

    public static boolean contains(int[] nums, int x) {
        for (int num : nums) {
            if (num == x) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] nums, double x) {
        for (double num : nums) {
            if (num == x) {
                return true;
            }
        }
        return false;
    }

    public static int count(int[] nums, int x) {
        int count = 0;
        for (int num : nums) {
            if (num == x) {
                count++;
            }
        }
        return count;
    }

    public static int count(double[] nums, double x) {
        int count = 0;
        for (double num : nums) {
            if (num == x) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double sum(double[] nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }

    public static int indexOf(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(double[] nums, double x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static int max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static double max(double[] nums) {
        double max = nums[0];
        for (double num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public static int[] subarray(int[] nums, int beg, int end) {
        int[] sub = new int[end - beg];
        for (int i = 0; i < sub.length; i++) {
            sub[i] = nums[i + beg];
        }
        return sub;
    }

    public static double[] merge(double[] a, double[] b) {
        double[] nums = new double[a.length + b.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < a.length) {
                nums[i] = a[i];
            } else {
                nums[i] = b[i - a.length];
            }
        }
        return nums;
    }

    public static double[] mergeIntToArray(double a, double b) {
        double[] nums = {a, b};
        return nums;
    }
}


