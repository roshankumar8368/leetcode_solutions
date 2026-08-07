class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();

        int i = 0;

        // 1. newInterval se pehle wale intervals add karo
        while (i < intervals.length && intervals[i][0] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }

        // 2. newInterval insert karo
        list.add(newInterval);

        // 3. Baaki intervals add karo
        while (i < intervals.length) {
            list.add(intervals[i]);
            i++;
        }

        
        List<int[]> ans = new ArrayList<>();

        for (int[] interval : list) {

            if (ans.isEmpty()) {
                ans.add(interval);
            } else {

                int[] last = ans.get(ans.size() - 1);

                if (last[1] >= interval[0]) {
                    last[1] = Math.max(last[1], interval[1]);
                } else {
                    ans.add(interval);
                }
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}