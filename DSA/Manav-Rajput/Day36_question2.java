class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int rotations = check(tops[0], tops, bottoms, n);
        if (rotations != -1 || tops[0] == bottoms[0]) {
            return rotations;
        } else {
            return check(bottoms[0], tops, bottoms, n);
        }
    }
    private int check(int target, int[] tops, int[] bottoms, int n) {
        int topRotations = 0;
        int bottomRotations = 0;
        for (int i = 0; i < n; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return -1; 
            } else if (tops[i] != target) {
                topRotations++;
            } else if (bottoms[i] != target) {
                bottomRotations++;
            }
        }
        return Math.min(topRotations, bottomRotations);
    }
}
