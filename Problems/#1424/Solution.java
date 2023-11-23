class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<List<Integer>> diagonals = new ArrayList<>();
        int size = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                if (i + j >= diagonals.size()) diagonals.add(new ArrayList<>());
                diagonals.get(i + j).add(0, nums.get(i).get(j));
                size++;
            }
        }
        int[] result = new int[size];
        int index = 0;
        for (List<Integer> list : diagonals) {
            for (int num : list) result[index++] = num;
        }
        return result;
    }
}